package H2;

/* loaded from: classes.dex */
public final class U0 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public static final H2.U0 f1559j = new H2.U0(2);

    public final void invoke(I.InterfaceC0155p interfaceC0155p, int i3) {
        if ((i3 & 11) == 2) {
            I.C0164u c0164u = (I.C0164u) interfaceC0155p;
            if (c0164u.H()) {
                c0164u.V();
                return;
            }
        }
        e0.C0393g c0393g = android.support.v4.media.session.b.f3419c;
        if (c0393g == null) {
            e0.C0391e c0391e = new e0.C0391e("Filled.Rotate90DegreesCw", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = e0.N.f4942a;
            a0.N n2 = new a0.N(a0.C0238s.f3360b);
            I.o1 o1Var = new I.o1(1);
            o1Var.k(4.64f, 19.37f);
            o1Var.f(3.03f, 3.03f, 7.67f, 3.44f, 11.15f, 1.25f);
            o1Var.j(-1.46f, -1.46f);
            o1Var.f(-2.66f, 1.43f, -6.04f, 1.03f, -8.28f, -1.21f);
            o1Var.f(-2.73f, -2.73f, -2.73f, -7.17f, 0.0f, -9.9f);
            o1Var.e(7.42f, 6.69f, 9.21f, 6.03f, 11.0f, 6.03f);
            java.util.ArrayList arrayList = o1Var.f2278i;
            arrayList.add(new e0.C0378B(9.0f));
            o1Var.j(4.0f, -4.0f);
            o1Var.j(-4.0f, -4.0f);
            o1Var.n(3.01f);
            o1Var.f(-2.3f, 0.0f, -4.61f, 0.87f, -6.36f, 2.63f);
            o1Var.e(1.12f, 10.15f, 1.12f, 15.85f, 4.64f, 19.37f);
            o1Var.d();
            o1Var.k(11.0f, 13.0f);
            o1Var.j(6.0f, 6.0f);
            o1Var.j(6.0f, -6.0f);
            o1Var.j(-6.0f, -6.0f);
            o1Var.i(11.0f, 13.0f);
            o1Var.d();
            e0.C0391e.a(c0391e, arrayList, 0, n2);
            c0393g = c0391e.b();
            android.support.v4.media.session.b.f3419c = c0393g;
        }
        G.AbstractC0067t.m41Iconww6aTOc(c0393g, (java.lang.String) null, (U.o) null, 0L, interfaceC0155p, 48, 12);
    }

    @Override // X1.e
    public final /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        invoke((I.InterfaceC0155p) obj, ((java.lang.Number) obj2).intValue());
        return L1.k.f2619a;
    }
}
