package H2;

/* loaded from: classes.dex */
public final class K extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1505j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X1.a f1506k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1507l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(X1.a aVar, I.InterfaceC0144j0 interfaceC0144j0, int i3) {
        super(1);
        this.f1505j = i3;
        this.f1506k = aVar;
        this.f1507l = interfaceC0144j0;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        X1.a aVar;
        X1.a aVar2;
        X1.a aVar3;
        X1.a aVar4;
        Y.o oVar = (Y.o) obj;
        switch (this.f1505j) {
            case 0:
                Y1.j.e("it", oVar);
                this.f1507l.setValue(java.lang.Boolean.valueOf(oVar.a()));
                if (oVar.a() && (aVar = this.f1506k) != null) {
                    aVar.b();
                }
                break;
            case 1:
                Y1.j.e("it", oVar);
                this.f1507l.setValue(java.lang.Boolean.valueOf(oVar.a()));
                if (oVar.a() && (aVar2 = this.f1506k) != null) {
                    aVar2.b();
                }
                break;
            case 2:
                Y1.j.e("it", oVar);
                this.f1507l.setValue(java.lang.Boolean.valueOf(oVar.a()));
                if (oVar.a() && (aVar3 = this.f1506k) != null) {
                    aVar3.b();
                }
                break;
            case 3:
                Y1.j.e("it", oVar);
                this.f1507l.setValue(java.lang.Boolean.valueOf(oVar.a()));
                if (oVar.a() && (aVar4 = this.f1506k) != null) {
                    aVar4.b();
                }
                break;
            default:
                Y1.j.e("it", oVar);
                this.f1507l.setValue(java.lang.Boolean.valueOf(oVar.a()));
                if (oVar.a()) {
                    this.f1506k.b();
                }
                break;
        }
        return L1.k.f2619a;
    }
}
