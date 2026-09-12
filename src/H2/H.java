package H2;

/* loaded from: classes.dex */
public final class H extends Y1.k implements X1.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1471j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X1.c f1472k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1473l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(X1.c cVar, java.lang.String str, int i3) {
        super(0);
        this.f1471j = i3;
        this.f1472k = cVar;
        this.f1473l = str;
    }

    @Override // X1.a
    public final java.lang.Object b() {
        switch (this.f1471j) {
            case 0:
                this.f1472k.invoke(this.f1473l);
                break;
            default:
                this.f1472k.invoke(this.f1473l);
                break;
        }
        return L1.k.f2619a;
    }
}
