package H2;

/* loaded from: classes.dex */
public final class U extends Y1.k implements X1.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1556j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X1.c f1557k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1558l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(X1.c cVar, boolean z, int i3) {
        super(0);
        this.f1556j = i3;
        this.f1557k = cVar;
        this.f1558l = z;
    }

    @Override // X1.a
    public final java.lang.Object b() {
        switch (this.f1556j) {
            case 0:
                this.f1557k.invoke(java.lang.Boolean.valueOf(!this.f1558l));
                break;
            case 1:
                this.f1557k.invoke(java.lang.Boolean.valueOf(!this.f1558l));
                break;
            case 2:
                this.f1557k.invoke(java.lang.Boolean.valueOf(!this.f1558l));
                break;
            default:
                this.f1557k.invoke(java.lang.Boolean.valueOf(!this.f1558l));
                break;
        }
        return L1.k.f2619a;
    }
}
