package H2;

/* loaded from: classes.dex */
public final class B0 implements I.P {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1421b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1422c;

    public /* synthetic */ B0(java.lang.Object obj, int i3, java.lang.Object obj2) {
        this.f1420a = i3;
        this.f1421b = obj;
        this.f1422c = obj2;
    }

    @Override // I.P
    public final void a() {
        switch (this.f1420a) {
            case 0:
                ((androidx.media3.exoplayer.ExoPlayer) this.f1421b).removeListener((H2.C0) this.f1422c);
                break;
            case 1:
                ((p.H) this.f1421b).f6115a.l((p.D) this.f1422c);
                break;
            case 2:
                ((android.content.Context) this.f1421b).getApplicationContext().unregisterComponentCallbacks((q0.Q) this.f1422c);
                break;
            default:
                ((x.U) this.f1421b).f8782c.add(this.f1422c);
                break;
        }
    }
}
