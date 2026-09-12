package H2;

/* loaded from: classes.dex */
public final class X extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.util.List f1572j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ G2.i f1573k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G2.h f1574l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f1575m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.f f1576n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y.l f1577o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ X1.a f1578p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ X1.c f1579q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(java.util.List list, G2.i iVar, G2.h hVar, float f3, G2.f fVar, Y.l lVar, X1.a aVar, X1.c cVar) {
        super(1);
        this.f1572j = list;
        this.f1573k = iVar;
        this.f1574l = hVar;
        this.f1575m = f3;
        this.f1576n = fVar;
        this.f1577o = lVar;
        this.f1578p = aVar;
        this.f1579q = cVar;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        w.C0958m c0958m = (w.C0958m) obj;
        Y1.j.e("$this$LazyVerticalGrid", c0958m);
        java.util.List list = this.f1572j;
        c0958m.f8553b.c(list.size(), new w.C0956k(w.C0957l.f8549k, new B.a(list, 4), new Q.a(1229287273, new H2.W(list, this.f1573k, this.f1574l, this.f1575m, this.f1576n, this.f1577o, this.f1578p, this.f1579q), true)));
        return L1.k.f2619a;
    }
}
