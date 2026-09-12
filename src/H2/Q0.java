package H2;

/* loaded from: classes.dex */
public final class Q0 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public static final H2.Q0 f1546j = new H2.Q0(2);

    public final void invoke(I.InterfaceC0155p interfaceC0155p, int i3) {
        if ((i3 & 11) == 2) {
            I.C0164u c0164u = (I.C0164u) interfaceC0155p;
            if (c0164u.H()) {
                c0164u.V();
                return;
            }
        }
        e0.C0393g c0393g = a2.AbstractC0240a.f3375b;
        if (c0393g == null) {
            e0.C0391e c0391e = new e0.C0391e("Filled.PowerSettingsNew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = e0.N.f4942a;
            a0.N n2 = new a0.N(a0.C0238s.f3360b);
            I.o1 o1Var = new I.o1(1);
            o1Var.k(13.0f, 3.0f);
            o1Var.h(-2.0f);
            o1Var.n(10.0f);
            o1Var.h(2.0f);
            o1Var.i(13.0f, 3.0f);
            o1Var.d();
            o1Var.k(17.83f, 5.17f);
            o1Var.j(-1.42f, 1.42f);
            o1Var.e(17.99f, 7.86f, 19.0f, 9.81f, 19.0f, 12.0f);
            o1Var.f(0.0f, 3.87f, -3.13f, 7.0f, -7.0f, 7.0f);
            o1Var.l(-7.0f, -3.13f, -7.0f, -7.0f);
            o1Var.f(0.0f, -2.19f, 1.01f, -4.14f, 2.58f, -5.42f);
            o1Var.i(6.17f, 5.17f);
            o1Var.e(4.23f, 6.82f, 3.0f, 9.26f, 3.0f, 12.0f);
            o1Var.f(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
            o1Var.l(9.0f, -4.03f, 9.0f, -9.0f);
            o1Var.f(0.0f, -2.74f, -1.23f, -5.18f, -3.17f, -6.83f);
            o1Var.d();
            e0.C0391e.a(c0391e, o1Var.f2278i, 0, n2);
            c0393g = c0391e.b();
            a2.AbstractC0240a.f3375b = c0393g;
        }
        G.AbstractC0067t.m41Iconww6aTOc(c0393g, (java.lang.String) null, androidx.compose.foundation.layout.c.h(U.l.f3053b, 16), 0L, interfaceC0155p, 432, 8);
    }

    @Override // X1.e
    public final /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        invoke((I.InterfaceC0155p) obj, ((java.lang.Number) obj2).intValue());
        return L1.k.f2619a;
    }
}
