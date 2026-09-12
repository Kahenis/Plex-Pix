package H2;

/* renamed from: H2.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0097l0 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1801j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1802k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1803l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1804m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1805n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0097l0(U.o oVar, java.lang.String str, X1.c cVar, int i3) {
        super(2);
        this.f1801j = 3;
        this.f1803l = oVar;
        this.f1805n = str;
        this.f1804m = cVar;
        this.f1802k = i3;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        int i3 = this.f1801j;
        I.InterfaceC0155p interfaceC0155p = (I.InterfaceC0155p) obj;
        ((java.lang.Number) obj2).intValue();
        switch (i3) {
            case 0:
                int D3 = I.AbstractC0168w.D(this.f1802k | 1);
                H2.L0.ServerPick((java.util.List) this.f1803l, (X1.c) this.f1804m, (X1.a) this.f1805n, interfaceC0155p, D3);
                break;
            case 1:
                int D4 = I.AbstractC0168w.D(this.f1802k) | 1;
                ((Q.a) this.f1803l).d(this.f1804m, (java.lang.Comparable) this.f1805n, interfaceC0155p, D4);
                break;
            case 2:
                int D5 = I.AbstractC0168w.D(this.f1802k | 1);
                ((R.h) this.f1803l).SaveableStateProvider(this.f1804m, (X1.e) this.f1805n, interfaceC0155p, D5);
                break;
            case 3:
                int D6 = I.AbstractC0168w.D(this.f1802k | 1);
                q.r.Canvas((U.o) this.f1803l, (java.lang.String) this.f1805n, (X1.c) this.f1804m, interfaceC0155p, D6);
                break;
            case 4:
                int D7 = I.AbstractC0168w.D(this.f1802k | 1);
                q0.AbstractC0761f0.ProvideCommonCompositionLocals((p0.a0) this.f1803l, (q0.J0) this.f1804m, (X1.e) this.f1805n, interfaceC0155p, D7);
                break;
            case 5:
                int D8 = I.AbstractC0168w.D(this.f1802k | 1);
                x.J.LazyLayoutPrefetcher((x.C0983G) this.f1803l, (x.C1001s) this.f1804m, (n0.X) this.f1805n, interfaceC0155p, D8);
                break;
            default:
                int D9 = I.AbstractC0168w.D(this.f1802k | 1);
                ((x.U) this.f1803l).SaveableStateProvider(this.f1804m, (X1.e) this.f1805n, interfaceC0155p, D9);
                break;
        }
        return L1.k.f2619a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0097l0(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i3, int i4) {
        super(2);
        this.f1801j = i4;
        this.f1803l = obj;
        this.f1804m = obj2;
        this.f1805n = obj3;
        this.f1802k = i3;
    }
}
