package H2;

/* loaded from: classes.dex */
public final class m1 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public java.io.File f1827m;

    /* renamed from: n, reason: collision with root package name */
    public int f1828n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f1829o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G2.k f1830p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ G2.m f1831q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I.C0152n0 f1832r;
    public final /* synthetic */ I.InterfaceC0144j0 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1833t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(android.content.Context context, G2.k kVar, G2.m mVar, I.C0152n0 c0152n0, I.InterfaceC0144j0 interfaceC0144j0, I.InterfaceC0144j0 interfaceC0144j02, P1.d dVar) {
        super(2, dVar);
        this.f1829o = context;
        this.f1830p = kVar;
        this.f1831q = mVar;
        this.f1832r = c0152n0;
        this.s = interfaceC0144j0;
        this.f1833t = interfaceC0144j02;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.m1(this.f1829o, this.f1830p, this.f1831q, this.f1832r, this.s, this.f1833t, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.m1) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00da, code lost:
    
        if (r0 == null) goto L25;
     */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.Object obj) {
        java.io.File file;
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1828n;
        I.InterfaceC0144j0 interfaceC0144j0 = this.f1833t;
        I.InterfaceC0144j0 interfaceC0144j02 = this.s;
        android.content.Context context = this.f1829o;
        try {
            if (i3 == 0) {
                android.support.v4.media.session.b.R(obj);
                Y1.j.e("context", context);
                java.io.File file2 = new java.io.File(new java.io.File(context.getCacheDir(), "updates"), "Plex-Pix-update.apk");
                android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
                o2.c cVar = h2.AbstractC0461E.f5255b;
                H2.l1 l1Var = new H2.l1(this.f1831q, this.f1830p, file2, handler, this.f1832r, null);
                this.f1827m = file2;
                this.f1828n = 1;
                if (h2.AbstractC0526x.x(cVar, l1Var, this) == aVar) {
                    return aVar;
                }
                file = file2;
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                file = this.f1827m;
                android.support.v4.media.session.b.R(obj);
            }
            interfaceC0144j02.setValue(H2.t1.f1915o);
            interfaceC0144j0.setValue("Installation de la version " + this.f1830p.f1126a + "…");
            Y1.j.e("context", context);
            Y1.j.e("file", file);
            android.net.Uri uriForFile = androidx.core.content.FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
            intent.addFlags(268435456);
            intent.addFlags(1);
            context.startActivity(intent);
        } catch (java.lang.Exception e3) {
            interfaceC0144j02.setValue(H2.t1.f1916p);
            java.lang.String message = e3.getMessage();
            if (message != null) {
                if (g2.AbstractC0448m.i0(message)) {
                    message = null;
                }
            }
            message = "La mise à jour a échoué.";
            interfaceC0144j0.setValue(message);
        }
        return L1.k.f2619a;
    }
}
