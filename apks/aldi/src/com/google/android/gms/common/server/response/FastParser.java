package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

@KeepForSdk
@ShowFirstParty
public class FastParser<T extends FastJsonResponse>
{
  private static final char[] zaqf = { 117, 108, 108 };
  private static final char[] zaqg = { 114, 117, 101 };
  private static final char[] zaqh = { 114, 117, 101, 34 };
  private static final char[] zaqi = { 97, 108, 115, 101 };
  private static final char[] zaqj = { 97, 108, 115, 101, 34 };
  private static final char[] zaqk = { '\n' };
  private static final zaa<Integer> zaqm = new zaa();
  private static final zaa<Long> zaqn = new zab();
  private static final zaa<Float> zaqo = new zac();
  private static final zaa<Double> zaqp = new zad();
  private static final zaa<Boolean> zaqq = new zae();
  private static final zaa<String> zaqr = new zaf();
  private static final zaa<BigInteger> zaqs = new zag();
  private static final zaa<BigDecimal> zaqt = new zah();
  private final char[] zaqa = new char[1];
  private final char[] zaqb = new char[32];
  private final char[] zaqc = new char['Ѐ'];
  private final StringBuilder zaqd = new StringBuilder(32);
  private final StringBuilder zaqe = new StringBuilder(1024);
  private final Stack<Integer> zaql = new Stack();
  
  private final int zaa(BufferedReader paramBufferedReader, char[] paramArrayOfChar)
    throws FastParser.ParseException, IOException
  {
    char c = zaj(paramBufferedReader);
    if (c != 0)
    {
      if (c != ',')
      {
        if (c == 'n')
        {
          zab(paramBufferedReader, zaqf);
          return 0;
        }
        paramBufferedReader.mark(1024);
        int k;
        if (c == '"')
        {
          i = 0;
          int j = 0;
          for (;;)
          {
            k = i;
            if (i >= paramArrayOfChar.length) {
              break label260;
            }
            k = i;
            if (paramBufferedReader.read(paramArrayOfChar, i, 1) == -1) {
              break label260;
            }
            c = paramArrayOfChar[i];
            if (Character.isISOControl(c)) {
              break;
            }
            if ((c == '"') && (j == 0))
            {
              paramBufferedReader.reset();
              paramBufferedReader.skip(i + 1);
              return i;
            }
            if (c == '\\') {
              j ^= 0x1;
            } else {
              j = 0;
            }
            i += 1;
          }
          throw new ParseException("Unexpected control character while reading string");
        }
        paramArrayOfChar[0] = c;
        int i = 1;
        for (;;)
        {
          k = i;
          if (i >= paramArrayOfChar.length) {
            break label260;
          }
          k = i;
          if (paramBufferedReader.read(paramArrayOfChar, i, 1) == -1) {
            break label260;
          }
          if ((paramArrayOfChar[i] == '}') || (paramArrayOfChar[i] == ',') || (Character.isWhitespace(paramArrayOfChar[i])) || (paramArrayOfChar[i] == ']')) {
            break;
          }
          i += 1;
        }
        paramBufferedReader.reset();
        paramBufferedReader.skip(i - 1);
        paramArrayOfChar[i] = '\000';
        return i;
        label260:
        if (k == paramArrayOfChar.length) {
          throw new ParseException("Absurdly long value");
        }
        throw new ParseException("Unexpected EOF");
      }
      throw new ParseException("Missing value");
    }
    throw new ParseException("Unexpected EOF");
  }
  
  private final String zaa(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    this.zaql.push(Integer.valueOf(2));
    char c = zaj(paramBufferedReader);
    if (c != '"')
    {
      if (c != ']')
      {
        if (c == '}')
        {
          zak(2);
          return null;
        }
        paramBufferedReader = new StringBuilder(19);
        paramBufferedReader.append("Unexpected token: ");
        paramBufferedReader.append(c);
        throw new ParseException(paramBufferedReader.toString());
      }
      zak(2);
      zak(1);
      zak(5);
      return null;
    }
    this.zaql.push(Integer.valueOf(3));
    String str = zab(paramBufferedReader, this.zaqb, this.zaqd, null);
    zak(3);
    if (zaj(paramBufferedReader) == ':') {
      return str;
    }
    throw new ParseException("Expected key/value separator");
  }
  
