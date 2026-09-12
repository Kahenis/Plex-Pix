package H2;

/* loaded from: classes.dex */
public final class p1 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1862j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1863k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1864l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1865m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ X1.c f1866n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1867o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, X1.c cVar, int i3) {
        super(2);
        this.f1862j = str;
        this.f1863k = str2;
        this.f1864l = str3;
        this.f1865m = str4;
        this.f1866n = cVar;
        this.f1867o = i3;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int D3 = I.AbstractC0168w.D(this.f1867o | 1);
        java.lang.String str = this.f1865m;
        X1.c cVar = this.f1866n;
        H2.q1.ThumbChoice(this.f1862j, this.f1863k, this.f1864l, str, cVar, (I.InterfaceC0155p) obj, D3);
        return L1.k.f2619a;
    }
}
