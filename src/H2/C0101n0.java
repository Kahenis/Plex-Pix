package H2;

/* renamed from: H2.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0101n0 extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1838j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X1.c f1839k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0101n0(int i3, X1.c cVar) {
        super(1);
        this.f1838j = i3;
        this.f1839k = cVar;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        long j3;
        int i3;
        switch (this.f1838j) {
            case 0:
                android.view.KeyEvent keyEvent = ((i0.C0531b) obj).f5369a;
                Y1.j.e("ev", keyEvent);
                if (!android.support.v4.media.session.b.w(y2.d.v(keyEvent), 2)) {
                    return java.lang.Boolean.FALSE;
                }
                long c3 = y2.l.c(keyEvent.getKeyCode());
                boolean z = true;
                boolean a3 = i0.C0530a.a(c3, i0.C0530a.f5356e) ? true : i0.C0530a.a(c3, i0.C0530a.f5365n);
                X1.c cVar = this.f1839k;
                if (a3) {
                    j3 = -10000;
                } else {
                    if (!(i0.C0530a.a(c3, i0.C0530a.f5357f) ? true : i0.C0530a.a(c3, i0.C0530a.f5366o))) {
                        z = false;
                        return java.lang.Boolean.valueOf(z);
                    }
                    j3 = androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
                }
                cVar.invoke(java.lang.Long.valueOf(j3));
                return java.lang.Boolean.valueOf(z);
            case 1:
                android.view.KeyEvent keyEvent2 = ((i0.C0531b) obj).f5369a;
                Y1.j.e("ev", keyEvent2);
                boolean z3 = true;
                if (android.support.v4.media.session.b.w(y2.d.v(keyEvent2), 1) && (i0.C0530a.a(y2.l.c(keyEvent2.getKeyCode()), i0.C0530a.f5358g) || i0.C0530a.a(y2.l.c(keyEvent2.getKeyCode()), i0.C0530a.f5360i))) {
                    this.f1839k.invoke(java.lang.Boolean.FALSE);
                } else {
                    z3 = false;
                }
                return java.lang.Boolean.valueOf(z3);
            case 2:
                S.m mVar = (S.m) obj;
                synchronized (S.o.f2960b) {
                    i3 = S.o.f2962d;
                    S.o.f2962d = i3 + 1;
                }
                return new S.C0191f(i3, mVar, this.f1839k);
            case 3:
                S.h hVar = (S.h) this.f1839k.invoke((S.m) obj);
                synchronized (S.o.f2960b) {
                    S.o.f2961c = S.o.f2961c.g(hVar.d());
                }
                return hVar;
            default:
                return this.f1839k.invoke(java.lang.Long.valueOf(((java.lang.Number) obj).longValue()));
        }
    }
}
