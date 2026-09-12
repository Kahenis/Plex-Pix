package H2;

/* loaded from: classes.dex */
public final class S extends Y1.k implements X1.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1548j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.List f1549k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X1.c f1550l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1551m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S(java.util.List list, X1.c cVar, int i3, int i4) {
        super(0);
        this.f1548j = i4;
        this.f1549k = list;
        this.f1550l = cVar;
        this.f1551m = i3;
    }

    @Override // X1.a
    public final java.lang.Object b() {
        switch (this.f1548j) {
            case 0:
                java.util.List list = this.f1549k;
                if (!list.isEmpty()) {
                    this.f1550l.invoke(java.lang.Integer.valueOf((list.size() + (this.f1551m - 1)) % list.size()));
                }
                break;
            case 1:
                java.util.List list2 = this.f1549k;
                if (!list2.isEmpty()) {
                    this.f1550l.invoke(java.lang.Integer.valueOf((this.f1551m + 1) % list2.size()));
                }
                break;
            case 2:
                java.util.List list3 = this.f1549k;
                if (!list3.isEmpty()) {
                    this.f1550l.invoke(java.lang.Integer.valueOf((list3.size() + (this.f1551m - 1)) % list3.size()));
                }
                break;
            default:
                java.util.List list4 = this.f1549k;
                if (!list4.isEmpty()) {
                    this.f1550l.invoke(java.lang.Integer.valueOf((this.f1551m + 1) % list4.size()));
                }
                break;
        }
        return L1.k.f2619a;
    }
}