  private final String zaa(BufferedReader paramBufferedReader, char[] paramArrayOfChar1, StringBuilder paramStringBuilder, char[] paramArrayOfChar2)
    throws FastParser.ParseException, IOException
  {
    int i = zaj(paramBufferedReader);
    if (i != 34)
    {
      if (i == 110)
      {
        zab(paramBufferedReader, zaqf);
        return null;
      }
      throw new ParseException("Expected string");
    }
    return zab(paramBufferedReader, paramArrayOfChar1, paramStringBuilder, paramArrayOfChar2);
  }
  
  private final <T extends FastJsonResponse> ArrayList<T> zaa(BufferedReader paramBufferedReader, FastJsonResponse.Field<?, ?> paramField)
    throws FastParser.ParseException, IOException
  {
    ArrayList localArrayList = new ArrayList();
    char c = zaj(paramBufferedReader);
    if (c != ']')
    {
      if (c != 'n')
      {
        if (c == '{')
        {
          Object localObject = this.zaql;
          for (;;)
          {
            ((Stack)localObject).push(Integer.valueOf(1));
            try
            {
              localObject = paramField.zacp();
              if (zaa(paramBufferedReader, (FastJsonResponse)localObject))
              {
                localArrayList.add(localObject);
                c = zaj(paramBufferedReader);
                if (c != ',')
                {
                  if (c == ']')
                  {
                    zak(5);
                    return localArrayList;
                  }
                  paramBufferedReader = new StringBuilder(19);
                  paramBufferedReader.append("Unexpected token: ");
                  paramBufferedReader.append(c);
                  throw new ParseException(paramBufferedReader.toString());
                }
                if (zaj(paramBufferedReader) == '{') {
                  localObject = this.zaql;
                } else {
                  throw new ParseException("Expected start of next object in array");
                }
              }
              else
              {
                return localArrayList;
              }
            }
            catch (IllegalAccessException paramBufferedReader)
            {
              throw new ParseException("Error instantiating inner object", paramBufferedReader);
            }
            catch (InstantiationException paramBufferedReader)
            {
              throw new ParseException("Error instantiating inner object", paramBufferedReader);
            }
          }
        }
        paramBufferedReader = new StringBuilder(19);
        paramBufferedReader.append("Unexpected token: ");
        paramBufferedReader.append(c);
        throw new ParseException(paramBufferedReader.toString());
      }
      zab(paramBufferedReader, zaqf);
      zak(5);
      return null;
    }
    zak(5);
    return localArrayList;
  }
  
  private final <O> ArrayList<O> zaa(BufferedReader paramBufferedReader, zaa<O> paramzaa)
    throws FastParser.ParseException, IOException
  {
    int i = zaj(paramBufferedReader);
    if (i == 110)
    {
      zab(paramBufferedReader, zaqf);
      return null;
    }
    if (i == 91)
    {
      this.zaql.push(Integer.valueOf(5));
      ArrayList localArrayList = new ArrayList();
      for (;;)
      {
        paramBufferedReader.mark(1024);
        i = zaj(paramBufferedReader);
        if (i == 0) {
          break label107;
        }
        if (i != 44)
        {
          if (i == 93) {
            break;
          }
          paramBufferedReader.reset();
          localArrayList.add(paramzaa.zah(this, paramBufferedReader));
        }
      }
      zak(5);
      return localArrayList;
      label107:
      throw new ParseException("Unexpected EOF");
    }
    throw new ParseException("Expected start of array");
  }
  
