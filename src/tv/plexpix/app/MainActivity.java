package tv.plexpix.app;

/* loaded from: classes.dex */
public final class MainActivity extends d.m {
    public static final int $stable = 0;

    @Override // d.m, androidx.core.app.AbstractActivityC0242b, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        android.view.Window window = getWindow();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            V0.H.a(window, false);
        } else {
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
        }
        try {
            android.view.Window window2 = getWindow();
            B0.p pVar = new B0.p(getWindow().getDecorView());
            int i3 = android.os.Build.VERSION.SDK_INT;
            y2.l y3 = i3 >= 30 ? new V0.Y(window2, pVar) : i3 >= 26 ? new V0.X(window2, pVar) : new V0.W(window2, pVar);
            y3.z();
            y3.O();
        } catch (java.lang.Throwable th) {
            android.support.v4.media.session.b.u(th);
        }
        Q.a aVar = F2.c.f700b;
        android.view.ViewGroup.LayoutParams layoutParams = e.e.f4862a;
        android.view.View childAt = ((android.view.ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        q0.C0759e0 c0759e0 = childAt instanceof q0.C0759e0 ? (q0.C0759e0) childAt : null;
        if (c0759e0 != null) {
            c0759e0.setParentCompositionContext(null);
            c0759e0.setContent(aVar);
            return;
        }
        q0.C0759e0 c0759e02 = new q0.C0759e0(this);
        c0759e02.setParentCompositionContext(null);
        c0759e02.setContent(aVar);
        android.view.View decorView2 = getWindow().getDecorView();
        if (androidx.lifecycle.K.c(decorView2) == null) {
            decorView2.setTag(tv.plexpix.app.R.id.view_tree_lifecycle_owner, this);
        }
        if (((androidx.lifecycle.W) f2.i.S(f2.i.U(f2.i.T(decorView2, androidx.lifecycle.X.f3736m), androidx.lifecycle.X.f3737n))) == null) {
            decorView2.setTag(tv.plexpix.app.R.id.view_tree_view_model_store_owner, this);
        }
        if (((j1.InterfaceC0546g) f2.i.S(f2.i.U(f2.i.T(decorView2, j1.C0547h.f5421k), j1.C0547h.f5422l))) == null) {
            decorView2.setTag(tv.plexpix.app.R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(c0759e02, e.e.f4862a);
    }
}
