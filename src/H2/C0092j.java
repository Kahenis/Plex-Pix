package H2;

/* renamed from: H2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0092j extends Y1.k implements X1.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ G2.l f1769j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h2.InterfaceC0525w f1770k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1771l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1772m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1773n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1774o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1775p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1776q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1777r;
    public final /* synthetic */ G2.h s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I.C0154o0 f1778t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1779u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0092j(G2.l lVar, m2.d dVar, I.InterfaceC0144j0 interfaceC0144j0, I.InterfaceC0144j0 interfaceC0144j02, I.InterfaceC0144j0 interfaceC0144j03, I.InterfaceC0144j0 interfaceC0144j04, I.InterfaceC0144j0 interfaceC0144j05, I.InterfaceC0144j0 interfaceC0144j06, I.InterfaceC0144j0 interfaceC0144j07, G2.h hVar, I.C0154o0 c0154o0, I.InterfaceC0144j0 interfaceC0144j08) {
        super(0);
        this.f1769j = lVar;
        this.f1770k = dVar;
        this.f1771l = interfaceC0144j0;
        this.f1772m = interfaceC0144j02;
        this.f1773n = interfaceC0144j03;
        this.f1774o = interfaceC0144j04;
        this.f1775p = interfaceC0144j05;
        this.f1776q = interfaceC0144j06;
        this.f1777r = interfaceC0144j07;
        this.s = hVar;
        this.f1778t = c0154o0;
        this.f1779u = interfaceC0144j08;
    }

    @Override // X1.a
    public final java.lang.Object b() {
        G2.l lVar = this.f1769j;
        java.lang.String a3 = lVar.a();
        android.content.SharedPreferences sharedPreferences = lVar.f1130a;
        java.lang.String string = sharedPreferences.getString("thumbSize", "medium");
        java.lang.String str = string != null ? string : "medium";
        boolean z = sharedPreferences.getBoolean("videoFullscreen", false);
        boolean z3 = sharedPreferences.getBoolean("cloisteredNav", false);
        boolean z4 = sharedPreferences.getBoolean("chainPlay", false);
        boolean z5 = sharedPreferences.getBoolean("keepOnResize", false);
        sharedPreferences.edit().clear().putString("clientId", a3).putString("thumbSize", str).putBoolean("videoFullscreen", z).putBoolean("cloisteredNav", z3).putBoolean("chainPlay", z4).putBoolean("keepOnResize", z5).putBoolean("optimizedNav", sharedPreferences.getBoolean("optimizedNav", false)).putBoolean("updateBeta", sharedPreferences.getBoolean("updateBeta", false)).apply();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f1771l.setValue(bool);
        M1.t tVar = M1.t.f2687i;
        this.f1772m.setValue(tVar);
        this.f1773n.setValue(tVar);
        this.f1774o.setValue(null);
        this.f1775p.setValue(null);
        this.f1776q.setValue(bool);
        this.f1777r.setValue(H2.Y0.f1628j);
        h2.AbstractC0526x.p(this.f1770k, null, 0, new H2.C0090i(this.s, this.f1778t, this.f1779u, null), 3);
        return L1.k.f2619a;
    }
}
