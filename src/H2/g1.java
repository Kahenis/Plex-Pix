package H2;

/* loaded from: classes.dex */
public final class g1 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public int f1741m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q.y0 f1742n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(q.y0 y0Var, P1.d dVar) {
        super(2, dVar);
        this.f1742n = y0Var;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.g1(this.f1742n, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.g1) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1741m;
        if (i3 == 0) {
            android.support.v4.media.session.b.R(obj);
            this.f1741m = 1;
            if (q2.r.j(this.f1742n, 90.0f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.R(obj);
        }
        return L1.k.f2619a;
    }
}
