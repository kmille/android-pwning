package com.google.android.gms.internal.measurement;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzack
{
  private static void zza(String paramString, Object paramObject, StringBuffer paramStringBuffer1, StringBuffer paramStringBuffer2)
    throws IllegalAccessException, InvocationTargetException
  {
    if (paramObject != null)
    {
      int j;
      if ((paramObject instanceof zzacj))
      {
        int m = paramStringBuffer1.length();
        if (paramString != null)
        {
          paramStringBuffer2.append(paramStringBuffer1);
          paramStringBuffer2.append(zzfs(paramString));
          paramStringBuffer2.append(" <\n");
          paramStringBuffer1.append("  ");
        }
        Class localClass = paramObject.getClass();
        Object localObject1 = localClass.getFields();
        int n = localObject1.length;
        i = 0;
        Object localObject3;
        while (i < n)
        {
          Object localObject4 = localObject1[i];
          j = ((Field)localObject4).getModifiers();
          localObject2 = ((Field)localObject4).getName();
          if ((!"cachedSize".equals(localObject2)) && ((j & 0x1) == 1) && ((j & 0x8) != 8) && (!((String)localObject2).startsWith("_")) && (!((String)localObject2).endsWith("_")))
          {
            localObject3 = ((Field)localObject4).getType();
            localObject4 = ((Field)localObject4).get(paramObject);
            int k;
            if ((((Class)localObject3).isArray()) && (((Class)localObject3).getComponentType() != Byte.TYPE))
            {
              if (localObject4 == null) {
                j = 0;
              } else {
                j = Array.getLength(localObject4);
              }
              k = 0;
            }
            while (k < j)
            {
              zza((String)localObject2, Array.get(localObject4, k), paramStringBuffer1, paramStringBuffer2);
              k += 1;
              continue;
              zza((String)localObject2, localObject4, paramStringBuffer1, paramStringBuffer2);
            }
          }
          i += 1;
        }
        Object localObject2 = localClass.getMethods();
        j = localObject2.length;
        i = 0;
        while (i < j)
        {
          localObject1 = localObject2[i].getName();
          if (((String)localObject1).startsWith("set")) {
            localObject3 = ((String)localObject1).substring(3);
          }
          try
          {
            localObject1 = String.valueOf(localObject3);
            if (((String)localObject1).length() != 0) {
              localObject1 = "has".concat((String)localObject1);
            } else {
              localObject1 = new String("has");
            }
            localObject1 = localClass.getMethod((String)localObject1, new Class[0]);
            if (((Boolean)((Method)localObject1).invoke(paramObject, new Object[0])).booleanValue())
            {
              localObject1 = String.valueOf(localObject3);
              if (((String)localObject1).length() != 0) {
                localObject1 = "get".concat((String)localObject1);
              } else {
                localObject1 = new String("get");
              }
              localObject1 = localClass.getMethod((String)localObject1, new Class[0]);
              zza((String)localObject3, ((Method)localObject1).invoke(paramObject, new Object[0]), paramStringBuffer1, paramStringBuffer2);
            }
          }
          catch (NoSuchMethodException localNoSuchMethodException)
          {
            for (;;) {}
          }
          i += 1;
        }
        if (paramString != null)
        {
          paramStringBuffer1.setLength(m);
          paramStringBuffer2.append(paramStringBuffer1);
          paramStringBuffer2.append(">\n");
        }
        return;
      }
      paramString = zzfs(paramString);
      paramStringBuffer2.append(paramStringBuffer1);
      paramStringBuffer2.append(paramString);
      paramStringBuffer2.append(": ");
      if ((paramObject instanceof String))
      {
        paramObject = (String)paramObject;
        paramString = (String)paramObject;
        if (!((String)paramObject).startsWith("http"))
        {
          paramString = (String)paramObject;
          if (((String)paramObject).length() > 200) {
            paramString = String.valueOf(((String)paramObject).substring(0, 200)).concat("[...]");
          }
        }
        j = paramString.length();
        paramObject = new StringBuilder(j);
        i = 0;
        while (i < j)
        {
          char c = paramString.charAt(i);
          if ((c >= ' ') && (c <= '~') && (c != '"') && (c != '\'')) {
            ((StringBuilder)paramObject).append(c);
          } else {
            ((StringBuilder)paramObject).append(String.format("\\u%04x", new Object[] { Integer.valueOf(c) }));
          }
          i += 1;
        }
        paramString = ((StringBuilder)paramObject).toString();
        paramStringBuffer2.append("\"");
        paramStringBuffer2.append(paramString);
        paramString = "\"";
      }
      else
      {
        if (!(paramObject instanceof byte[])) {
          break label822;
        }
        paramString = (byte[])paramObject;
        if (paramString != null) {
          break label702;
        }
        paramString = "\"\"";
      }
      paramStringBuffer2.append(paramString);
      break label828;
      label702:
      paramStringBuffer2.append('"');
      int i = 0;
      while (i < paramString.length)
      {
        j = paramString[i] & 0xFF;
        if ((j != 92) && (j != 34))
        {
          if ((j < 32) || (j >= 127))
          {
            paramStringBuffer2.append(String.format("\\%03o", new Object[] { Integer.valueOf(j) }));
            break label803;
          }
        }
        else {
          paramStringBuffer2.append('\\');
        }
        paramStringBuffer2.append((char)j);
        label803:
        i += 1;
      }
      paramStringBuffer2.append('"');
      break label828;
      label822:
      paramStringBuffer2.append(paramObject);
      label828:
      paramStringBuffer2.append("\n");
    }
  }
  
  public static <T extends zzacj> String zzc(T paramT)
  {
    if (paramT == null) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    try
    {
      zza(null, paramT, new StringBuffer(), localStringBuffer);
      return localStringBuffer.toString();
    }
    catch (InvocationTargetException paramT)
    {
      paramT = String.valueOf(paramT.getMessage());
      if (paramT.length() != 0) {
        return "Error printing proto: ".concat(paramT);
      }
      return new String("Error printing proto: ");
    }
    catch (IllegalAccessException paramT)
    {
      paramT = String.valueOf(paramT.getMessage());
      if (paramT.length() != 0) {
        return "Error printing proto: ".concat(paramT);
      }
    }
    return new String("Error printing proto: ");
  }
  
  private static String zzfs(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (i < paramString.length())
    {
      char c2 = paramString.charAt(i);
      if (i == 0) {}
      for (;;)
      {
        char c1 = Character.toLowerCase(c2);
        do
        {
          localStringBuffer.append(c1);
          break;
          c1 = c2;
        } while (!Character.isUpperCase(c2));
        localStringBuffer.append('_');
      }
      i += 1;
    }
    return localStringBuffer.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzack.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */