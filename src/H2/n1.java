package H2;

/* loaded from: classes.dex */
public final class n1 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G2.m f1840m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.f f1841n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(G2.m mVar, G2.f fVar, P1.d dVar) {
        super(2, dVar);
        this.f1840m = mVar;
        this.f1841n = fVar;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.n1(this.f1840m, this.f1841n, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.n1) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        android.support.v4.media.session.b.R(obj);
        return this.f1840m.a(this.f1841n.f1114g);
    }
}
