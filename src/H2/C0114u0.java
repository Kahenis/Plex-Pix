package H2;

/* renamed from: H2.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114u0 extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1930j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1931k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X1.a f1932l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X1.a f1933m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1934n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.C0154o0 f1935o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0114u0(boolean z, boolean z3, X1.a aVar, X1.a aVar2, I.InterfaceC0144j0 interfaceC0144j0, I.C0154o0 c0154o0) {
        super(1);
        this.f1930j = z;
        this.f1931k = z3;
        this.f1932l = aVar;
        this.f1933m = aVar2;
        this.f1934n = interfaceC0144j0;
        this.f1935o = c0154o0;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        X1.a aVar;
        android.view.KeyEvent keyEvent = ((i0.C0531b) obj).f5369a;
        Y1.j.e("ev", keyEvent);
        if (!android.support.v4.media.session.b.w(y2.d.v(keyEvent), 2) || i0.C0530a.a(y2.l.c(keyEvent.getKeyCode()), i0.C0530a.f5353b)) {
            return java.lang.Boolean.FALSE;
        }
        boolean z = this.f1930j;
        I.C0154o0 c0154o0 = this.f1935o;
        I.InterfaceC0144j0 interfaceC0144j0 = this.f1934n;
        boolean z3 = true;
        if (z && this.f1931k) {
            long c3 = y2.l.c(keyEvent.getKeyCode());
            if (i0.C0530a.a(c3, i0.C0530a.f5356e)) {
                aVar = this.f1932l;
            } else if (i0.C0530a.a(c3, i0.C0530a.f5357f)) {
                aVar = this.f1933m;
            } else {
                if (!(i0.C0530a.a(c3, i0.C0530a.f5355d) ? true : i0.C0530a.a(c3, i0.C0530a.f5358g) ? true : i0.C0530a.a(c3, i0.C0530a.f5360i))) {
                    z3 = false;
                    return java.lang.Boolean.valueOf(z3);
                }
            }
            aVar.b();
            return java.lang.Boolean.valueOf(z3);
        }
        H2.L0.s(interfaceC0144j0, c0154o0);
        return java.lang.Boolean.valueOf(z3);
    }
}
