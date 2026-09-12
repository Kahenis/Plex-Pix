package H2;

/* renamed from: H2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106q extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G2.h f1868m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.i f1869n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1870o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0106q(G2.h hVar, G2.i iVar, java.lang.String str, P1.d dVar) {
        super(2, dVar);
        this.f1868m = hVar;
        this.f1869n = iVar;
        this.f1870o = str;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.C0106q(this.f1868m, this.f1869n, this.f1870o, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.C0106q) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        android.support.v4.media.session.b.R(obj);
        return this.f1868m.g(this.f1869n, this.f1870o);
    }
}
