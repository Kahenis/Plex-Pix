package H2;

/* loaded from: classes.dex */
public final class C0 implements androidx.media3.common.Player.Listener {

    /* renamed from: i, reason: collision with root package name */
    public boolean f1429i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1430j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I.p1 f1431k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I.p1 f1432l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1433m;

    public C0(I.InterfaceC0144j0 interfaceC0144j0, I.p1 p1Var, I.p1 p1Var2, I.InterfaceC0144j0 interfaceC0144j02) {
        this.f1430j = interfaceC0144j0;
        this.f1431k = p1Var;
        this.f1432l = p1Var2;
        this.f1433m = interfaceC0144j02;
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsPlayingChanged(boolean z) {
        this.f1430j.setValue(java.lang.Boolean.valueOf(z));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i3) {
        if (i3 == 3) {
            this.f1429i = true;
        }
        if (i3 == 4 && this.f1429i) {
            this.f1429i = false;
            if (((java.lang.Boolean) this.f1431k.getValue()).booleanValue()) {
                ((X1.a) this.f1432l.getValue()).b();
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(androidx.media3.common.PlaybackException playbackException) {
        Y1.j.e("error", playbackException);
        I.InterfaceC0144j0 interfaceC0144j0 = this.f1433m;
        java.lang.String str = (java.lang.String) interfaceC0144j0.getValue();
        interfaceC0144j0.setValue(Y1.j.a(str, "direct") ? "copy" : Y1.j.a(str, "copy") ? "transcode" : (java.lang.String) interfaceC0144j0.getValue());
    }
}
