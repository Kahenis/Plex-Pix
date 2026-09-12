package H2;

/* loaded from: classes.dex */
public final class I0 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public int f1485m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1486n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1487o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y.l f1488p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y.l f1489q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(I.InterfaceC0144j0 interfaceC0144j0, Y.l lVar, Y.l lVar2, P1.d dVar) {
        super(2, dVar);
        this.f1487o = interfaceC0144j0;
        this.f1488p = lVar;
        this.f1489q = lVar2;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        H2.I0 i02 = new H2.I0(this.f1487o, this.f1488p, this.f1489q, dVar);
        i02.f1486n = obj;
        return i02;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.I0) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1485m;
        try {
            if (i3 == 0) {
                android.support.v4.media.session.b.R(obj);
                h2.InterfaceC0525w interfaceC0525w = (h2.InterfaceC0525w) this.f1486n;
                boolean b3 = H2.L0.b(this.f1487o);
                this.f1486n = interfaceC0525w;
                if (b3) {
                    this.f1485m = 1;
                    if (h2.AbstractC0526x.e(60L, this) == aVar) {
                        return aVar;
                    }
                    this.f1488p.a();
                } else {
                    this.f1485m = 2;
                    if (h2.AbstractC0526x.e(40L, this) == aVar) {
                        return aVar;
                    }
                    this.f1489q.a();
                }
            } else if (i3 == 1) {
                android.support.v4.media.session.b.R(obj);
                this.f1488p.a();
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.support.v4.media.session.b.R(obj);
                this.f1489q.a();
            }
        } catch (java.lang.Throwable th) {
            android.support.v4.media.session.b.u(th);
        }
        return L1.k.f2619a;
    }
}
