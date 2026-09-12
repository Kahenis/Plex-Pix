package H2;

/* renamed from: H2.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093j0 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ X1.e f1780j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0093j0(X1.e eVar) {
        super(2);
        this.f1780j = eVar;
    }

    public final void invoke(I.InterfaceC0155p interfaceC0155p, int i3) {
        if ((i3 & 11) == 2) {
            I.C0164u c0164u = (I.C0164u) interfaceC0155p;
            if (c0164u.H()) {
                c0164u.V();
                return;
            }
        }
        this.f1780j.j(interfaceC0155p, 0);
    }

    @Override // X1.e
    public final /* bridge */ /* synthetic */ java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        invoke((I.InterfaceC0155p) obj, ((java.lang.Number) obj2).intValue());
        return L1.k.f2619a;
    }
}
