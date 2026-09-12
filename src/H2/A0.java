package H2;

/* loaded from: classes.dex */
public final class A0 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f1411m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.i f1412n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.ExoPlayer f1413o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G2.h f1414p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ G2.b f1415q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f1416r;
    public final /* synthetic */ I.InterfaceC0144j0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(boolean z, G2.i iVar, androidx.media3.exoplayer.ExoPlayer exoPlayer, G2.h hVar, G2.b bVar, boolean z3, I.InterfaceC0144j0 interfaceC0144j0, P1.d dVar) {
        super(2, dVar);
        this.f1411m = z;
        this.f1412n = iVar;
        this.f1413o = exoPlayer;
        this.f1414p = hVar;
        this.f1415q = bVar;
        this.f1416r = z3;
        this.s = interfaceC0144j0;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.A0(this.f1411m, this.f1412n, this.f1413o, this.f1414p, this.f1415q, this.f1416r, this.s, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.A0) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        if (r2 == null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6  */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.Object obj) {
        G2.i iVar;
        java.lang.String sb;
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration;
        android.net.Uri uri;
        android.support.v4.media.session.b.R(obj);
        boolean z = this.f1411m;
        L1.k kVar = L1.k.f2619a;
        androidx.media3.exoplayer.ExoPlayer exoPlayer = this.f1413o;
        if (!z || (iVar = this.f1412n) == null) {
            if (exoPlayer.getMediaItemCount() > 0) {
                exoPlayer.stop();
                exoPlayer.clearMediaItems();
            }
            return kVar;
        }
        java.lang.String str = (java.lang.String) this.s.getValue();
        boolean a3 = Y1.j.a(str, "direct");
        java.lang.String str2 = null;
        G2.b bVar = this.f1415q;
        G2.h hVar = this.f1414p;
        if (!a3) {
            if (!Y1.j.a(str, "copy")) {
                hVar.getClass();
                Y1.j.e("server", iVar);
                Y1.j.e("item", bVar);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(iVar.f1121d);
                sb2.append("/video/:/transcode/universal/start.mp4?path=/library/metadata/");
                java.lang.String str3 = bVar.f1079a;
                sb2.append(str3);
                sb2.append("&mediaIndex=0&partIndex=0&protocol=http&fastSeek=1&copyts=1&directPlay=0&directStream=0&videoQuality=80&maxVideoBitrate=8000&videoResolution=1280x720&session=ppx");
                sb2.append(str3);
                sb2.append("&X-Plex-Platform=Android&X-Plex-Product=Plex-Pix&X-Plex-Client-Identifier=");
                sb2.append(hVar.f1115a);
                sb2.append("&X-Plex-Token=");
                sb2.append(iVar.f1120c);
                sb = sb2.toString();
                if (this.f1416r) {
                    androidx.media3.common.MediaItem currentMediaItem = exoPlayer.getCurrentMediaItem();
                    if (currentMediaItem != null && (localConfiguration = currentMediaItem.localConfiguration) != null && (uri = localConfiguration.uri) != null) {
                        str2 = uri.toString();
                    }
                    if (exoPlayer.getPlaybackState() != 1 && exoPlayer.getPlaybackState() != 4 && Y1.j.a(str2, sb)) {
                        exoPlayer.setPlayWhenReady(true);
                        return kVar;
                    }
                }
                exoPlayer.setMediaItem(androidx.media3.common.MediaItem.fromUri(sb));
                exoPlayer.prepare();
                exoPlayer.setPlayWhenReady(true);
                return kVar;
            }
            sb = hVar.n(iVar, bVar);
            if (this.f1416r) {
            }
            exoPlayer.setMediaItem(androidx.media3.common.MediaItem.fromUri(sb));
            exoPlayer.prepare();
            exoPlayer.setPlayWhenReady(true);
            return kVar;
        }
        hVar.getClass();
        Y1.j.e("server", iVar);
        Y1.j.e("item", bVar);
        java.lang.String str4 = bVar.f1083e;
        if (str4 == null) {
            sb = null;
        } else {
            sb = iVar.f1121d + str4 + "?X-Plex-Token=" + iVar.f1120c;
        }
    }
}
