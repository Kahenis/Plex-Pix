package H2;

/* loaded from: classes.dex */
public final class J0 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1501m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.h f1502n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ G2.i f1503o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G2.b f1504p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(G2.h hVar, G2.i iVar, G2.b bVar, P1.d dVar) {
        super(2, dVar);
        this.f1502n = hVar;
        this.f1503o = iVar;
        this.f1504p = bVar;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        H2.J0 j02 = new H2.J0(this.f1502n, this.f1503o, this.f1504p, dVar);
        j02.f1501m = obj;
        return j02;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.J0) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        java.lang.Object u3;
        android.support.v4.media.session.b.R(obj);
        try {
            u3 = this.f1502n.k(this.f1503o, this.f1504p);
        } catch (java.lang.Throwable th) {
            u3 = android.support.v4.media.session.b.u(th);
        }
        if (u3 instanceof L1.g) {
            return null;
        }
        return u3;
    }
}
