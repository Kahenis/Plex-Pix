package H2;

/* renamed from: H2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076b extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1660j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1661k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1662l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1663m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0076b(G2.l lVar, I.InterfaceC0144j0 interfaceC0144j0, I.InterfaceC0144j0 interfaceC0144j02) {
        super(1);
        this.f1660j = 1;
        this.f1663m = lVar;
        this.f1661k = interfaceC0144j0;
        this.f1662l = interfaceC0144j02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0214, code lost:
    
        if (r0 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021f, code lost:
    
        if (r0 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0206, code lost:
    
        if (r0 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0208, code lost:
    
        r0.invoke(r13);
     */
    @Override // X1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.Object obj) {
        X1.e h1Var;
        X1.c cVar;
        q2.v vVar;
        switch (this.f1660j) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                Y1.j.e("it", str);
                ((I.InterfaceC0144j0) this.f1661k).setValue(str);
                ((I.C0154o0) this.f1663m).h(0);
                ((I.InterfaceC0144j0) this.f1662l).setValue(H2.u1.f1936i);
                return L1.k.f2619a;
            case 1:
                G2.f fVar = (G2.f) obj;
                Y1.j.e("next", fVar);
                I.InterfaceC0144j0 interfaceC0144j0 = (I.InterfaceC0144j0) this.f1661k;
                boolean z = ((G2.f) interfaceC0144j0.getValue()).f1110c;
                boolean z3 = fVar.f1110c;
                if (z && !z3) {
                    H2.L0.c((I.InterfaceC0144j0) this.f1662l, true);
                }
                interfaceC0144j0.setValue(fVar);
                G2.l lVar = (G2.l) this.f1663m;
                lVar.getClass();
                lVar.f1130a.edit().putString("thumbSize", fVar.f1108a).putBoolean("videoFullscreen", fVar.f1109b).putBoolean("cloisteredNav", z3).putBoolean("chainPlay", fVar.f1111d).putBoolean("keepOnResize", fVar.f1112e).putBoolean("optimizedNav", fVar.f1113f).putBoolean("updateBeta", fVar.f1114g).apply();
                return L1.k.f2619a;
            case 2:
                android.view.KeyEvent keyEvent = ((i0.C0531b) obj).f5369a;
                Y1.j.e("ev", keyEvent);
                boolean z4 = true;
                if (android.support.v4.media.session.b.w(y2.d.v(keyEvent), 1) && (i0.C0530a.a(y2.l.c(keyEvent.getKeyCode()), i0.C0530a.f5358g) || i0.C0530a.a(y2.l.c(keyEvent.getKeyCode()), i0.C0530a.f5360i))) {
                    ((X1.c) this.f1661k).invoke(java.lang.Boolean.FALSE);
                } else {
                    boolean w3 = android.support.v4.media.session.b.w(y2.d.v(keyEvent), 2);
                    h2.InterfaceC0525w interfaceC0525w = (h2.InterfaceC0525w) this.f1662l;
                    q.y0 y0Var = (q.y0) this.f1663m;
                    if (w3 && i0.C0530a.a(y2.l.c(keyEvent.getKeyCode()), i0.C0530a.f5355d)) {
                        h1Var = new H2.g1(y0Var, null);
                    } else if (android.support.v4.media.session.b.w(y2.d.v(keyEvent), 2) && i0.C0530a.a(y2.l.c(keyEvent.getKeyCode()), i0.C0530a.f5354c)) {
                        h1Var = new H2.h1(y0Var, null);
                    } else {
                        z4 = false;
                    }
                    h2.AbstractC0526x.p(interfaceC0525w, null, 0, h1Var, 3);
                }
                return java.lang.Boolean.valueOf(z4);
            case 3:
                a0.InterfaceC0237q x3 = ((c0.InterfaceC0346d) obj).v().x();
                L0.j jVar = (L0.j) this.f1661k;
                if (jVar.getView().getVisibility() != 8) {
                    jVar.f2562C = true;
                    p0.a0 a0Var = ((androidx.compose.ui.node.a) this.f1662l).f3562q;
                    q0.C0789u c0789u = a0Var instanceof q0.C0789u ? (q0.C0789u) a0Var : null;
                    if (c0789u != null) {
                        android.graphics.Canvas a3 = a0.AbstractC0224d.a(x3);
                        c0789u.getAndroidViewsHandler$ui_release().getClass();
                        ((L0.j) this.f1663m).draw(a3);
                    }
                    jVar.f2562C = false;
                }
                return L1.k.f2619a;
            case 4:
                R.h hVar = (R.h) this.f1661k;
                java.util.LinkedHashMap linkedHashMap = hVar.f2877b;
                java.lang.Object obj2 = this.f1662l;
                if (!(!linkedHashMap.containsKey(obj2))) {
                    throw new java.lang.IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
                }
                hVar.f2876a.remove(obj2);
                java.util.LinkedHashMap linkedHashMap2 = hVar.f2877b;
                R.f fVar2 = (R.f) this.f1663m;
                linkedHashMap2.put(obj2, fVar2);
                return new R.g(fVar2, hVar, obj2);
            case 5:
                W.c cVar2 = (W.c) obj;
                Y1.o oVar = (Y1.o) this.f1661k;
                boolean z5 = oVar.f3246i;
                boolean x02 = cVar2.x0((B0.p) this.f1662l);
                if (x02) {
                    ((q0.ViewOnDragListenerC0769j0) ((q0.C0789u) p0.AbstractC0655C.B((W.c) this.f1663m)).getDragAndDropManager()).f7095b.add(cVar2);
                }
                oVar.f3246i = z5 | x02;
                return java.lang.Boolean.TRUE;
            case 6:
                d.x xVar = (d.x) this.f1661k;
                xVar.getClass();
                androidx.lifecycle.InterfaceC0277u interfaceC0277u = (androidx.lifecycle.InterfaceC0277u) this.f1662l;
                Y1.j.e("owner", interfaceC0277u);
                e.c cVar3 = (e.c) this.f1663m;
                Y1.j.e("onBackPressedCallback", cVar3);
                androidx.lifecycle.AbstractC0273p lifecycle = interfaceC0277u.getLifecycle();
                if (lifecycle.b() != androidx.lifecycle.EnumC0272o.f3751i) {
                    cVar3.f4859b.add(new d.u(xVar, lifecycle, cVar3));
                    xVar.d();
                    cVar3.f4860c = new d.w(0, xVar, d.x.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
                }
                return new H2.M(1, cVar3);
            case 7:
                L1.b a4 = m2.a.a((X1.c) this.f1661k, this.f1662l, null);
                if (a4 != null) {
                    h2.AbstractC0526x.k((P1.i) this.f1663m, a4);
                }
                return L1.k.f2619a;
            case 8:
                p1.AbstractC0706j abstractC0706j = (p1.AbstractC0706j) obj;
                if (!(abstractC0706j instanceof p1.C0704h)) {
                    if (!(abstractC0706j instanceof p1.C0705i)) {
                        if (abstractC0706j instanceof p1.C0703g) {
                            cVar = (X1.c) this.f1663m;
                            break;
                        } else {
                            boolean z6 = abstractC0706j instanceof p1.C0702f;
                        }
                        return L1.k.f2619a;
                    }
                    cVar = (X1.c) this.f1662l;
                    break;
                } else {
                    cVar = (X1.c) this.f1661k;
                    break;
                }
            case 9:
                p1.AbstractC0706j abstractC0706j2 = (p1.AbstractC0706j) obj;
                if (abstractC0706j2 instanceof p1.C0704h) {
                    d0.AbstractC0369c abstractC0369c = (d0.AbstractC0369c) this.f1661k;
                    if (abstractC0369c == null) {
                        return (p1.C0704h) abstractC0706j2;
                    }
                    ((p1.C0704h) abstractC0706j2).getClass();
                    return new p1.C0704h(abstractC0369c);
                }
                if (!(abstractC0706j2 instanceof p1.C0703g)) {
                    return abstractC0706j2;
                }
                p1.C0703g c0703g = (p1.C0703g) abstractC0706j2;
                y1.C1035e c1035e = c0703g.f6535b;
                if (c1035e.f9124c instanceof y1.C1042l) {
                    d0.AbstractC0369c abstractC0369c2 = (d0.AbstractC0369c) this.f1662l;
                    return abstractC0369c2 != null ? new p1.C0703g(abstractC0369c2, c1035e) : c0703g;
                }
                d0.AbstractC0369c abstractC0369c3 = (d0.AbstractC0369c) this.f1663m;
                return abstractC0369c3 != null ? new p1.C0703g(abstractC0369c3, c1035e) : c0703g;
            case 10:
                float floatValue = ((java.lang.Number) obj).floatValue();
                float f3 = ((r.C0854p) this.f1661k).f7734x ? 1.0f : -1.0f;
                float a5 = ((r.InterfaceC0843j0) this.f1662l).a(f3 * floatValue) * f3;
                if (java.lang.Math.abs(a5) < java.lang.Math.abs(floatValue)) {
                    java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException("Scroll animation cancelled because scroll was not consumed (" + a5 + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    ((h2.InterfaceC0478W) this.f1663m).b(cancellationException);
                }
                return L1.k.f2619a;
            case 11:
                n0.O o3 = (n0.O) obj;
                u.C0890A c0890a = (u.C0890A) this.f1661k;
                boolean z7 = c0890a.z;
                n0.P p3 = (n0.P) this.f1662l;
                n0.H h3 = (n0.H) this.f1663m;
                if (z7) {
                    n0.O.f(o3, p3, h3.E(c0890a.f8003v), h3.E(c0890a.f8004w));
                } else {
                    n0.O.c(o3, p3, h3.E(c0890a.f8003v), h3.E(c0890a.f8004w));
                }
                return L1.k.f2619a;
            case 12:
                u.C0893D c0893d = (u.C0893D) this.f1663m;
                u.InterfaceC0891B interfaceC0891B = c0893d.f8011v;
                n0.H h4 = (n0.H) this.f1662l;
                n0.O.c((n0.O) obj, (n0.P) this.f1661k, h4.E(((u.C0892C) interfaceC0891B).a(h4.getLayoutDirection())), h4.E(((u.C0892C) c0893d.f8011v).f8008b));
                return L1.k.f2619a;
            case 13:
                n0.O o4 = (n0.O) obj;
                I0.k layoutDirection = ((n0.H) this.f1663m).getLayoutDirection();
                u.C0895F c0895f = (u.C0895F) this.f1661k;
                c0895f.getClass();
                androidx.recyclerview.widget.C0306p c0306p = (androidx.recyclerview.widget.C0306p) this.f1662l;
                for (int i3 = c0306p.f4522b; i3 < c0306p.f4523c; i3++) {
                    n0.P p4 = ((n0.P[]) c0895f.f8022f)[i3];
                    Y1.j.b(p4);
                    java.lang.Object h5 = ((n0.E) ((java.util.List) c0895f.f8021e).get(i3)).h();
                    u.C0896G c0896g = h5 instanceof u.C0896G ? (u.C0896G) h5 : null;
                    if (c0896g == null || (vVar = c0896g.f8026c) == null) {
                        vVar = (q2.v) c0895f.f8020d;
                    }
                    int i4 = c0895f.f8017a;
                    int c3 = vVar.c(c0306p.f4521a - (i4 == 1 ? p4.f5902j : p4.f5901i), i4 == 1 ? I0.k.f2382i : layoutDirection);
                    int i5 = c0306p.f4522b;
                    int[] iArr = (int[]) c0306p.f4524d;
                    if (i4 == 1) {
                        n0.O.c(o4, p4, iArr[i3 - i5], c3);
                    } else {
                        n0.O.c(o4, p4, c3, iArr[i3 - i5]);
                    }
                }
                return L1.k.f2619a;
            case 14:
                n0.O o5 = (n0.O) obj;
                java.util.List list = (java.util.List) this.f1662l;
                int size = list.size();
                int i6 = 0;
                while (true) {
                    v.z zVar = (v.z) this.f1663m;
                    if (i6 >= size) {
                        if (zVar != null) {
                            zVar.b(o5);
                        }
                        ((I.InterfaceC0144j0) this.f1661k).getValue();
                        return L1.k.f2619a;
                    }
                    v.z zVar2 = (v.z) list.get(i6);
                    if (zVar2 != zVar) {
                        zVar2.b(o5);
                    }
                    i6++;
                }
            default:
                int intValue = ((java.lang.Number) obj).intValue();
                x.InterfaceC1004v interfaceC1004v = (x.InterfaceC1004v) ((X1.a) this.f1661k).b();
                if (intValue >= 0 && intValue < interfaceC1004v.c()) {
                    h2.AbstractC0526x.p((h2.InterfaceC0525w) this.f1662l, null, 0, new x.P((x.K) this.f1663m, intValue, null), 3);
                    return java.lang.Boolean.TRUE;
                }
                throw new java.lang.IllegalArgumentException(("Can't scroll to index " + intValue + ", it is out of bounds [0, " + interfaceC1004v.c() + ')').toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0076b(I.InterfaceC0144j0 interfaceC0144j0, I.C0154o0 c0154o0, I.InterfaceC0144j0 interfaceC0144j02) {
        super(1);
        this.f1660j = 0;
        this.f1661k = interfaceC0144j0;
        this.f1663m = c0154o0;
        this.f1662l = interfaceC0144j02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0076b(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i3) {
        super(1);
        this.f1660j = i3;
        this.f1661k = obj;
        this.f1662l = obj2;
        this.f1663m = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0076b(java.util.ArrayList arrayList, v.z zVar, boolean z, I.InterfaceC0144j0 interfaceC0144j0) {
        super(1);
        this.f1660j = 14;
        this.f1662l = arrayList;
        this.f1663m = zVar;
        this.f1661k = interfaceC0144j0;
    }
}
