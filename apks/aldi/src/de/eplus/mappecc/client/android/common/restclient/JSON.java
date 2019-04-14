package de.eplus.mappecc.client.android.common.restclient;

import a.a.a;
import a.a.b;
import a.a.b.f;
import a.a.b.i;
import a.a.b.k;
import a.a.b.o;
import a.a.b.p;
import a.a.b.q;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.eplus.mappecc.client.android.common.restclient.model.DSLProductModel;
import de.eplus.mappecc.client.android.common.restclient.model.FrontendConditionArrayModel;
import de.eplus.mappecc.client.android.common.restclient.model.FrontendConditionBaseModel;
import de.eplus.mappecc.client.android.common.restclient.model.FrontendConditionKeyValueModel;
import de.eplus.mappecc.client.android.common.restclient.model.FrontendConditionTextModel;
import de.eplus.mappecc.client.android.common.restclient.model.FrontendConditionWorldzonesModel;
import de.eplus.mappecc.client.android.common.restclient.model.HWOnlyProduct;
import de.eplus.mappecc.client.android.common.restclient.model.MobileProduct;
import de.eplus.mappecc.client.android.common.restclient.model.OrderModel;
import de.eplus.mappecc.client.android.common.restclient.model.PrepaidMobile;
import de.eplus.mappecc.client.android.common.restclient.model.SimCardsOrderModel;
import de.eplus.mappecc.client.android.common.restclient.model.SubscriptionTypeModel;
import de.eplus.mappecc.client.android.common.restclient.model.UdpSimcardOrderModel;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;

public class JSON
{
  private DateTimeTypeAdapter dateTimeTypeAdapter = new DateTimeTypeAdapter();
  private DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
  private Gson gson = createGson().registerTypeAdapter(java.util.Date.class, this.dateTypeAdapter).registerTypeAdapter(java.sql.Date.class, this.sqlDateTypeAdapter).registerTypeAdapter(DateTime.class, this.dateTimeTypeAdapter).registerTypeAdapter(LocalDate.class, this.localDateTypeAdapter).create();
  private LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
  private SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
  
  public static GsonBuilder createGson()
  {
    a.a.c localc = new a.a.c().a(SubscriptionTypeModel.class, new a.a.e()
    {
      public final Class getClassForElement(JsonElement paramAnonymousJsonElement)
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("DSLProductModel", DSLProductModel.class);
        localHashMap.put("HWOnlyProduct", HWOnlyProduct.class);
        localHashMap.put("MobileProduct", MobileProduct.class);
        localHashMap.put("PrepaidMobile", PrepaidMobile.class);
        localHashMap.put("SubscriptionTypeModel", SubscriptionTypeModel.class);
        return JSON.getClassByDiscriminator(localHashMap, JSON.access$000(paramAnonymousJsonElement, "type"));
      }
    }).a(FrontendConditionBaseModel.class, new a.a.e()
    {
      public final Class getClassForElement(JsonElement paramAnonymousJsonElement)
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("FrontendConditionArrayModel", FrontendConditionArrayModel.class);
        localHashMap.put("FrontendConditionKeyValueModel", FrontendConditionKeyValueModel.class);
        localHashMap.put("FrontendConditionTextModel", FrontendConditionTextModel.class);
        localHashMap.put("FrontendConditionWorldzonesModel", FrontendConditionWorldzonesModel.class);
        localHashMap.put("FrontendConditionBaseModel", FrontendConditionBaseModel.class);
        return JSON.getClassByDiscriminator(localHashMap, JSON.access$000(paramAnonymousJsonElement, "type"));
      }
    }).a(OrderModel.class, new a.a.e()
    {
      public final Class getClassForElement(JsonElement paramAnonymousJsonElement)
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("SimCardsOrderModel", SimCardsOrderModel.class);
        localHashMap.put("UdpSimcardOrderModel", UdpSimcardOrderModel.class);
        localHashMap.put("OrderModel", OrderModel.class);
        return JSON.getClassByDiscriminator(localHashMap, JSON.access$000(paramAnonymousJsonElement, "type"));
      }
    });
    Object localObject1 = Collections.newSetFromMap(new ConcurrentHashMap());
    GsonBuilder localGsonBuilder = new GsonBuilder();
    if (localc.j)
    {
      localObject2 = new a.a.c.a.c(new i(localc.d));
      localc.a(Object.class).a().add(localObject2);
    }
    if (localc.k) {
      localGsonBuilder.registerTypeAdapterFactory(new f(localc.e, localc.f));
    }
    Object localObject2 = localc.c.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (Class)((Iterator)localObject2).next();
      localObject3 = (a)localc.a.get(localObject3);
      if (((a)localObject3).b != null) {
        localGsonBuilder.registerTypeAdapterFactory(new p((a)localObject3, (Set)localObject1));
      }
      localGsonBuilder.registerTypeAdapterFactory(new k((a)localObject3));
    }
    localObject1 = localc.g.entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Map.Entry)((Iterator)localObject1).next();
      localGsonBuilder.registerTypeAdapterFactory(new a.a.b.e((Class)((Map.Entry)localObject2).getKey(), (Enum)((Map.Entry)localObject2).getValue()));
    }
    if (localc.h != null) {
      localGsonBuilder.registerTypeAdapter(java.util.Date.class, localc.h.a(localc.i));
    }
    localGsonBuilder.registerTypeAdapterFactory(new o());
    localGsonBuilder.registerTypeAdapterFactory(new q(localc.b));
    return localGsonBuilder;
  }
  
  private static Class getClassByDiscriminator(Map paramMap, String paramString)
  {
    paramMap = (Class)paramMap.get(paramString);
    if (paramMap != null) {
      return paramMap;
    }
    paramMap = new StringBuilder("cannot determine model class of name: <");
    paramMap.append(paramString);
    paramMap.append(">");
    throw new IllegalArgumentException(paramMap.toString());
  }
  
  private static String getDiscriminatorValue(JsonElement paramJsonElement, String paramString)
  {
    paramJsonElement = paramJsonElement.getAsJsonObject().get(paramString);
    if (paramJsonElement != null) {
      return paramJsonElement.getAsString();
    }
    paramJsonElement = new StringBuilder("missing discriminator field: <");
    paramJsonElement.append(paramString);
    paramJsonElement.append(">");
    throw new IllegalArgumentException(paramJsonElement.toString());
  }
  
  public Gson getGson()
  {
    return this.gson;
  }
  
  public JSON setDateFormat(DateFormat paramDateFormat)
  {
    this.dateTypeAdapter.setFormat(paramDateFormat);
    return this;
  }
  
  public JSON setDateTimeFormat(DateTimeFormatter paramDateTimeFormatter)
  {
    this.dateTimeTypeAdapter.setFormat(paramDateTimeFormatter);
    return this;
  }
  
  public JSON setGson(Gson paramGson)
  {
    this.gson = paramGson;
    return this;
  }
  
  public JSON setLocalDateFormat(DateTimeFormatter paramDateTimeFormatter)
  {
    this.localDateTypeAdapter.setFormat(paramDateTimeFormatter);
    return this;
  }
  
  public JSON setSqlDateFormat(DateFormat paramDateFormat)
  {
    this.sqlDateTypeAdapter.setFormat(paramDateFormat);
    return this;
  }
  
  public static class DateTimeTypeAdapter
    extends TypeAdapter<DateTime>
  {
    private DateTimeFormatter formatter;
    
    public DateTimeTypeAdapter()
    {
      this(new DateTimeFormatterBuilder().append(ISODateTimeFormat.dateTime().getPrinter(), ISODateTimeFormat.dateOptionalTimeParser().getParser()).toFormatter());
    }
    
    public DateTimeTypeAdapter(DateTimeFormatter paramDateTimeFormatter)
    {
      this.formatter = paramDateTimeFormatter;
    }
    
    public DateTime read(JsonReader paramJsonReader)
      throws IOException
    {
      if (JSON.4.$SwitchMap$com$google$gson$stream$JsonToken[paramJsonReader.peek().ordinal()] != 1)
      {
        paramJsonReader = paramJsonReader.nextString();
        return this.formatter.parseDateTime(paramJsonReader);
      }
      paramJsonReader.nextNull();
      return null;
    }
    
    public void setFormat(DateTimeFormatter paramDateTimeFormatter)
    {
      this.formatter = paramDateTimeFormatter;
    }
    
    public void write(JsonWriter paramJsonWriter, DateTime paramDateTime)
      throws IOException
    {
      if (paramDateTime == null)
      {
        paramJsonWriter.nullValue();
        return;
      }
      paramJsonWriter.value(this.formatter.print(paramDateTime));
    }
  }
  
  public static class DateTypeAdapter
    extends TypeAdapter<java.util.Date>
  {
    private DateFormat dateFormat;
    
    public DateTypeAdapter() {}
    
    public DateTypeAdapter(DateFormat paramDateFormat)
    {
      this.dateFormat = paramDateFormat;
    }
    
    public java.util.Date read(JsonReader paramJsonReader)
      throws IOException
    {
      try
      {
        if (JSON.4.$SwitchMap$com$google$gson$stream$JsonToken[paramJsonReader.peek().ordinal()] != 1)
        {
          paramJsonReader = paramJsonReader.nextString();
          try
          {
            if (this.dateFormat != null) {
              return this.dateFormat.parse(paramJsonReader);
            }
            paramJsonReader = ISO8601Utils.parse(paramJsonReader, new ParsePosition(0));
            return paramJsonReader;
          }
          catch (ParseException paramJsonReader)
          {
            throw new JsonParseException(paramJsonReader);
          }
        }
        paramJsonReader.nextNull();
        return null;
      }
      catch (IllegalArgumentException paramJsonReader)
      {
        throw new JsonParseException(paramJsonReader);
      }
    }
    
    public void setFormat(DateFormat paramDateFormat)
    {
      this.dateFormat = paramDateFormat;
    }
    
    public void write(JsonWriter paramJsonWriter, java.util.Date paramDate)
      throws IOException
    {
      if (paramDate == null)
      {
        paramJsonWriter.nullValue();
        return;
      }
      if (this.dateFormat != null) {
        paramDate = this.dateFormat.format(paramDate);
      } else {
        paramDate = ISO8601Utils.format(paramDate, true);
      }
      paramJsonWriter.value(paramDate);
    }
  }
  
  public class LocalDateTypeAdapter
    extends TypeAdapter<LocalDate>
  {
    private DateTimeFormatter formatter;
    
    public LocalDateTypeAdapter()
    {
      this(ISODateTimeFormat.date());
    }
    
    public LocalDateTypeAdapter(DateTimeFormatter paramDateTimeFormatter)
    {
      this.formatter = paramDateTimeFormatter;
    }
    
    public LocalDate read(JsonReader paramJsonReader)
      throws IOException
    {
      if (JSON.4.$SwitchMap$com$google$gson$stream$JsonToken[paramJsonReader.peek().ordinal()] != 1)
      {
        paramJsonReader = paramJsonReader.nextString();
        return this.formatter.parseLocalDate(paramJsonReader);
      }
      paramJsonReader.nextNull();
      return null;
    }
    
    public void setFormat(DateTimeFormatter paramDateTimeFormatter)
    {
      this.formatter = paramDateTimeFormatter;
    }
    
    public void write(JsonWriter paramJsonWriter, LocalDate paramLocalDate)
      throws IOException
    {
      if (paramLocalDate == null)
      {
        paramJsonWriter.nullValue();
        return;
      }
      paramJsonWriter.value(this.formatter.print(paramLocalDate));
    }
  }
  
  public static class SqlDateTypeAdapter
    extends TypeAdapter<java.sql.Date>
  {
    private DateFormat dateFormat;
    
    public SqlDateTypeAdapter() {}
    
    public SqlDateTypeAdapter(DateFormat paramDateFormat)
    {
      this.dateFormat = paramDateFormat;
    }
    
    public java.sql.Date read(JsonReader paramJsonReader)
      throws IOException
    {
      if (JSON.4.$SwitchMap$com$google$gson$stream$JsonToken[paramJsonReader.peek().ordinal()] != 1)
      {
        paramJsonReader = paramJsonReader.nextString();
        try
        {
          if (this.dateFormat != null) {
            return new java.sql.Date(this.dateFormat.parse(paramJsonReader).getTime());
          }
          paramJsonReader = new java.sql.Date(ISO8601Utils.parse(paramJsonReader, new ParsePosition(0)).getTime());
          return paramJsonReader;
        }
        catch (ParseException paramJsonReader)
        {
          throw new JsonParseException(paramJsonReader);
        }
      }
      paramJsonReader.nextNull();
      return null;
    }
    
    public void setFormat(DateFormat paramDateFormat)
    {
      this.dateFormat = paramDateFormat;
    }
    
    public void write(JsonWriter paramJsonWriter, java.sql.Date paramDate)
      throws IOException
    {
      if (paramDate == null)
      {
        paramJsonWriter.nullValue();
        return;
      }
      if (this.dateFormat != null) {
        paramDate = this.dateFormat.format(paramDate);
      } else {
        paramDate = paramDate.toString();
      }
      paramJsonWriter.value(paramDate);
    }
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/de/eplus/mappecc/client/android/common/restclient/JSON.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */