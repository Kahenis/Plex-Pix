package H2;

/* renamed from: H2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119x extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G2.h f1953m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I.C0154o0 f1954n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119x(G2.h hVar, I.C0154o0 c0154o0, P1.d dVar) {
        super(2, dVar);
        this.f1953m = hVar;
        this.f1954n = c0154o0;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.C0119x(this.f1953m, this.f1954n, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.C0119x) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        android.support.v4.media.session.b.R(obj);
        int g3 = this.f1954n.g();
        G2.h hVar = this.f1953m;
        hVar.getClass();
        return G2.h.f(new org.json.JSONObject(G2.h.o(hVar, B.n.g(g3, "https://plex.tv/api/v2/pins/"), null, null, 6)), "authToken", "auth_token");
    }
}
