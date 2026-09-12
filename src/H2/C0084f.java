package H2;

/* renamed from: H2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084f extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1723j = 1;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1724k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I.C0154o0 f1725l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1726m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1727n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1728o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0084f(androidx.media3.exoplayer.ExoPlayer exoPlayer, I.C0156p0 c0156p0, I.C0156p0 c0156p02, I.InterfaceC0144j0 interfaceC0144j0, I.C0154o0 c0154o0) {
        super(1);
        this.f1726m = exoPlayer;
        this.f1727n = c0156p0;
        this.f1728o = c0156p02;
        this.f1724k = interfaceC0144j0;
        this.f1725l = c0154o0;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Number number = (java.lang.Number) obj;
        switch (this.f1723j) {
            case 0:
                int intValue = number.intValue();
                this.f1725l.h(intValue);
                this.f1724k.setValue(java.lang.Boolean.FALSE);
                G2.b bVar = (G2.b) M1.k.b0(intValue, (java.util.List) this.f1726m);
                this.f1728o.setValue((Y1.j.a(bVar != null ? bVar.f1081c : null, androidx.media3.common.MimeTypes.BASE_TYPE_VIDEO) && ((G2.f) this.f1727n.getValue()).f1109b) ? H2.u1.f1938k : H2.u1.f1937j);
                break;
            default:
                long longValue = number.longValue();
                I.C0156p0 c0156p0 = (I.C0156p0) this.f1727n;
                if (c0156p0.g() > 0) {
                    androidx.media3.exoplayer.ExoPlayer exoPlayer = (androidx.media3.exoplayer.ExoPlayer) this.f1726m;
                    long l3 = android.support.v4.media.session.b.l(exoPlayer.getCurrentPosition() + longValue, 0L, c0156p0.g());
                    exoPlayer.seekTo(l3);
                    ((I.C0156p0) this.f1728o).h(l3);
                    H2.L0.s(this.f1724k, this.f1725l);
                }
                break;
        }
        return L1.k.f2619a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0084f(java.util.List list, I.C0154o0 c0154o0, I.InterfaceC0144j0 interfaceC0144j0, I.InterfaceC0144j0 interfaceC0144j02, I.InterfaceC0144j0 interfaceC0144j03) {
        super(1);
        this.f1726m = list;
        this.f1725l = c0154o0;
        this.f1724k = interfaceC0144j0;
        this.f1727n = interfaceC0144j02;
        this.f1728o = interfaceC0144j03;
    }
}
