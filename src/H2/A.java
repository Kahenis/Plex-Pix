package H2;

/* loaded from: classes.dex */
public final class A extends Y1.k implements X1.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1406j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1407k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I.p1 f1408l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1409m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1410n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(java.lang.Object obj, I.p1 p1Var, java.lang.Object obj2, java.lang.Object obj3, int i3) {
        super(0);
        this.f1406j = i3;
        this.f1407k = obj;
        this.f1408l = p1Var;
        this.f1409m = obj2;
        this.f1410n = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (Y1.j.a(r21.f1409m, r1.f6098j) == false) goto L8;
     */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b() {
        switch (this.f1406j) {
            case 0:
                ((I.InterfaceC0144j0) this.f1407k).setValue(java.lang.Boolean.TRUE);
                ((I.InterfaceC0144j0) this.f1408l).setValue("Galerie démo");
                ((I.InterfaceC0144j0) this.f1409m).setValue(M1.l.P(new G2.c("demo:riviera", "Côte d'Azur", 6, "https://images.unsplash.com/photo-1519046904884-53103b34b206?auto=format&fit=crop&w=400&q=60", null, null, true, 48), new G2.c("demo:tokyo", "Rues de Tokyo", 4, "https://images.unsplash.com/photo-1540959733332-eab4deabeeaf?auto=format&fit=crop&w=400&q=60", null, null, true, 48)));
                ((I.InterfaceC0144j0) this.f1410n).setValue(H2.Y0.f1630l);
                break;
            default:
                p.D d3 = (p.D) this.f1408l;
                if (Y1.j.a(this.f1407k, d3.f6097i)) {
                    break;
                }
                java.lang.Object obj = this.f1407k;
                d3.f6097i = obj;
                java.lang.Object obj2 = this.f1409m;
                d3.f6098j = obj2;
                d3.f6101m = new p.V((p.C) this.f1410n, d3.f6099k, obj, obj2, null);
                d3.f6105q.f6116b.setValue(java.lang.Boolean.TRUE);
                d3.f6102n = false;
                d3.f6103o = true;
                break;
        }
        return L1.k.f2619a;
    }
}
