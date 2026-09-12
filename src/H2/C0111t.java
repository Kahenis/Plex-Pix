package H2;

/* renamed from: H2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111t extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G2.h f1900m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1901n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0111t(G2.h hVar, java.lang.String str, P1.d dVar) {
        super(2, dVar);
        this.f1900m = hVar;
        this.f1901n = str;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.C0111t(this.f1900m, this.f1901n, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.C0111t) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        android.support.v4.media.session.b.R(obj);
        return this.f1900m.b(this.f1901n);
    }
}
