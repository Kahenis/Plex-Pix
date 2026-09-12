package H2;

/* loaded from: classes.dex */
public final class e1 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public int f1719m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1720n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1721o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y.l f1722p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(boolean z, Y.l lVar, P1.d dVar) {
        super(2, dVar);
        this.f1721o = z;
        this.f1722p = lVar;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        H2.e1 e1Var = new H2.e1(this.f1721o, this.f1722p, dVar);
        e1Var.f1720n = obj;
        return e1Var;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.e1) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(1:(1:4)(2:14|15))(4:16|(2:18|(1:20))|8|9)|5|6|7|8|9) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        android.support.v4.media.session.b.u(r4);
     */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object l(java.lang.Object obj) {
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1719m;
        if (i3 == 0) {
            android.support.v4.media.session.b.R(obj);
            h2.InterfaceC0525w interfaceC0525w = (h2.InterfaceC0525w) this.f1720n;
            if (this.f1721o) {
                this.f1720n = interfaceC0525w;
                this.f1719m = 1;
                if (h2.AbstractC0526x.e(60L, this) == aVar) {
                    return aVar;
                }
            }
            return L1.k.f2619a;
        }
        if (i3 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        android.support.v4.media.session.b.R(obj);
        this.f1722p.a();
        return L1.k.f2619a;
    }
}
