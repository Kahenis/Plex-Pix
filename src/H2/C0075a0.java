package H2;

/* renamed from: H2.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075a0 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H2.u1 f1653m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.ExoPlayer f1654n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0075a0(H2.u1 u1Var, androidx.media3.exoplayer.ExoPlayer exoPlayer, P1.d dVar) {
        super(2, dVar);
        this.f1653m = u1Var;
        this.f1654n = exoPlayer;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.C0075a0(this.f1653m, this.f1654n, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        H2.C0075a0 c0075a0 = (H2.C0075a0) a((P1.d) obj2, (h2.InterfaceC0525w) obj);
        L1.k kVar = L1.k.f2619a;
        c0075a0.l(kVar);
        return kVar;
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        android.support.v4.media.session.b.R(obj);
        if (this.f1653m == H2.u1.f1936i) {
            androidx.media3.exoplayer.ExoPlayer exoPlayer = this.f1654n;
            exoPlayer.stop();
            exoPlayer.clearMediaItems();
        }
        return L1.k.f2619a;
    }
}
