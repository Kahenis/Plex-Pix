package H2;

/* loaded from: classes.dex */
public final class D0 extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.ExoPlayer f1441j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1442k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I.p1 f1443l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I.p1 f1444m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1445n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(androidx.media3.exoplayer.ExoPlayer exoPlayer, I.InterfaceC0144j0 interfaceC0144j0, I.p1 p1Var, I.p1 p1Var2, I.InterfaceC0144j0 interfaceC0144j02) {
        super(1);
        this.f1441j = exoPlayer;
        this.f1442k = interfaceC0144j0;
        this.f1443l = p1Var;
        this.f1444m = p1Var2;
        this.f1445n = interfaceC0144j02;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        Y1.j.e("$this$DisposableEffect", (I.Q) obj);
        H2.C0 c02 = new H2.C0(this.f1442k, this.f1443l, this.f1444m, this.f1445n);
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.f1441j;
        exoPlayer.addListener(c02);
        return new H2.B0(exoPlayer, 0, c02);
    }
}
