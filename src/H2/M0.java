package H2;

/* loaded from: classes.dex */
public final class M0 extends Y1.k implements X1.f {

    /* renamed from: j, reason: collision with root package name */
    public static final H2.M0 f1518j = new H2.M0(3);

    @Override // X1.f
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        invoke((v.InterfaceC0931c) obj, (I.InterfaceC0155p) obj2, ((java.lang.Number) obj3).intValue());
        return L1.k.f2619a;
    }

    public final void invoke(v.InterfaceC0931c interfaceC0931c, I.InterfaceC0155p interfaceC0155p, int i3) {
        Y1.j.e("$this$item", interfaceC0931c);
        if ((i3 & 81) == 16) {
            I.C0164u c0164u = (I.C0164u) interfaceC0155p;
            if (c0164u.H()) {
                c0164u.V();
                return;
            }
        }
        U.l lVar = U.l.f3053b;
        U.o e3 = androidx.compose.foundation.layout.b.e(androidx.compose.foundation.layout.c.c(lVar, 1.0f), 6, 8);
        I.C0164u c0164u2 = (I.C0164u) interfaceC0155p;
        c0164u2.a0(733328855);
        n0.F rememberBoxMeasurePolicy = u.AbstractC0915k.rememberBoxMeasurePolicy(U.a.f3033i, false, c0164u2, 0);
        c0164u2.a0(-1323940314);
        int currentCompositeKeyHash = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u2, 0);
        I.InterfaceC0167v0 q3 = c0164u2.q();
        p0.InterfaceC0672h.f6471g.getClass();
        p0.C0670f c0670f = p0.C0671g.f6465b;
        Q.a a3 = n0.AbstractC0606q.a(e3);
        if (!(c0164u2.f2317a instanceof I.InterfaceC0133e)) {
            I.AbstractC0147l.a();
            throw null;
        }
        c0164u2.d0();
        if (c0164u2.f2315O) {
            c0164u2.p(c0670f);
        } else {
            c0164u2.p0();
        }
        I.AbstractC0168w.C(c0164u2, rememberBoxMeasurePolicy, p0.C0671g.f6469f);
        I.AbstractC0168w.C(c0164u2, q3, p0.C0671g.f6468e);
        p0.C0669e c0669e = p0.C0671g.f6470g;
        if (c0164u2.f2315O || !Y1.j.a(c0164u2.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
            q.AbstractC0731s.b(currentCompositeKeyHash, c0164u2, currentCompositeKeyHash, c0669e);
        }
        q.AbstractC0731s.c(0, a3, new I.O0(c0164u2), c0164u2, 2058660585);
        u.AbstractC0915k.Box(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.c(lVar, 1.0f), 1), a0.C0238s.b(a0.C0238s.f3361c, 0.18f), a0.H.f3290a), c0164u2, 6);
        c0164u2.u(false);
        c0164u2.u(true);
        c0164u2.u(false);
        c0164u2.u(false);
    }
}
