package H2;

/* renamed from: H2.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0112t0 extends Y1.k implements X1.f {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G2.b f1902j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1903k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1904l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.ExoPlayer f1905m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.i f1906n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ G2.h f1907o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I.C0152n0 f1908p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0112t0(G2.b bVar, boolean z, boolean z3, androidx.media3.exoplayer.ExoPlayer exoPlayer, G2.i iVar, G2.h hVar, I.C0152n0 c0152n0) {
        super(3);
        this.f1902j = bVar;
        this.f1903k = z;
        this.f1904l = z3;
        this.f1905m = exoPlayer;
        this.f1906n = iVar;
        this.f1907o = hVar;
        this.f1908p = c0152n0;
    }

    @Override // X1.f
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        invoke((u.r) obj, (I.InterfaceC0155p) obj2, ((java.lang.Number) obj3).intValue());
        return L1.k.f2619a;
    }

    public final void invoke(u.r rVar, I.InterfaceC0155p interfaceC0155p, int i3) {
        int i4;
        java.lang.String str;
        java.lang.Integer num;
        java.lang.Integer num2;
        Y1.j.e("$this$BoxWithConstraints", rVar);
        if ((i3 & 14) == 0) {
            i4 = i3 | (((I.C0164u) interfaceC0155p).h(rVar) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i4 & 91) == 18) {
            I.C0164u c0164u = (I.C0164u) interfaceC0155p;
            if (c0164u.H()) {
                c0164u.V();
                return;
            }
        }
        u.s sVar = (u.s) rVar;
        long j3 = sVar.f8088b;
        boolean d3 = I0.a.d(j3);
        I0.b bVar = sVar.f8087a;
        float e02 = d3 ? bVar.e0(I0.a.h(j3)) : Float.POSITIVE_INFINITY;
        float e03 = I0.a.c(j3) ? bVar.e0(I0.a.g(j3)) : Float.POSITIVE_INFINITY;
        G2.b bVar2 = this.f1902j;
        G2.d dVar = bVar2.f1088j;
        boolean z = this.f1903k;
        float intValue = (dVar == null || (num2 = dVar.f1097b) == null) ? z ? 1920 : 1200 : num2.intValue();
        G2.d dVar2 = bVar2.f1088j;
        float intValue2 = (dVar2 == null || (num = dVar2.f1098c) == null) ? z ? 1080 : 1600 : num.intValue();
        boolean z3 = this.f1904l;
        float f3 = z3 ? intValue2 / intValue : intValue / intValue2;
        float f4 = e02 / f3;
        if (java.lang.Float.compare(f4, e03) > 0) {
            e02 = e03 * f3;
        }
        if (java.lang.Float.compare(f4, e03) <= 0) {
            e03 = f4;
        }
        float f5 = z3 ? e03 : e02;
        if (!z3) {
            e02 = e03;
        }
        U.o g3 = androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.c.k(), f5, e02);
        I.C0164u c0164u2 = (I.C0164u) interfaceC0155p;
        c0164u2.a0(-896773622);
        java.lang.Object Q2 = c0164u2.Q();
        if (Q2 == I.C0153o.f2276a) {
            Q2 = new B0.g(3, this.f1908p);
            c0164u2.m0(Q2);
        }
        c0164u2.u(false);
        U.o a3 = androidx.compose.ui.graphics.a.a(g3, (X1.c) Q2);
        if (z) {
            c0164u2.a0(-2030123510);
            H2.L0.VideoSurface(this.f1905m, a3, c0164u2, 8, 0);
            c0164u2.u(false);
            return;
        }
        c0164u2.a0(-2030029363);
        java.lang.String str2 = bVar2.f1087i;
        G2.i iVar = this.f1906n;
        if (str2 == null) {
            if (iVar != null) {
                java.lang.String k02 = g2.AbstractC0448m.k0(bVar2.f1082d, "/thumb", "");
                this.f1907o.getClass();
                str2 = g2.AbstractC0448m.k0(G2.h.d(iVar, k02, 1920), "width=1920&height=1920", "width=1920&height=1920");
            } else {
                str2 = null;
            }
        }
        if (iVar != null && (str = bVar2.f1083e) != null) {
            str2 = iVar.f1121d + str + "?X-Plex-Token=" + iVar.f1120c;
        }
        p1.AbstractC0695F.m52AsyncImagegl8XCv8(str2, bVar2.f1080b, a3, null, null, null, n0.C0598i.f5931b, 0.0f, null, 0, false, null, c0164u2, 1572864, 0, 4024);
        c0164u2.u(false);
    }
}
