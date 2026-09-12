package H2;

/* renamed from: H2.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087g0 extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1739j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1740k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0087g0(boolean z, int i3) {
        super(1);
        this.f1739j = i3;
        this.f1740k = z;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        L1.k kVar = L1.k.f2619a;
        boolean z = this.f1740k;
        switch (this.f1739j) {
            case 0:
                Y.f fVar = (Y.f) obj;
                Y1.j.e("$this$focusProperties", fVar);
                fVar.c(z);
                break;
            default:
                e2.InterfaceC0418c[] interfaceC0418cArr = u0.q.f8187a;
                u0.r rVar = u0.o.f8184x;
                e2.InterfaceC0418c interfaceC0418c = u0.q.f8187a[17];
                rVar.a((u0.i) obj, java.lang.Boolean.valueOf(z));
                break;
        }
        return kVar;
    }
}
