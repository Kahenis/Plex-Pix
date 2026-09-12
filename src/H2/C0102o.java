package H2;

/* renamed from: H2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102o extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1842j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1843k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0102o(int i3, int i4) {
        super(2);
        this.f1842j = i4;
        this.f1843k = i3;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        int i3 = this.f1842j;
        I.InterfaceC0155p interfaceC0155p = (I.InterfaceC0155p) obj;
        ((java.lang.Number) obj2).intValue();
        switch (i3) {
            case 0:
                H2.L0.AppRoot(interfaceC0155p, I.AbstractC0168w.D(this.f1843k | 1));
                break;
            default:
                H2.L0.Brand(interfaceC0155p, I.AbstractC0168w.D(this.f1843k | 1));
                break;
        }
        return L1.k.f2619a;
    }
}
