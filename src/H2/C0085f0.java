package H2;

/* renamed from: H2.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085f0 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1729j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1730k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1731l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1732m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0085f0(int i3, int i4, java.lang.String str, java.lang.String str2) {
        super(2);
        this.f1729j = i4;
        this.f1730k = str;
        this.f1731l = str2;
        this.f1732m = i3;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        int i3 = this.f1729j;
        I.InterfaceC0155p interfaceC0155p = (I.InterfaceC0155p) obj;
        ((java.lang.Number) obj2).intValue();
        switch (i3) {
            case 0:
                H2.L0.MetaLine(this.f1730k, this.f1731l, interfaceC0155p, I.AbstractC0168w.D(this.f1732m | 1));
                break;
            default:
                H2.q1.HelpLine(this.f1730k, this.f1731l, interfaceC0155p, I.AbstractC0168w.D(this.f1732m | 1));
                break;
        }
        return L1.k.f2619a;
    }
}
