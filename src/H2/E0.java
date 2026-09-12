package H2;

/* loaded from: classes.dex */
public final class E0 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public int f1447m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f1448n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1449o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ X1.a f1450p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E0(boolean z, boolean z3, X1.a aVar, P1.d dVar) {
        super(2, dVar);
        this.f1448n = z;
        this.f1449o = z3;
        this.f1450p = aVar;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.E0(this.f1448n, this.f1449o, this.f1450p, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.E0) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1447m;
        if (i3 == 0) {
            android.support.v4.media.session.b.R(obj);
            if (this.f1448n && !this.f1449o) {
                this.f1447m = 1;
                if (h2.AbstractC0526x.e(5000L, this) == aVar) {
                    return aVar;
                }
            }
            return L1.k.f2619a;
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        android.support.v4.media.session.b.R(obj);
        this.f1450p.b();
        return L1.k.f2619a;
    }
}
