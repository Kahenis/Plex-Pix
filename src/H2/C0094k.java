package H2;

/* renamed from: H2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094k extends Y1.k implements X1.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1788j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d.m f1789k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0094k(d.m mVar, int i3) {
        super(0);
        this.f1788j = i3;
        this.f1789k = mVar;
    }

    @Override // X1.a
    public final java.lang.Object b() {
        d.j jVar;
        switch (this.f1788j) {
            case 0:
                this.f1789k.finishAffinity();
                return L1.k.f2619a;
            case 1:
                this.f1789k.finishAffinity();
                return L1.k.f2619a;
            case 2:
                this.f1789k.finishAffinity();
                return L1.k.f2619a;
            case 3:
                d.m mVar = this.f1789k;
                return new androidx.lifecycle.N(mVar.getApplication(), (tv.plexpix.app.MainActivity) mVar, mVar.getIntent() != null ? mVar.getIntent().getExtras() : null);
            case 4:
                this.f1789k.reportFullyDrawn();
                return L1.k.f2619a;
            case 5:
                d.m mVar2 = this.f1789k;
                jVar = mVar2.reportFullyDrawnExecutor;
                return new d.n(jVar, new H2.C0094k((tv.plexpix.app.MainActivity) mVar2, 4));
            default:
                d.m mVar3 = this.f1789k;
                tv.plexpix.app.MainActivity mainActivity = (tv.plexpix.app.MainActivity) mVar3;
                d.x xVar = new d.x(new d.RunnableC0366d(mainActivity, 1));
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    if (Y1.j.a(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                        mVar3.getLifecycle().a(new V0.C0197e(xVar, 1, mVar3));
                    } else {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new androidx.media3.common.k(mainActivity, 7, xVar));
                    }
                }
                return xVar;
        }
    }
}
