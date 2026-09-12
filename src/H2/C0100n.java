package H2;

/* renamed from: H2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100n extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public int f1834m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1835n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.C0154o0 f1836o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y.l f1837p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0100n(I.C0154o0 c0154o0, Y.l lVar, P1.d dVar) {
        super(2, dVar);
        this.f1836o = c0154o0;
        this.f1837p = lVar;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        H2.C0100n c0100n = new H2.C0100n(this.f1836o, this.f1837p, dVar);
        c0100n.f1835n = obj;
        return c0100n;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.C0100n) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1834m;
        L1.k kVar = L1.k.f2619a;
        if (i3 == 0) {
            android.support.v4.media.session.b.R(obj);
            h2.InterfaceC0525w interfaceC0525w = (h2.InterfaceC0525w) this.f1835n;
            if (this.f1836o.g() == 0) {
                return kVar;
            }
            this.f1835n = interfaceC0525w;
            this.f1834m = 1;
            if (h2.AbstractC0526x.e(40L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.R(obj);
        }
        try {
            this.f1837p.a();
        } catch (java.lang.Throwable th) {
            android.support.v4.media.session.b.u(th);
        }
        return kVar;
    }
}
