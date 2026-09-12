package H2;

/* loaded from: classes.dex */
public final class J extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1490j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1491k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1492l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1493m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1494n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1495o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1496p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1497q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1498r;
    public final /* synthetic */ java.lang.Object s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1499t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ L1.a f1500u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(G2.c cVar, boolean z, G2.i iVar, G2.h hVar, boolean z3, Y.l lVar, X1.a aVar, Y.l lVar2, X1.a aVar2, int i3, int i4) {
        super(2);
        this.f1490j = 0;
        this.f1495o = cVar;
        this.f1491k = z;
        this.f1496p = iVar;
        this.f1497q = hVar;
        this.f1492l = z3;
        this.f1498r = lVar;
        this.f1499t = aVar;
        this.s = lVar2;
        this.f1500u = aVar2;
        this.f1493m = i3;
        this.f1494n = i4;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f1490j) {
            case 0:
                ((java.lang.Number) obj2).intValue();
                int D3 = I.AbstractC0168w.D(this.f1493m | 1);
                Y.l lVar = (Y.l) this.s;
                X1.a aVar = (X1.a) this.f1500u;
                H2.L0.FolderRow((G2.c) this.f1495o, this.f1491k, (G2.i) this.f1496p, (G2.h) this.f1497q, this.f1492l, (Y.l) this.f1498r, (X1.a) this.f1499t, lVar, aVar, (I.InterfaceC0155p) obj, D3, this.f1494n);
                break;
            case 1:
                ((java.lang.Number) obj2).intValue();
                int D4 = I.AbstractC0168w.D(this.f1493m | 1);
                boolean z = this.f1492l;
                X1.c cVar = (X1.c) this.f1500u;
                v.AbstractC0930b.LazyColumn((U.o) this.f1495o, (v.I) this.f1496p, (u.InterfaceC0891B) this.f1497q, this.f1491k, (u.InterfaceC0909e) this.f1498r, (U.b) this.s, (r.InterfaceC0823P) this.f1499t, z, cVar, (I.InterfaceC0155p) obj, D4, this.f1494n);
                break;
            default:
                ((java.lang.Number) obj2).intValue();
                int D5 = I.AbstractC0168w.D(this.f1493m | 1);
                boolean z3 = this.f1492l;
                X1.c cVar2 = (X1.c) this.f1500u;
                v.AbstractC0930b.LazyRow((U.o) this.f1495o, (v.I) this.f1496p, (u.InterfaceC0891B) this.f1497q, this.f1491k, (u.InterfaceC0907c) this.f1498r, (U.c) this.s, (r.InterfaceC0823P) this.f1499t, z3, cVar2, (I.InterfaceC0155p) obj, D5, this.f1494n);
                break;
        }
        return L1.k.f2619a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(U.o oVar, v.I i3, u.InterfaceC0891B interfaceC0891B, boolean z, java.lang.Object obj, java.lang.Object obj2, r.InterfaceC0823P interfaceC0823P, boolean z3, X1.c cVar, int i4, int i5, int i6) {
        super(2);
        this.f1490j = i6;
        this.f1495o = oVar;
        this.f1496p = i3;
        this.f1497q = interfaceC0891B;
        this.f1491k = z;
        this.f1498r = obj;
        this.s = obj2;
        this.f1499t = interfaceC0823P;
        this.f1492l = z3;
        this.f1500u = cVar;
        this.f1493m = i4;
        this.f1494n = i5;
    }
}
