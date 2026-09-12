package H2;

/* renamed from: H2.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107q0 extends Y1.k implements X1.c {

    /* renamed from: k, reason: collision with root package name */
    public static final H2.C0107q0 f1871k = new H2.C0107q0(1, 0);

    /* renamed from: l, reason: collision with root package name */
    public static final H2.C0107q0 f1872l = new H2.C0107q0(1, 1);

    /* renamed from: m, reason: collision with root package name */
    public static final H2.C0107q0 f1873m = new H2.C0107q0(1, 2);

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1874j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0107q0(int i3, int i4) {
        super(i3);
        this.f1874j = i4;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        Y.f fVar = (Y.f) obj;
        switch (this.f1874j) {
            case 0:
                Y1.j.e("$this$focusProperties", fVar);
                fVar.c(false);
                break;
            case 1:
                Y1.j.e("$this$focusProperties", fVar);
                fVar.c(false);
                break;
            default:
                Y1.j.e("$this$focusProperties", fVar);
                Y.l lVar = Y.l.f3207c;
                fVar.a(lVar);
                fVar.f(lVar);
                fVar.e(lVar);
                fVar.d(lVar);
                break;
        }
        return L1.k.f2619a;
    }
}
