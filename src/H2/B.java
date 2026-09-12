package H2;

/* loaded from: classes.dex */
public final class B extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G2.h f1417m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.i f1418n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ G2.l f1419o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(G2.h hVar, G2.i iVar, G2.l lVar, P1.d dVar) {
        super(2, dVar);
        this.f1417m = hVar;
        this.f1418n = iVar;
        this.f1419o = lVar;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.B(this.f1417m, this.f1418n, this.f1419o, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.B) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        android.support.v4.media.session.b.R(obj);
        return this.f1417m.g(this.f1418n, this.f1419o.f1130a.getString("authToken", null));
    }
}
