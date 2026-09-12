package H2;

/* loaded from: classes.dex */
public final class D extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G2.l f1434j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h2.InterfaceC0525w f1435k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1436l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1437m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.h f1438n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1439o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1440p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(G2.l lVar, m2.d dVar, I.InterfaceC0144j0 interfaceC0144j0, I.InterfaceC0144j0 interfaceC0144j02, G2.h hVar, I.InterfaceC0144j0 interfaceC0144j03, I.InterfaceC0144j0 interfaceC0144j04) {
        super(1);
        this.f1434j = lVar;
        this.f1435k = dVar;
        this.f1436l = interfaceC0144j0;
        this.f1437m = interfaceC0144j02;
        this.f1438n = hVar;
        this.f1439o = interfaceC0144j03;
        this.f1440p = interfaceC0144j04;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        G2.i iVar = (G2.i) obj;
        Y1.j.e(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, iVar);
        this.f1436l.setValue(iVar);
        G2.l lVar = this.f1434j;
        java.lang.String string = lVar.f1130a.getString("authToken", null);
        if (string == null) {
            string = "";
        }
        java.lang.String str = (java.lang.String) this.f1437m.getValue();
        lVar.b(string, iVar.f1121d, iVar.f1120c, iVar.f1118a, str);
        h2.AbstractC0526x.p(this.f1435k, null, 0, new H2.C(this.f1438n, iVar, this.f1434j, this.f1439o, this.f1440p, null), 3);
        return L1.k.f2619a;
    }
}
