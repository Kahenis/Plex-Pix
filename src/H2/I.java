package H2;

/* loaded from: classes.dex */
public final class I extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1479j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X1.c f1480k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1481l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1482m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1483n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1484o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(java.lang.String str, X1.c cVar, boolean z, boolean z3, int i3, int i4) {
        super(2);
        this.f1479j = str;
        this.f1480k = cVar;
        this.f1481l = z;
        this.f1482m = z3;
        this.f1483n = i3;
        this.f1484o = i4;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int D3 = I.AbstractC0168w.D(this.f1483n | 1);
        boolean z = this.f1481l;
        boolean z3 = this.f1482m;
        H2.L0.FilterBar(this.f1479j, this.f1480k, z, z3, (I.InterfaceC0155p) obj, D3, this.f1484o);
        return L1.k.f2619a;
    }
}
