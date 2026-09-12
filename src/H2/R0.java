package H2;

/* loaded from: classes.dex */
public final class R0 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public static final H2.R0 f1547j = new H2.R0(2);

    public final void invoke(I.InterfaceC0155p interfaceC0155p, int i3) {
        if ((i3 & 11) == 2) {
            I.C0164u c0164u = (I.C0164u) interfaceC0155p;
            if (c0164u.H()) {
                c0164u.V();
                return;
            }
        }
        e0.C0393g c0393g = a.AbstractC0217a.f3280a;
        if (c0393g == null) {
            e0.C0391e c0391e = new e0.C0391e("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i4 = e0.N.f4942a;
            a0.N n2 = new a0.N(a0.C0238s.f3360b);
            I.o1 o1Var = new I.o1(1);
            o1Var.k(12.0f, 2.0f);
            o1Var.e(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
            o1Var.l(4.48f, 10.0f, 10.0f, 10.0f);
            o1Var.l(10.0f, -4.48f, 10.0f, -10.0f);
            java.util.ArrayList arrayList = o1Var.f2278i;
            arrayList.add(new e0.C0403q(17.52f, 2.0f, 12.0f, 2.0f));
            o1Var.d();
            o1Var.k(13.0f, 17.0f);
            o1Var.h(-2.0f);
            o1Var.n(-6.0f);
            o1Var.h(2.0f);
            o1Var.n(6.0f);
            o1Var.d();
            o1Var.k(13.0f, 9.0f);
            o1Var.h(-2.0f);
            o1Var.i(11.0f, 7.0f);
            o1Var.h(2.0f);
            o1Var.n(2.0f);
            o1Var.d();
            e0.C0391e.a(c0391e, arrayList, 0, n2);
            c0393g = c0391e.b();
            a.AbstractC0217a.f3280a = c0393g;
        }
        G.AbstractC0067t.m41Iconww6aTOc(c0393g, (java.lang.String) null, (U.o) null, 0L, interfaceC0155p, 48, 12);
    }

    @Override // X1.e
    public final /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        invoke((I.InterfaceC0155p) obj, ((java.lang.Number) obj2).intValue());
        return L1.k.f2619a;
    }
}
