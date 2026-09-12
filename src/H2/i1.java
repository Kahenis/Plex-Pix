package H2;

/* loaded from: classes.dex */
public final class i1 extends Y1.k implements X1.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1762j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f1763k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1764l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1765m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h2.InterfaceC0525w f1766n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.C0152n0 f1767o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G2.m f1768p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(I.InterfaceC0144j0 interfaceC0144j0, android.content.Context context, I.InterfaceC0144j0 interfaceC0144j02, I.InterfaceC0144j0 interfaceC0144j03, h2.InterfaceC0525w interfaceC0525w, I.C0152n0 c0152n0, G2.m mVar) {
        super(0);
        this.f1762j = interfaceC0144j0;
        this.f1763k = context;
        this.f1764l = interfaceC0144j02;
        this.f1765m = interfaceC0144j03;
        this.f1766n = interfaceC0525w;
        this.f1767o = c0152n0;
        this.f1768p = mVar;
    }

    @Override // X1.a
    public final java.lang.Object b() {
        I.InterfaceC0144j0 interfaceC0144j0 = this.f1762j;
        G2.k kVar = (G2.k) interfaceC0144j0.getValue();
        if (kVar != null) {
            android.content.Context context = this.f1763k;
            Y1.j.e("context", context);
            boolean canRequestPackageInstalls = android.os.Build.VERSION.SDK_INT >= 26 ? context.getPackageManager().canRequestPackageInstalls() : true;
            I.InterfaceC0144j0 interfaceC0144j02 = this.f1764l;
            I.InterfaceC0144j0 interfaceC0144j03 = this.f1765m;
            if (canRequestPackageInstalls) {
                H2.q1.d(this.f1766n, interfaceC0144j02, this.f1767o, interfaceC0144j03, context, this.f1768p, kVar);
            } else {
                interfaceC0144j0.setValue(kVar);
                interfaceC0144j02.setValue(H2.t1.f1913m);
                interfaceC0144j03.setValue("Pour installer la mise à jour, autorisez Plex-Pix à installer des applications non signées.");
            }
        }
        return L1.k.f2619a;
    }
}
