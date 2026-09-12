package H2;

/* renamed from: H2.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0108r0 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1877j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1878k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1879l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1880m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1881n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0108r0(U.o oVar, X1.e eVar, int i3, int i4) {
        super(2);
        this.f1877j = 2;
        this.f1881n = oVar;
        this.f1880m = eVar;
        this.f1878k = i3;
        this.f1879l = i4;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        int i3 = this.f1877j;
        I.InterfaceC0155p interfaceC0155p = (I.InterfaceC0155p) obj;
        ((java.lang.Number) obj2).intValue();
        switch (i3) {
            case 0:
                H2.L0.VideoSurface((androidx.media3.exoplayer.ExoPlayer) this.f1880m, (U.o) this.f1881n, interfaceC0155p, I.AbstractC0168w.D(this.f1878k | 1), this.f1879l);
                break;
            case 1:
                e0.T.RenderVectorGroup((e0.M) this.f1880m, (java.util.Map) this.f1881n, interfaceC0155p, I.AbstractC0168w.D(this.f1878k | 1), this.f1879l);
                break;
            case 2:
                n0.U.SubcomposeLayout((U.o) this.f1881n, (X1.e) this.f1880m, interfaceC0155p, I.AbstractC0168w.D(this.f1878k | 1), this.f1879l);
                break;
            case 3:
                int D3 = I.AbstractC0168w.D(this.f1879l | 1);
                ((v.q) this.f1880m).Item(this.f1878k, this.f1881n, interfaceC0155p, D3);
                break;
            default:
                int D4 = I.AbstractC0168w.D(this.f1879l | 1);
                ((w.q) this.f1880m).Item(this.f1878k, this.f1881n, interfaceC0155p, D4);
                break;
        }
        return L1.k.f2619a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0108r0(java.lang.Object obj, java.lang.Object obj2, int i3, int i4, int i5) {
        super(2);
        this.f1877j = i5;
        this.f1880m = obj;
        this.f1881n = obj2;
        this.f1878k = i3;
        this.f1879l = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0108r0(x.InterfaceC1004v interfaceC1004v, int i3, java.lang.Object obj, int i4, int i5) {
        super(2);
        this.f1877j = i5;
        this.f1880m = interfaceC1004v;
        this.f1878k = i3;
        this.f1881n = obj;
        this.f1879l = i4;
    }
}
