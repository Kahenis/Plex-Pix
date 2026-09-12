package H2;

/* loaded from: classes.dex */
public final class K0 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public int f1508m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.i f1509n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1510o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G2.h f1511p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ G2.b f1512q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1513r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(G2.i iVar, I.InterfaceC0144j0 interfaceC0144j0, G2.h hVar, G2.b bVar, I.InterfaceC0144j0 interfaceC0144j02, P1.d dVar) {
        super(2, dVar);
        this.f1509n = iVar;
        this.f1510o = interfaceC0144j0;
        this.f1511p = hVar;
        this.f1512q = bVar;
        this.f1513r = interfaceC0144j02;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.K0(this.f1509n, this.f1510o, this.f1511p, this.f1512q, this.f1513r, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.K0) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        G2.i iVar;
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1508m;
        L1.k kVar = L1.k.f2619a;
        if (i3 == 0) {
            android.support.v4.media.session.b.R(obj);
            if (H2.L0.a(this.f1510o) && (iVar = this.f1509n) != null) {
                o2.c cVar = h2.AbstractC0461E.f5255b;
                H2.J0 j02 = new H2.J0(this.f1511p, iVar, this.f1512q, null);
                this.f1508m = 1;
                obj = h2.AbstractC0526x.x(cVar, j02, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return kVar;
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        android.support.v4.media.session.b.R(obj);
        G2.d dVar = (G2.d) obj;
        if (dVar != null) {
            this.f1513r.setValue(dVar);
        }
        return kVar;
    }
}
