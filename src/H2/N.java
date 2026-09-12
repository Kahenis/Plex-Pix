package H2;

/* loaded from: classes.dex */
public final class N extends Y1.k implements X1.f {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1519j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(java.lang.String str) {
        super(3);
        this.f1519j = str;
    }

    @Override // X1.f
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        invoke((v.InterfaceC0931c) obj, (I.InterfaceC0155p) obj2, ((java.lang.Number) obj3).intValue());
        return L1.k.f2619a;
    }

    public final void invoke(v.InterfaceC0931c interfaceC0931c, I.InterfaceC0155p interfaceC0155p, int i3) {
        Y1.j.e("$this$stickyHeader", interfaceC0931c);
        if ((i3 & 81) == 16) {
            I.C0164u c0164u = (I.C0164u) interfaceC0155p;
            if (c0164u.H()) {
                c0164u.V();
                return;
            }
        }
        java.lang.String upperCase = this.f1519j.toUpperCase(java.util.Locale.ROOT);
        Y1.j.d("toUpperCase(...)", upperCase);
        float f3 = 6;
        G.l0.m33Text4IGK_g(upperCase, androidx.compose.foundation.layout.b.g(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.c(U.l.f3053b, 1.0f), H2.s1.f1890b, a0.H.f3290a), f3, 2, f3, f3), H2.s1.f1895g, y2.d.u(10), (B0.l) null, (B0.n) null, (B0.f) null, y2.d.t(1.5d), (H0.g) null, (H0.f) null, 0L, 2, false, 1, 0, (X1.c) null, (w0.t) null, interfaceC0155p, 12586368, 3120, 120688);
    }
}
