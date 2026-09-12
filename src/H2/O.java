package H2;

/* loaded from: classes.dex */
public final class O extends Y1.k implements X1.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1521j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1522k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1523l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O(java.lang.Object obj, int i3, java.lang.Object obj2) {
        super(0);
        this.f1521j = i3;
        this.f1522k = obj;
        this.f1523l = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [U.n] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [U.n] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [K.h] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [K.h] */
    @Override // X1.a
    public final java.lang.Object b() {
        n0.O placementScope;
        u0.l lVar;
        androidx.compose.ui.node.a aVar;
        L1.k kVar = L1.k.f2619a;
        java.lang.Object obj = this.f1523l;
        java.lang.Object obj2 = this.f1522k;
        switch (this.f1521j) {
            case 0:
                ((X1.c) obj2).invoke((G2.c) obj);
                return kVar;
            case 1:
                ((X1.a) obj2).b();
                X1.a aVar2 = (X1.a) obj;
                if (aVar2 != null) {
                    aVar2.b();
                }
                return kVar;
            case 2:
                ((X1.c) obj2).invoke((G2.i) obj);
                return kVar;
            case 3:
                ((X.b) obj2).f3165x.invoke((X.c) obj);
                return kVar;
            case 4:
                ((Y1.s) obj2).f3250i = ((Y.p) obj).x0();
                return kVar;
            case 5:
                p0.P p3 = ((androidx.compose.ui.node.a) obj2).E;
                if ((p3.f6387e.f3057l & 8) != 0) {
                    for (U.n nVar = p3.f6386d; nVar != null; nVar = nVar.f3058m) {
                        if ((nVar.f3056k & 8) != 0) {
                            ?? r7 = 0;
                            p0.AbstractC0675k abstractC0675k = nVar;
                            while (abstractC0675k != 0) {
                                if (abstractC0675k instanceof p0.g0) {
                                    p0.g0 g0Var = (p0.g0) abstractC0675k;
                                    Y1.s sVar = (Y1.s) obj;
                                    if (g0Var.T()) {
                                        u0.i iVar = new u0.i();
                                        sVar.f3250i = iVar;
                                        iVar.f8139k = true;
                                    }
                                    if (g0Var.U()) {
                                        ((u0.i) sVar.f3250i).f8138j = true;
                                    }
                                    g0Var.u((u0.i) sVar.f3250i);
                                } else if ((abstractC0675k.f3056k & 8) != 0 && (abstractC0675k instanceof p0.AbstractC0675k)) {
                                    U.n nVar2 = abstractC0675k.f6478w;
                                    int i3 = 0;
                                    abstractC0675k = abstractC0675k;
                                    r7 = r7;
                                    while (nVar2 != null) {
                                        if ((nVar2.f3056k & 8) != 0) {
                                            i3++;
                                            r7 = r7;
                                            if (i3 == 1) {
                                                abstractC0675k = nVar2;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new K.h(new U.n[16]);
                                                }
                                                if (abstractC0675k != 0) {
                                                    r7.b(abstractC0675k);
                                                    abstractC0675k = 0;
                                                }
                                                r7.b(nVar2);
                                            }
                                        }
                                        nVar2 = nVar2.f3059n;
                                        abstractC0675k = abstractC0675k;
                                        r7 = r7;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC0675k = p0.AbstractC0655C.f(r7);
                            }
                        }
                    }
                }
                return kVar;
            case 6:
                p0.C0660H c0660h = (p0.C0660H) obj2;
                p0.V v3 = c0660h.a().s;
                if (v3 == null || (placementScope = v3.f6360p) == null) {
                    placementScope = ((q0.C0789u) p0.AbstractC0655C.A(c0660h.f6335a)).getPlacementScope();
                }
                p0.C0658F c0658f = (p0.C0658F) obj;
                X1.c cVar = c0658f.f6317H;
                if (cVar == null) {
                    p0.V a3 = c0660h.a();
                    long j3 = c0658f.f6318I;
                    float f3 = c0658f.f6319J;
                    placementScope.getClass();
                    n0.O.d(a3, j3, f3);
                } else {
                    p0.V a4 = c0660h.a();
                    long j4 = c0658f.f6318I;
                    float f4 = c0658f.f6319J;
                    placementScope.getClass();
                    n0.O.j(a4, j4, f4, cVar);
                }
                return kVar;
            case 7:
                a0.J j5 = p0.V.f6408J;
                ((p0.V) obj2).u0((a0.InterfaceC0237q) obj);
                return kVar;
            case 8:
                ((Y1.s) obj2).f3250i = p0.AbstractC0655C.p((q.L) obj, n0.N.f5900a);
                return kVar;
            case 9:
                q0.C0789u c0789u = (q0.C0789u) obj2;
                L0.j jVar = (L0.j) obj;
                c0789u.getAndroidViewsHandler$ui_release().removeViewInLayout(jVar);
                Y1.v.b(c0789u.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder()).remove(c0789u.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(jVar));
                java.lang.reflect.Field field = V0.B.f3080a;
                jVar.setImportantForAccessibility(0);
                return kVar;
            case 10:
                q0.F0 f02 = (q0.F0) obj2;
                u0.g gVar = f02.f6884m;
                u0.g gVar2 = f02.f6885n;
                java.lang.Float f5 = f02.f6882k;
                java.lang.Float f6 = f02.f6883l;
                float floatValue = (gVar == null || f5 == null) ? 0.0f : ((java.lang.Number) gVar.f8111a.b()).floatValue() - f5.floatValue();
                float floatValue2 = (gVar2 == null || f6 == null) ? 0.0f : ((java.lang.Number) gVar2.f8111a.b()).floatValue() - f6.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    q0.C0747I c0747i = (q0.C0747I) obj;
                    int K2 = c0747i.K(f02.f6880i);
                    q0.G0 g02 = (q0.G0) c0747i.x().get(java.lang.Integer.valueOf(c0747i.f6924u));
                    if (g02 != null) {
                        try {
                            android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = c0747i.f6925v;
                            if (accessibilityNodeInfo != null) {
                                accessibilityNodeInfo.setBoundsInScreen(c0747i.p(g02));
                            }
                        } catch (java.lang.IllegalStateException unused) {
                        }
                    }
                    c0747i.f6916l.invalidate();
                    q0.G0 g03 = (q0.G0) c0747i.x().get(java.lang.Integer.valueOf(K2));
                    if (g03 != null && (lVar = g03.f6888a) != null && (aVar = lVar.f8144c) != null) {
                        if (gVar != null) {
                            c0747i.f6927x.put(java.lang.Integer.valueOf(K2), gVar);
                        }
                        if (gVar2 != null) {
                            c0747i.f6928y.put(java.lang.Integer.valueOf(K2), gVar2);
                        }
                        c0747i.G(aVar);
                    }
                }
                if (gVar != null) {
                    f02.f6882k = (java.lang.Float) gVar.f8111a.b();
                }
                if (gVar2 != null) {
                    f02.f6883l = (java.lang.Float) gVar2.f8111a.b();
                }
                return kVar;
            case 11:
                w.C0958m c0958m = (w.C0958m) ((I.p1) obj2).getValue();
                w.K k3 = (w.K) obj;
                return new w.q(k3, c0958m, new K.a((d2.C0376d) k3.f8504i.f8272f.getValue(), c0958m));
            default:
                Z.d dVar = (Z.d) obj2;
                if (dVar != null) {
                    return dVar;
                }
                n0.InterfaceC0602m x02 = ((y.C1024g) obj).x0();
                if (x02 != null) {
                    return a2.AbstractC0240a.c(Z.c.f3258b, android.support.v4.media.session.b.T(x02.I()));
                }
                return null;
        }
    }
}
