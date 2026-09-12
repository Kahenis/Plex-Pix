package H2;

/* loaded from: classes.dex */
public final class W extends Y1.k implements X1.g {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.List f1563j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G2.i f1564k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G2.h f1565l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f1566m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.f f1567n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y.l f1568o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ X1.a f1569p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ X1.c f1570q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(java.util.List list, G2.i iVar, G2.h hVar, float f3, G2.f fVar, Y.l lVar, X1.a aVar, X1.c cVar) {
        super(4);
        this.f1563j = list;
        this.f1564k = iVar;
        this.f1565l = hVar;
        this.f1566m = f3;
        this.f1567n = fVar;
        this.f1568o = lVar;
        this.f1569p = aVar;
        this.f1570q = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X1.g
    public final /* bridge */ /* synthetic */ java.lang.Object h(java.lang.Object obj, java.lang.Comparable comparable, java.lang.Object obj2, java.lang.Object obj3) {
        invoke((w.s) obj, ((java.lang.Number) comparable).intValue(), (I.InterfaceC0155p) obj2, ((java.lang.Number) obj3).intValue());
        return L1.k.f2619a;
    }

    public final void invoke(w.s sVar, int i3, I.InterfaceC0155p interfaceC0155p, int i4) {
        int i5;
        if ((i4 & 14) == 0) {
            i5 = i4 | (((I.C0164u) interfaceC0155p).h(sVar) ? 4 : 2);
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= ((I.C0164u) interfaceC0155p).f(i3) ? 32 : 16;
        }
        if ((i5 & 731) == 146) {
            I.C0164u c0164u = (I.C0164u) interfaceC0155p;
            if (c0164u.H()) {
                c0164u.V();
                return;
            }
        }
        G2.b bVar = (G2.b) this.f1563j.get(i3);
        I.C0164u c0164u2 = (I.C0164u) interfaceC0155p;
        c0164u2.a0(-530875132);
        boolean a3 = Y1.j.a(this.f1567n.f1108a, "tiny");
        Y.l lVar = i3 == 0 ? this.f1568o : null;
        c0164u2.a0(-709851807);
        X1.c cVar = this.f1570q;
        boolean h3 = ((((i5 & 112) ^ 48) > 32 && c0164u2.f(i3)) || (i5 & 48) == 32) | c0164u2.h(cVar);
        java.lang.Object Q2 = c0164u2.Q();
        if (h3 || Q2 == I.C0153o.f2276a) {
            Q2 = new H2.V(i3, cVar);
            c0164u2.m0(Q2);
        }
        c0164u2.u(false);
        H2.L0.m42ThumbCardaA_HZ9I(bVar, this.f1564k, this.f1565l, this.f1566m, a3, lVar, this.f1569p, (X1.a) Q2, c0164u2, 512, 0);
        c0164u2.u(false);
    }
}
