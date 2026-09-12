package H2;

/* loaded from: classes.dex */
public final class L extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1514j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Y.l f1515k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(boolean z, Y.l lVar) {
        super(1);
        this.f1514j = z;
        this.f1515k = lVar;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        Y.f fVar = (Y.f) obj;
        Y1.j.e("$this$focusProperties", fVar);
        fVar.c(this.f1514j);
        Y.l lVar = this.f1515k;
        if (lVar != null) {
            fVar.a(lVar);
        }
        return L1.k.f2619a;
    }
}
