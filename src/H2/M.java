package H2;

/* loaded from: classes.dex */
public final class M implements I.P {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1517b;

    public /* synthetic */ M(int i3, java.lang.Object obj) {
        this.f1516a = i3;
        this.f1517b = obj;
    }

    @Override // I.P
    public final void a() {
        switch (this.f1516a) {
            case 0:
                ((androidx.media3.exoplayer.ExoPlayer) this.f1517b).release();
                break;
            case 1:
                java.util.Iterator it = ((e.c) this.f1517b).f4859b.iterator();
                while (it.hasNext()) {
                    ((d.InterfaceC0365c) it.next()).cancel();
                }
                break;
            case 2:
                ((q0.C0765h0) this.f1517b).f7084a.b();
                break;
            case 3:
                ((x.r) this.f1517b).f8819d = null;
                break;
            default:
                x.C0979C c0979c = (x.C0979C) this.f1517b;
                int a3 = c0979c.a();
                for (int i3 = 0; i3 < a3; i3++) {
                    c0979c.c();
                }
                break;
        }
    }
}
