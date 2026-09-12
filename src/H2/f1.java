package H2;

/* loaded from: classes.dex */
public final class f1 extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1733j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X1.c f1734k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G2.f f1735l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(X1.c cVar, G2.f fVar, int i3) {
        super(1);
        this.f1733j = i3;
        this.f1734k = cVar;
        this.f1735l = fVar;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f1733j) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                Y1.j.e("it", str);
                this.f1734k.invoke(G2.f.a(this.f1735l, str, false, false, false, false, false, false, 126));
                break;
            case 1:
                this.f1734k.invoke(G2.f.a(this.f1735l, null, false, false, false, false, false, ((java.lang.Boolean) obj).booleanValue(), 63));
                break;
            case 2:
                java.lang.String str2 = (java.lang.String) obj;
                Y1.j.e("it", str2);
                this.f1734k.invoke(G2.f.a(this.f1735l, str2, false, false, false, false, false, false, 126));
                break;
            case 3:
                java.lang.String str3 = (java.lang.String) obj;
                Y1.j.e("it", str3);
                this.f1734k.invoke(G2.f.a(this.f1735l, str3, false, false, false, false, false, false, 126));
                break;
            case 4:
                java.lang.String str4 = (java.lang.String) obj;
                Y1.j.e("it", str4);
                this.f1734k.invoke(G2.f.a(this.f1735l, str4, false, false, false, false, false, false, 126));
                break;
            case 5:
                this.f1734k.invoke(G2.f.a(this.f1735l, null, ((java.lang.Boolean) obj).booleanValue(), false, false, false, false, false, 125));
                break;
            case 6:
                this.f1734k.invoke(G2.f.a(this.f1735l, null, false, ((java.lang.Boolean) obj).booleanValue(), false, false, false, false, 123));
                break;
            case 7:
                this.f1734k.invoke(G2.f.a(this.f1735l, null, false, false, ((java.lang.Boolean) obj).booleanValue(), false, false, false, 119));
                break;
            case 8:
                this.f1734k.invoke(G2.f.a(this.f1735l, null, false, false, false, ((java.lang.Boolean) obj).booleanValue(), false, false, 111));
                break;
            default:
                this.f1734k.invoke(G2.f.a(this.f1735l, null, false, false, false, false, ((java.lang.Boolean) obj).booleanValue(), false, 95));
                break;
        }
        return L1.k.f2619a;
    }
}
