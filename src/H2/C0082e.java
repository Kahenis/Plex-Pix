package H2;

/* renamed from: H2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0082e extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h2.InterfaceC0525w f1702j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1703k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1704l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1705m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I.C0154o0 f1706n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1707o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I.C0154o0 f1708p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1709q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1710r;
    public final /* synthetic */ I.InterfaceC0144j0 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1711t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G2.h f1712u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0082e(m2.d dVar, I.InterfaceC0144j0 interfaceC0144j0, I.InterfaceC0144j0 interfaceC0144j02, I.InterfaceC0144j0 interfaceC0144j03, I.C0154o0 c0154o0, I.InterfaceC0144j0 interfaceC0144j04, I.C0154o0 c0154o02, I.InterfaceC0144j0 interfaceC0144j05, I.InterfaceC0144j0 interfaceC0144j06, I.InterfaceC0144j0 interfaceC0144j07, I.InterfaceC0144j0 interfaceC0144j08, G2.h hVar) {
        super(1);
        this.f1702j = dVar;
        this.f1703k = interfaceC0144j0;
        this.f1704l = interfaceC0144j02;
        this.f1705m = interfaceC0144j03;
        this.f1706n = c0154o0;
        this.f1707o = interfaceC0144j04;
        this.f1708p = c0154o02;
        this.f1709q = interfaceC0144j05;
        this.f1710r = interfaceC0144j06;
        this.s = interfaceC0144j07;
        this.f1711t = interfaceC0144j08;
        this.f1712u = hVar;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        G2.c cVar = (G2.c) obj;
        Y1.j.e("folder", cVar);
        this.f1703k.setValue(cVar);
        this.f1704l.setValue(H2.u1.f1936i);
        this.f1705m.setValue(java.lang.Boolean.FALSE);
        this.f1706n.h(0);
        H2.L0.c(this.f1707o, false);
        I.C0154o0 c0154o0 = this.f1708p;
        c0154o0.h(c0154o0.g() + 1);
        if (cVar.f1095g) {
            java.util.List<L1.f> P2 = M1.l.P(new L1.f("photo-1519046904884-53103b34b206", "Promenade"), new L1.f("photo-1507525428034-b723cf961d3e", "Calanques"), new L1.f("photo-1533105079780-92b9be482077", "Village blanc"), new L1.f("photo-1500375592092-40eb2168fd21", "Port"), new L1.f("photo-1523906834658-6e24ef2386f9", "Terrasse"), new L1.f("photo-1500530855697-b586d89ba3ee", "Fin de journée"));
            java.util.List P3 = M1.l.P(new L1.f("photo-1540959733332-eab4deabeeaf", "Shibuya"), new L1.f("photo-1513407030348-c983a97b98d8", "Tour de Tokyo"), new L1.f("photo-1524413840807-0c3cb6fa808d", "Lanternes"), new L1.f("photo-1503899036084-c55cdd92da26", "Pluie"));
            if (g2.AbstractC0440e.n0(cVar.f1089a, "tokyo", false)) {
                P2 = P3;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(M1.m.S(P2));
            for (L1.f fVar : P2) {
                java.lang.String str = (java.lang.String) fVar.f2612i;
                java.lang.String str2 = "https://images.unsplash.com/" + str + "?auto=format&fit=crop&w=1600&q=80";
                arrayList.add(new G2.b(str, (java.lang.String) fVar.f2613j, "photo", str2, null, null, null, null, str2, null, 752));
            }
            this.f1709q.setValue(arrayList);
        } else {
            G2.i iVar = (G2.i) this.f1710r.getValue();
            if (iVar != null) {
                h2.AbstractC0526x.p(this.f1702j, null, 0, new H2.C0080d(this.s, this.f1711t, this.f1712u, iVar, cVar, this.f1709q, null), 3);
            }
        }
        return L1.k.f2619a;
    }
}
