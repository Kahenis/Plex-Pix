package H2;

/* loaded from: classes.dex */
public final class Z0 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1635j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1636k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1637l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1638m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1639n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X1.c f1640o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1641p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1642q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, X1.c cVar, int i3, int i4) {
        super(2);
        this.f1635j = str;
        this.f1636k = str2;
        this.f1637l = z;
        this.f1638m = str3;
        this.f1639n = str4;
        this.f1640o = cVar;
        this.f1641p = i3;
        this.f1642q = i4;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int D3 = I.AbstractC0168w.D(this.f1641p | 1);
        java.lang.String str = this.f1639n;
        X1.c cVar = this.f1640o;
        H2.q1.SettingToggle(this.f1635j, this.f1636k, this.f1637l, this.f1638m, str, cVar, (I.InterfaceC0155p) obj, D3, this.f1642q);
        return L1.k.f2619a;
    }
}
