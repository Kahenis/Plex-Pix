package H2;

/* renamed from: H2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098m extends Y1.k implements X1.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1811j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1812k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1813l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1814m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1815n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1816o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1817p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0098m(G2.f fVar, h2.InterfaceC0525w interfaceC0525w, I.InterfaceC0144j0 interfaceC0144j0, I.InterfaceC0144j0 interfaceC0144j02, I.InterfaceC0144j0 interfaceC0144j03, G2.m mVar) {
        super(0);
        this.f1811j = 1;
        this.f1816o = fVar;
        this.f1812k = interfaceC0525w;
        this.f1813l = interfaceC0144j0;
        this.f1814m = interfaceC0144j02;
        this.f1815n = interfaceC0144j03;
        this.f1817p = mVar;
    }

    @Override // X1.a
    public final java.lang.Object b() {
        boolean z;
        switch (this.f1811j) {
            case 0:
                ((I.InterfaceC0144j0) this.f1813l).setValue(java.lang.Boolean.TRUE);
                ((I.InterfaceC0144j0) this.f1814m).setValue(H2.u1.f1936i);
                H2.L0.c((I.InterfaceC0144j0) this.f1815n, true);
                ((I.InterfaceC0144j0) this.f1816o).setValue(java.lang.Boolean.FALSE);
                h2.AbstractC0526x.p((h2.InterfaceC0525w) this.f1812k, null, 0, new H2.C0096l((d.m) this.f1817p, null), 3);
                break;
            case 1:
                G2.f fVar = (G2.f) this.f1816o;
                java.lang.String str = fVar.f1114g ? "bêta" : "officielle";
                H2.t1 t1Var = H2.t1.f1910j;
                I.InterfaceC0144j0 interfaceC0144j0 = (I.InterfaceC0144j0) this.f1813l;
                interfaceC0144j0.setValue(t1Var);
                I.InterfaceC0144j0 interfaceC0144j02 = (I.InterfaceC0144j0) this.f1814m;
                interfaceC0144j02.setValue("Recherche de mise à jour (" + str + ")…");
                I.InterfaceC0144j0 interfaceC0144j03 = (I.InterfaceC0144j0) this.f1815n;
                interfaceC0144j03.setValue(null);
                h2.AbstractC0526x.p((h2.InterfaceC0525w) this.f1812k, null, 0, new H2.o1(str, (G2.m) this.f1817p, fVar, interfaceC0144j0, interfaceC0144j02, interfaceC0144j03, null), 3);
                break;
            default:
                R.b bVar = (R.b) this.f1812k;
                R.l lVar = bVar.f2857j;
                R.l lVar2 = (R.l) this.f1814m;
                boolean z3 = true;
                if (lVar != lVar2) {
                    bVar.f2857j = lVar2;
                    z = true;
                } else {
                    z = false;
                }
                java.lang.String str2 = bVar.f2858k;
                java.lang.String str3 = (java.lang.String) this.f1815n;
                if (Y1.j.a(str2, str3)) {
                    z3 = z;
                } else {
                    bVar.f2858k = str3;
                }
                bVar.f2856i = (R.o) this.f1813l;
                bVar.f2859l = this.f1816o;
                bVar.f2860m = (java.lang.Object[]) this.f1817p;
                R.k kVar = bVar.f2861n;
                if (kVar != null && z3) {
                    ((D0.b) kVar).t();
                    bVar.f2861n = null;
                    bVar.a();
                }
                break;
        }
        return L1.k.f2619a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0098m(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, int i3) {
        super(0);
        this.f1811j = i3;
        this.f1812k = obj;
        this.f1813l = obj2;
        this.f1814m = obj3;
        this.f1815n = obj4;
        this.f1816o = obj5;
        this.f1817p = obj6;
    }
}
