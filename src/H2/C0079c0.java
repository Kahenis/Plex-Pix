package H2;

/* renamed from: H2.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079c0 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public I.InterfaceC0144j0 f1673m;

    /* renamed from: n, reason: collision with root package name */
    public int f1674n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1675o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1676p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1677q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079c0(java.lang.String str, java.lang.String str2, I.InterfaceC0144j0 interfaceC0144j0, P1.d dVar) {
        super(2, dVar);
        this.f1675o = str;
        this.f1676p = str2;
        this.f1677q = interfaceC0144j0;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.C0079c0(this.f1675o, this.f1676p, this.f1677q, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.C0079c0) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        I.InterfaceC0144j0 interfaceC0144j0;
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1674n;
        if (i3 == 0) {
            android.support.v4.media.session.b.R(obj);
            o2.d dVar = h2.AbstractC0461E.f5254a;
            H2.C0077b0 c0077b0 = new H2.C0077b0(this.f1675o, this.f1676p, null);
            I.InterfaceC0144j0 interfaceC0144j02 = this.f1677q;
            this.f1673m = interfaceC0144j02;
            this.f1674n = 1;
            obj = h2.AbstractC0526x.x(dVar, c0077b0, this);
            if (obj == aVar) {
                return aVar;
            }
            interfaceC0144j0 = interfaceC0144j02;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0144j0 = this.f1673m;
            android.support.v4.media.session.b.R(obj);
        }
        interfaceC0144j0.setValue((a0.InterfaceC0220C) obj);
        return L1.k.f2619a;
    }
}
