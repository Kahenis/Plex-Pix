package H2;

/* loaded from: classes.dex */
public final class l1 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G2.m f1806m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.k f1807n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.io.File f1808o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f1809p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ I.C0152n0 f1810q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(G2.m mVar, G2.k kVar, java.io.File file, android.os.Handler handler, I.C0152n0 c0152n0, P1.d dVar) {
        super(2, dVar);
        this.f1806m = mVar;
        this.f1807n = kVar;
        this.f1808o = file;
        this.f1809p = handler;
        this.f1810q = c0152n0;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.l1(this.f1806m, this.f1807n, this.f1808o, this.f1809p, this.f1810q, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        H2.l1 l1Var = (H2.l1) a((P1.d) obj2, (h2.InterfaceC0525w) obj);
        L1.k kVar = L1.k.f2619a;
        l1Var.l(kVar);
        return kVar;
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        java.lang.Object u3;
        android.support.v4.media.session.b.R(obj);
        G2.k kVar = this.f1807n;
        java.lang.String str = kVar.f1127b;
        android.os.Handler handler = this.f1809p;
        final I.C0152n0 c0152n0 = this.f1810q;
        G2.m mVar = this.f1806m;
        mVar.getClass();
        Y1.j.e("url", str);
        java.io.File file = this.f1808o;
        Y1.j.e("dest", file);
        java.io.File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        if (file.exists()) {
            file.delete();
        }
        I.A a3 = new I.A();
        a3.m(str);
        a3.j("User-Agent", "Plex-Pix/1.3.13");
        a3.j("Accept", "application/octet-stream");
        int i3 = 0;
        if (kVar.f1129d) {
            try {
                byte[] bArr = new byte[40];
                for (int i4 = 0; i4 < 40; i4++) {
                    bArr[i4] = (byte) ((G2.a.f1078b[i4] & 255) ^ (G2.a.f1077a[i4 % 8] & 255));
                }
                u3 = new java.lang.String(bArr, g2.AbstractC0436a.f5192a);
            } catch (java.lang.Throwable th) {
                u3 = android.support.v4.media.session.b.u(th);
            }
            if (u3 instanceof L1.g) {
                u3 = null;
            }
            java.lang.String str2 = (java.lang.String) u3;
            if (str2 == null) {
                str2 = "";
            }
            if (!g2.AbstractC0448m.i0(str2)) {
                a3.j("Authorization", "Bearer ".concat(str2));
            }
        }
        q2.z e3 = mVar.f1131a.a(a3.f()).e();
        try {
            if (!e3.r()) {
                throw new java.lang.IllegalStateException("Téléchargement impossible (" + e3.f7465l + ").");
            }
            q1.n nVar = e3.f7468o;
            if (nVar == null) {
                throw new java.lang.IllegalStateException("Fichier vide.");
            }
            long b3 = nVar.b();
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                java.io.InputStream I2 = nVar.s().I();
                try {
                    byte[] bArr2 = new byte[androidx.media3.exoplayer.DecoderReuseEvaluation.DISCARD_REASON_AUDIO_BYPASS_POSSIBLE];
                    long j3 = 0;
                    long j4 = 0;
                    while (true) {
                        int read = I2.read(bArr2);
                        if (read < 0) {
                            break;
                        }
                        fileOutputStream.write(bArr2, i3, read);
                        long j5 = read + j4;
                        if (b3 > j3) {
                            final float j6 = android.support.v4.media.session.b.j(j5 / b3, 0.0f, 1.0f);
                            handler.post(new java.lang.Runnable() { // from class: H2.k1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    I.C0152n0 c0152n02 = c0152n0;
                                    Y1.j.e("$updateProgress$delegate", c0152n02);
                                    c0152n02.h(j6);
                                }
                            });
                        }
                        j4 = j5;
                        i3 = 0;
                        j3 = 0;
                    }
                    a.AbstractC0217a.x(I2, null);
                    a.AbstractC0217a.x(fileOutputStream, null);
                    a.AbstractC0217a.x(e3, null);
                    if (file.length() < 1024) {
                        file.delete();
                        throw new java.lang.IllegalStateException("Fichier de mise à jour invalide.");
                    }
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                    try {
                        byte[] bArr3 = new byte[2];
                        if (fileInputStream.read(bArr3) == 2 && bArr3[0] == 80 && bArr3[1] == 75) {
                            a.AbstractC0217a.x(fileInputStream, null);
                            return L1.k.f2619a;
                        }
                        file.delete();
                        throw new java.lang.IllegalStateException("Le fichier téléchargé n’est pas un APK.");
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
