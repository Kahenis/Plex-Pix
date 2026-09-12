package H2;

/* loaded from: classes.dex */
public final class G extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f1459j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f1460k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(boolean z, boolean z3) {
        super(1);
        this.f1459j = z;
        this.f1460k = z3;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        Y.f fVar = (Y.f) obj;
        Y1.j.e("$this$focusProperties", fVar);
        fVar.c(this.f1459j);
        if (this.f1460k) {
            fVar.a(Y.l.f3207c);
        }
        return L1.k.f2619a;
    }
}
