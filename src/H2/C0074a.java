package H2;

/* renamed from: H2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0074a extends Y1.k implements X1.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1643j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1644k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1645l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1646m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1647n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1648o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1649p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1650q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1651r;
    public final /* synthetic */ I.C0154o0 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1652t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0074a(I.InterfaceC0144j0 interfaceC0144j0, I.InterfaceC0144j0 interfaceC0144j02, I.InterfaceC0144j0 interfaceC0144j03, I.InterfaceC0144j0 interfaceC0144j04, I.InterfaceC0144j0 interfaceC0144j05, I.InterfaceC0144j0 interfaceC0144j06, I.InterfaceC0144j0 interfaceC0144j07, I.InterfaceC0144j0 interfaceC0144j08, I.InterfaceC0144j0 interfaceC0144j09, I.C0154o0 c0154o0, I.InterfaceC0144j0 interfaceC0144j010) {
        super(0);
        this.f1643j = interfaceC0144j0;
        this.f1644k = interfaceC0144j02;
        this.f1645l = interfaceC0144j03;
        this.f1646m = interfaceC0144j04;
        this.f1647n = interfaceC0144j05;
        this.f1648o = interfaceC0144j06;
        this.f1649p = interfaceC0144j07;
        this.f1650q = interfaceC0144j08;
        this.f1651r = interfaceC0144j09;
        this.s = c0154o0;
        this.f1652t = interfaceC0144j010;
    }

    @Override // X1.a
    public final java.lang.Object b() {
        I.InterfaceC0144j0 interfaceC0144j0 = this.f1643j;
        if (((java.lang.Boolean) interfaceC0144j0.getValue()).booleanValue()) {
            interfaceC0144j0.setValue(java.lang.Boolean.FALSE);
        } else {
            I.InterfaceC0144j0 interfaceC0144j02 = this.f1644k;
            if (((java.lang.Boolean) interfaceC0144j02.getValue()).booleanValue()) {
                interfaceC0144j02.setValue(java.lang.Boolean.FALSE);
            } else {
                I.InterfaceC0144j0 interfaceC0144j03 = this.f1645l;
                H2.Y0 y0 = (H2.Y0) interfaceC0144j03.getValue();
                H2.Y0 y02 = H2.Y0.f1630l;
                if (y0 == y02) {
                    I.InterfaceC0144j0 interfaceC0144j04 = this.f1646m;
                    if (((java.lang.Boolean) interfaceC0144j04.getValue()).booleanValue()) {
                        interfaceC0144j04.setValue(java.lang.Boolean.FALSE);
                    }
                }
                H2.Y0 y03 = (H2.Y0) interfaceC0144j03.getValue();
                H2.u1 u1Var = H2.u1.f1936i;
                I.InterfaceC0144j0 interfaceC0144j05 = this.f1647n;
                if (y03 != y02 || ((H2.u1) interfaceC0144j05.getValue()) == u1Var) {
                    H2.Y0 y04 = (H2.Y0) interfaceC0144j03.getValue();
                    I.InterfaceC0144j0 interfaceC0144j06 = this.f1651r;
                    I.InterfaceC0144j0 interfaceC0144j07 = this.f1650q;
                    if (y04 == y02 && ((G2.f) this.f1649p.getValue()).f1110c && ((G2.c) interfaceC0144j07.getValue()) != null && !((java.lang.Boolean) interfaceC0144j06.getValue()).booleanValue()) {
                        interfaceC0144j06.setValue(java.lang.Boolean.TRUE);
                        I.C0154o0 c0154o0 = this.s;
                        c0154o0.h(c0154o0.g() + 1);
                    } else if (((H2.Y0) interfaceC0144j03.getValue()) == y02 && ((G2.c) interfaceC0144j07.getValue()) != null) {
                        interfaceC0144j07.setValue(null);
                        this.f1652t.setValue(M1.t.f2687i);
                        interfaceC0144j05.setValue(u1Var);
                        H2.L0.c(interfaceC0144j06, true);
                    } else if (((H2.Y0) interfaceC0144j03.getValue()) == H2.Y0.f1629k) {
                        interfaceC0144j03.setValue(H2.Y0.f1628j);
                    }
                } else {
                    interfaceC0144j05.setValue(u1Var);
                    this.f1648o.setValue(java.lang.Boolean.FALSE);
                }
            }
        }
        return L1.k.f2619a;
    }
}
