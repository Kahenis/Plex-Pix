package H2;

/* renamed from: H2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088h extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G2.h f1743m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088h(G2.h hVar, P1.d dVar) {
        super(2, dVar);
        this.f1743m = hVar;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.C0088h(this.f1743m, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.C0088h) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        android.support.v4.media.session.b.R(obj);
        return this.f1743m.a();
    }
}
