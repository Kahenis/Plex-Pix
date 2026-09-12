package H2;

/* loaded from: classes.dex */
public final class Z extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1633j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.ExoPlayer f1634k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(androidx.media3.exoplayer.ExoPlayer exoPlayer, int i3) {
        super(1);
        this.f1633j = i3;
        this.f1634k = exoPlayer;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f1633j) {
            case 0:
                Y1.j.e("$this$DisposableEffect", (I.Q) obj);
                return new H2.M(0, this.f1634k);
            case 1:
                android.content.Context context = (android.content.Context) obj;
                Y1.j.e("ctx", context);
                android.view.View inflate = android.view.LayoutInflater.from(context).inflate(tv.plexpix.app.R.layout.pix_player, (android.view.ViewGroup) null);
                Y1.j.c("null cannot be cast to non-null type androidx.media3.ui.PlayerView", inflate);
                androidx.media3.ui.PlayerView playerView = (androidx.media3.ui.PlayerView) inflate;
                playerView.setUseController(false);
                playerView.setControllerAutoShow(false);
                playerView.hideController();
                playerView.setFocusable(false);
                playerView.setFocusableInTouchMode(false);
                playerView.setDescendantFocusability(393216);
                playerView.setShutterBackgroundColor(0);
                playerView.setPlayer(this.f1634k);
                return playerView;
            default:
                androidx.media3.ui.PlayerView playerView2 = (androidx.media3.ui.PlayerView) obj;
                Y1.j.e("view", playerView2);
                playerView2.setUseController(false);
                playerView2.hideController();
                playerView2.setFocusable(false);
                playerView2.setFocusableInTouchMode(false);
                playerView2.setDescendantFocusability(393216);
                androidx.media3.common.Player player = playerView2.getPlayer();
                androidx.media3.exoplayer.ExoPlayer exoPlayer = this.f1634k;
                if (player != exoPlayer) {
                    playerView2.setPlayer(exoPlayer);
                }
                return L1.k.f2619a;
        }
    }
}
