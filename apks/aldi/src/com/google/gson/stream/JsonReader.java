package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

public class JsonReader
  implements Closeable
{
  private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
  private static final char[] NON_EXECUTE_PREFIX = ")]}'\n".toCharArray();
  private static final int NUMBER_CHAR_DECIMAL = 3;
  private static final int NUMBER_CHAR_DIGIT = 2;
  private static final int NUMBER_CHAR_EXP_DIGIT = 7;
  private static final int NUMBER_CHAR_EXP_E = 5;
  private static final int NUMBER_CHAR_EXP_SIGN = 6;
  private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
  private static final int NUMBER_CHAR_NONE = 0;
  private static final int NUMBER_CHAR_SIGN = 1;
  private static final int PEEKED_BEGIN_ARRAY = 3;
  private static final int PEEKED_BEGIN_OBJECT = 1;
  private static final int PEEKED_BUFFERED = 11;
  private static final int PEEKED_DOUBLE_QUOTED = 9;
  private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
  private static final int PEEKED_END_ARRAY = 4;
  private static final int PEEKED_END_OBJECT = 2;
  private static final int PEEKED_EOF = 17;
  private static final int PEEKED_FALSE = 6;
  private static final int PEEKED_LONG = 15;
  private static final int PEEKED_NONE = 0;
  private static final int PEEKED_NULL = 7;
  private static final int PEEKED_NUMBER = 16;
  private static final int PEEKED_SINGLE_QUOTED = 8;
  private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
  private static final int PEEKED_TRUE = 5;
  private static final int PEEKED_UNQUOTED = 10;
  private static final int PEEKED_UNQUOTED_NAME = 14;
  private final char[] buffer = new char['Ѐ'];
  private final Reader in;
  private boolean lenient = false;
  private int limit = 0;
  private int lineNumber = 0;
  private int lineStart = 0;
  private int[] pathIndices;
  private String[] pathNames;
  int peeked = 0;
  private long peekedLong;
  private int peekedNumberLength;
  private String peekedString;
  private int pos = 0;
  private int[] stack = new int[32];
  private int stackSize = 0;
  
  static
  {
    JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess()
    {
      public final void promoteNameToValue(JsonReader paramAnonymousJsonReader)
        throws IOException
      {
        if ((paramAnonymousJsonReader instanceof JsonTreeReader))
        {
          ((JsonTreeReader)paramAnonymousJsonReader).promoteNameToValue();
          return;
        }
        int j = paramAnonymousJsonReader.peeked;
        int i = j;
        if (j == 0) {
          i = paramAnonymousJsonReader.doPeek();
        }
        if (i == 13)
        {
          paramAnonymousJsonReader.peeked = 9;
          return;
        }
        if (i == 12)
        {
          paramAnonymousJsonReader.peeked = 8;
          return;
        }
        if (i == 14)
        {
          paramAnonymousJsonReader.peeked = 10;
          return;
        }
        StringBuilder localStringBuilder = new StringBuilder("Expected a name but was ");
        localStringBuilder.append(paramAnonymousJsonReader.peek());
        localStringBuilder.append(paramAnonymousJsonReader.locationString());
        throw new IllegalStateException(localStringBuilder.toString());
      }
    };
  }
  
  public JsonReader(Reader paramReader)
  {
    int[] arrayOfInt = this.stack;
    int i = this.stackSize;
    this.stackSize = (i + 1);
    arrayOfInt[i] = 6;
    this.pathNames = new String[32];
    this.pathIndices = new int[32];
    if (paramReader != null)
    {
      this.in = paramReader;
      return;
    }
    throw new NullPointerException("in == null");
  }
  
  private void checkLenient()
    throws IOException
  {
    if (this.lenient) {
      return;
    }
    throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
  }
  
  private void consumeNonExecutePrefix()
    throws IOException
  {
    nextNonWhitespace(true);
    this.pos -= 1;
    if ((this.pos + NON_EXECUTE_PREFIX.length > this.limit) && (!fillBuffer(NON_EXECUTE_PREFIX.length))) {
      return;
    }
    int i = 0;
    while (i < NON_EXECUTE_PREFIX.length)
    {
      if (this.buffer[(this.pos + i)] != NON_EXECUTE_PREFIX[i]) {
        return;
      }
      i += 1;
    }
    this.pos += NON_EXECUTE_PREFIX.length;
  }
  
  private boolean fillBuffer(int paramInt)
    throws IOException
  {
    char[] arrayOfChar = this.buffer;
    this.lineStart -= this.pos;
    if (this.limit != this.pos)
    {
      this.limit -= this.pos;
      System.arraycopy(arrayOfChar, this.pos, arrayOfChar, 0, this.limit);
    }
    else
    {
      this.limit = 0;
    }
    this.pos = 0;
    int i;
    do
    {
      i = this.in.read(arrayOfChar, this.limit, arrayOfChar.length - this.limit);
      if (i == -1) {
        break;
      }
      this.limit += i;
      i = paramInt;
      if (this.lineNumber == 0)
      {
        i = paramInt;
        if (this.lineStart == 0)
        {
          i = paramInt;
          if (this.limit > 0)
          {
            i = paramInt;
            if (arrayOfChar[0] == 65279)
            {
              this.pos += 1;
              this.lineStart += 1;
              i = paramInt + 1;
            }
          }
        }
      }
      paramInt = i;
    } while (this.limit < i);
    return true;
    return false;
  }
  
  private boolean isLiteral(char paramChar)
    throws IOException
  {
    switch (paramChar)
    {
    default: 
      return true;
    case '#': 
    case '/': 
    case ';': 
    case '=': 
    case '\\': 
      checkLenient();
    }
    return false;
  }
  
  private int nextNonWhitespace(boolean paramBoolean)
    throws IOException
  {
    Object localObject = this.buffer;
    int i = this.pos;
    label11:
    int j;
    for (int m = this.limit;; m = j)
    {
      int k = i;
      j = m;
      if (i == m)
      {
        this.pos = i;
        if (fillBuffer(1))
        {
          k = this.pos;
          j = this.limit;
        }
        else
        {
          if (!paramBoolean) {
            return -1;
          }
          localObject = new StringBuilder("End of input");
          ((StringBuilder)localObject).append(locationString());
          throw new EOFException(((StringBuilder)localObject).toString());
        }
      }
      i = k + 1;
      k = localObject[k];
      if (k == 10)
      {
        this.lineNumber += 1;
        this.lineStart = i;
      }
      else if ((k != 32) && (k != 13) && (k != 9))
      {
        if (k == 47)
        {
          this.pos = i;
          if (i == j)
          {
            this.pos -= 1;
            boolean bool = fillBuffer(2);
            this.pos += 1;
            if (!bool) {
              return k;
            }
          }
          checkLenient();
          i = localObject[this.pos];
          if (i != 42)
          {
            if (i != 47) {
              return k;
            }
            this.pos += 1;
            break label298;
          }
          this.pos += 1;
          if (skipTo("*/"))
          {
            i = this.pos + 2;
            break label11;
          }
          throw syntaxError("Unterminated comment");
        }
        if (k == 35)
        {
          this.pos = i;
          checkLenient();
          label298:
          skipToEndOfLine();
          break;
        }
        this.pos = i;
        return k;
      }
    }
  }
  
  private String nextQuotedValue(char paramChar)
    throws IOException
  {
    char[] arrayOfChar = this.buffer;
    Object localObject1 = null;
    for (;;)
    {
      char c2 = this.pos;
      int i = this.limit;
      char c3;
      for (char c1 = c2;; c1 = c3)
      {
        if (c1 >= i) {
          break label191;
        }
        c3 = c1 + '\001';
        c1 = arrayOfChar[c1];
        if (c1 == paramChar)
        {
          this.pos = c3;
          paramChar = c3 - c2 - 1;
          if (localObject1 == null) {
            return new String(arrayOfChar, c2, paramChar);
          }
          ((StringBuilder)localObject1).append(arrayOfChar, c2, paramChar);
          return ((StringBuilder)localObject1).toString();
        }
        if (c1 == '\\')
        {
          this.pos = c3;
          c1 = c3 - c2 - 1;
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new StringBuilder(Math.max((c1 + '\001') * 2, 16));
          }
          ((StringBuilder)localObject2).append(arrayOfChar, c2, c1);
          ((StringBuilder)localObject2).append(readEscapeCharacter());
          localObject1 = localObject2;
          break;
        }
        if (c1 == '\n')
        {
          this.lineNumber += 1;
          this.lineStart = c3;
        }
      }
      label191:
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new StringBuilder(Math.max((c1 - c2) * 2, 16));
      }
      ((StringBuilder)localObject2).append(arrayOfChar, c2, c1 - c2);
      this.pos = c1;
      if (!fillBuffer(1)) {
        break;
      }
      localObject1 = localObject2;
    }
    throw syntaxError("Unterminated string");
  }
  
  private String nextUnquotedValue()
    throws IOException
  {
    int j = 0;
    Object localObject1 = null;
    label204:
    label207:
    Object localObject2;
    do
    {
      i = 0;
      do
      {
        while (this.pos + i < this.limit) {
          switch (this.buffer[(this.pos + i)])
          {
          default: 
            i += 1;
            break;
          case '#': 
          case '/': 
          case ';': 
          case '=': 
          case '\\': 
            checkLenient();
            break label204;
          }
        }
        if (i >= this.buffer.length) {
          break label207;
        }
      } while (fillBuffer(i + 1));
      break;
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new StringBuilder(Math.max(i, 16));
      }
      ((StringBuilder)localObject2).append(this.buffer, this.pos, i);
      this.pos += i;
      localObject1 = localObject2;
    } while (fillBuffer(1));
    localObject1 = localObject2;
    int i = j;
    if (localObject1 == null)
    {
      localObject1 = new String(this.buffer, this.pos, i);
    }
    else
    {
      ((StringBuilder)localObject1).append(this.buffer, this.pos, i);
      localObject1 = ((StringBuilder)localObject1).toString();
    }
    this.pos += i;
    return (String)localObject1;
  }
  
  private int peekKeyword()
    throws IOException
  {
    int i = this.buffer[this.pos];
    String str1;
    String str2;
    if ((i != 116) && (i != 84))
    {
      if ((i != 102) && (i != 70))
      {
        if ((i != 110) && (i != 78)) {
          return 0;
        }
        str1 = "null";
        str2 = "NULL";
        i = 7;
      }
      else
      {
        str1 = "false";
        str2 = "FALSE";
        i = 6;
      }
    }
    else
    {
      str1 = "true";
      str2 = "TRUE";
      i = 5;
    }
    int k = str1.length();
    int j = 1;
    while (j < k)
    {
      if ((this.pos + j >= this.limit) && (!fillBuffer(j + 1))) {
        return 0;
      }
      int m = this.buffer[(this.pos + j)];
      if ((m != str1.charAt(j)) && (m != str2.charAt(j))) {
        return 0;
      }
      j += 1;
    }
    if (((this.pos + k < this.limit) || (fillBuffer(k + 1))) && (isLiteral(this.buffer[(this.pos + k)]))) {
      return 0;
    }
    this.pos += k;
    this.peeked = i;
    return i;
  }
  
  private int peekNumber()
    throws IOException
  {
    char[] arrayOfChar = this.buffer;
    int i3 = this.pos;
    int k = this.limit;
    int n = 0;
    int i = 0;
    int j = 1;
    long l1 = 0L;
    int m = 0;
    for (;;)
    {
      int i2 = i3;
      int i1 = k;
      char c;
      if (i3 + n == k)
      {
        if (n == arrayOfChar.length) {
          return 0;
        }
        if (fillBuffer(n + 1))
        {
          i2 = this.pos;
          i1 = this.limit;
        }
      }
      else
      {
        c = arrayOfChar[(i2 + n)];
        if (c == '+') {
          break label466;
        }
        if ((c == 'E') || (c == 'e')) {
          break label446;
        }
      }
      switch (c)
      {
      default: 
        if ((c >= '0') && (c <= '9'))
        {
          if ((i != 1) && (i != 0))
          {
            long l2;
            if (i == 2)
            {
              if (l1 == 0L) {
                return 0;
              }
              l2 = 10L * l1 - (c - '0');
              if ((l1 <= -922337203685477580L) && ((l1 != -922337203685477580L) || (l2 >= l1))) {
                k = 0;
              } else {
                k = 1;
              }
              k &= j;
            }
            else
            {
              if (i == 3)
              {
                i = 4;
                break label291;
              }
              if (i == 5) {
                break label275;
              }
              k = j;
              l2 = l1;
              if (i == 6) {
                break label275;
              }
            }
            j = k;
            l1 = l2;
            break label291;
            i = 7;
          }
          else
          {
            l1 = -(c - '0');
            i = 2;
          }
          break;
        }
        if (isLiteral(c)) {
          return 0;
        }
        if ((i == 2) && (j != 0) && ((l1 != Long.MIN_VALUE) || (m != 0)) && ((l1 != 0L) || (m == 0)))
        {
          if (m == 0) {
            l1 = -l1;
          }
          this.peekedLong = l1;
          this.pos += n;
        }
        for (i = 15;; i = 16)
        {
          this.peeked = i;
          return i;
          if ((i != 2) && (i != 4) && (i != 7)) {
            return 0;
          }
          this.peekedNumberLength = n;
        }
      case '.': 
        if (i == 2)
        {
          i = 3;
          break;
        }
        return 0;
      case '-': 
        label275:
        label291:
        if (i == 0)
        {
          i = 1;
          m = 1;
        }
        else if (i != 5)
        {
          return 0;
          label446:
          if ((i != 2) && (i != 4)) {
            return 0;
          }
          i = 5;
        }
        break;
      }
      label466:
      if (i != 5) {
        break;
      }
      i = 6;
      n += 1;
      i3 = i2;
      k = i1;
    }
    return 0;
  }
  
  private void push(int paramInt)
  {
    if (this.stackSize == this.stack.length)
    {
      arrayOfInt1 = new int[this.stackSize * 2];
      int[] arrayOfInt2 = new int[this.stackSize * 2];
      String[] arrayOfString = new String[this.stackSize * 2];
      System.arraycopy(this.stack, 0, arrayOfInt1, 0, this.stackSize);
      System.arraycopy(this.pathIndices, 0, arrayOfInt2, 0, this.stackSize);
      System.arraycopy(this.pathNames, 0, arrayOfString, 0, this.stackSize);
      this.stack = arrayOfInt1;
      this.pathIndices = arrayOfInt2;
      this.pathNames = arrayOfString;
    }
    int[] arrayOfInt1 = this.stack;
    int i = this.stackSize;
    this.stackSize = (i + 1);
    arrayOfInt1[i] = paramInt;
  }
  
  private char readEscapeCharacter()
    throws IOException
  {
    if ((this.pos == this.limit) && (!fillBuffer(1))) {
      throw syntaxError("Unterminated escape sequence");
    }
    Object localObject = this.buffer;
    int i = this.pos;
    this.pos = (i + 1);
    char c = localObject[i];
    if (c != '\n')
    {
      if ((c != '"') && (c != '\'') && (c != '/') && (c != '\\'))
      {
        if (c != 'b')
        {
          if (c != 'f')
          {
            if (c != 'n')
            {
              if (c != 'r')
              {
                switch (c)
                {
                default: 
                  throw syntaxError("Invalid escape sequence");
                case 'u': 
                  if ((this.pos + 4 > this.limit) && (!fillBuffer(4))) {
                    throw syntaxError("Unterminated escape sequence");
                  }
                  c = '\000';
                  int j = this.pos;
                  int k;
                  for (i = j;; i = k + 1)
                  {
                    k = i;
                    if (k >= j + 4) {
                      break label332;
                    }
                    i = this.buffer[k];
                    int m = (char)(c << '\004');
                    if ((i >= 48) && (i <= 57))
                    {
                      i -= 48;
                      c = (char)(m + i);
                    }
                    else
                    {
                      if ((i >= 97) && (i <= 102)) {
                        i -= 97;
                      }
                      for (;;)
                      {
                        i += 10;
                        break;
                        if ((i < 65) || (i > 70)) {
                          break label285;
                        }
                        i -= 65;
                      }
                    }
                  }
                  label285:
                  localObject = new StringBuilder("\\u");
                  ((StringBuilder)localObject).append(new String(this.buffer, this.pos, 4));
                  throw new NumberFormatException(((StringBuilder)localObject).toString());
                  label332:
                  this.pos += 4;
                  return c;
                }
                return '\t';
              }
              return '\r';
            }
            return '\n';
          }
          return '\f';
        }
        return '\b';
      }
    }
    else
    {
      this.lineNumber += 1;
      this.lineStart = this.pos;
    }
    return c;
  }
  
  private void skipQuotedValue(char paramChar)
    throws IOException
  {
    char[] arrayOfChar = this.buffer;
    label88:
    do
    {
      char c1 = this.pos;
      char c3 = this.limit;
      for (;;)
      {
        if (c1 >= c3) {
          break label88;
        }
        char c2 = c1 + '\001';
        c1 = arrayOfChar[c1];
        if (c1 == paramChar)
        {
          this.pos = c2;
          return;
        }
        if (c1 == '\\')
        {
          this.pos = c2;
          readEscapeCharacter();
          break;
        }
        if (c1 == '\n')
        {
          this.lineNumber += 1;
          this.lineStart = c2;
        }
        c1 = c2;
      }
      this.pos = c1;
    } while (fillBuffer(1));
    throw syntaxError("Unterminated string");
  }
  
  private boolean skipTo(String paramString)
    throws IOException
  {
    int j = paramString.length();
    for (;;)
    {
      int k = this.pos;
      int m = this.limit;
      int i = 0;
      if ((k + j > m) && (!fillBuffer(j))) {
        return false;
      }
      if (this.buffer[this.pos] == '\n')
      {
        this.lineNumber += 1;
        this.lineStart = (this.pos + 1);
      }
      else
      {
        for (;;)
        {
          if (i >= j) {
            break label122;
          }
          if (this.buffer[(this.pos + i)] != paramString.charAt(i)) {
            break;
          }
          i += 1;
        }
      }
      this.pos += 1;
    }
    label122:
    return true;
  }
  
  private void skipToEndOfLine()
    throws IOException
  {
    int i;
    do
    {
      if ((this.pos >= this.limit) && (!fillBuffer(1))) {
        break;
      }
      char[] arrayOfChar = this.buffer;
      i = this.pos;
      this.pos = (i + 1);
      i = arrayOfChar[i];
      if (i == 10)
      {
        this.lineNumber += 1;
        this.lineStart = this.pos;
        return;
      }
    } while (i != 13);
  }
  
  private void skipUnquotedValue()
    throws IOException
  {
    do
    {
      int i = 0;
      while (this.pos + i < this.limit) {
        switch (this.buffer[(this.pos + i)])
        {
        default: 
          i += 1;
          break;
        case '#': 
        case '/': 
        case ';': 
        case '=': 
        case '\\': 
          checkLenient();
        case '\t': 
        case '\n': 
        case '\f': 
        case '\r': 
        case ' ': 
        case ',': 
        case ':': 
        case '[': 
        case ']': 
        case '{': 
        case '}': 
          this.pos += i;
          return;
        }
      }
      this.pos += i;
    } while (fillBuffer(1));
  }
  
  private IOException syntaxError(String paramString)
    throws IOException
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(locationString());
    throw new MalformedJsonException(localStringBuilder.toString());
  }
  
  public void beginArray()
    throws IOException
  {
    int j = this.peeked;
    int i = j;
    if (j == 0) {
      i = doPeek();
    }
    if (i == 3)
    {
      push(1);
      this.pathIndices[(this.stackSize - 1)] = 0;
      this.peeked = 0;
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("Expected BEGIN_ARRAY but was ");
    localStringBuilder.append(peek());
    localStringBuilder.append(locationString());
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public void beginObject()
    throws IOException
  {
    int j = this.peeked;
    int i = j;
    if (j == 0) {
      i = doPeek();
    }
    if (i == 1)
    {
      push(3);
      this.peeked = 0;
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("Expected BEGIN_OBJECT but was ");
    localStringBuilder.append(peek());
    localStringBuilder.append(locationString());
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public void close()
    throws IOException
  {
    this.peeked = 0;
    this.stack[0] = 8;
    this.stackSize = 1;
    this.in.close();
  }
  
  int doPeek()
    throws IOException
  {
    int j = this.stack[(this.stackSize - 1)];
    int i;
    if (j == 1)
    {
      this.stack[(this.stackSize - 1)] = 2;
    }
    else if (j == 2)
    {
      i = nextNonWhitespace(true);
      if (i != 44)
      {
        if (i != 59)
        {
          if (i == 93)
          {
            this.peeked = 4;
            return 4;
          }
          throw syntaxError("Unterminated array");
        }
        checkLenient();
      }
    }
    else
    {
      if ((j == 3) || (j == 5)) {
        break label483;
      }
      if (j == 4)
      {
        this.stack[(this.stackSize - 1)] = 5;
        i = nextNonWhitespace(true);
        if (i != 58) {
          if (i == 61)
          {
            checkLenient();
            if (((this.pos < this.limit) || (fillBuffer(1))) && (this.buffer[this.pos] == '>'))
            {
              i = this.pos + 1;
              this.pos = i;
            }
          }
          else
          {
            throw syntaxError("Expected ':'");
          }
        }
      }
      else if (j == 6)
      {
        if (this.lenient) {
          consumeNonExecutePrefix();
        }
        this.stack[(this.stackSize - 1)] = 7;
      }
      else if (j == 7)
      {
        if (nextNonWhitespace(false) == -1) {
          i = 17;
        }
      }
    }
    for (;;)
    {
      this.peeked = i;
      return i;
      checkLenient();
      i = this.pos - 1;
      break;
      if (j != 8)
      {
        i = nextNonWhitespace(true);
        if (i != 34)
        {
          if (i != 39)
          {
            if ((i != 44) && (i != 59)) {
              if (i != 91)
              {
                if (i != 93)
                {
                  if (i != 123)
                  {
                    this.pos -= 1;
                    i = peekKeyword();
                    if (i != 0) {
                      return i;
                    }
                    i = peekNumber();
                    if (i != 0) {
                      return i;
                    }
                    if (isLiteral(this.buffer[this.pos]))
                    {
                      checkLenient();
                      i = 10;
                      continue;
                    }
                    throw syntaxError("Expected value");
                  }
                  this.peeked = 1;
                  return 1;
                }
                if (j == 1)
                {
                  this.peeked = 4;
                  return 4;
                }
              }
              else
              {
                this.peeked = 3;
                return 3;
              }
            }
            if ((j != 1) && (j != 2)) {
              throw syntaxError("Unexpected value");
            }
            checkLenient();
            this.pos -= 1;
            this.peeked = 7;
            return 7;
          }
          else
          {
            checkLenient();
            this.peeked = 8;
            return 8;
          }
        }
        else {
          i = 9;
        }
      }
      else
      {
        throw new IllegalStateException("JsonReader is closed");
        label483:
        this.stack[(this.stackSize - 1)] = 4;
        if (j == 5)
        {
          i = nextNonWhitespace(true);
          if (i != 44)
          {
            if (i != 59)
            {
              if (i == 125)
              {
                this.peeked = 2;
                return 2;
              }
              throw syntaxError("Unterminated object");
            }
            checkLenient();
          }
        }
        i = nextNonWhitespace(true);
        if (i != 34)
        {
          if (i != 39)
          {
            if (i != 125)
            {
              checkLenient();
              this.pos -= 1;
              if (isLiteral((char)i)) {
                i = 14;
              } else {
                throw syntaxError("Expected name");
              }
            }
            else
            {
              if (j != 5)
              {
                this.peeked = 2;
                return 2;
              }
              throw syntaxError("Expected name");
            }
          }
          else
          {
            checkLenient();
            i = 12;
          }
        }
        else {
          i = 13;
        }
      }
    }
  }
  
  public void endArray()
    throws IOException
  {
    int j = this.peeked;
    int i = j;
    if (j == 0) {
      i = doPeek();
    }
    if (i == 4)
    {
      this.stackSize -= 1;
      localObject = this.pathIndices;
      i = this.stackSize - 1;
      localObject[i] += 1;
      this.peeked = 0;
      return;
    }
    Object localObject = new StringBuilder("Expected END_ARRAY but was ");
    ((StringBuilder)localObject).append(peek());
    ((StringBuilder)localObject).append(locationString());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void endObject()
    throws IOException
  {
    int j = this.peeked;
    int i = j;
    if (j == 0) {
      i = doPeek();
    }
    if (i == 2)
    {
      this.stackSize -= 1;
      this.pathNames[this.stackSize] = null;
      localObject = this.pathIndices;
      i = this.stackSize - 1;
      localObject[i] += 1;
      this.peeked = 0;
      return;
    }
    Object localObject = new StringBuilder("Expected END_OBJECT but was ");
    ((StringBuilder)localObject).append(peek());
    ((StringBuilder)localObject).append(locationString());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public String getPath()
  {
    StringBuilder localStringBuilder = new StringBuilder("$");
    int j = this.stackSize;
    int i = 0;
    while (i < j)
    {
      switch (this.stack[i])
      {
      default: 
        break;
      case 3: 
      case 4: 
      case 5: 
        localStringBuilder.append('.');
        if (this.pathNames[i] != null) {
          localStringBuilder.append(this.pathNames[i]);
        }
        break;
      case 1: 
      case 2: 
        localStringBuilder.append('[');
        localStringBuilder.append(this.pathIndices[i]);
        localStringBuilder.append(']');
      }
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public boolean hasNext()
    throws IOException
  {
    int j = this.peeked;
    int i = j;
    if (j == 0) {
      i = doPeek();
    }
    return (i != 2) && (i != 4);
  }
  
  public final boolean isLenient()
  {
    return this.lenient;
  }
  
  String locationString()
  {
    int i = this.lineNumber;
    int j = this.pos;
    int k = this.lineStart;
    StringBuilder localStringBuilder = new StringBuilder(" at line ");
    localStringBuilder.append(i + 1);
    localStringBuilder.append(" column ");
    localStringBuilder.append(j - k + 1);
    localStringBuilder.append(" path ");
    localStringBuilder.append(getPath());
    return localStringBuilder.toString();
  }
  
  public boolean nextBoolean()
    throws IOException
  {
    int j = this.peeked;
    int i = j;
    if (j == 0) {
      i = doPeek();
    }
    if (i == 5)
    {
      this.peeked = 0;
      localObject = this.pathIndices;
      i = this.stackSize - 1;
      localObject[i] += 1;
      return true;
    }
    if (i == 6)
    {
      this.peeked = 0;
      localObject = this.pathIndices;
      i = this.stackSize - 1;
      localObject[i] += 1;
      return false;
    }
    Object localObject = new StringBuilder("Expected a boolean but was ");
    ((StringBuilder)localObject).append(peek());
    ((StringBuilder)localObject).append(locationString());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public double nextDouble()
    throws IOException
  {
    int j = this.peeked;
    int i = j;
    if (j == 0) {
      i = doPeek();
    }
    if (i == 15)
    {
      this.peeked = 0;
      localObject = this.pathIndices;
      i = this.stackSize - 1;
      localObject[i] += 1;
      return this.peekedLong;
    }
    if (i == 16)
    {
      this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
      this.pos += this.peekedNumberLength;
    }
    else
    {
      if ((i != 8) && (i != 9)) {
        if (i != 10) {}
      }
      char c;
      for (localObject = nextUnquotedValue();; localObject = nextQuotedValue(c))
      {
        this.peekedString = ((String)localObject);
        break;
        if (i == 11) {
          break;
        }
        localObject = new StringBuilder("Expected a double but was ");
        ((StringBuilder)localObject).append(peek());
        ((StringBuilder)localObject).append(locationString());
        throw new IllegalStateException(((StringBuilder)localObject).toString());
        if (i == 8) {
          c = '\'';
        } else {
          c = '"';
        }
      }
    }
    this.peeked = 11;
    double d = Double.parseDouble(this.peekedString);
    if ((!this.lenient) && ((Double.isNaN(d)) || (Double.isInfinite(d))))
    {
      localObject = new StringBuilder("JSON forbids NaN and infinities: ");
      ((StringBuilder)localObject).append(d);
      ((StringBuilder)localObject).append(locationString());
      throw new MalformedJsonException(((StringBuilder)localObject).toString());
    }
    this.peekedString = null;
    this.peeked = 0;
    Object localObject = this.pathIndices;
    i = this.stackSize - 1;
    localObject[i] += 1;
    return d;
  }
  
  public int nextInt()
    throws IOException
  {
    int j = this.peeked;
    int i = j;
    if (j == 0) {
      i = doPeek();
    }
    if (i == 15)
    {
      i = (int)this.peekedLong;
      if (this.peekedLong == i)
      {
        this.peeked = 0;
        localObject = this.pathIndices;
        j = this.stackSize - 1;
        localObject[j] += 1;
        return i;
      }
      localObject = new StringBuilder("Expected an int but was ");
      ((StringBuilder)localObject).append(this.peekedLong);
      ((StringBuilder)localObject).append(locationString());
      throw new NumberFormatException(((StringBuilder)localObject).toString());
    }
    if (i == 16)
    {
      this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
      this.pos += this.peekedNumberLength;
    }
    else
    {
      if ((i != 8) && (i != 9) && (i != 10))
      {
        localObject = new StringBuilder("Expected an int but was ");
        ((StringBuilder)localObject).append(peek());
        ((StringBuilder)localObject).append(locationString());
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
      if (i == 10) {}
      char c;
      for (localObject = nextUnquotedValue();; localObject = nextQuotedValue(c))
      {
        this.peekedString = ((String)localObject);
        break;
        if (i == 8) {
          c = '\'';
        } else {
          c = '"';
        }
      }
    }
    try
    {
      i = Integer.parseInt(this.peekedString);
      this.peeked = 0;
      localObject = this.pathIndices;
      j = this.stackSize - 1;
      localObject[j] += 1;
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      double d;
      for (;;) {}
    }
    this.peeked = 11;
    d = Double.parseDouble(this.peekedString);
    i = (int)d;
    if (i == d)
    {
      this.peekedString = null;
      this.peeked = 0;
      localObject = this.pathIndices;
      j = this.stackSize - 1;
      localObject[j] += 1;
      return i;
    }
    Object localObject = new StringBuilder("Expected an int but was ");
    ((StringBuilder)localObject).append(this.peekedString);
    ((StringBuilder)localObject).append(locationString());
    throw new NumberFormatException(((StringBuilder)localObject).toString());
  }
  
  public long nextLong()
    throws IOException
  {
    int j = this.peeked;
    int i = j;
    if (j == 0) {
      i = doPeek();
    }
    if (i == 15)
    {
      this.peeked = 0;
      localObject = this.pathIndices;
      i = this.stackSize - 1;
      localObject[i] += 1;
      return this.peekedLong;
    }
    if (i == 16)
    {
      this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
      this.pos += this.peekedNumberLength;
    }
    else
    {
      if ((i != 8) && (i != 9) && (i != 10))
      {
        localObject = new StringBuilder("Expected a long but was ");
        ((StringBuilder)localObject).append(peek());
        ((StringBuilder)localObject).append(locationString());
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
      if (i == 10) {}
      char c;
      for (localObject = nextUnquotedValue();; localObject = nextQuotedValue(c))
      {
        this.peekedString = ((String)localObject);
        break;
        if (i == 8) {
          c = '\'';
        } else {
          c = '"';
        }
      }
    }
    try
    {
      l = Long.parseLong(this.peekedString);
      this.peeked = 0;
      localObject = this.pathIndices;
      i = this.stackSize - 1;
      localObject[i] += 1;
      return l;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      long l;
      double d;
      for (;;) {}
    }
    this.peeked = 11;
    d = Double.parseDouble(this.peekedString);
    l = d;
    if (l == d)
    {
      this.peekedString = null;
      this.peeked = 0;
      localObject = this.pathIndices;
      i = this.stackSize - 1;
      localObject[i] += 1;
      return l;
    }
    Object localObject = new StringBuilder("Expected a long but was ");
    ((StringBuilder)localObject).append(this.peekedString);
    ((StringBuilder)localObject).append(locationString());
    throw new NumberFormatException(((StringBuilder)localObject).toString());
  }
  
  public String nextName()
    throws IOException
  {
    int j = this.peeked;
    int i = j;
    if (j == 0) {
      i = doPeek();
    }
    if (i == 14)
    {
      localObject = nextUnquotedValue();
    }
    else
    {
      if (i == 12) {}
      for (char c = '\'';; c = '"')
      {
        localObject = nextQuotedValue(c);
        break;
        if (i != 13) {
          break label83;
        }
      }
    }
    this.peeked = 0;
    this.pathNames[(this.stackSize - 1)] = localObject;
    return (String)localObject;
    label83:
    Object localObject = new StringBuilder("Expected a name but was ");
    ((StringBuilder)localObject).append(peek());
    ((StringBuilder)localObject).append(locationString());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void nextNull()
    throws IOException
  {
    int j = this.peeked;
    int i = j;
    if (j == 0) {
      i = doPeek();
    }
    if (i == 7)
    {
      this.peeked = 0;
      localObject = this.pathIndices;
      i = this.stackSize - 1;
      localObject[i] += 1;
      return;
    }
    Object localObject = new StringBuilder("Expected null but was ");
    ((StringBuilder)localObject).append(peek());
    ((StringBuilder)localObject).append(locationString());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public String nextString()
    throws IOException
  {
    int j = this.peeked;
    int i = j;
    if (j == 0) {
      i = doPeek();
    }
    if (i == 10)
    {
      localObject = nextUnquotedValue();
    }
    else
    {
      if (i == 8) {}
      for (char c = '\'';; c = '"')
      {
        localObject = nextQuotedValue(c);
        break label140;
        if (i != 9) {
          break;
        }
      }
      if (i == 11)
      {
        localObject = this.peekedString;
        this.peekedString = null;
      }
      else if (i == 15)
      {
        localObject = Long.toString(this.peekedLong);
      }
      else
      {
        if (i != 16) {
          break label171;
        }
        localObject = new String(this.buffer, this.pos, this.peekedNumberLength);
        this.pos += this.peekedNumberLength;
      }
    }
    label140:
    this.peeked = 0;
    int[] arrayOfInt = this.pathIndices;
    i = this.stackSize - 1;
    arrayOfInt[i] += 1;
    return (String)localObject;
    label171:
    Object localObject = new StringBuilder("Expected a string but was ");
    ((StringBuilder)localObject).append(peek());
    ((StringBuilder)localObject).append(locationString());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public JsonToken peek()
    throws IOException
  {
    int j = this.peeked;
    int i = j;
    if (j == 0) {
      i = doPeek();
    }
    switch (i)
    {
    default: 
      throw new AssertionError();
    case 17: 
      return JsonToken.END_DOCUMENT;
    case 15: 
    case 16: 
      return JsonToken.NUMBER;
    case 12: 
    case 13: 
    case 14: 
      return JsonToken.NAME;
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      return JsonToken.STRING;
    case 7: 
      return JsonToken.NULL;
    case 5: 
    case 6: 
      return JsonToken.BOOLEAN;
    case 4: 
      return JsonToken.END_ARRAY;
    case 3: 
      return JsonToken.BEGIN_ARRAY;
    case 2: 
      return JsonToken.END_OBJECT;
    }
    return JsonToken.BEGIN_OBJECT;
  }
  
  public final void setLenient(boolean paramBoolean)
  {
    this.lenient = paramBoolean;
  }
  
  public void skipValue()
    throws IOException
  {
    int j = 0;
    label187:
    do
    {
      i = this.peeked;
      int k = i;
      if (i == 0) {
        k = doPeek();
      }
      if (k == 3) {
        push(1);
      }
      for (;;)
      {
        i = j + 1;
        break label187;
        if (k != 1) {
          break;
        }
        push(3);
      }
      if (k == 4) {}
      while (k == 2)
      {
        this.stackSize -= 1;
        i = j - 1;
        break;
      }
      if ((k != 14) && (k != 10))
      {
        char c;
        if ((k != 8) && (k != 12))
        {
          if ((k != 9) && (k != 13))
          {
            i = j;
            if (k != 16) {
              break label187;
            }
            this.pos += this.peekedNumberLength;
            i = j;
            break label187;
          }
          c = '"';
        }
        else
        {
          c = '\'';
        }
        skipQuotedValue(c);
        i = j;
      }
      else
      {
        skipUnquotedValue();
        i = j;
      }
      this.peeked = 0;
      j = i;
    } while (i != 0);
    int[] arrayOfInt = this.pathIndices;
    int i = this.stackSize - 1;
    arrayOfInt[i] += 1;
    this.pathNames[(this.stackSize - 1)] = "null";
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append(locationString());
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/gson/stream/JsonReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */