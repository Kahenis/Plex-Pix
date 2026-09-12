package H2;

/* renamed from: H2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0104p extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public int f1852m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1853n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.C0154o0 f1854o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1855p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y.l f1856q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0104p(I.C0154o0 c0154o0, I.InterfaceC0144j0 interfaceC0144j0, Y.l lVar, P1.d dVar) {
        super(2, dVar);
        this.f1854o = c0154o0;
        this.f1855p = interfaceC0144j0;
        this.f1856q = lVar;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        H2.C0104p c0104p = new H2.C0104p(this.f1854o, this.f1855p, this.f1856q, dVar);
        c0104p.f1853n = obj;
        return c0104p;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.C0104p) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(1:(1:4)(2:13|14))(3:15|(2:19|(1:21))|8)|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        android.support.v4.media.session.b.u(r6);
     */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.Object obj) {
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1852m;
        L1.k kVar = L1.k.f2619a;
        if (i3 == 0) {
            android.support.v4.media.session.b.R(obj);
            h2.InterfaceC0525w interfaceC0525w = (h2.InterfaceC0525w) this.f1853n;
            if (this.f1854o.g() != 0 && !((java.lang.Boolean) this.f1855p.getValue()).booleanValue()) {
                this.f1853n = interfaceC0525w;
                this.f1852m = 1;
                if (h2.AbstractC0526x.e(80L, this) == aVar) {
                    return aVar;
                }
            }
            return kVar;
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        android.support.v4.media.session.b.R(obj);
        this.f1856q.a();
        return kVar;
    }
}
