package H2;

/* loaded from: classes.dex */
public final class P0 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public static final H2.P0 f1535j = new H2.P0(2);

    public final void invoke(I.InterfaceC0155p interfaceC0155p, int i3) {
        e0.C0393g c0393g;
        if ((i3 & 11) == 2) {
            I.C0164u c0164u = (I.C0164u) interfaceC0155p;
            if (c0164u.H()) {
                c0164u.V();
                return;
            }
        }
        e0.C0393g c0393g2 = y2.d.f9237c;
        if (c0393g2 != null) {
            c0393g = c0393g2;
        } else {
            e0.C0391e c0391e = new e0.C0391e("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = e0.N.f4942a;
            a0.N n2 = new a0.N(a0.C0238s.f3360b);
            I.o1 o1Var = new I.o1(1);
            o1Var.k(19.14f, 12.94f);
            o1Var.f(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
            o1Var.f(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
            o1Var.j(2.03f, -1.58f);
            o1Var.f(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
            o1Var.j(-1.92f, -3.32f);
            o1Var.f(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
            o1Var.j(-2.39f, 0.96f);
            o1Var.f(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
            o1Var.i(14.4f, 2.81f);
            o1Var.f(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
            o1Var.h(-3.84f);
            o1Var.f(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
            o1Var.i(9.25f, 5.35f);
            o1Var.e(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
            o1Var.i(5.24f, 5.33f);
            o1Var.f(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
            o1Var.i(2.74f, 8.87f);
            o1Var.e(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
            o1Var.j(2.03f, 1.58f);
            o1Var.e(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
            o1Var.l(0.02f, 0.64f, 0.07f, 0.94f);
            o1Var.j(-2.03f, 1.58f);
            o1Var.f(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
            o1Var.j(1.92f, 3.32f);
            o1Var.f(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
            o1Var.j(2.39f, -0.96f);
            o1Var.f(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
            o1Var.j(0.36f, 2.54f);
            o1Var.f(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
            o1Var.h(3.84f);
            o1Var.f(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
            o1Var.j(0.36f, -2.54f);
            o1Var.f(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
            o1Var.j(2.39f, 0.96f);
            o1Var.f(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
            o1Var.j(1.92f, -3.32f);
            o1Var.f(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
            o1Var.i(19.14f, 12.94f);
            o1Var.d();
            o1Var.k(12.0f, 15.6f);
            o1Var.f(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
            o1Var.l(1.62f, -3.6f, 3.6f, -3.6f);
            o1Var.l(3.6f, 1.62f, 3.6f, 3.6f);
            java.util.ArrayList arrayList = o1Var.f2278i;
            arrayList.add(new e0.C0403q(13.98f, 15.6f, 12.0f, 15.6f));
            o1Var.d();
            e0.C0391e.a(c0391e, arrayList, 0, n2);
            e0.C0393g b3 = c0391e.b();
            y2.d.f9237c = b3;
            c0393g = b3;
        }
        G.AbstractC0067t.m41Iconww6aTOc(c0393g, (java.lang.String) null, androidx.compose.foundation.layout.c.h(U.l.f3053b, 16), 0L, interfaceC0155p, 432, 8);
    }

    @Override // X1.e
    public final /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        invoke((I.InterfaceC0155p) obj, ((java.lang.Number) obj2).intValue());
        return L1.k.f2619a;
    }
}