  private final boolean zaa(BufferedReader paramBufferedReader, FastJsonResponse paramFastJsonResponse)
    throws FastParser.ParseException, IOException
  {
    Map localMap = paramFastJsonResponse.getFieldMappings();
    Object localObject = zaa(paramBufferedReader);
    if (localObject == null)
    {
      zak(1);
      return false;
    }
    while (localObject != null)
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localMap.get(localObject);
      if (localField == null)
      {
        localObject = zab(paramBufferedReader);
      }
      else
      {
        this.zaql.push(Integer.valueOf(4));
        int i;
        switch (localField.zapq)
        {
        default: 
          i = localField.zapq;
          paramBufferedReader = new StringBuilder(30);
          paramBufferedReader.append("Invalid field type ");
          paramBufferedReader.append(i);
          throw new ParseException(paramBufferedReader.toString());
        case 11: 
          if (localField.zapr)
          {
            i = zaj(paramBufferedReader);
            if (i == 110)
            {
              zab(paramBufferedReader, zaqf);
              paramFastJsonResponse.addConcreteTypeArrayInternal(localField, localField.zapu, null);
              break label1094;
            }
            this.zaql.push(Integer.valueOf(5));
            if (i == 91)
            {
              paramFastJsonResponse.addConcreteTypeArrayInternal(localField, localField.zapu, zaa(paramBufferedReader, localField));
              break label1094;
            }
            throw new ParseException("Expected array start");
          }
          i = zaj(paramBufferedReader);
          if (i == 110)
          {
            zab(paramBufferedReader, zaqf);
            paramFastJsonResponse.addConcreteTypeInternal(localField, localField.zapu, null);
            break label1094;
          }
          this.zaql.push(Integer.valueOf(1));
          if (i == 123) {
            try
            {
              localObject = localField.zacp();
              zaa(paramBufferedReader, (FastJsonResponse)localObject);
              paramFastJsonResponse.addConcreteTypeInternal(localField, localField.zapu, (FastJsonResponse)localObject);
            }
            catch (IllegalAccessException paramBufferedReader)
            {
              throw new ParseException("Error instantiating inner object", paramBufferedReader);
            }
            catch (InstantiationException paramBufferedReader)
            {
              throw new ParseException("Error instantiating inner object", paramBufferedReader);
            }
          }
          throw new ParseException("Expected start of object");
        case 10: 
          i = zaj(paramBufferedReader);
          if (i == 110)
          {
            zab(paramBufferedReader, zaqf);
            localObject = null;
          }
          else
          {
            if (i != 123) {
              break label717;
            }
            this.zaql.push(Integer.valueOf(1));
            localObject = new HashMap();
            do
            {
              i = zaj(paramBufferedReader);
              if (i == 0) {
                break label707;
              }
              if (i == 34) {
                break;
              }
            } while (i != 125);
            for (;;)
            {
              zak(1);
              break label660;
              String str = zab(paramBufferedReader, this.zaqb, this.zaqd, null);
              if (zaj(paramBufferedReader) != ':')
              {
                paramBufferedReader = String.valueOf(str);
                if (paramBufferedReader.length() != 0) {
                  paramBufferedReader = "No map value found for key ".concat(paramBufferedReader);
                } else {
                  paramBufferedReader = new String("No map value found for key ");
                }
                throw new ParseException(paramBufferedReader);
              }
              if (zaj(paramBufferedReader) != '"')
              {
                paramBufferedReader = String.valueOf(str);
                if (paramBufferedReader.length() != 0) {
                  paramBufferedReader = "Expected String value for key ".concat(paramBufferedReader);
                } else {
                  paramBufferedReader = new String("Expected String value for key ");
                }
                throw new ParseException(paramBufferedReader);
              }
              ((HashMap)localObject).put(str, zab(paramBufferedReader, this.zaqb, this.zaqd, null));
              c = zaj(paramBufferedReader);
              if (c == ',') {
                break;
              }
              if (c != '}') {
                break label671;
              }
            }
          }
          paramFastJsonResponse.zaa(localField, (Map)localObject);
          break label1094;
          paramBufferedReader = new StringBuilder(48);
          paramBufferedReader.append("Unexpected character while parsing string map: ");
          paramBufferedReader.append(c);
          throw new ParseException(paramBufferedReader.toString());
          throw new ParseException("Unexpected EOF");
          throw new ParseException("Expected start of a map object");
        case 9: 
          localObject = Base64Utils.decodeUrlSafe(zaa(paramBufferedReader, this.zaqc, this.zaqe, zaqk));
          break;
        case 8: 
          localObject = Base64Utils.decode(zaa(paramBufferedReader, this.zaqc, this.zaqe, zaqk));
          paramFastJsonResponse.zaa(localField, (byte[])localObject);
          break;
        case 7: 
          if (localField.zapr) {
            paramFastJsonResponse.zah(localField, zaa(paramBufferedReader, zaqr));
          } else {
            paramFastJsonResponse.zaa(localField, zac(paramBufferedReader));
          }
          break;
        case 6: 
          if (localField.zapr) {
            paramFastJsonResponse.zag(localField, zaa(paramBufferedReader, zaqq));
          } else {
            paramFastJsonResponse.zaa(localField, zaa(paramBufferedReader, false));
          }
          break;
        case 5: 
          if (localField.zapr) {
            paramFastJsonResponse.zaf(localField, zaa(paramBufferedReader, zaqt));
          } else {
            paramFastJsonResponse.zaa(localField, zai(paramBufferedReader));
          }
          break;
        case 4: 
          if (localField.zapr) {
            paramFastJsonResponse.zae(localField, zaa(paramBufferedReader, zaqp));
          } else {
            paramFastJsonResponse.zaa(localField, zah(paramBufferedReader));
          }
          break;
        case 3: 
          if (localField.zapr) {
            paramFastJsonResponse.zad(localField, zaa(paramBufferedReader, zaqo));
          } else {
            paramFastJsonResponse.zaa(localField, zag(paramBufferedReader));
          }
          break;
        case 2: 
          if (localField.zapr) {
            paramFastJsonResponse.zac(localField, zaa(paramBufferedReader, zaqn));
          } else {
            paramFastJsonResponse.zaa(localField, zae(paramBufferedReader));
          }
          break;
        case 1: 
          label660:
          label671:
          label707:
          label717:
          if (localField.zapr) {
            paramFastJsonResponse.zab(localField, zaa(paramBufferedReader, zaqs));
          } else {
            paramFastJsonResponse.zaa(localField, zaf(paramBufferedReader));
          }
          break;
        }
        if (localField.zapr) {
          paramFastJsonResponse.zaa(localField, zaa(paramBufferedReader, zaqm));
        } else {
          paramFastJsonResponse.zaa(localField, zad(paramBufferedReader));
        }
        label1094:
        zak(4);
        zak(2);
        char c = zaj(paramBufferedReader);
        if (c != ',')
        {
          if (c == '}')
          {
            localObject = null;
          }
          else
          {
            paramBufferedReader = new StringBuilder(55);
            paramBufferedReader.append("Expected end of object or field separator, but found: ");
            paramBufferedReader.append(c);
            throw new ParseException(paramBufferedReader.toString());
          }
        }
        else {
          localObject = zaa(paramBufferedReader);
        }
      }
    }
    zak(1);
    return true;
  }
  
  private final boolean zaa(BufferedReader paramBufferedReader, boolean paramBoolean)
    throws FastParser.ParseException, IOException
  {
    for (;;)
    {
      char c = zaj(paramBufferedReader);
      if (c != '"')
      {
        char[] arrayOfChar;
        if (c != 'f')
        {
          if (c != 'n')
          {
            if (c == 't')
            {
              if (paramBoolean) {
                arrayOfChar = zaqh;
              } else {
                arrayOfChar = zaqg;
              }
              zab(paramBufferedReader, arrayOfChar);
              return true;
            }
            paramBufferedReader = new StringBuilder(19);
            paramBufferedReader.append("Unexpected token: ");
            paramBufferedReader.append(c);
            throw new ParseException(paramBufferedReader.toString());
          }
          zab(paramBufferedReader, zaqf);
          return false;
        }
        if (paramBoolean) {
          arrayOfChar = zaqj;
        } else {
          arrayOfChar = zaqi;
        }
        zab(paramBufferedReader, arrayOfChar);
        return false;
      }
      if (paramBoolean) {
        break;
      }
      paramBoolean = true;
    }
    throw new ParseException("No boolean value found in string");
  }
  
  private final String zab(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    paramBufferedReader.mark(1024);
    int j = zaj(paramBufferedReader);
    int k;
    int i;
    if (j != 34)
    {
      if (j != 44)
      {
        k = 1;
        if (j != 91)
        {
          if (j != 123)
          {
            paramBufferedReader.reset();
            zaa(paramBufferedReader, this.zaqc);
          }
          else
          {
            this.zaql.push(Integer.valueOf(1));
            paramBufferedReader.mark(32);
            i = zaj(paramBufferedReader);
            if (i == 125) {}
            for (;;)
            {
              zak(1);
              break label398;
              if (i != 34) {
                break;
              }
              paramBufferedReader.reset();
              zaa(paramBufferedReader);
              while (zab(paramBufferedReader) != null) {}
            }
            paramBufferedReader = new StringBuilder(18);
            paramBufferedReader.append("Unexpected token ");
            paramBufferedReader.append(i);
            throw new ParseException(paramBufferedReader.toString());
          }
        }
        else
        {
          this.zaql.push(Integer.valueOf(5));
          paramBufferedReader.mark(32);
          if (zaj(paramBufferedReader) == ']') {}
          for (;;)
          {
            zak(5);
            break label398;
            paramBufferedReader.reset();
            j = 0;
            int m = 0;
            while (k > 0)
            {
              i = zaj(paramBufferedReader);
              if (i == 0) {
                break label341;
              }
              if (Character.isISOControl(i)) {
                break label330;
              }
              int n = m;
              if (i == 34)
              {
                n = m;
                if (j == 0) {
                  n = m ^ 0x1;
                }
              }
              m = k;
              if (i == 91)
              {
                m = k;
                if (n == 0) {
                  m = k + 1;
                }
              }
              k = m;
              if (i == 93)
              {
                k = m;
                if (n == 0) {
                  k = m - 1;
                }
              }
              if ((i == 92) && (n != 0))
              {
                j ^= 0x1;
                m = n;
              }
              else
              {
                j = 0;
                m = n;
              }
            }
          }
          label330:
          throw new ParseException("Unexpected control character while reading array");
          label341:
          throw new ParseException("Unexpected EOF while parsing array");
        }
      }
      else
      {
        throw new ParseException("Missing value");
      }
    }
    else
    {
      if (paramBufferedReader.read(this.zaqa) == -1) {
        break label539;
      }
      k = this.zaqa[0];
      j = 0;
    }
    for (;;)
    {
      if ((k == 34) && (j == 0))
      {
        label398:
        i = zaj(paramBufferedReader);
        if (i != 44)
        {
          if (i == 125)
          {
            zak(2);
            return null;
          }
          paramBufferedReader = new StringBuilder(18);
          paramBufferedReader.append("Unexpected token ");
          paramBufferedReader.append(i);
          throw new ParseException(paramBufferedReader.toString());
        }
        zak(2);
        return zaa(paramBufferedReader);
      }
      if (k == 92) {
        j ^= 0x1;
      } else {
        j = 0;
      }
      if (paramBufferedReader.read(this.zaqa) == -1) {
        break label528;
      }
      i = this.zaqa[0];
      if (Character.isISOControl(i)) {
        break;
      }
      k = i;
    }
    throw new ParseException("Unexpected control character while reading string");
    label528:
    throw new ParseException("Unexpected EOF while parsing string");
    label539:
    throw new ParseException("Unexpected EOF while parsing string");
  }
  
  private static String zab(BufferedReader paramBufferedReader, char[] paramArrayOfChar1, StringBuilder paramStringBuilder, char[] paramArrayOfChar2)
    throws FastParser.ParseException, IOException
  {
    paramStringBuilder.setLength(0);
    paramBufferedReader.mark(paramArrayOfChar1.length);
    int i = 0;
    int k;
    for (int j = 0;; j = k)
    {
      int n = paramBufferedReader.read(paramArrayOfChar1);
      if (n == -1) {
        break;
      }
      k = i;
      int m = 0;
      i = j;
      j = k;
      k = m;
      while (k < n)
      {
        char c = paramArrayOfChar1[k];
        if (Character.isISOControl(c))
        {
          if (paramArrayOfChar2 != null)
          {
            m = 0;
            while (m < paramArrayOfChar2.length)
            {
              if (paramArrayOfChar2[m] == c)
              {
                m = 1;
                break label111;
              }
              m += 1;
            }
          }
          m = 0;
          label111:
          if (m == 0) {
            throw new ParseException("Unexpected control character while reading string");
          }
        }
        if ((c == '"') && (j == 0))
        {
          paramStringBuilder.append(paramArrayOfChar1, 0, k);
          paramBufferedReader.reset();
          paramBufferedReader.skip(k + 1);
          if (i != 0) {
            return JsonUtils.unescapeString(paramStringBuilder.toString());
          }
          return paramStringBuilder.toString();
        }
        if (c == '\\')
        {
          j ^= 0x1;
          i = 1;
        }
        else
        {
          j = 0;
        }
        k += 1;
      }
      paramStringBuilder.append(paramArrayOfChar1, 0, n);
      paramBufferedReader.mark(paramArrayOfChar1.length);
      k = i;
      i = j;
    }
    throw new ParseException("Unexpected EOF while parsing string");
  }
  
  private final void zab(BufferedReader paramBufferedReader, char[] paramArrayOfChar)
    throws FastParser.ParseException, IOException
  {
    int i = 0;
    while (i < paramArrayOfChar.length)
    {
      int k = paramBufferedReader.read(this.zaqb, 0, paramArrayOfChar.length - i);
      if (k != -1)
      {
        int j = 0;
        while (j < k) {
          if (paramArrayOfChar[(j + i)] == this.zaqb[j]) {
            j += 1;
          } else {
            throw new ParseException("Unexpected character");
          }
        }
        i += k;
      }
      else
      {
        throw new ParseException("Unexpected EOF");
      }
    }
  }
  
  private final String zac(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    return zaa(paramBufferedReader, this.zaqb, this.zaqd, null);
  }
  
  private final int zad(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    int i1 = zaa(paramBufferedReader, this.zaqc);
    if (i1 == 0) {
      return 0;
    }
    paramBufferedReader = this.zaqc;
    if (i1 > 0)
    {
      int i;
      int k;
      int m;
      if (paramBufferedReader[0] == '-')
      {
        i = 1;
        k = 1;
        m = Integer.MIN_VALUE;
      }
      else
      {
        i = 0;
        k = 0;
        m = -2147483647;
      }
      int j;
      int n;
      if (i < i1)
      {
        j = i + 1;
        i = Character.digit(paramBufferedReader[i], 10);
        if (i >= 0)
        {
          n = -i;
          i = j;
          j = n;
        }
        else
        {
          throw new ParseException("Unexpected non-digit character");
        }
      }
      else
      {
        j = 0;
      }
      while (i < i1)
      {
        n = Character.digit(paramBufferedReader[i], 10);
        if (n >= 0)
        {
          if (j >= -214748364)
          {
            j *= 10;
            if (j >= m + n)
            {
              j -= n;
              i += 1;
            }
            else
            {
              throw new ParseException("Number too large");
            }
          }
          else
          {
            throw new ParseException("Number too large");
          }
        }
        else {
          throw new ParseException("Unexpected non-digit character");
        }
      }
      if (k != 0)
      {
        if (i > 1) {
          return j;
        }
        throw new ParseException("No digits to parse");
      }
      return -j;
    }
    throw new ParseException("No number to parse");
  }
  
  private final long zae(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    int m = zaa(paramBufferedReader, this.zaqc);
    if (m == 0) {
      return 0L;
    }
    paramBufferedReader = this.zaqc;
    if (m > 0)
    {
      int i = 0;
      long l2;
      int j;
      if (paramBufferedReader[0] == '-')
      {
        l2 = Long.MIN_VALUE;
        i = 1;
        j = 1;
      }
      else
      {
        l2 = -9223372036854775807L;
        j = 0;
      }
      int k;
      long l1;
      if (i < m)
      {
        k = i + 1;
        i = Character.digit(paramBufferedReader[i], 10);
        if (i >= 0)
        {
          l1 = -i;
          i = k;
        }
        else
        {
          throw new ParseException("Unexpected non-digit character");
        }
      }
      else
      {
        l1 = 0L;
      }
      while (i < m)
      {
        k = Character.digit(paramBufferedReader[i], 10);
        if (k >= 0)
        {
          if (l1 >= -922337203685477580L)
          {
            l1 *= 10L;
            long l3 = k;
            if (l1 >= l2 + l3)
            {
              l1 -= l3;
              i += 1;
            }
            else
            {
              throw new ParseException("Number too large");
            }
          }
          else
          {
            throw new ParseException("Number too large");
          }
        }
        else {
          throw new ParseException("Unexpected non-digit character");
        }
      }
      if (j != 0)
      {
        if (i > 1) {
          return l1;
        }
        throw new ParseException("No digits to parse");
      }
      return -l1;
    }
    throw new ParseException("No number to parse");
  }
  
  private final BigInteger zaf(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    int i = zaa(paramBufferedReader, this.zaqc);
    if (i == 0) {
      return null;
    }
    return new BigInteger(new String(this.zaqc, 0, i));
  }
  
  private final float zag(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    int i = zaa(paramBufferedReader, this.zaqc);
    if (i == 0) {
      return 0.0F;
    }
    return Float.parseFloat(new String(this.zaqc, 0, i));
  }
  
  private final double zah(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    int i = zaa(paramBufferedReader, this.zaqc);
    if (i == 0) {
      return 0.0D;
    }
    return Double.parseDouble(new String(this.zaqc, 0, i));
  }
  
  private final BigDecimal zai(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    int i = zaa(paramBufferedReader, this.zaqc);
    if (i == 0) {
      return null;
    }
    return new BigDecimal(new String(this.zaqc, 0, i));
  }
  
  private final char zaj(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    if (paramBufferedReader.read(this.zaqa) == -1) {
      return '\000';
    }
    while (Character.isWhitespace(this.zaqa[0])) {
      if (paramBufferedReader.read(this.zaqa) == -1) {
        return '\000';
      }
    }
    return this.zaqa[0];
  }
  
  private final void zak(int paramInt)
    throws FastParser.ParseException
  {
    if (!this.zaql.isEmpty())
    {
      int i = ((Integer)this.zaql.pop()).intValue();
      if (i == paramInt) {
        return;
      }
      localStringBuilder = new StringBuilder(46);
      localStringBuilder.append("Expected state ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" but had ");
      localStringBuilder.append(i);
      throw new ParseException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder(46);
    localStringBuilder.append("Expected state ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" but had empty stack");
    throw new ParseException(localStringBuilder.toString());
  }
  
  /* Error */
  @KeepForSdk
  public void parse(java.io.InputStream paramInputStream, T paramT)
    throws FastParser.ParseException
  {
    // Byte code:
    //   0: new 150	java/io/BufferedReader
    //   3: dup
    //   4: new 518	java/io/InputStreamReader
    //   7: dup
    //   8: aload_1
    //   9: invokespecial 521	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   12: sipush 1024
    //   15: invokespecial 524	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   18: astore_1
    //   19: aload_0
    //   20: getfield 131	com/google/android/gms/common/server/response/FastParser:zaql	Ljava/util/Stack;
    //   23: iconst_0
    //   24: invokestatic 191	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   27: invokevirtual 195	java/util/Stack:push	(Ljava/lang/Object;)Ljava/lang/Object;
    //   30: pop
    //   31: aload_0
    //   32: aload_1
    //   33: invokespecial 144	com/google/android/gms/common/server/response/FastParser:zaj	(Ljava/io/BufferedReader;)C
    //   36: istore_3
    //   37: iload_3
    //   38: ifeq +174 -> 212
    //   41: iload_3
    //   42: bipush 91
    //   44: if_icmpeq +66 -> 110
    //   47: iload_3
    //   48: bipush 123
    //   50: if_icmpne +25 -> 75
    //   53: aload_0
    //   54: getfield 131	com/google/android/gms/common/server/response/FastParser:zaql	Ljava/util/Stack;
    //   57: iconst_1
    //   58: invokestatic 191	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   61: invokevirtual 195	java/util/Stack:push	(Ljava/lang/Object;)Ljava/lang/Object;
    //   64: pop
    //   65: aload_0
    //   66: aload_1
    //   67: aload_2
    //   68: invokespecial 235	com/google/android/gms/common/server/response/FastParser:zaa	(Ljava/io/BufferedReader;Lcom/google/android/gms/common/server/response/FastJsonResponse;)Z
    //   71: pop
    //   72: goto +119 -> 191
    //   75: new 119	java/lang/StringBuilder
    //   78: dup
    //   79: bipush 19
    //   81: invokespecial 122	java/lang/StringBuilder:<init>	(I)V
    //   84: astore_2
    //   85: aload_2
    //   86: ldc -56
    //   88: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: pop
    //   92: aload_2
    //   93: iload_3
    //   94: invokevirtual 207	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   97: pop
    //   98: new 7	com/google/android/gms/common/server/response/FastParser$ParseException
    //   101: dup
    //   102: aload_2
    //   103: invokevirtual 211	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokespecial 175	com/google/android/gms/common/server/response/FastParser$ParseException:<init>	(Ljava/lang/String;)V
    //   109: athrow
    //   110: aload_0
    //   111: getfield 131	com/google/android/gms/common/server/response/FastParser:zaql	Ljava/util/Stack;
    //   114: iconst_5
    //   115: invokestatic 191	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   118: invokevirtual 195	java/util/Stack:push	(Ljava/lang/Object;)Ljava/lang/Object;
    //   121: pop
    //   122: aload_2
    //   123: invokevirtual 266	com/google/android/gms/common/server/response/FastJsonResponse:getFieldMappings	()Ljava/util/Map;
    //   126: astore 4
    //   128: aload 4
    //   130: invokeinterface 527 1 0
    //   135: iconst_1
    //   136: if_icmpne +65 -> 201
    //   139: aload 4
    //   141: invokeinterface 531 1 0
    //   146: invokeinterface 537 1 0
    //   151: invokeinterface 542 1 0
    //   156: checkcast 544	java/util/Map$Entry
    //   159: invokeinterface 547 1 0
    //   164: checkcast 228	com/google/android/gms/common/server/response/FastJsonResponse$Field
    //   167: astore 4
    //   169: aload_0
    //   170: aload_1
    //   171: aload 4
    //   173: invokespecial 298	com/google/android/gms/common/server/response/FastParser:zaa	(Ljava/io/BufferedReader;Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Ljava/util/ArrayList;
    //   176: astore 5
    //   178: aload_2
    //   179: aload 4
    //   181: aload 4
    //   183: getfield 292	com/google/android/gms/common/server/response/FastJsonResponse$Field:zapu	Ljava/lang/String;
    //   186: aload 5
    //   188: invokevirtual 296	com/google/android/gms/common/server/response/FastJsonResponse:addConcreteTypeArrayInternal	(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/String;Ljava/util/ArrayList;)V
    //   191: aload_0
    //   192: iconst_0
    //   193: invokespecial 198	com/google/android/gms/common/server/response/FastParser:zak	(I)V
    //   196: aload_1
    //   197: invokevirtual 550	java/io/BufferedReader:close	()V
    //   200: return
    //   201: new 7	com/google/android/gms/common/server/response/FastParser$ParseException
    //   204: dup
    //   205: ldc_w 552
    //   208: invokespecial 175	com/google/android/gms/common/server/response/FastParser$ParseException:<init>	(Ljava/lang/String;)V
    //   211: athrow
    //   212: new 7	com/google/android/gms/common/server/response/FastParser$ParseException
    //   215: dup
    //   216: ldc_w 554
    //   219: invokespecial 175	com/google/android/gms/common/server/response/FastParser$ParseException:<init>	(Ljava/lang/String;)V
    //   222: athrow
    //   223: astore_2
    //   224: goto +13 -> 237
    //   227: astore_2
    //   228: new 7	com/google/android/gms/common/server/response/FastParser$ParseException
    //   231: dup
    //   232: aload_2
    //   233: invokespecial 557	com/google/android/gms/common/server/response/FastParser$ParseException:<init>	(Ljava/lang/Throwable;)V
    //   236: athrow
    //   237: aload_1
    //   238: invokevirtual 550	java/io/BufferedReader:close	()V
    //   241: aload_2
    //   242: athrow
    //   243: astore_1
    //   244: return
    //   245: astore_1
    //   246: goto -5 -> 241
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	249	0	this	FastParser
    //   0	249	1	paramInputStream	java.io.InputStream
    //   0	249	2	paramT	T
    //   36	58	3	c	char
    //   126	56	4	localObject	Object
    //   176	11	5	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   19	37	223	finally
    //   53	72	223	finally
    //   75	110	223	finally
    //   110	191	223	finally
    //   191	196	223	finally
    //   201	212	223	finally
    //   212	223	223	finally
    //   228	237	223	finally
    //   19	37	227	java/io/IOException
    //   53	72	227	java/io/IOException
    //   75	110	227	java/io/IOException
    //   110	191	227	java/io/IOException
    //   191	196	227	java/io/IOException
    //   201	212	227	java/io/IOException
    //   212	223	227	java/io/IOException
    //   196	200	243	java/io/IOException
    //   237	241	245	java/io/IOException
  }
  
  @KeepForSdk
  @ShowFirstParty
  public static class ParseException
    extends Exception
  {
    public ParseException(String paramString)
    {
      super();
    }
    
    public ParseException(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
    
    public ParseException(Throwable paramThrowable)
    {
      super();
    }
  }
  
  static abstract interface zaa<O>
  {
    public abstract O zah(FastParser paramFastParser, BufferedReader paramBufferedReader)
      throws FastParser.ParseException, IOException;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/common/server/response/FastParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */