package H2;

/* renamed from: H2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080d extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public I.InterfaceC0144j0 f1686m;

    /* renamed from: n, reason: collision with root package name */
    public int f1687n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1688o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1689p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ G2.h f1690q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G2.i f1691r;
    public final /* synthetic */ G2.c s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1692t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0080d(I.InterfaceC0144j0 interfaceC0144j0, I.InterfaceC0144j0 interfaceC0144j02, G2.h hVar, G2.i iVar, G2.c cVar, I.InterfaceC0144j0 interfaceC0144j03, P1.d dVar) {
        super(2, dVar);
        this.f1688o = interfaceC0144j0;
        this.f1689p = interfaceC0144j02;
        this.f1690q = hVar;
        this.f1691r = iVar;
        this.s = cVar;
        this.f1692t = interfaceC0144j03;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.C0080d(this.f1688o, this.f1689p, this.f1690q, this.f1691r, this.s, this.f1692t, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.C0080d) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        I.InterfaceC0144j0 interfaceC0144j0;
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1687n;
        I.InterfaceC0144j0 interfaceC0144j02 = this.f1692t;
        I.InterfaceC0144j0 interfaceC0144j03 = this.f1689p;
        I.InterfaceC0144j0 interfaceC0144j04 = this.f1688o;
        try {
            try {
                if (i3 == 0) {
                    android.support.v4.media.session.b.R(obj);
                    interfaceC0144j04.setValue(java.lang.Boolean.TRUE);
                    interfaceC0144j03.setValue(null);
                    o2.c cVar = h2.AbstractC0461E.f5255b;
                    H2.C0078c c0078c = new H2.C0078c(this.f1690q, this.f1691r, this.s, null);
                    this.f1686m = interfaceC0144j02;
                    this.f1687n = 1;
                    obj = h2.AbstractC0526x.x(cVar, c0078c, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    interfaceC0144j0 = interfaceC0144j02;
                } else {
                    if (i3 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0144j0 = this.f1686m;
                    android.support.v4.media.session.b.R(obj);
                }
                interfaceC0144j0.setValue((java.util.List) obj);
            } catch (java.lang.Exception e3) {
                interfaceC0144j02.setValue(M1.t.f2687i);
                interfaceC0144j03.setValue(e3.getMessage());
            }
            return L1.k.f2619a;
        } finally {
            interfaceC0144j04.setValue(java.lang.Boolean.FALSE);
        }
    }
}
