package H2;

/* loaded from: classes.dex */
public final class F extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1451j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1452k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1453l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(int i3, int i4, int i5) {
        super(2);
        this.f1451j = i5;
        this.f1452k = i3;
        this.f1453l = i4;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        int i3 = this.f1451j;
        I.InterfaceC0155p interfaceC0155p = (I.InterfaceC0155p) obj;
        ((java.lang.Number) obj2).intValue();
        switch (i3) {
            case 0:
                H2.L0.FilmStripProgress(this.f1452k, interfaceC0155p, I.AbstractC0168w.D(this.f1453l | 1));
                break;
            default:
                H2.L0.Splash(this.f1452k, interfaceC0155p, I.AbstractC0168w.D(this.f1453l | 1));
                break;
        }
        return L1.k.f2619a;
    }
}
