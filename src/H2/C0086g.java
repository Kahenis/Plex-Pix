package H2;

/* renamed from: H2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086g extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1736j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1737k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1738l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0086g(java.lang.Object obj, int i3, java.lang.Object obj2) {
        super(1);
        this.f1736j = i3;
        this.f1737k = obj;
        this.f1738l = obj2;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z;
        int i3;
        int i4;
        int i5 = 2;
        switch (this.f1736j) {
            case 0:
                H2.u1 u1Var = (H2.u1) obj;
                Y1.j.e("mode", u1Var);
                ((I.InterfaceC0144j0) this.f1737k).setValue(u1Var);
                if (u1Var == H2.u1.f1936i) {
                    ((I.InterfaceC0144j0) this.f1738l).setValue(java.lang.Boolean.FALSE);
                }
                return L1.k.f2619a;
            case 1:
                I.C0139h c0139h = (I.C0139h) this.f1737k;
                java.lang.Object obj2 = c0139h.f2244j;
                Y1.s sVar = (Y1.s) this.f1738l;
                synchronized (obj2) {
                    java.util.List list = c0139h.f2246l;
                    java.lang.Object obj3 = sVar.f3250i;
                    if (obj3 == null) {
                        Y1.j.i("awaiter");
                        throw null;
                    }
                    list.remove((I.C0137g) obj3);
                }
                return L1.k.f2619a;
            case 2:
                I.C0128b0 c0128b0 = (I.C0128b0) this.f1737k;
                java.lang.Object obj4 = c0128b0.f2204b;
                h2.InterfaceC0490e interfaceC0490e = (h2.InterfaceC0490e) this.f1738l;
                synchronized (obj4) {
                    ((java.util.List) c0128b0.f2205c).remove(interfaceC0490e);
                }
                return L1.k.f2619a;
            case 3:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                I.J0 j02 = (I.J0) this.f1737k;
                java.lang.Object obj5 = j02.f2079b;
                java.lang.Throwable th2 = (java.lang.Throwable) this.f1738l;
                synchronized (obj5) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (th instanceof java.util.concurrent.CancellationException) {
                                th = null;
                            }
                            if (th != null) {
                                a.AbstractC0217a.d(th2, th);
                            }
                        } catch (java.lang.Throwable th3) {
                            throw th3;
                        }
                    }
                    j02.f2081d = th2;
                    k2.L l3 = j02.f2095r;
                    I.C0 c02 = I.C0.f2031i;
                    l3.getClass();
                    l3.g(null, c02);
                }
                return L1.k.f2619a;
            case 4:
                ((I.B) this.f1737k).A(obj);
                K.d dVar = (K.d) this.f1738l;
                if (dVar != null) {
                    dVar.add(obj);
                }
                return L1.k.f2619a;
            case 5:
                ((androidx.compose.ui.node.a) this.f1737k).V(((U.o) obj).e((U.o) this.f1738l));
                return L1.k.f2619a;
            case 6:
                n0.O.i((n0.O) obj, (n0.P) this.f1737k, 0, 0, ((a0.C0234n) this.f1738l).f3355v, 4);
                return L1.k.f2619a;
            case 7:
                n0.O.i((n0.O) obj, (n0.P) this.f1737k, 0, 0, ((a0.M) this.f1738l).f3324L, 4);
                return L1.k.f2619a;
            case 8:
                ((i2.c) this.f1737k).f5373k.removeCallbacks((java.lang.Runnable) this.f1738l);
                return L1.k.f2619a;
            case 9:
                p.H h3 = (p.H) this.f1737k;
                K.h hVar = h3.f6115a;
                p.D d3 = (p.D) this.f1738l;
                hVar.b(d3);
                h3.f6116b.setValue(java.lang.Boolean.TRUE);
                return new H2.B0(h3, 1, d3);
            case 10:
                p.C0635h c0635h = (p.C0635h) obj;
                ((X1.e) this.f1737k).j(c0635h.f6243e.getValue(), ((X1.c) ((B0.w) ((p.X) this.f1738l)).f111j).invoke(c0635h.f6244f));
                return L1.k.f2619a;
            case 11:
                p0.C0654B c0654b = (p0.C0654B) obj;
                c0654b.c();
                c0.InterfaceC0346d.J(c0654b, (a0.F) this.f1737k, (a0.AbstractC0235o) this.f1738l, 0.0f, null, 60);
                return L1.k.f2619a;
            case 12:
                android.content.Context context = (android.content.Context) this.f1737k;
                android.content.Context applicationContext = context.getApplicationContext();
                q0.Q q3 = (q0.Q) this.f1738l;
                applicationContext.registerComponentCallbacks(q3);
                return new H2.B0(context, i5, q3);
            case 13:
                q0.V v3 = (q0.V) this.f1737k;
                android.view.Choreographer.FrameCallback frameCallback = (android.view.Choreographer.FrameCallback) this.f1738l;
                synchronized (v3.f6997m) {
                    v3.f6999o.remove(frameCallback);
                }
                return L1.k.f2619a;
            case 14:
                ((android.view.Choreographer) ((I.C0163t0) this.f1737k).f2300j).removeFrameCallback((android.view.Choreographer.FrameCallback) this.f1738l);
                return L1.k.f2619a;
            case 15:
                q0.C0778o c0778o = (q0.C0778o) obj;
                q0.j1 j1Var = (q0.j1) this.f1737k;
                if (!j1Var.f7099k) {
                    androidx.lifecycle.AbstractC0273p lifecycle = c0778o.f7116a.getLifecycle();
                    X1.e eVar = (X1.e) this.f1738l;
                    j1Var.f7101m = eVar;
                    if (j1Var.f7100l == null) {
                        j1Var.f7100l = lifecycle;
                        lifecycle.a(j1Var);
                    } else if (lifecycle.b().compareTo(androidx.lifecycle.EnumC0272o.f3753k) >= 0) {
                        j1Var.f7098j.d(new Q.a(-2000640158, new q0.i1(j1Var, eVar), true));
                    }
                }
                return L1.k.f2619a;
            case 16:
                ((k0.f) this.f1737k).f5489a.l((r.C0848m) this.f1738l);
                return L1.k.f2619a;
            case 17:
                long j3 = ((Z.c) obj).f3262a;
                r.G0 g02 = (r.G0) this.f1737k;
                if (g02.f7514d) {
                    j3 = Z.c.h(j3, -1.0f);
                }
                long a3 = g02.a((r.InterfaceC0843j0) this.f1738l, j3, 2);
                if (g02.f7514d) {
                    a3 = Z.c.h(a3, -1.0f);
                }
                return new Z.c(a3);
            case 18:
                ((java.lang.Number) obj).longValue();
                r.S0 s02 = (r.S0) this.f1737k;
                float f3 = s02.f7605e;
                s02.f7605e = 0.0f;
                ((X1.c) this.f1738l).invoke(java.lang.Float.valueOf(f3));
                return L1.k.f2619a;
            case 19:
                u2.n a4 = ((w.H) this.f1737k).a(((java.lang.Number) obj).intValue());
                java.util.List list2 = a4.f8266b;
                java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
                int size = list2.size();
                int i6 = a4.f8265a;
                int i7 = 0;
                for (int i8 = 0; i8 < size; i8++) {
                    int i9 = (int) ((w.C0948c) list2.get(i8)).f8523a;
                    arrayList.add(new L1.f(java.lang.Integer.valueOf(i6), new I0.a(((w.w) this.f1738l).a(i7, i9))));
                    i6++;
                    i7 += i9;
                }
                return arrayList;
            case 20:
                n0.O o3 = (n0.O) obj;
                java.util.List list3 = (java.util.List) this.f1738l;
                int size2 = list3.size();
                int i10 = 0;
                while (i10 < size2) {
                    w.C0944B c0944b = (w.C0944B) list3.get(i10);
                    if (c0944b.f8470m == Integer.MIN_VALUE) {
                        throw new java.lang.IllegalArgumentException("position() should be called first".toString());
                    }
                    java.util.List list4 = c0944b.f8464g;
                    int size3 = list4.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        n0.P p3 = (n0.P) list4.get(i11);
                        boolean z3 = c0944b.f8460c;
                        if (z3) {
                            int i12 = p3.f5902j;
                        } else {
                            int i13 = p3.f5901i;
                        }
                        long j4 = c0944b.f8471n;
                        m.q qVar = (m.q) c0944b.f8467j.f8348f;
                        if (qVar.f5799e != 0) {
                        }
                        if (c0944b.f8462e) {
                            if (z3) {
                                int i14 = I0.i.f2379c;
                                z = z3;
                                i4 = (int) (j4 >> 32);
                            } else {
                                z = z3;
                                int i15 = I0.i.f2379c;
                                i4 = (c0944b.f8470m - ((int) (j4 >> 32))) - (z ? p3.f5902j : p3.f5901i);
                            }
                            j4 = a2.AbstractC0240a.b(i4, z ? (c0944b.f8470m - ((int) (j4 & 4294967295L))) - (z ? p3.f5902j : p3.f5901i) : (int) (j4 & 4294967295L));
                        } else {
                            z = z3;
                        }
                        int i16 = I0.i.f2379c;
                        long j5 = c0944b.f8465h;
                        java.util.List list5 = list3;
                        int i17 = size2;
                        long b3 = a2.AbstractC0240a.b(((int) (j5 >> 32)) + ((int) (j4 >> 32)), ((int) (j4 & 4294967295L)) + ((int) (j5 & 4294967295L)));
                        if (z) {
                            i3 = i11;
                            n0.O.k(o3, p3, b3, null, 6);
                        } else {
                            i3 = i11;
                            n0.O.h(o3, p3, b3, null, 6);
                        }
                        i11 = i3 + 1;
                        list3 = list5;
                        size2 = i17;
                    }
                    i10++;
                    list3 = list3;
                }
                ((I.InterfaceC0144j0) this.f1737k).getValue();
                return L1.k.f2619a;
            default:
                x.U u3 = (x.U) this.f1737k;
                java.util.LinkedHashSet linkedHashSet = u3.f8782c;
                java.lang.Object obj6 = this.f1738l;
                linkedHashSet.remove(obj6);
                return new H2.B0(u3, 3, obj6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0086g(java.util.ArrayList arrayList, I.InterfaceC0144j0 interfaceC0144j0) {
        super(1);
        this.f1736j = 20;
        this.f1738l = arrayList;
        this.f1737k = interfaceC0144j0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0086g(q.s0 s0Var) {
        super(1);
        this.f1736j = 10;
        B0.w wVar = p.Y.f6192a;
        this.f1737k = s0Var;
        this.f1738l = wVar;
    }
}
