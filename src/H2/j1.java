package H2;

/* loaded from: classes.dex */
public final class j1 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G2.f f1781j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1782k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1783l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X1.c f1784m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ X1.c f1785n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ X1.c f1786o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1787p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(G2.f fVar, boolean z, boolean z3, X1.c cVar, X1.c cVar2, X1.c cVar3, int i3) {
        super(2);
        this.f1781j = fVar;
        this.f1782k = z;
        this.f1783l = z3;
        this.f1784m = cVar;
        this.f1785n = cVar2;
        this.f1786o = cVar3;
        this.f1787p = i3;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int D3 = I.AbstractC0168w.D(this.f1787p | 1);
        X1.c cVar = this.f1785n;
        X1.c cVar2 = this.f1786o;
        H2.q1.SettingsPane(this.f1781j, this.f1782k, this.f1783l, this.f1784m, cVar, cVar2, (I.InterfaceC0155p) obj, D3);
        return L1.k.f2619a;
    }
}
