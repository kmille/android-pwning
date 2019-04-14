package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

final class zzaas
{
  static String zza(zzaaq paramzzaaq, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("# ");
    localStringBuilder.append(paramString);
    zza(paramzzaaq, localStringBuilder, 0);
    return localStringBuilder.toString();
  }
  
  private static void zza(zzaaq paramzzaaq, StringBuilder paramStringBuilder, int paramInt)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Object localObject1 = new TreeSet();
    Object localObject2 = paramzzaaq.getClass().getDeclaredMethods();
    int j = localObject2.length;
    int i = 0;
    while (i < j)
    {
      localObject3 = localObject2[i];
      localHashMap2.put(((Method)localObject3).getName(), localObject3);
      if (((Method)localObject3).getParameterTypes().length == 0)
      {
        localHashMap1.put(((Method)localObject3).getName(), localObject3);
        if (((Method)localObject3).getName().startsWith("get")) {
          ((Set)localObject1).add(((Method)localObject3).getName());
        }
      }
      i += 1;
    }
    Object localObject3 = ((Set)localObject1).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (String)((Iterator)localObject3).next();
      Object localObject4 = ((String)localObject2).replaceFirst("get", "");
      Object localObject5;
      if ((((String)localObject4).endsWith("List")) && (!((String)localObject4).endsWith("OrBuilderList")) && (!((String)localObject4).equals("List")))
      {
        localObject1 = String.valueOf(((String)localObject4).substring(0, 1).toLowerCase());
        localObject5 = String.valueOf(((String)localObject4).substring(1, ((String)localObject4).length() - 4));
        if (((String)localObject5).length() != 0) {
          localObject1 = ((String)localObject1).concat((String)localObject5);
        } else {
          localObject1 = new String((String)localObject1);
        }
        localObject5 = (Method)localHashMap1.get(localObject2);
        if ((localObject5 != null) && (((Method)localObject5).getReturnType().equals(List.class)))
        {
          zzb(paramStringBuilder, paramInt, zzfp((String)localObject1), zzzv.zza((Method)localObject5, paramzzaaq, new Object[0]));
          continue;
        }
      }
      if ((((String)localObject4).endsWith("Map")) && (!((String)localObject4).equals("Map")))
      {
        localObject1 = String.valueOf(((String)localObject4).substring(0, 1).toLowerCase());
        localObject5 = String.valueOf(((String)localObject4).substring(1, ((String)localObject4).length() - 3));
        if (((String)localObject5).length() != 0) {
          localObject1 = ((String)localObject1).concat((String)localObject5);
        } else {
          localObject1 = new String((String)localObject1);
        }
        localObject2 = (Method)localHashMap1.get(localObject2);
        if ((localObject2 != null) && (((Method)localObject2).getReturnType().equals(Map.class)) && (!((Method)localObject2).isAnnotationPresent(Deprecated.class)) && (Modifier.isPublic(((Method)localObject2).getModifiers())))
        {
          zzb(paramStringBuilder, paramInt, zzfp((String)localObject1), zzzv.zza((Method)localObject2, paramzzaaq, new Object[0]));
          continue;
        }
      }
      localObject1 = String.valueOf(localObject4);
      if (((String)localObject1).length() != 0) {
        localObject1 = "set".concat((String)localObject1);
      } else {
        localObject1 = new String("set");
      }
      if ((Method)localHashMap2.get(localObject1) != null) {
        if (((String)localObject4).endsWith("Bytes"))
        {
          localObject1 = String.valueOf(((String)localObject4).substring(0, ((String)localObject4).length() - 5));
          if (((String)localObject1).length() != 0) {
            localObject1 = "get".concat((String)localObject1);
          } else {
            localObject1 = new String("get");
          }
          if (localHashMap1.containsKey(localObject1)) {}
        }
        else
        {
          localObject1 = String.valueOf(((String)localObject4).substring(0, 1).toLowerCase());
          localObject2 = String.valueOf(((String)localObject4).substring(1));
          if (((String)localObject2).length() != 0) {
            localObject1 = ((String)localObject1).concat((String)localObject2);
          } else {
            localObject1 = new String((String)localObject1);
          }
          localObject2 = String.valueOf(localObject4);
          if (((String)localObject2).length() != 0) {
            localObject2 = "get".concat((String)localObject2);
          } else {
            localObject2 = new String("get");
          }
          localObject5 = (Method)localHashMap1.get(localObject2);
          localObject2 = String.valueOf(localObject4);
          if (((String)localObject2).length() != 0) {
            localObject2 = "has".concat((String)localObject2);
          } else {
            localObject2 = new String("has");
          }
          localObject2 = (Method)localHashMap1.get(localObject2);
          if (localObject5 != null)
          {
            localObject4 = zzzv.zza((Method)localObject5, paramzzaaq, new Object[0]);
            boolean bool;
            if (localObject2 == null)
            {
              if ((localObject4 instanceof Boolean)) {
                if (((Boolean)localObject4).booleanValue()) {}
              }
              for (;;)
              {
                bool = true;
                break;
                label862:
                label886:
                label952:
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          bool = false;
                          break label974;
                          if (!(localObject4 instanceof Integer)) {
                            break;
                          }
                        } while (((Integer)localObject4).intValue() != 0);
                        break;
                        if (!(localObject4 instanceof Float)) {
                          break label862;
                        }
                      } while (((Float)localObject4).floatValue() != 0.0F);
                      break;
                      if (!(localObject4 instanceof Double)) {
                        break label886;
                      }
                    } while (((Double)localObject4).doubleValue() != 0.0D);
                    break;
                    if ((localObject4 instanceof String)) {}
                    for (localObject2 = "";; localObject2 = zzzb.zzbte)
                    {
                      bool = localObject4.equals(localObject2);
                      break label974;
                      if (!(localObject4 instanceof zzzb)) {
                        break;
                      }
                    }
                    if (!(localObject4 instanceof zzaaq)) {
                      break label952;
                    }
                  } while (localObject4 != ((zzaaq)localObject4).zzuo());
                  break;
                } while ((!(localObject4 instanceof Enum)) || (((Enum)localObject4).ordinal() != 0));
              }
              label974:
              if (!bool) {
                bool = true;
              } else {
                bool = false;
              }
            }
            else
            {
              bool = ((Boolean)zzzv.zza((Method)localObject2, paramzzaaq, new Object[0])).booleanValue();
            }
            if (bool) {
              zzb(paramStringBuilder, paramInt, zzfp((String)localObject1), localObject4);
            }
          }
        }
      }
    }
    if ((paramzzaaq instanceof zzzv.zza))
    {
      paramzzaaq = ((zzzv.zza)paramzzaaq).zzbui.iterator();
      if (!paramzzaaq.hasNext()) {
        return;
      }
      ((Map.Entry)paramzzaaq.next()).getKey();
      throw new NoSuchMethodError();
    }
  }
  
  static final void zzb(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if ((paramObject instanceof List))
    {
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        zzb(paramStringBuilder, paramInt, paramString, ((Iterator)paramObject).next());
      }
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (((Iterator)paramObject).hasNext()) {
        zzb(paramStringBuilder, paramInt, paramString, (Map.Entry)((Iterator)paramObject).next());
      }
      return;
    }
    paramStringBuilder.append('\n');
    int j = 0;
    int k = 0;
    int i = 0;
    while (i < paramInt)
    {
      paramStringBuilder.append(' ');
      i += 1;
    }
    paramStringBuilder.append(paramString);
    if ((paramObject instanceof String))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(zzabl.zza(zzzb.zzfn((String)paramObject)));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof zzzb))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(zzabl.zza((zzzb)paramObject));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof zzzv))
    {
      paramStringBuilder.append(" {");
      zza((zzzv)paramObject, paramStringBuilder, paramInt + 2);
      paramStringBuilder.append("\n");
      i = k;
      while (i < paramInt)
      {
        paramStringBuilder.append(' ');
        i += 1;
      }
      paramStringBuilder.append("}");
      return;
    }
    if ((paramObject instanceof Map.Entry))
    {
      paramStringBuilder.append(" {");
      paramString = (Map.Entry)paramObject;
      i = paramInt + 2;
      zzb(paramStringBuilder, i, "key", paramString.getKey());
      zzb(paramStringBuilder, i, "value", paramString.getValue());
      paramStringBuilder.append("\n");
      i = j;
      while (i < paramInt)
      {
        paramStringBuilder.append(' ');
        i += 1;
      }
      paramStringBuilder.append("}");
      return;
    }
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject.toString());
  }
  
  private static final String zzfp(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < paramString.length())
    {
      char c = paramString.charAt(i);
      if (Character.isUpperCase(c)) {
        localStringBuilder.append("_");
      }
      localStringBuilder.append(Character.toLowerCase(c));
      i += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/com/google/android/gms/internal/measurement/zzaas.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */