package b.i.b.a.d;

final class c<V>
{
  static final c<Object> a = new c();
  private final long b;
  private final V c;
  private final c<V> d;
  private final c<V> e;
  private final int f;
  
  private c()
  {
    this.f = 0;
    this.b = 0L;
    this.c = null;
    this.d = null;
    this.e = null;
  }
  
  private c(long paramLong, V paramV, c<V> paramc1, c<V> paramc2)
  {
    this.b = paramLong;
    this.c = paramV;
    this.d = paramc1;
    this.e = paramc2;
    this.f = (paramc1.f + 1 + paramc2.f);
  }
  
  private static <V> c<V> a(long paramLong, V paramV, c<V> paramc1, c<V> paramc2)
  {
    if (paramc1.f + paramc2.f > 1)
    {
      c localc1;
      c localc2;
      c localc3;
      c localc4;
      if (paramc1.f >= paramc2.f * 5)
      {
        localc1 = paramc1.d;
        localc2 = paramc1.e;
        if (localc2.f < localc1.f * 2) {
          return new c(paramc1.b + paramLong, paramc1.c, localc1, new c(-paramc1.b, paramV, localc2.b(localc2.b + paramc1.b), paramc2));
        }
        localc3 = localc2.d;
        localc4 = localc2.e;
        return new c(localc2.b + paramc1.b + paramLong, localc2.c, new c(-localc2.b, paramc1.c, localc1, localc3.b(localc3.b + localc2.b)), new c(-paramc1.b - localc2.b, paramV, localc4.b(localc4.b + localc2.b + paramc1.b), paramc2));
      }
      if (paramc2.f >= paramc1.f * 5)
      {
        localc1 = paramc2.d;
        localc2 = paramc2.e;
        if (localc1.f < localc2.f * 2) {
          return new c(paramc2.b + paramLong, paramc2.c, new c(-paramc2.b, paramV, paramc1, localc1.b(localc1.b + paramc2.b)), localc2);
        }
        localc3 = localc1.d;
        localc4 = localc1.e;
        return new c(localc1.b + paramc2.b + paramLong, localc1.c, new c(-paramc2.b - localc1.b, paramV, paramc1, localc3.b(localc3.b + localc1.b + paramc2.b)), new c(-localc1.b, paramc2.c, localc4.b(localc4.b + localc1.b), localc2));
      }
    }
    return new c(paramLong, paramV, paramc1, paramc2);
  }
  
  private c<V> a(c<V> paramc1, c<V> paramc2)
  {
    if ((paramc1 == this.d) && (paramc2 == this.e)) {
      return this;
    }
    return a(this.b, this.c, paramc1, paramc2);
  }
  
  private c<V> b(long paramLong)
  {
    if (this.f != 0)
    {
      if (paramLong == this.b) {
        return this;
      }
      return new c(paramLong, this.c, this.d, this.e);
    }
    return this;
  }
  
  final c<V> a(long paramLong, V paramV)
  {
    if (this.f == 0) {
      return new c(paramLong, paramV, this, this);
    }
    if (paramLong < this.b) {
      return a(this.d.a(paramLong - this.b, paramV), this.e);
    }
    if (paramLong > this.b) {
      return a(this.d, this.e.a(paramLong - this.b, paramV));
    }
    if (paramV == this.c) {
      return this;
    }
    return new c(paramLong, paramV, this.d, this.e);
  }
  
  final V a(long paramLong)
  {
    Object localObject = this;
    if (((c)localObject).f == 0) {
      return null;
    }
    if (paramLong < ((c)localObject).b) {}
    for (c localc = ((c)localObject).d;; localc = ((c)localObject).e)
    {
      paramLong -= ((c)localObject).b;
      localObject = localc;
      break;
      if (paramLong <= ((c)localObject).b) {
        break label62;
      }
    }
    label62:
    return (V)((c)localObject).c;
  }
}


/* Location:              /home/kmille/projects/android-pwning/apks/aldi/ALDI TALK_v6.2.1_apkpure.com-dex2jar.jar!/b/i/b/a/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */