package H2;

/* loaded from: classes.dex */
public final class G0 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public int f1461m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1462n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ G2.b f1463o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f1464p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f1465q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1466r;
    public final /* synthetic */ I.C0152n0 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1467t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ I.C0154o0 f1468u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y.l f1469v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y.l f1470w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(G2.b bVar, boolean z, boolean z3, I.InterfaceC0144j0 interfaceC0144j0, I.C0152n0 c0152n0, I.InterfaceC0144j0 interfaceC0144j02, I.C0154o0 c0154o0, Y.l lVar, Y.l lVar2, P1.d dVar) {
        super(2, dVar);
        this.f1463o = bVar;
        this.f1464p = z;
        this.f1465q = z3;
        this.f1466r = interfaceC0144j0;
        this.s = c0152n0;
        this.f1467t = interfaceC0144j02;
        this.f1468u = c0154o0;
        this.f1469v = lVar;
        this.f1470w = lVar2;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        H2.G0 g02 = new H2.G0(this.f1463o, this.f1464p, this.f1465q, this.f1466r, this.s, this.f1467t, this.f1468u, this.f1469v, this.f1470w, dVar);
        g02.f1462n = obj;
        return g02;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.G0) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[RETURN] */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.Object obj) {
        h2.InterfaceC0525w interfaceC0525w;
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1461m;
        Y.l lVar = this.f1469v;
        try {
        } catch (java.lang.Throwable th) {
            android.support.v4.media.session.b.u(th);
        }
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    android.support.v4.media.session.b.R(obj);
                    lVar.a();
                    return L1.k.f2619a;
                }
                if (i3 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.support.v4.media.session.b.R(obj);
                this.f1470w.a();
                return L1.k.f2619a;
            }
            interfaceC0525w = (h2.InterfaceC0525w) this.f1462n;
            android.support.v4.media.session.b.R(obj);
            try {
                lVar.a();
            } catch (java.lang.Throwable th2) {
                android.support.v4.media.session.b.u(th2);
            }
            this.f1462n = interfaceC0525w;
            this.f1461m = 2;
            if (h2.AbstractC0526x.e(160L, this) == aVar) {
                return aVar;
            }
            lVar.a();
            return L1.k.f2619a;
        }
        android.support.v4.media.session.b.R(obj);
        interfaceC0525w = (h2.InterfaceC0525w) this.f1462n;
        this.f1466r.setValue(this.f1463o.f1088j);
        this.s.h(0.0f);
        boolean z = this.f1464p;
        I.InterfaceC0144j0 interfaceC0144j0 = this.f1467t;
        if (z && this.f1465q && !H2.L0.b(interfaceC0144j0)) {
            this.f1462n = interfaceC0525w;
            this.f1461m = 3;
            if (h2.AbstractC0526x.e(40L, this) == aVar) {
                return aVar;
            }
            this.f1470w.a();
            return L1.k.f2619a;
        }
        interfaceC0144j0.setValue(java.lang.Boolean.TRUE);
        I.C0154o0 c0154o0 = this.f1468u;
        c0154o0.h(c0154o0.g() + 1);
        this.f1462n = interfaceC0525w;
        this.f1461m = 1;
        if (h2.AbstractC0526x.e(80L, this) == aVar) {
            return aVar;
        }
        lVar.a();
        this.f1462n = interfaceC0525w;
        this.f1461m = 2;
        if (h2.AbstractC0526x.e(160L, this) == aVar) {
        }
        lVar.a();
        return L1.k.f2619a;
    }
}
