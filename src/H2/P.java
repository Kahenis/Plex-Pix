package H2;

/* loaded from: classes.dex */
public final class P extends Y1.k implements X1.g {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.List f1525j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G2.c f1526k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1527l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G2.i f1528m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.h f1529n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ H2.u1 f1530o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G2.f f1531p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f1532q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ X1.a f1533r;
    public final /* synthetic */ Y.l s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X1.c f1534t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(java.util.List list, G2.c cVar, boolean z, G2.i iVar, G2.h hVar, H2.u1 u1Var, G2.f fVar, boolean z3, X1.a aVar, Y.l lVar, X1.c cVar2) {
        super(4);
        this.f1525j = list;
        this.f1526k = cVar;
        this.f1527l = z;
        this.f1528m = iVar;
        this.f1529n = hVar;
        this.f1530o = u1Var;
        this.f1531p = fVar;
        this.f1532q = z3;
        this.f1533r = aVar;
        this.s = lVar;
        this.f1534t = cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X1.g
    public final /* bridge */ /* synthetic */ java.lang.Object h(java.lang.Object obj, java.lang.Comparable comparable, java.lang.Object obj2, java.lang.Object obj3) {
        invoke((v.InterfaceC0931c) obj, ((java.lang.Number) comparable).intValue(), (I.InterfaceC0155p) obj2, ((java.lang.Number) obj3).intValue());
        return L1.k.f2619a;
    }

    public final void invoke(v.InterfaceC0931c interfaceC0931c, int i3, I.InterfaceC0155p interfaceC0155p, int i4) {
        int i5;
        boolean z;
        boolean h3;
        java.lang.Object Q2;
        if ((i4 & 14) == 0) {
            i5 = i4 | (((I.C0164u) interfaceC0155p).h(interfaceC0931c) ? 4 : 2);
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
        G2.c cVar = (G2.c) this.f1525j.get(i3);
        I.C0164u c0164u2 = (I.C0164u) interfaceC0155p;
        c0164u2.a0(588229029);
        java.lang.String str = cVar.f1089a;
        G2.c cVar2 = this.f1526k;
        boolean a3 = Y1.j.a(str, cVar2 != null ? cVar2.f1089a : null);
        boolean z3 = this.f1527l;
        boolean z4 = a3 && !z3;
        if (!z3) {
            if (this.f1530o != H2.u1.f1936i || (this.f1531p.f1110c && !this.f1532q)) {
                z = false;
                c0164u2.a0(157536877);
                X1.c cVar3 = this.f1534t;
                h3 = c0164u2.h(cVar3) | c0164u2.h(cVar);
                Q2 = c0164u2.Q();
                if (!h3 || Q2 == I.C0153o.f2276a) {
                    Q2 = new H2.O(cVar3, 0, cVar);
                    c0164u2.m0(Q2);
                }
                c0164u2.u(false);
                H2.L0.FolderRow(cVar, z4, this.f1528m, this.f1529n, z, null, this.f1533r, this.s, (X1.a) Q2, c0164u2, 4096, 32);
                c0164u2.u(false);
            }
        }
        z = true;
        c0164u2.a0(157536877);
        X1.c cVar32 = this.f1534t;
        h3 = c0164u2.h(cVar32) | c0164u2.h(cVar);
        Q2 = c0164u2.Q();
        if (!h3) {
        }
        Q2 = new H2.O(cVar32, 0, cVar);
        c0164u2.m0(Q2);
        c0164u2.u(false);
        H2.L0.FolderRow(cVar, z4, this.f1528m, this.f1529n, z, null, this.f1533r, this.s, (X1.a) Q2, c0164u2, 4096, 32);
        c0164u2.u(false);
    }
}
