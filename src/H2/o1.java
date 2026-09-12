package H2;

/* loaded from: classes.dex */
public final class o1 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public int f1846m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1847n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ G2.m f1848o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G2.f f1849p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1850q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1851r;
    public final /* synthetic */ I.InterfaceC0144j0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(java.lang.String str, G2.m mVar, G2.f fVar, I.InterfaceC0144j0 interfaceC0144j0, I.InterfaceC0144j0 interfaceC0144j02, I.InterfaceC0144j0 interfaceC0144j03, P1.d dVar) {
        super(2, dVar);
        this.f1847n = str;
        this.f1848o = mVar;
        this.f1849p = fVar;
        this.f1850q = interfaceC0144j0;
        this.f1851r = interfaceC0144j02;
        this.s = interfaceC0144j03;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.o1(this.f1847n, this.f1848o, this.f1849p, this.f1850q, this.f1851r, this.s, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.o1) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        if (r5 == null) goto L36;
     */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1846m;
        I.InterfaceC0144j0 interfaceC0144j0 = this.f1851r;
        I.InterfaceC0144j0 interfaceC0144j02 = this.f1850q;
        try {
            if (i3 == 0) {
                android.support.v4.media.session.b.R(obj);
                o2.c cVar = h2.AbstractC0461E.f5255b;
                H2.n1 n1Var = new H2.n1(this.f1848o, this.f1849p, null);
                this.f1846m = 1;
                obj = h2.AbstractC0526x.x(cVar, n1Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.support.v4.media.session.b.R(obj);
            }
            G2.k kVar = (G2.k) obj;
            H2.t1 t1Var = H2.t1.f1911k;
            java.lang.String str3 = this.f1847n;
            if (kVar == null) {
                interfaceC0144j02.setValue(t1Var);
                str2 = "Aucune version " + str3 + " publiée. Version installée : 1.3.13.";
            } else {
                java.lang.String str4 = kVar.f1126a;
                if (G2.a.c(str4, tv.plexpix.app.BuildConfig.VERSION_NAME)) {
                    this.s.setValue(kVar);
                    interfaceC0144j02.setValue(H2.t1.f1912l);
                    str2 = "La version " + str3 + " " + str4 + " est disponible (installée : 1.3.13).\nVoulez-vous mettre à jour ?";
                } else if (G2.a.c(tv.plexpix.app.BuildConfig.VERSION_NAME, str4)) {
                    interfaceC0144j02.setValue(t1Var);
                    str2 = "La version " + str3 + " trouvée (" + str4 + ") est inférieure à la version installée (1.3.13).\nPour rétrograder, il faut d’abord désinstaller Plex-Pix, puis installer la version souhaitée.";
                } else {
                    interfaceC0144j02.setValue(t1Var);
                    str2 = "Vous avez déjà la dernière version " + str3 + " (1.3.13).";
                }
            }
            interfaceC0144j0.setValue(str2);
        } catch (java.lang.Exception e3) {
            interfaceC0144j02.setValue(H2.t1.f1916p);
            java.lang.String message = e3.getMessage();
            if (message != null) {
                str = g2.AbstractC0448m.i0(message) ? null : message;
            }
            str = "Impossible de vérifier les mises à jour.";
            interfaceC0144j0.setValue(str);
        }
        return L1.k.f2619a;
    }
}
