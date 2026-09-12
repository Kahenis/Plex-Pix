package H2;

/* renamed from: H2.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089h0 extends Y1.k implements X1.f {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ X1.e f1744j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1745k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1746l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0089h0(X1.e eVar, java.lang.String str, boolean z) {
        super(3);
        this.f1744j = eVar;
        this.f1745k = str;
        this.f1746l = z;
    }

    @Override // X1.f
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        invoke((u.InterfaceC0898I) obj, (I.InterfaceC0155p) obj2, ((java.lang.Number) obj3).intValue());
        return L1.k.f2619a;
    }

    public final void invoke(u.InterfaceC0898I interfaceC0898I, I.InterfaceC0155p interfaceC0155p, int i3) {
        Y1.j.e("$this$Button", interfaceC0898I);
        if ((i3 & 81) == 16) {
            I.C0164u c0164u = (I.C0164u) interfaceC0155p;
            if (c0164u.H()) {
                c0164u.V();
                return;
            }
        }
        I.C0164u c0164u2 = (I.C0164u) interfaceC0155p;
        c0164u2.a0(-1561287225);
        X1.e eVar = this.f1744j;
        if (eVar != null) {
            eVar.j(c0164u2, 0);
            u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.j(U.l.f3053b, 6), c0164u2, 6);
        }
        c0164u2.u(false);
        G.l0.m33Text4IGK_g(this.f1745k, (U.o) null, 0L, y2.d.u(this.f1746l ? 13 : 14), (B0.l) null, (B0.n) null, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u2, 0, 0, 131062);
    }
}
