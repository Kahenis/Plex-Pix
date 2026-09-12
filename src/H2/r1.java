package H2;

/* loaded from: classes.dex */
public final class r1 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1882j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X1.e f1883k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1884l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(X1.e eVar, int i3, int i4) {
        super(2);
        this.f1882j = i4;
        this.f1883k = eVar;
        this.f1884l = i3;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        int i3 = this.f1882j;
        I.InterfaceC0155p interfaceC0155p = (I.InterfaceC0155p) obj;
        ((java.lang.Number) obj2).intValue();
        switch (i3) {
            case 0:
                H2.s1.PlexPixTheme(this.f1883k, interfaceC0155p, I.AbstractC0168w.D(this.f1884l | 1));
                break;
            default:
                I.T.LaunchedEffect(this.f1883k, interfaceC0155p, I.AbstractC0168w.D(this.f1884l | 1));
                break;
        }
        return L1.k.f2619a;
    }
}
