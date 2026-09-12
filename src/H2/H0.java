package H2;

/* loaded from: classes.dex */
public final class H0 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public int f1474m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f1475n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1476o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1477p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1478q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(boolean z, I.InterfaceC0144j0 interfaceC0144j0, I.InterfaceC0144j0 interfaceC0144j02, I.InterfaceC0144j0 interfaceC0144j03, P1.d dVar) {
        super(2, dVar);
        this.f1475n = z;
        this.f1476o = interfaceC0144j0;
        this.f1477p = interfaceC0144j02;
        this.f1478q = interfaceC0144j03;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.H0(this.f1475n, this.f1476o, this.f1477p, this.f1478q, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.H0) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1474m;
        L1.k kVar = L1.k.f2619a;
        I.InterfaceC0144j0 interfaceC0144j0 = this.f1476o;
        if (i3 == 0) {
            android.support.v4.media.session.b.R(obj);
            if (!H2.L0.b(interfaceC0144j0)) {
                return kVar;
            }
            if (H2.L0.a(this.f1477p)) {
                return kVar;
            }
            if (this.f1475n && !((java.lang.Boolean) this.f1478q.getValue()).booleanValue()) {
                return kVar;
            }
            this.f1474m = 1;
            if (h2.AbstractC0526x.e(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.R(obj);
        }
        interfaceC0144j0.setValue(java.lang.Boolean.FALSE);
        return kVar;
    }
}
