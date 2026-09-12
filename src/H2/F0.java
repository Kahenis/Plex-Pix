package H2;

/* loaded from: classes.dex */
public final class F0 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public int f1454m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f1455n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.ExoPlayer f1456o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I.C0156p0 f1457p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ I.C0156p0 f1458q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(boolean z, androidx.media3.exoplayer.ExoPlayer exoPlayer, I.C0156p0 c0156p0, I.C0156p0 c0156p02, P1.d dVar) {
        super(2, dVar);
        this.f1455n = z;
        this.f1456o = exoPlayer;
        this.f1457p = c0156p0;
        this.f1458q = c0156p02;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.F0(this.f1455n, this.f1456o, this.f1457p, this.f1458q, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.F0) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1454m;
        if (i3 != 0 && i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        android.support.v4.media.session.b.R(obj);
        while (this.f1455n) {
            androidx.media3.exoplayer.ExoPlayer exoPlayer = this.f1456o;
            this.f1457p.h(android.support.v4.media.session.b.g(exoPlayer.getCurrentPosition()));
            this.f1458q.h(android.support.v4.media.session.b.g(exoPlayer.getDuration()));
            this.f1454m = 1;
            if (h2.AbstractC0526x.e(250L, this) == aVar) {
                return aVar;
            }
        }
        return L1.k.f2619a;
    }
}
