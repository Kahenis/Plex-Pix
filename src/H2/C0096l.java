package H2;

/* renamed from: H2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096l extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public int f1799m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d.m f1800n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0096l(d.m mVar, P1.d dVar) {
        super(2, dVar);
        this.f1800n = mVar;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.C0096l(this.f1800n, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.C0096l) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        Q1.a aVar = Q1.a.f2846i;
        int i3 = this.f1799m;
        if (i3 == 0) {
            android.support.v4.media.session.b.R(obj);
            this.f1799m = 1;
            if (h2.AbstractC0526x.e(120L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.R(obj);
        }
        android.view.KeyEvent keyEvent = new android.view.KeyEvent(0, 22);
        d.m mVar = this.f1800n;
        mVar.dispatchKeyEvent(keyEvent);
        mVar.dispatchKeyEvent(new android.view.KeyEvent(1, 22));
        return L1.k.f2619a;
    }
}
