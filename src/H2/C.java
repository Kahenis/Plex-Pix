package H2;

/* loaded from: classes.dex */
public final class C extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public I.InterfaceC0144j0 f1423m;

    /* renamed from: n, reason: collision with root package name */
    public int f1424n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ G2.h f1425o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ G2.i f1426p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ G2.l f1427q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1428r;
    public final /* synthetic */ I.InterfaceC0144j0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(G2.h hVar, G2.i iVar, G2.l lVar, I.InterfaceC0144j0 interfaceC0144j0, I.InterfaceC0144j0 interfaceC0144j02, P1.d dVar) {
        super(2, dVar);
        this.f1425o = hVar;
        this.f1426p = iVar;
        this.f1427q = lVar;
        this.f1428r = interfaceC0144j0;
        this.s = interfaceC0144j02;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.C(this.f1425o, this.f1426p, this.f1427q, this.f1428r, this.s, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.C) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        I.InterfaceC0144j0 interfaceC0144j0;
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1424n;
        if (i3 == 0) {
            android.support.v4.media.session.b.R(obj);
            o2.c cVar = h2.AbstractC0461E.f5255b;
            H2.B b3 = new H2.B(this.f1425o, this.f1426p, this.f1427q, null);
            I.InterfaceC0144j0 interfaceC0144j02 = this.f1428r;
            this.f1423m = interfaceC0144j02;
            this.f1424n = 1;
            obj = h2.AbstractC0526x.x(cVar, b3, this);
            if (obj == aVar) {
                return aVar;
            }
            interfaceC0144j0 = interfaceC0144j02;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0144j0 = this.f1423m;
            android.support.v4.media.session.b.R(obj);
        }
        interfaceC0144j0.setValue((java.util.List) obj);
        this.s.setValue(H2.Y0.f1630l);
        return L1.k.f2619a;
    }
}
