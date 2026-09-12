package H2;

/* loaded from: classes.dex */
public final class c1 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public G2.k f1678m;

    /* renamed from: n, reason: collision with root package name */
    public int f1679n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f1680o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1681p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1682q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h2.InterfaceC0525w f1683r;
    public final /* synthetic */ I.C0152n0 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1684t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G2.m f1685u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.content.Context context, I.InterfaceC0144j0 interfaceC0144j0, I.InterfaceC0144j0 interfaceC0144j02, h2.InterfaceC0525w interfaceC0525w, I.C0152n0 c0152n0, I.InterfaceC0144j0 interfaceC0144j03, G2.m mVar, P1.d dVar) {
        super(2, dVar);
        this.f1680o = context;
        this.f1681p = interfaceC0144j0;
        this.f1682q = interfaceC0144j02;
        this.f1683r = interfaceC0525w;
        this.s = c0152n0;
        this.f1684t = interfaceC0144j03;
        this.f1685u = mVar;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.c1(this.f1680o, this.f1681p, this.f1682q, this.f1683r, this.s, this.f1684t, this.f1685u, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.c1) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:5:0x0014). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.Object obj) {
        G2.k kVar;
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1679n;
        L1.k kVar2 = L1.k.f2619a;
        H2.t1 t1Var = H2.t1.f1913m;
        I.InterfaceC0144j0 interfaceC0144j0 = this.f1681p;
        if (i3 == 0) {
            android.support.v4.media.session.b.R(obj);
            if (((H2.t1) interfaceC0144j0.getValue()) != t1Var) {
                return kVar2;
            }
            G2.k kVar3 = (G2.k) this.f1682q.getValue();
            if (kVar3 == null) {
                return kVar2;
            }
            kVar = kVar3;
            if (((H2.t1) interfaceC0144j0.getValue()) == t1Var) {
            }
            return kVar2;
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kVar = this.f1678m;
        android.support.v4.media.session.b.R(obj);
        G2.k kVar4 = kVar;
        android.content.Context context = this.f1680o;
        Y1.j.e("context", context);
        if (!(android.os.Build.VERSION.SDK_INT < 26 ? context.getPackageManager().canRequestPackageInstalls() : true)) {
            H2.q1.d(this.f1683r, this.f1681p, this.s, this.f1684t, this.f1680o, this.f1685u, kVar4);
            return kVar2;
        }
        kVar = kVar4;
        if (((H2.t1) interfaceC0144j0.getValue()) == t1Var) {
            this.f1678m = kVar;
            this.f1679n = 1;
            if (h2.AbstractC0526x.e(800L, this) == aVar) {
                return aVar;
            }
            G2.k kVar42 = kVar;
            android.content.Context context2 = this.f1680o;
            Y1.j.e("context", context2);
            if (!(android.os.Build.VERSION.SDK_INT < 26 ? context2.getPackageManager().canRequestPackageInstalls() : true)) {
            }
        }
        return kVar2;
    }
}
