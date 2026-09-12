package H2;

/* renamed from: H2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090i extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public int f1749m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.h f1750n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I.C0154o0 f1751o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1752p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0090i(G2.h hVar, I.C0154o0 c0154o0, I.InterfaceC0144j0 interfaceC0144j0, P1.d dVar) {
        super(2, dVar);
        this.f1750n = hVar;
        this.f1751o = c0154o0;
        this.f1752p = interfaceC0144j0;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.C0090i(this.f1750n, this.f1751o, this.f1752p, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.C0090i) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1749m;
        try {
            if (i3 == 0) {
                android.support.v4.media.session.b.R(obj);
                o2.c cVar = h2.AbstractC0461E.f5255b;
                H2.C0088h c0088h = new H2.C0088h(this.f1750n, null);
                this.f1749m = 1;
                obj = h2.AbstractC0526x.x(cVar, c0088h, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.support.v4.media.session.b.R(obj);
            }
            G2.e eVar = (G2.e) obj;
            this.f1751o.h(eVar.f1106a);
            this.f1752p.setValue(eVar.f1107b);
        } catch (java.lang.Exception unused) {
        }
        return L1.k.f2619a;
    }
}
