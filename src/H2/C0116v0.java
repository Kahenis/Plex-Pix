package H2;

/* renamed from: H2.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0116v0 extends Y1.k implements X1.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1943j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1944k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1945l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1946m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0116v0(I.C0164u c0164u, J.C0176a c0176a, I.P0 p02, I.AbstractC0142i0 abstractC0142i0) {
        super(0);
        this.f1943j = 3;
        this.f1944k = c0164u;
        this.f1946m = c0176a;
        this.f1945l = p02;
    }

    @Override // X1.a
    public final java.lang.Object b() {
        switch (this.f1943j) {
            case 0:
                ((I.InterfaceC0144j0) this.f1944k).setValue(java.lang.Boolean.valueOf(!H2.L0.a(r0)));
                H2.L0.s((I.InterfaceC0144j0) this.f1946m, (I.C0154o0) this.f1945l);
                return L1.k.f2619a;
            case 1:
                I.C0152n0 c0152n0 = (I.C0152n0) this.f1946m;
                c0152n0.h((c0152n0.g() + 90.0f) % 360.0f);
                H2.L0.s((I.InterfaceC0144j0) this.f1944k, (I.C0154o0) this.f1945l);
                return L1.k.f2619a;
            case 2:
                androidx.media3.exoplayer.ExoPlayer exoPlayer = (androidx.media3.exoplayer.ExoPlayer) this.f1946m;
                if (exoPlayer.isPlaying()) {
                    exoPlayer.pause();
                } else {
                    exoPlayer.play();
                }
                H2.L0.s((I.InterfaceC0144j0) this.f1944k, (I.C0154o0) this.f1945l);
                return L1.k.f2619a;
            case 3:
                I.C0164u c0164u = (I.C0164u) this.f1944k;
                J.C0177b c0177b = c0164u.f2312L;
                J.C0176a c0176a = (J.C0176a) this.f1946m;
                I.P0 p02 = (I.P0) this.f1945l;
                J.C0176a c0176a2 = c0177b.f2415b;
                try {
                    c0177b.f2415b = c0176a;
                    I.P0 p03 = c0164u.f2306F;
                    int[] iArr = c0164u.f2330n;
                    B0.p pVar = c0164u.f2336u;
                    c0164u.f2330n = null;
                    c0164u.f2336u = null;
                    try {
                        c0164u.f2306F = p02;
                        boolean z = c0177b.f2418e;
                        try {
                            c0177b.f2418e = false;
                            throw null;
                        } catch (java.lang.Throwable th) {
                            c0177b.f2418e = z;
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        c0164u.f2306F = p03;
                        c0164u.f2330n = iArr;
                        c0164u.f2336u = pVar;
                        throw th2;
                    }
                } catch (java.lang.Throwable th3) {
                    c0177b.f2415b = c0176a2;
                    throw th3;
                }
            case 4:
                p0.C0657E c0657e = (p0.C0657E) this.f1944k;
                p0.C0660H c0660h = c0657e.f6299D;
                int i3 = 0;
                c0660h.f6344j = 0;
                K.h s = c0660h.f6335a.s();
                int i4 = s.f2529k;
                if (i4 > 0) {
                    java.lang.Object[] objArr = s.f2527i;
                    int i5 = 0;
                    do {
                        p0.C0657E c0657e2 = ((androidx.compose.ui.node.a) objArr[i5]).f3543F.f6350p;
                        Y1.j.b(c0657e2);
                        c0657e2.f6301o = c0657e2.f6302p;
                        c0657e2.f6302p = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
                        if (c0657e2.f6303q == 2) {
                            c0657e2.f6303q = 3;
                        }
                        i5++;
                    } while (i5 < i4);
                }
                p0.C0660H c0660h2 = c0657e.f6299D;
                K.h s3 = c0660h2.f6335a.s();
                int i6 = s3.f2529k;
                if (i6 > 0) {
                    java.lang.Object[] objArr2 = s3.f2527i;
                    int i7 = 0;
                    do {
                        p0.C0657E c0657e3 = ((androidx.compose.ui.node.a) objArr2[i7]).f3543F.f6350p;
                        Y1.j.b(c0657e3);
                        c0657e3.f6308w.f6282d = false;
                        i7++;
                    } while (i7 < i6);
                }
                p0.AbstractC0663K abstractC0663K = c0657e.u().f6488O;
                p0.C0660H c0660h3 = (p0.C0660H) this.f1945l;
                if (abstractC0663K != null) {
                    boolean z3 = abstractC0663K.f6359o;
                    java.util.List l3 = c0660h3.f6335a.l();
                    int size = l3.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        p0.AbstractC0663K y0 = ((androidx.compose.ui.node.a) l3.get(i8)).E.f6385c.y0();
                        if (y0 != null) {
                            y0.f6359o = z3;
                        }
                    }
                }
                ((p0.AbstractC0663K) this.f1946m).d0().d();
                if (c0657e.u().f6488O != null) {
                    java.util.List l4 = c0660h3.f6335a.l();
                    int size2 = l4.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        p0.AbstractC0663K y02 = ((androidx.compose.ui.node.a) l4.get(i9)).E.f6385c.y0();
                        if (y02 != null) {
                            y02.f6359o = false;
                        }
                    }
                }
                androidx.compose.ui.node.a aVar = c0660h2.f6335a;
                K.h s4 = aVar.s();
                int i10 = s4.f2529k;
                if (i10 > 0) {
                    java.lang.Object[] objArr3 = s4.f2527i;
                    int i11 = 0;
                    do {
                        p0.C0657E c0657e4 = ((androidx.compose.ui.node.a) objArr3[i11]).f3543F.f6350p;
                        Y1.j.b(c0657e4);
                        int i12 = c0657e4.f6301o;
                        int i13 = c0657e4.f6302p;
                        if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                            c0657e4.Z();
                        }
                        i11++;
                    } while (i11 < i10);
                }
                K.h s5 = aVar.s();
                int i14 = s5.f2529k;
                if (i14 > 0) {
                    java.lang.Object[] objArr4 = s5.f2527i;
                    do {
                        p0.C0657E c0657e5 = ((androidx.compose.ui.node.a) objArr4[i3]).f3543F.f6350p;
                        Y1.j.b(c0657e5);
                        p0.C0653A c0653a = c0657e5.f6308w;
                        c0653a.f6283e = c0653a.f6282d;
                        i3++;
                    } while (i3 < i14);
                }
                return L1.k.f2619a;
            case 5:
                q0.AbstractC0752b abstractC0752b = (q0.AbstractC0752b) this.f1944k;
                abstractC0752b.removeOnAttachStateChangeListener((q0.ViewOnAttachStateChangeListenerC0795x) this.f1946m);
                q0.K0 k02 = (q0.K0) this.f1945l;
                Y1.j.e("listener", k02);
                a.AbstractC0217a.P(abstractC0752b).f3373a.remove(k02);
                return L1.k.f2619a;
            case 6:
                y2.d dVar = ((q2.e) this.f1944k).f7323b;
                Y1.j.b(dVar);
                return dVar.k(((q2.l) this.f1946m).a(), ((q2.C0804a) this.f1945l).f7299h.f7384d);
            case 7:
                v.C0939k c0939k = (v.C0939k) ((I.p1) this.f1944k).getValue();
                v.I i15 = (v.I) this.f1946m;
                return new v.q(i15, c0939k, (v.C0932d) this.f1945l, new K.a((d2.C0376d) i15.f8298k.f8272f.getValue(), c0939k));
            default:
                n0.InterfaceC0602m interfaceC0602m = (n0.InterfaceC0602m) this.f1946m;
                X1.a aVar2 = (X1.a) this.f1945l;
                y.C1029l c1029l = (y.C1029l) this.f1944k;
                Z.d y03 = y.C1029l.y0(c1029l, interfaceC0602m, aVar2);
                if (y03 == null) {
                    return null;
                }
                r.C0854p c0854p = c1029l.f9082x;
                if (!(!I0.j.a(c0854p.E, 0L))) {
                    throw new java.lang.IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
                }
                long B02 = c0854p.B0(y03, c0854p.E);
                return y03.f(a.AbstractC0217a.c(-Z.c.d(B02), -Z.c.e(B02)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0116v0(java.lang.Object obj, I.InterfaceC0144j0 interfaceC0144j0, I.C0154o0 c0154o0, int i3) {
        super(0);
        this.f1943j = i3;
        this.f1946m = obj;
        this.f1944k = interfaceC0144j0;
        this.f1945l = c0154o0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0116v0(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i3) {
        super(0);
        this.f1943j = i3;
        this.f1944k = obj;
        this.f1946m = obj2;
        this.f1945l = obj3;
    }
}
