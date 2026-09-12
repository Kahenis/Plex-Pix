package H2;

/* renamed from: H2.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120x0 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1955j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0120x0(I.InterfaceC0144j0 interfaceC0144j0) {
        super(2);
        this.f1955j = interfaceC0144j0;
    }

    public final void invoke(I.InterfaceC0155p interfaceC0155p, int i3) {
        e0.C0393g O2;
        if ((i3 & 11) == 2) {
            I.C0164u c0164u = (I.C0164u) interfaceC0155p;
            if (c0164u.H()) {
                c0164u.V();
                return;
            }
        }
        if (((java.lang.Boolean) this.f1955j.getValue()).booleanValue()) {
            O2 = y2.d.f9236b;
            if (O2 == null) {
                e0.C0391e c0391e = new e0.C0391e("Filled.Pause", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i4 = e0.N.f4942a;
                a0.N n2 = new a0.N(a0.C0238s.f3360b);
                I.o1 o1Var = new I.o1(1);
                o1Var.k(6.0f, 19.0f);
                o1Var.h(4.0f);
                o1Var.i(10.0f, 5.0f);
                o1Var.i(6.0f, 5.0f);
                o1Var.n(14.0f);
                o1Var.d();
                o1Var.k(14.0f, 5.0f);
                o1Var.n(14.0f);
                o1Var.h(4.0f);
                o1Var.i(18.0f, 5.0f);
                o1Var.h(-4.0f);
                o1Var.d();
                e0.C0391e.a(c0391e, o1Var.f2278i, 0, n2);
                O2 = c0391e.b();
                y2.d.f9236b = O2;
            }
        } else {
            O2 = a.AbstractC0217a.O();
        }
        G.AbstractC0067t.m41Iconww6aTOc(O2, (java.lang.String) null, (U.o) null, 0L, interfaceC0155p, 48, 12);
    }

    @Override // X1.e
    public final /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        invoke((I.InterfaceC0155p) obj, ((java.lang.Number) obj2).intValue());
        return L1.k.f2619a;
    }
}
