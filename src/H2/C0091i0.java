package H2;

/* renamed from: H2.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091i0 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1753j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ U.o f1754k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X1.e f1755l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1756m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f1757n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X1.a f1758o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ X1.a f1759p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1760q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1761r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091i0(java.lang.String str, U.o oVar, X1.e eVar, boolean z, boolean z3, X1.a aVar, X1.a aVar2, int i3, int i4) {
        super(2);
        this.f1753j = str;
        this.f1754k = oVar;
        this.f1755l = eVar;
        this.f1756m = z;
        this.f1757n = z3;
        this.f1758o = aVar;
        this.f1759p = aVar2;
        this.f1760q = i3;
        this.f1761r = i4;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int D3 = I.AbstractC0168w.D(this.f1760q | 1);
        X1.a aVar = this.f1758o;
        X1.a aVar2 = this.f1759p;
        H2.L0.PixButton(this.f1753j, this.f1754k, this.f1755l, this.f1756m, this.f1757n, aVar, aVar2, (I.InterfaceC0155p) obj, D3, this.f1761r);
        return L1.k.f2619a;
    }
}
