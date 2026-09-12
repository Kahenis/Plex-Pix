package H2;

/* renamed from: H2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121y extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G2.h f1956m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1957n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0121y(G2.h hVar, java.lang.String str, P1.d dVar) {
        super(2, dVar);
        this.f1956m = hVar;
        this.f1957n = str;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.C0121y(this.f1956m, this.f1957n, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.C0121y) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        android.support.v4.media.session.b.R(obj);
        return this.f1956m.b(this.f1957n);
    }
}
