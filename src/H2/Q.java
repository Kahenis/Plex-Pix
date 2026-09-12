package H2;

/* loaded from: classes.dex */
public final class Q extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.List f1536j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G2.c f1537k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1538l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G2.i f1539m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.h f1540n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ H2.u1 f1541o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G2.f f1542p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f1543q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ X1.a f1544r;
    public final /* synthetic */ Y.l s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X1.c f1545t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(java.util.List list, G2.c cVar, boolean z, G2.i iVar, G2.h hVar, H2.u1 u1Var, G2.f fVar, boolean z3, X1.a aVar, Y.l lVar, X1.c cVar2) {
        super(1);
        this.f1536j = list;
        this.f1537k = cVar;
        this.f1538l = z;
        this.f1539m = iVar;
        this.f1540n = hVar;
        this.f1541o = u1Var;
        this.f1542p = fVar;
        this.f1543q = z3;
        this.f1544r = aVar;
        this.s = lVar;
        this.f1545t = cVar2;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        v.C0939k c0939k = (v.C0939k) obj;
        Y1.j.e("$this$LazyColumn", c0939k);
        java.util.Iterator it = this.f1536j.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i4 = i3 + 1;
            if (i3 < 0) {
                M1.l.R();
                throw null;
            }
            L1.f fVar = (L1.f) next;
            java.lang.String str = (java.lang.String) fVar.f2612i;
            java.util.List list = (java.util.List) fVar.f2613j;
            if (i3 > 0) {
                c0939k.h(B.n.g(i3, "sep-"), null, H2.X0.f1580a);
            }
            if (str != null && !g2.AbstractC0448m.i0(str)) {
                java.lang.String str2 = "lib-" + i3 + "-" + str;
                Q.a aVar = new Q.a(-206388404, new H2.N(str), true);
                java.util.ArrayList arrayList = c0939k.f8340b;
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    c0939k.f8340b = arrayList;
                }
                arrayList.add(java.lang.Integer.valueOf(c0939k.f8339a.f2512b));
                c0939k.h(str2, null, aVar);
            }
            c0939k.f8339a.c(list.size(), new v.C0936h(new B.a(list, 2), new B.a(list, 3), new Q.a(-632812321, new H2.P(list, this.f1537k, this.f1538l, this.f1539m, this.f1540n, this.f1541o, this.f1542p, this.f1543q, this.f1544r, this.s, this.f1545t), true)));
            it = it;
            i3 = i4;
        }
        return L1.k.f2619a;
    }
}
