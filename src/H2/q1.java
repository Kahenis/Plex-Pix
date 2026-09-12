package H2;

/* loaded from: classes.dex */
public abstract class q1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void HelpLine(java.lang.String str, java.lang.String str2, I.InterfaceC0155p interfaceC0155p, int i3) {
        int i4;
        I.C0164u c0164u;
        I.C0164u c0164u2 = (I.C0164u) interfaceC0155p;
        c0164u2.b0(618970857);
        if ((i3 & 14) == 0) {
            i4 = (c0164u2.h(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= c0164u2.h(str2) ? 32 : 16;
        }
        int i5 = i4;
        if ((i5 & 91) == 18 && c0164u2.H()) {
            c0164u2.V();
            c0164u = c0164u2;
        } else {
            U.o h3 = androidx.compose.foundation.layout.b.h(U.l.f3053b, 0.0f, 0.0f, 12, 7);
            c0164u2.a0(-483455358);
            n0.F columnMeasurePolicy = u.t.columnMeasurePolicy(u.AbstractC0911g.f8051c, U.a.f3041q, c0164u2, 0);
            c0164u2.a0(-1323940314);
            int currentCompositeKeyHash = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u2, 0);
            I.InterfaceC0167v0 q3 = c0164u2.q();
            p0.InterfaceC0672h.f6471g.getClass();
            p0.C0670f c0670f = p0.C0671g.f6465b;
            Q.a a3 = n0.AbstractC0606q.a(h3);
            if (!(c0164u2.f2317a instanceof I.InterfaceC0133e)) {
                I.AbstractC0147l.a();
                throw null;
            }
            c0164u2.d0();
            if (c0164u2.f2315O) {
                c0164u2.p(c0670f);
            } else {
                c0164u2.p0();
            }
            I.AbstractC0168w.C(c0164u2, columnMeasurePolicy, p0.C0671g.f6469f);
            I.AbstractC0168w.C(c0164u2, q3, p0.C0671g.f6468e);
            p0.C0669e c0669e = p0.C0671g.f6470g;
            if (c0164u2.f2315O || !Y1.j.a(c0164u2.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                q.AbstractC0731s.b(currentCompositeKeyHash, c0164u2, currentCompositeKeyHash, c0669e);
            }
            q.AbstractC0731s.c(0, a3, new I.O0(c0164u2), c0164u2, 2058660585);
            G.l0.m33Text4IGK_g(str, (U.o) null, H2.s1.f1896h, y2.d.u(14), (B0.l) null, B0.n.f96l, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u2, (i5 & 14) | 200064, 0, 131026);
            G.l0.m33Text4IGK_g(str2, (U.o) null, H2.s1.f1893e, y2.d.u(14), (B0.l) null, (B0.n) null, (B0.f) null, 0L, (H0.g) null, (H0.f) null, y2.d.u(20), 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u2, ((i5 >> 3) & 14) | 3456, 6, 130034);
            c0164u = c0164u2;
            q.AbstractC0731s.e(c0164u, false, true, false, false);
        }
        I.B0 y3 = c0164u.y();
        if (y3 != null) {
            y3.f2026d = new H2.C0085f0(i3, 1, str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SettingToggle(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, X1.c cVar, I.InterfaceC0155p interfaceC0155p, int i3, int i4) {
        int i5;
        int i6;
        java.lang.String str5;
        int i7;
        java.lang.String str6;
        java.lang.Object Q2;
        I.C0136f0 c0136f0;
        java.lang.Object Q3;
        boolean z3;
        java.lang.Object Q4;
        boolean z4;
        java.lang.String str7;
        int i8;
        I.C0164u c0164u = (I.C0164u) interfaceC0155p;
        c0164u.b0(1418833989);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (c0164u.h(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= c0164u.h(str2) ? 32 : 16;
            if ((i4 & 4) == 0) {
                i5 |= androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i3 & 896) == 0) {
                i5 |= c0164u.i(z) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i3 & 7168) == 0) {
                str5 = str3;
                i5 |= c0164u.h(str5) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((57344 & i3) == 0) {
                    str6 = str4;
                    i5 |= c0164u.h(str6) ? 16384 : 8192;
                    if ((i4 & 32) != 0) {
                        i8 = (i3 & 458752) == 0 ? c0164u.j(cVar) ? 131072 : androidx.media3.common.C.DEFAULT_BUFFER_SEGMENT_SIZE : 196608;
                        if ((374491 & i5) == 74898 || !c0164u.H()) {
                            java.lang.String str8 = i6 != 0 ? "OFF" : str5;
                            java.lang.String str9 = i7 != 0 ? "ON" : str6;
                            c0164u.a0(443258019);
                            Q2 = c0164u.Q();
                            c0136f0 = I.C0153o.f2276a;
                            if (Q2 == c0136f0) {
                                Q2 = I.Z0.b(java.lang.Boolean.FALSE, I.C0136f0.f2234m);
                                c0164u.m0(Q2);
                            }
                            I.InterfaceC0144j0 interfaceC0144j0 = (I.InterfaceC0144j0) Q2;
                            c0164u.u(false);
                            U.l lVar = U.l.f3053b;
                            float f3 = 12;
                            U.o v3 = a.AbstractC0217a.v(androidx.compose.foundation.layout.c.c(lVar, 1.0f), A.e.a(f3));
                            c0164u.a0(443262363);
                            Q3 = c0164u.Q();
                            if (Q3 == c0136f0) {
                                Q3 = new B.f(interfaceC0144j0, 4);
                                c0164u.m0(Q3);
                            }
                            c0164u.u(false);
                            U.o g3 = y2.d.g(androidx.compose.ui.focus.a.c(v3, (X1.c) Q3), 2, ((java.lang.Boolean) interfaceC0144j0.getValue()).booleanValue() ? H2.s1.f1898j : a0.C0238s.f3364f, A.e.a(f3));
                            c0164u.a0(443267160);
                            z3 = ((i5 & 458752) == 131072) | ((i5 & 896) == 256);
                            Q4 = c0164u.Q();
                            if (!z3 || Q4 == c0136f0) {
                                Q4 = new H2.U(cVar, z, 2);
                                c0164u.m0(Q4);
                            }
                            c0164u.u(false);
                            U.o e3 = androidx.compose.foundation.layout.b.e(androidx.compose.foundation.a.e(g3, (X1.a) Q4), 14, f3);
                            U.f fVar = U.a.f3040p;
                            c0164u.a0(693286680);
                            n0.F rowMeasurePolicy = u.AbstractC0897H.rowMeasurePolicy(u.AbstractC0911g.f8049a, fVar, c0164u, 48);
                            c0164u.a0(-1323940314);
                            int currentCompositeKeyHash = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                            I.InterfaceC0167v0 q3 = c0164u.q();
                            p0.InterfaceC0672h.f6471g.getClass();
                            p0.C0670f c0670f = p0.C0671g.f6465b;
                            Q.a a3 = n0.AbstractC0606q.a(e3);
                            z4 = c0164u.f2317a instanceof I.InterfaceC0133e;
                            if (!z4) {
                                I.AbstractC0147l.a();
                                throw null;
                            }
                            c0164u.d0();
                            if (c0164u.f2315O) {
                                c0164u.p(c0670f);
                            } else {
                                c0164u.p0();
                            }
                            p0.C0669e c0669e = p0.C0671g.f6469f;
                            I.AbstractC0168w.C(c0164u, rowMeasurePolicy, c0669e);
                            p0.C0669e c0669e2 = p0.C0671g.f6468e;
                            I.AbstractC0168w.C(c0164u, q3, c0669e2);
                            p0.C0669e c0669e3 = p0.C0671g.f6470g;
                            if (c0164u.f2315O || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                q.AbstractC0731s.b(currentCompositeKeyHash, c0164u, currentCompositeKeyHash, c0669e3);
                            }
                            a3.i(new I.O0(c0164u), c0164u, 0);
                            c0164u.a0(2058660585);
                            U.o h3 = androidx.compose.foundation.layout.b.h(u.InterfaceC0898I.a(), 0.0f, 16, 0.0f, 11);
                            c0164u.a0(-483455358);
                            n0.F columnMeasurePolicy = u.t.columnMeasurePolicy(u.AbstractC0911g.f8051c, U.a.f3041q, c0164u, 0);
                            c0164u.a0(-1323940314);
                            int currentCompositeKeyHash2 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                            I.InterfaceC0167v0 q4 = c0164u.q();
                            Q.a a4 = n0.AbstractC0606q.a(h3);
                            if (!z4) {
                                I.AbstractC0147l.a();
                                throw null;
                            }
                            c0164u.d0();
                            if (c0164u.f2315O) {
                                c0164u.p(c0670f);
                            } else {
                                c0164u.p0();
                            }
                            I.AbstractC0168w.C(c0164u, columnMeasurePolicy, c0669e);
                            I.AbstractC0168w.C(c0164u, q4, c0669e2);
                            if (c0164u.f2315O || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                q.AbstractC0731s.b(currentCompositeKeyHash2, c0164u, currentCompositeKeyHash2, c0669e3);
                            }
                            q.AbstractC0731s.c(0, a4, new I.O0(c0164u), c0164u, 2058660585);
                            G.l0.m33Text4IGK_g(str, (U.o) null, H2.s1.f1893e, 0L, (B0.l) null, B0.n.f96l, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, (i5 & 14) | 196992, 0, 131034);
                            long j3 = H2.s1.f1894f;
                            G.l0.m33Text4IGK_g(str2, (U.o) null, j3, y2.d.u(13), (B0.l) null, (B0.n) null, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, ((i5 >> 3) & 14) | 3456, 0, 131058);
                            q.AbstractC0731s.e(c0164u, false, true, false, false);
                            U.o a5 = androidx.compose.foundation.a.a(a.AbstractC0217a.v(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.j(lVar, (str8.length() > 3 || str9.length() > 3) ? 118 : 72), 36), A.e.a(18)), z ? H2.s1.f1896h : H2.s1.f1892d, a0.H.f3290a);
                            U.g gVar = z ? U.a.f3037m : U.a.f3035k;
                            c0164u.a0(733328855);
                            n0.F rememberBoxMeasurePolicy = u.AbstractC0915k.rememberBoxMeasurePolicy(gVar, false, c0164u, 0);
                            c0164u.a0(-1323940314);
                            int currentCompositeKeyHash3 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                            I.InterfaceC0167v0 q5 = c0164u.q();
                            Q.a a6 = n0.AbstractC0606q.a(a5);
                            if (!z4) {
                                I.AbstractC0147l.a();
                                throw null;
                            }
                            c0164u.d0();
                            if (c0164u.f2315O) {
                                c0164u.p(c0670f);
                            } else {
                                c0164u.p0();
                            }
                            I.AbstractC0168w.C(c0164u, rememberBoxMeasurePolicy, c0669e);
                            I.AbstractC0168w.C(c0164u, q5, c0669e2);
                            if (c0164u.f2315O || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                q.AbstractC0731s.b(currentCompositeKeyHash3, c0164u, currentCompositeKeyHash3, c0669e3);
                            }
                            q.AbstractC0731s.c(0, a6, new I.O0(c0164u), c0164u, 2058660585);
                            G.l0.m33Text4IGK_g(z ? str9 : str8, androidx.compose.foundation.layout.b.f(lVar, 10, 0.0f, 2), z ? H2.s1.f1897i : j3, y2.d.u(11), (B0.l) null, B0.n.f98n, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 199728, 0, 131024);
                            q.AbstractC0731s.e(c0164u, false, true, false, false);
                            q.AbstractC0731s.e(c0164u, false, true, false, false);
                            str7 = str8;
                            str6 = str9;
                        } else {
                            c0164u.V();
                            str7 = str5;
                        }
                        I.B0 y3 = c0164u.y();
                        if (y3 != null) {
                            y3.f2026d = new H2.Z0(str, str2, z, str7, str6, cVar, i3, i4);
                            return;
                        }
                        return;
                    }
                    i5 |= i8;
                    if ((374491 & i5) == 74898) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    c0164u.a0(443258019);
                    Q2 = c0164u.Q();
                    c0136f0 = I.C0153o.f2276a;
                    if (Q2 == c0136f0) {
                    }
                    I.InterfaceC0144j0 interfaceC0144j02 = (I.InterfaceC0144j0) Q2;
                    c0164u.u(false);
                    U.l lVar2 = U.l.f3053b;
                    float f32 = 12;
                    U.o v32 = a.AbstractC0217a.v(androidx.compose.foundation.layout.c.c(lVar2, 1.0f), A.e.a(f32));
                    c0164u.a0(443262363);
                    Q3 = c0164u.Q();
                    if (Q3 == c0136f0) {
                    }
                    c0164u.u(false);
                    U.o g32 = y2.d.g(androidx.compose.ui.focus.a.c(v32, (X1.c) Q3), 2, ((java.lang.Boolean) interfaceC0144j02.getValue()).booleanValue() ? H2.s1.f1898j : a0.C0238s.f3364f, A.e.a(f32));
                    c0164u.a0(443267160);
                    z3 = ((i5 & 458752) == 131072) | ((i5 & 896) == 256);
                    Q4 = c0164u.Q();
                    if (!z3) {
                    }
                    Q4 = new H2.U(cVar, z, 2);
                    c0164u.m0(Q4);
                    c0164u.u(false);
                    U.o e32 = androidx.compose.foundation.layout.b.e(androidx.compose.foundation.a.e(g32, (X1.a) Q4), 14, f32);
                    U.f fVar2 = U.a.f3040p;
                    c0164u.a0(693286680);
                    n0.F rowMeasurePolicy2 = u.AbstractC0897H.rowMeasurePolicy(u.AbstractC0911g.f8049a, fVar2, c0164u, 48);
                    c0164u.a0(-1323940314);
                    int currentCompositeKeyHash4 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                    I.InterfaceC0167v0 q32 = c0164u.q();
                    p0.InterfaceC0672h.f6471g.getClass();
                    p0.C0670f c0670f2 = p0.C0671g.f6465b;
                    Q.a a32 = n0.AbstractC0606q.a(e32);
                    z4 = c0164u.f2317a instanceof I.InterfaceC0133e;
                    if (!z4) {
                    }
                }
                str6 = str4;
                if ((i4 & 32) != 0) {
                }
                i5 |= i8;
                if ((374491 & i5) == 74898) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                c0164u.a0(443258019);
                Q2 = c0164u.Q();
                c0136f0 = I.C0153o.f2276a;
                if (Q2 == c0136f0) {
                }
                I.InterfaceC0144j0 interfaceC0144j022 = (I.InterfaceC0144j0) Q2;
                c0164u.u(false);
                U.l lVar22 = U.l.f3053b;
                float f322 = 12;
                U.o v322 = a.AbstractC0217a.v(androidx.compose.foundation.layout.c.c(lVar22, 1.0f), A.e.a(f322));
                c0164u.a0(443262363);
                Q3 = c0164u.Q();
                if (Q3 == c0136f0) {
                }
                c0164u.u(false);
                U.o g322 = y2.d.g(androidx.compose.ui.focus.a.c(v322, (X1.c) Q3), 2, ((java.lang.Boolean) interfaceC0144j022.getValue()).booleanValue() ? H2.s1.f1898j : a0.C0238s.f3364f, A.e.a(f322));
                c0164u.a0(443267160);
                z3 = ((i5 & 458752) == 131072) | ((i5 & 896) == 256);
                Q4 = c0164u.Q();
                if (!z3) {
                }
                Q4 = new H2.U(cVar, z, 2);
                c0164u.m0(Q4);
                c0164u.u(false);
                U.o e322 = androidx.compose.foundation.layout.b.e(androidx.compose.foundation.a.e(g322, (X1.a) Q4), 14, f322);
                U.f fVar22 = U.a.f3040p;
                c0164u.a0(693286680);
                n0.F rowMeasurePolicy22 = u.AbstractC0897H.rowMeasurePolicy(u.AbstractC0911g.f8049a, fVar22, c0164u, 48);
                c0164u.a0(-1323940314);
                int currentCompositeKeyHash42 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                I.InterfaceC0167v0 q322 = c0164u.q();
                p0.InterfaceC0672h.f6471g.getClass();
                p0.C0670f c0670f22 = p0.C0671g.f6465b;
                Q.a a322 = n0.AbstractC0606q.a(e322);
                z4 = c0164u.f2317a instanceof I.InterfaceC0133e;
                if (!z4) {
                }
            }
            str5 = str3;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            str6 = str4;
            if ((i4 & 32) != 0) {
            }
            i5 |= i8;
            if ((374491 & i5) == 74898) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            c0164u.a0(443258019);
            Q2 = c0164u.Q();
            c0136f0 = I.C0153o.f2276a;
            if (Q2 == c0136f0) {
            }
            I.InterfaceC0144j0 interfaceC0144j0222 = (I.InterfaceC0144j0) Q2;
            c0164u.u(false);
            U.l lVar222 = U.l.f3053b;
            float f3222 = 12;
            U.o v3222 = a.AbstractC0217a.v(androidx.compose.foundation.layout.c.c(lVar222, 1.0f), A.e.a(f3222));
            c0164u.a0(443262363);
            Q3 = c0164u.Q();
            if (Q3 == c0136f0) {
            }
            c0164u.u(false);
            U.o g3222 = y2.d.g(androidx.compose.ui.focus.a.c(v3222, (X1.c) Q3), 2, ((java.lang.Boolean) interfaceC0144j0222.getValue()).booleanValue() ? H2.s1.f1898j : a0.C0238s.f3364f, A.e.a(f3222));
            c0164u.a0(443267160);
            z3 = ((i5 & 458752) == 131072) | ((i5 & 896) == 256);
            Q4 = c0164u.Q();
            if (!z3) {
            }
            Q4 = new H2.U(cVar, z, 2);
            c0164u.m0(Q4);
            c0164u.u(false);
            U.o e3222 = androidx.compose.foundation.layout.b.e(androidx.compose.foundation.a.e(g3222, (X1.a) Q4), 14, f3222);
            U.f fVar222 = U.a.f3040p;
            c0164u.a0(693286680);
            n0.F rowMeasurePolicy222 = u.AbstractC0897H.rowMeasurePolicy(u.AbstractC0911g.f8049a, fVar222, c0164u, 48);
            c0164u.a0(-1323940314);
            int currentCompositeKeyHash422 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
            I.InterfaceC0167v0 q3222 = c0164u.q();
            p0.InterfaceC0672h.f6471g.getClass();
            p0.C0670f c0670f222 = p0.C0671g.f6465b;
            Q.a a3222 = n0.AbstractC0606q.a(e3222);
            z4 = c0164u.f2317a instanceof I.InterfaceC0133e;
            if (!z4) {
            }
        }
        if ((i4 & 4) == 0) {
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        str5 = str3;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        str6 = str4;
        if ((i4 & 32) != 0) {
        }
        i5 |= i8;
        if ((374491 & i5) == 74898) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        c0164u.a0(443258019);
        Q2 = c0164u.Q();
        c0136f0 = I.C0153o.f2276a;
        if (Q2 == c0136f0) {
        }
        I.InterfaceC0144j0 interfaceC0144j02222 = (I.InterfaceC0144j0) Q2;
        c0164u.u(false);
        U.l lVar2222 = U.l.f3053b;
        float f32222 = 12;
        U.o v32222 = a.AbstractC0217a.v(androidx.compose.foundation.layout.c.c(lVar2222, 1.0f), A.e.a(f32222));
        c0164u.a0(443262363);
        Q3 = c0164u.Q();
        if (Q3 == c0136f0) {
        }
        c0164u.u(false);
        U.o g32222 = y2.d.g(androidx.compose.ui.focus.a.c(v32222, (X1.c) Q3), 2, ((java.lang.Boolean) interfaceC0144j02222.getValue()).booleanValue() ? H2.s1.f1898j : a0.C0238s.f3364f, A.e.a(f32222));
        c0164u.a0(443267160);
        z3 = ((i5 & 458752) == 131072) | ((i5 & 896) == 256);
        Q4 = c0164u.Q();
        if (!z3) {
        }
        Q4 = new H2.U(cVar, z, 2);
        c0164u.m0(Q4);
        c0164u.u(false);
        U.o e32222 = androidx.compose.foundation.layout.b.e(androidx.compose.foundation.a.e(g32222, (X1.a) Q4), 14, f32222);
        U.f fVar2222 = U.a.f3040p;
        c0164u.a0(693286680);
        n0.F rowMeasurePolicy2222 = u.AbstractC0897H.rowMeasurePolicy(u.AbstractC0911g.f8049a, fVar2222, c0164u, 48);
        c0164u.a0(-1323940314);
        int currentCompositeKeyHash4222 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
        I.InterfaceC0167v0 q32222 = c0164u.q();
        p0.InterfaceC0672h.f6471g.getClass();
        p0.C0670f c0670f2222 = p0.C0671g.f6465b;
        Q.a a32222 = n0.AbstractC0606q.a(e32222);
        z4 = c0164u.f2317a instanceof I.InterfaceC0133e;
        if (!z4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x14c7  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x04d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SettingsPane(G2.f fVar, boolean z, boolean z3, X1.c cVar, X1.c cVar2, X1.c cVar3, I.InterfaceC0155p interfaceC0155p, int i3) {
        int i4;
        I.C0136f0 c0136f0;
        I.C0136f0 c0136f02;
        G2.f fVar2;
        B0.n nVar;
        X1.c cVar4;
        I.C0164u c0164u;
        boolean z4;
        java.lang.Object Q2;
        boolean z5;
        java.lang.Object Q3;
        boolean z6;
        java.lang.Object Q4;
        boolean z7;
        java.lang.Object Q5;
        boolean z8;
        java.lang.Object Q6;
        boolean z9;
        java.lang.Object Q7;
        boolean z10;
        java.lang.Object Q8;
        boolean z11;
        java.lang.Object Q9;
        U.o c3;
        X1.c cVar5;
        X1.c cVar6;
        java.lang.Throwable th;
        U.o c4;
        float f3;
        U.e eVar;
        int i5;
        float f4;
        U.o a3;
        U.o a4;
        I.C0152n0 c0152n0;
        U.o c5;
        U.o c6;
        X1.e eVar2;
        U.o b3;
        boolean z12;
        X1.a aVar;
        java.lang.String str;
        boolean z13;
        int i6;
        int i7;
        X1.a i1Var;
        I.C0164u c0164u2;
        U.o c7;
        U.o c8;
        U.o a5;
        U.o a6;
        U.o a7;
        U.o a8;
        Y1.j.e("settings", fVar);
        Y1.j.e("onSettings", cVar);
        Y1.j.e("onAbout", cVar2);
        Y1.j.e("onHelp", cVar3);
        I.C0164u c0164u3 = (I.C0164u) interfaceC0155p;
        c0164u3.b0(2070224404);
        if ((i3 & 14) == 0) {
            i4 = (c0164u3.h(fVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= c0164u3.i(z) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= c0164u3.i(z3) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i4 |= c0164u3.j(cVar) ? 2048 : 1024;
        }
        if ((i3 & 57344) == 0) {
            i4 |= c0164u3.j(cVar2) ? 16384 : 8192;
        }
        if ((i3 & 458752) == 0) {
            i4 |= c0164u3.j(cVar3) ? 131072 : androidx.media3.common.C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        int i8 = i4;
        if ((374491 & i8) == 74898 && c0164u3.H()) {
            c0164u3.V();
            c0164u = c0164u3;
        } else {
            android.content.Context context = (android.content.Context) c0164u3.n(q0.S.f6984b);
            c0164u3.a0(773894976);
            c0164u3.a0(-492369756);
            java.lang.Object Q10 = c0164u3.Q();
            I.C0136f0 c0136f03 = I.C0153o.f2276a;
            P1.j jVar = P1.j.f2807i;
            if (Q10 == c0136f03) {
                I.H h3 = new I.H(I.T.a(jVar, c0164u3));
                c0164u3.m0(h3);
                Q10 = h3;
            }
            c0164u3.x();
            h2.InterfaceC0525w interfaceC0525w = ((I.H) Q10).f2055i;
            c0164u3.x();
            c0164u3.a0(33060650);
            java.lang.Object Q11 = c0164u3.Q();
            if (Q11 == c0136f03) {
                Q11 = new G2.m();
                c0164u3.m0(Q11);
            }
            G2.m mVar = (G2.m) Q11;
            c0164u3.x();
            c0164u3.a0(33062333);
            java.lang.Object Q12 = c0164u3.Q();
            H2.t1 t1Var = H2.t1.f1909i;
            if (Q12 == c0136f03) {
                Q12 = I.Z0.b(t1Var, I.C0136f0.f2234m);
                c0164u3.m0(Q12);
            }
            I.InterfaceC0144j0 interfaceC0144j0 = (I.InterfaceC0144j0) Q12;
            c0164u3.x();
            c0164u3.a0(33064525);
            java.lang.Object Q13 = c0164u3.Q();
            if (Q13 == c0136f03) {
                Q13 = I.Z0.b("", I.C0136f0.f2234m);
                c0164u3.m0(Q13);
            }
            I.InterfaceC0144j0 interfaceC0144j02 = (I.InterfaceC0144j0) Q13;
            c0164u3.x();
            c0164u3.a0(33066386);
            java.lang.Object Q14 = c0164u3.Q();
            if (Q14 == c0136f03) {
                Q14 = I.AbstractC0168w.w(0.0f);
                c0164u3.m0(Q14);
            }
            I.C0152n0 c0152n02 = (I.C0152n0) Q14;
            c0164u3.x();
            c0164u3.a0(33068159);
            java.lang.Object Q15 = c0164u3.Q();
            if (Q15 == c0136f03) {
                Q15 = I.Z0.b(null, I.C0136f0.f2234m);
                c0164u3.m0(Q15);
            }
            I.InterfaceC0144j0 interfaceC0144j03 = (I.InterfaceC0144j0) Q15;
            c0164u3.x();
            c0164u3.a0(33070443);
            java.lang.Object Q16 = c0164u3.Q();
            if (Q16 == c0136f03) {
                Q16 = new Y.l();
                c0164u3.m0(Q16);
            }
            Y.l lVar = (Y.l) Q16;
            c0164u3.x();
            c0164u3.a0(33072075);
            java.lang.Object Q17 = c0164u3.Q();
            if (Q17 == c0136f03) {
                Q17 = new Y.l();
                c0164u3.m0(Q17);
            }
            Y.l lVar2 = (Y.l) Q17;
            c0164u3.x();
            c0164u3.a0(33073675);
            java.lang.Object Q18 = c0164u3.Q();
            if (Q18 == c0136f03) {
                Q18 = new Y.l();
                c0164u3.m0(Q18);
            }
            Y.l lVar3 = (Y.l) Q18;
            c0164u3.x();
            boolean z14 = a(interfaceC0144j0) != t1Var;
            c0164u3.a0(33179519);
            java.lang.Object Q19 = c0164u3.Q();
            if (Q19 == c0136f03) {
                Q19 = new H2.a1(interfaceC0144j0, interfaceC0144j02, c0152n02, interfaceC0144j03, 0);
                c0164u3.m0(Q19);
            }
            c0164u3.x();
            e.d.BackHandler(z14, (X1.a) Q19, c0164u3, 48, 0);
            H2.t1 a9 = a(interfaceC0144j0);
            c0164u3.a0(33181245);
            java.lang.Object Q20 = c0164u3.Q();
            if (Q20 == c0136f03) {
                Q20 = new H2.b1(interfaceC0144j0, lVar, null);
                c0164u3.m0(Q20);
            }
            c0164u3.x();
            I.T.LaunchedEffect(a9, (X1.e) Q20, c0164u3, 64);
            I.T.LaunchedEffect(a(interfaceC0144j0), (G2.k) interfaceC0144j03.getValue(), new H2.c1(context, interfaceC0144j0, interfaceC0144j03, interfaceC0525w, c0152n02, interfaceC0144j02, mVar, null), c0164u3, 512);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z);
            c0164u3.a0(33199225);
            boolean z15 = (i8 & 112) == 32;
            java.lang.Object Q21 = c0164u3.Q();
            if (z15 || Q21 == c0136f03) {
                Q21 = new H2.d1(z, lVar2, null);
                c0164u3.m0(Q21);
            }
            c0164u3.x();
            I.T.LaunchedEffect(valueOf, (X1.e) Q21, c0164u3, ((i8 >> 3) & 14) | 64);
            java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z3);
            c0164u3.a0(33202583);
            boolean z16 = (i8 & 896) == 256;
            java.lang.Object Q22 = c0164u3.Q();
            if (z16 || Q22 == c0136f03) {
                c0136f0 = c0136f03;
                Q22 = new H2.e1(z3, lVar3, null);
                c0164u3.m0(Q22);
            } else {
                c0136f0 = c0136f03;
            }
            c0164u3.x();
            I.T.LaunchedEffect(valueOf2, (X1.e) Q22, c0164u3, ((i8 >> 6) & 14) | 64);
            U.l lVar4 = U.l.f3053b;
            U.o b4 = androidx.compose.foundation.layout.c.b();
            c0164u3.a0(733328855);
            n0.F rememberBoxMeasurePolicy = u.AbstractC0915k.rememberBoxMeasurePolicy(U.a.f3033i, false, c0164u3, 0);
            c0164u3.a0(-1323940314);
            int currentCompositeKeyHash = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u3, 0);
            I.InterfaceC0167v0 D3 = c0164u3.D();
            p0.InterfaceC0672h.f6471g.getClass();
            p0.C0670f a10 = p0.C0671g.a();
            Q.a a11 = n0.AbstractC0606q.a(b4);
            if (!(c0164u3.C() instanceof I.InterfaceC0133e)) {
                I.AbstractC0147l.a();
                throw null;
            }
            c0164u3.d0();
            if (c0164u3.G()) {
                c0164u3.p(a10);
            } else {
                c0164u3.p0();
            }
            I.AbstractC0168w.C(c0164u3, rememberBoxMeasurePolicy, p0.C0671g.c());
            I.AbstractC0168w.C(c0164u3, D3, p0.C0671g.d());
            p0.C0669e b5 = p0.C0671g.b();
            if (c0164u3.G() || !Y1.j.a(c0164u3.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                q.AbstractC0731s.b(currentCompositeKeyHash, c0164u3, currentCompositeKeyHash, b5);
            }
            a11.i(I.O0.a(c0164u3), c0164u3, 0);
            c0164u3.a0(2058660585);
            U.o d3 = androidx.compose.foundation.layout.b.d(q.w0.a(androidx.compose.foundation.layout.c.b(), q.w0.rememberScrollState(0, c0164u3, 0, 1)), 24);
            u.C0908d g3 = u.AbstractC0911g.g(22);
            c0164u3.a0(-483455358);
            U.e eVar3 = U.a.f3041q;
            n0.F columnMeasurePolicy = u.t.columnMeasurePolicy(g3, eVar3, c0164u3, 6);
            c0164u3.a0(-1323940314);
            int currentCompositeKeyHash2 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u3, 0);
            I.InterfaceC0167v0 D4 = c0164u3.D();
            p0.C0670f a12 = p0.C0671g.a();
            Q.a a13 = n0.AbstractC0606q.a(d3);
            if (!(c0164u3.C() instanceof I.InterfaceC0133e)) {
                I.AbstractC0147l.a();
                throw null;
            }
            c0164u3.d0();
            if (c0164u3.G()) {
                c0164u3.p(a12);
            } else {
                c0164u3.p0();
            }
            I.AbstractC0168w.C(c0164u3, columnMeasurePolicy, p0.C0671g.c());
            I.AbstractC0168w.C(c0164u3, D4, p0.C0671g.d());
            p0.C0669e b6 = p0.C0671g.b();
            if (c0164u3.G() || !Y1.j.a(c0164u3.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                q.AbstractC0731s.b(currentCompositeKeyHash2, c0164u3, currentCompositeKeyHash2, b6);
            }
            a13.i(I.O0.a(c0164u3), c0164u3, 0);
            c0164u3.a0(2058660585);
            long b7 = H2.s1.b();
            long u3 = y2.d.u(26);
            B0.n nVar2 = B0.n.f97m;
            I.C0136f0 c0136f04 = c0136f0;
            G.l0.m33Text4IGK_g("Paramètres", (U.o) null, b7, u3, (B0.l) null, nVar2, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u3, 200070, 0, 131026);
            G.l0.m33Text4IGK_g("Les choix sont enregistrés sur cet appareil.", (U.o) null, H2.s1.c(), y2.d.u(14), (B0.l) null, (B0.n) null, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u3, 3462, 0, 131058);
            long a14 = H2.s1.a();
            long u4 = y2.d.u(13);
            long u5 = y2.d.u(1);
            B0.n nVar3 = B0.n.f96l;
            G.l0.m33Text4IGK_g("Taille des miniatures", (U.o) null, a14, u4, (B0.l) null, nVar3, (B0.f) null, u5, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u3, 12782982, 0, 130898);
            java.lang.String b8 = fVar.b();
            c0164u3.a0(-908334503);
            int i9 = i8 & 7168;
            int i10 = i8 & 14;
            boolean z17 = (i9 == 2048) | (i10 == 4);
            java.lang.Object Q23 = c0164u3.Q();
            if (z17) {
                c0136f02 = c0136f04;
            } else {
                c0136f02 = c0136f04;
                if (Q23 != c0136f02) {
                    fVar2 = fVar;
                    nVar = nVar2;
                    cVar4 = cVar;
                    c0164u3.x();
                    I.C0136f0 c0136f05 = c0136f02;
                    c0164u = c0164u3;
                    ThumbChoice("tiny", "Très compacte", "Le plus grand nombre de miniatures", b8, (X1.c) Q23, c0164u3, 438);
                    java.lang.String b9 = fVar.b();
                    c0164u.a0(-908330055);
                    z4 = (i9 != 2048) | (i10 != 4);
                    Q2 = c0164u.Q();
                    if (!z4 || Q2 == c0136f05) {
                        Q2 = new H2.f1(cVar4, fVar2, 2);
                        c0164u.m0(Q2);
                    }
                    c0164u.x();
                    ThumbChoice("small", "Compacte", "Plus de photos à l’écran", b9, (X1.c) Q2, c0164u, 438);
                    java.lang.String b10 = fVar.b();
                    c0164u.a0(-908325831);
                    z5 = (i9 != 2048) | (i10 != 4);
                    Q3 = c0164u.Q();
                    if (!z5 || Q3 == c0136f05) {
                        Q3 = new H2.f1(cVar4, fVar2, 3);
                        c0164u.m0(Q3);
                    }
                    c0164u.x();
                    ThumbChoice("medium", "Normale", "Taille équilibrée", b10, (X1.c) Q3, c0164u, 438);
                    java.lang.String b11 = fVar.b();
                    c0164u.a0(-908321447);
                    z6 = (i9 != 2048) | (i10 != 4);
                    Q4 = c0164u.Q();
                    if (!z6 || Q4 == c0136f05) {
                        Q4 = new H2.f1(cVar4, fVar2, 4);
                        c0164u.m0(Q4);
                    }
                    c0164u.x();
                    ThumbChoice("large", "Grande", "Miniatures plus lisibles", b11, (X1.c) Q4, c0164u, 438);
                    c0164u.a0(-908315589);
                    z7 = (i9 != 2048) | (i10 != 4);
                    Q5 = c0164u.Q();
                    if (!z7 || Q5 == c0136f05) {
                        Q5 = new H2.f1(cVar4, fVar2, 5);
                        c0164u.m0(Q5);
                    }
                    c0164u.x();
                    SettingToggle("Démarrage des vidéos en plein écran", "Ouvre directement la vidéo en plein écran", fVar2.f1109b, null, null, (X1.c) Q5, c0164u, 54, 24);
                    c0164u.a0(-908308167);
                    z8 = (i9 != 2048) | (i10 != 4);
                    Q6 = c0164u.Q();
                    if (!z8 || Q6 == c0136f05) {
                        Q6 = new H2.f1(cVar4, fVar2, 6);
                        c0164u.m0(Q6);
                    }
                    c0164u.x();
                    SettingToggle("Navigation cloisonnée", "Les flèches restent dans les miniatures. Retour ramène au menu de gauche.", fVar2.f1110c, null, null, (X1.c) Q6, c0164u, 54, 24);
                    c0164u.a0(-908300939);
                    z9 = (i9 != 2048) | (i10 != 4);
                    Q7 = c0164u.Q();
                    if (!z9 || Q7 == c0136f05) {
                        Q7 = new H2.f1(cVar4, fVar2, 7);
                        c0164u.m0(Q7);
                    }
                    c0164u.x();
                    SettingToggle("Lecture enchaînée", "À la fin d’une vidéo, enchaîne automatiquement le fichier suivant du dossier.", fVar2.f1111d, null, null, (X1.c) Q7, c0164u, 54, 24);
                    c0164u.a0(-908292296);
                    z10 = (i9 != 2048) | (i10 != 4);
                    Q8 = c0164u.Q();
                    if (!z10 || Q8 == c0136f05) {
                        Q8 = new H2.f1(cVar4, fVar2, 8);
                        c0164u.m0(Q8);
                    }
                    c0164u.x();
                    SettingToggle("Modif Taille en lecture continue", "Plein écran ou fenêtre : la vidéo continue au même endroit. Suivant / précédent : toujours depuis le début.", fVar2.f1112e, null, null, (X1.c) Q8, c0164u, 54, 24);
                    c0164u.a0(-908284648);
                    z11 = (i9 != 2048) | (i10 != 4);
                    Q9 = c0164u.Q();
                    if (!z11 || Q9 == c0136f05) {
                        Q9 = new H2.f1(cVar4, fVar2, 9);
                        c0164u.m0(Q9);
                    }
                    c0164u.x();
                    SettingToggle("Navigation optimisée", "En plein écran seulement : gauche / droite change de fichier, bas affiche les icônes.", fVar2.f1113f, null, null, (X1.c) Q9, c0164u, 54, 24);
                    float f5 = 12;
                    u.C0908d g4 = u.AbstractC0911g.g(f5);
                    c3 = androidx.compose.foundation.layout.c.c(lVar4, 1.0f);
                    c0164u.a0(693286680);
                    U.f fVar3 = U.a.f3039o;
                    n0.F rowMeasurePolicy = u.AbstractC0897H.rowMeasurePolicy(g4, fVar3, c0164u, 6);
                    c0164u.a0(-1323940314);
                    int currentCompositeKeyHash3 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                    I.InterfaceC0167v0 D5 = c0164u.D();
                    p0.C0670f a15 = p0.C0671g.a();
                    Q.a a16 = n0.AbstractC0606q.a(c3);
                    if (c0164u.C() instanceof I.InterfaceC0133e) {
                        I.AbstractC0147l.a();
                        throw null;
                    }
                    c0164u.d0();
                    if (c0164u.G()) {
                        c0164u.p(a15);
                    } else {
                        c0164u.p0();
                    }
                    I.AbstractC0168w.C(c0164u, rowMeasurePolicy, p0.C0671g.c());
                    I.AbstractC0168w.C(c0164u, D5, p0.C0671g.d());
                    p0.C0669e b12 = p0.C0671g.b();
                    if (c0164u.G() || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                        q.AbstractC0731s.b(currentCompositeKeyHash3, c0164u, currentCompositeKeyHash3, b12);
                    }
                    a16.i(I.O0.a(c0164u), c0164u, 0);
                    c0164u.a0(2058660585);
                    U.o a17 = u.InterfaceC0898I.a();
                    c0164u.a0(-1223606661);
                    int i11 = i8 & 458752;
                    boolean z18 = i11 == 131072;
                    java.lang.Object Q24 = c0164u.Q();
                    if (z18 || Q24 == c0136f05) {
                        cVar5 = cVar3;
                        Q24 = new H2.T(6, cVar5);
                        c0164u.m0(Q24);
                    } else {
                        cVar5 = cVar3;
                    }
                    X1.a aVar2 = (X1.a) Q24;
                    c0164u.x();
                    X1.c cVar7 = cVar5;
                    H2.L0.PixButton("Mode d’emploi", a17, null, false, false, null, aVar2, c0164u, 6, 60);
                    U.o a18 = u.InterfaceC0898I.a();
                    c0164u.a0(-1223603524);
                    int i12 = i8 & 57344;
                    boolean z19 = i12 == 16384;
                    java.lang.Object Q25 = c0164u.Q();
                    if (z19 || Q25 == c0136f05) {
                        cVar6 = cVar2;
                        th = null;
                        Q25 = new H2.T(7, cVar6);
                        c0164u.m0(Q25);
                    } else {
                        cVar6 = cVar2;
                        th = null;
                    }
                    c0164u.x();
                    H2.L0.PixButton("À propos", a18, null, false, false, null, (X1.a) Q25, c0164u, 6, 60);
                    c0164u.x();
                    c0164u.w();
                    c0164u.x();
                    c0164u.x();
                    boolean z20 = fVar2.f1114g;
                    java.lang.String str2 = z20 ? "Canal bêta" : "Canal officiel";
                    c0164u.a0(-908263622);
                    boolean z21 = (i9 == 2048) | (i10 == 4);
                    java.lang.Object Q26 = c0164u.Q();
                    if (z21 || Q26 == c0136f05) {
                        Q26 = new H2.f1(cVar4, fVar2, 1);
                        c0164u.m0(Q26);
                    }
                    c0164u.x();
                    SettingToggle("Type MAJ", str2, z20, "OFFICIELLE", "BÊTA", (X1.c) Q26, c0164u, 27654, 0);
                    c4 = androidx.compose.foundation.layout.c.c(lVar4, 1.0f);
                    H2.L0.PixButton("Recherche de MAJ", c4, null, false, false, null, new H2.C0098m(fVar, interfaceC0525w, interfaceC0144j0, interfaceC0144j02, interfaceC0144j03, mVar), c0164u, 54, 60);
                    c0164u.x();
                    c0164u.w();
                    c0164u.x();
                    c0164u.x();
                    c0164u.a0(-74979942);
                    U.g gVar = U.a.f3036l;
                    if (z) {
                        a7 = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.b(), a0.C0238s.b(a0.C0238s.f3360b, 0.72f), a0.H.f3290a);
                        c0164u.a0(-74978369);
                        boolean z22 = i12 == 16384;
                        java.lang.Object Q27 = c0164u.Q();
                        if (z22 || Q27 == c0136f05) {
                            Q27 = new H2.T(8, cVar6);
                            c0164u.m0(Q27);
                        }
                        c0164u.x();
                        U.o e3 = androidx.compose.foundation.a.e(a7, (X1.a) Q27);
                        c0164u.a0(733328855);
                        n0.F rememberBoxMeasurePolicy2 = u.AbstractC0915k.rememberBoxMeasurePolicy(gVar, false, c0164u, 6);
                        c0164u.a0(-1323940314);
                        int currentCompositeKeyHash4 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                        I.InterfaceC0167v0 D6 = c0164u.D();
                        p0.C0670f a19 = p0.C0671g.a();
                        Q.a a20 = n0.AbstractC0606q.a(e3);
                        if (!(c0164u.C() instanceof I.InterfaceC0133e)) {
                            I.AbstractC0147l.a();
                            throw th;
                        }
                        c0164u.d0();
                        if (c0164u.G()) {
                            c0164u.p(a19);
                        } else {
                            c0164u.p0();
                        }
                        I.AbstractC0168w.C(c0164u, rememberBoxMeasurePolicy2, p0.C0671g.c());
                        I.AbstractC0168w.C(c0164u, D6, p0.C0671g.d());
                        p0.C0669e b13 = p0.C0671g.b();
                        if (c0164u.G() || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                            q.AbstractC0731s.b(currentCompositeKeyHash4, c0164u, currentCompositeKeyHash4, b13);
                        }
                        q.AbstractC0731s.c(0, a20, I.O0.a(c0164u), c0164u, 2058660585);
                        float f6 = 16;
                        a8 = androidx.compose.foundation.a.a(a.AbstractC0217a.v(androidx.compose.foundation.layout.c.j(lVar4, 520), A.e.a(f6)), H2.s1.f1891c, a0.H.f3290a);
                        f3 = f5;
                        U.o a21 = androidx.compose.foundation.b.a(androidx.compose.ui.focus.a.b(y2.d.g(a8, 1, a0.C0238s.b(a0.C0238s.f3361c, 0.12f), A.e.a(f6)), lVar2));
                        c0164u.a0(-908242362);
                        boolean z23 = i12 == 16384;
                        java.lang.Object Q28 = c0164u.Q();
                        if (z23 || Q28 == c0136f05) {
                            Q28 = new H2.C0101n0(1, cVar6);
                            c0164u.m0(Q28);
                        }
                        c0164u.x();
                        U.o d4 = androidx.compose.foundation.layout.b.d(androidx.compose.ui.input.key.a.a(a21, (X1.c) Q28), 28);
                        c0164u.a0(-483455358);
                        eVar = eVar3;
                        n0.F columnMeasurePolicy2 = u.t.columnMeasurePolicy(u.AbstractC0911g.f8051c, eVar, c0164u, 0);
                        c0164u.a0(-1323940314);
                        int currentCompositeKeyHash5 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                        I.InterfaceC0167v0 D7 = c0164u.D();
                        p0.C0670f a22 = p0.C0671g.a();
                        Q.a a23 = n0.AbstractC0606q.a(d4);
                        if (!(c0164u.C() instanceof I.InterfaceC0133e)) {
                            I.AbstractC0147l.a();
                            throw th;
                        }
                        c0164u.d0();
                        if (c0164u.G()) {
                            c0164u.p(a22);
                        } else {
                            c0164u.p0();
                        }
                        I.AbstractC0168w.C(c0164u, columnMeasurePolicy2, p0.C0671g.c());
                        I.AbstractC0168w.C(c0164u, D7, p0.C0671g.d());
                        p0.C0669e b14 = p0.C0671g.b();
                        if (c0164u.G() || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash5))) {
                            q.AbstractC0731s.b(currentCompositeKeyHash5, c0164u, currentCompositeKeyHash5, b14);
                        }
                        a23.i(I.O0.a(c0164u), c0164u, 0);
                        c0164u.a0(2058660585);
                        i5 = 733328855;
                        G.l0.m33Text4IGK_g("À PROPOS", (U.o) null, H2.s1.a(), y2.d.u(12), (B0.l) null, nVar3, (B0.f) null, y2.d.u(2), (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 12782982, 0, 130898);
                        u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, 10), c0164u, 6);
                        G.l0.m33Text4IGK_g("Plex-Pix", (U.o) null, H2.s1.b(), y2.d.u(24), (B0.l) null, nVar, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 200070, 0, 131026);
                        G.l0.m33Text4IGK_g("Version 1.3.13", (U.o) null, H2.s1.c(), y2.d.u(13), (B0.l) null, (B0.n) null, (B0.f) B0.f.f81c, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 3456, 0, 130994);
                        float f7 = 14;
                        u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, f7), c0164u, 6);
                        G.l0.m33Text4IGK_g("Plex-Pix : Application d'exploration et de visualisation de fichiers medias personnels, créer par Guilard Jean Francois, adresse de contact jfrancois@guilard.com", (U.o) null, H2.s1.b(), y2.d.u(15), (B0.l) null, (B0.n) null, (B0.f) null, 0L, (H0.g) null, (H0.f) null, y2.d.u(22), 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 3462, 6, 130034);
                        u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, f7), c0164u, 6);
                        G.l0.m33Text4IGK_g("Ce logiciel n’est pas conçu par les équipes de Plex. Il s’agit d’un projet personnel. Aucune information ni aucun code n’est collecté : tout est stocké en local sur la télévision.", (U.o) null, H2.s1.c(), y2.d.u(14), (B0.l) null, (B0.n) null, (B0.f) null, 0L, (H0.g) null, (H0.f) null, y2.d.u(20), 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 3462, 6, 130034);
                        u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, f6), c0164u, 6);
                        G.l0.m33Text4IGK_g("OK ou Retour pour fermer", (U.o) null, H2.s1.f1895g, y2.d.u(13), (B0.l) null, (B0.n) null, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 3462, 0, 131058);
                        c0164u.x();
                        c0164u.w();
                        c0164u.x();
                        c0164u.x();
                        c0164u.x();
                        c0164u.w();
                        c0164u.x();
                        c0164u.x();
                    } else {
                        f3 = f5;
                        eVar = eVar3;
                        i5 = 733328855;
                    }
                    c0164u.x();
                    c0164u.a0(-74915402);
                    if (z3) {
                        q.y0 rememberScrollState = q.w0.rememberScrollState(0, c0164u, 0, 1);
                        c0164u.a0(773894976);
                        c0164u.a0(-492369756);
                        java.lang.Object Q29 = c0164u.Q();
                        if (Q29 == c0136f05) {
                            I.H h4 = new I.H(I.T.a(jVar, c0164u));
                            c0164u.m0(h4);
                            Q29 = h4;
                        }
                        c0164u.x();
                        h2.InterfaceC0525w interfaceC0525w2 = ((I.H) Q29).f2055i;
                        c0164u.x();
                        c0164u.a0(-74913873);
                        java.lang.Object Q30 = c0164u.Q();
                        if (Q30 == c0136f05) {
                            Q30 = I.Z0.b(java.lang.Boolean.FALSE, I.C0136f0.f2234m);
                            c0164u.m0(Q30);
                        }
                        I.InterfaceC0144j0 interfaceC0144j04 = (I.InterfaceC0144j0) Q30;
                        c0164u.x();
                        a5 = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.b(), a0.C0238s.b(a0.C0238s.f3360b, 0.72f), a0.H.f3290a);
                        c0164u.a0(-74909794);
                        boolean z24 = i11 == 131072;
                        java.lang.Object Q31 = c0164u.Q();
                        if (z24 || Q31 == c0136f05) {
                            Q31 = new H2.T(9, cVar7);
                            c0164u.m0(Q31);
                        }
                        c0164u.x();
                        U.o e4 = androidx.compose.foundation.a.e(a5, (X1.a) Q31);
                        c0164u.a0(i5);
                        n0.F rememberBoxMeasurePolicy3 = u.AbstractC0915k.rememberBoxMeasurePolicy(gVar, false, c0164u, 6);
                        c0164u.a0(-1323940314);
                        int currentCompositeKeyHash6 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                        I.InterfaceC0167v0 D8 = c0164u.D();
                        p0.C0670f a24 = p0.C0671g.a();
                        Q.a a25 = n0.AbstractC0606q.a(e4);
                        if (!(c0164u.C() instanceof I.InterfaceC0133e)) {
                            I.AbstractC0147l.a();
                            throw th;
                        }
                        c0164u.d0();
                        if (c0164u.G()) {
                            c0164u.p(a24);
                        } else {
                            c0164u.p0();
                        }
                        I.AbstractC0168w.C(c0164u, rememberBoxMeasurePolicy3, p0.C0671g.c());
                        I.AbstractC0168w.C(c0164u, D8, p0.C0671g.d());
                        p0.C0669e b15 = p0.C0671g.b();
                        if (c0164u.G() || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash6))) {
                            q.AbstractC0731s.b(currentCompositeKeyHash6, c0164u, currentCompositeKeyHash6, b15);
                        }
                        q.AbstractC0731s.c(0, a25, I.O0.a(c0164u), c0164u, 2058660585);
                        float f8 = 560;
                        float f9 = 16;
                        a6 = androidx.compose.foundation.a.a(a.AbstractC0217a.v(androidx.compose.foundation.layout.c.f(androidx.compose.foundation.layout.c.j(lVar4, f8), f8), A.e.a(f9)), H2.s1.f1891c, a0.H.f3290a);
                        U.o b16 = androidx.compose.ui.focus.a.b(y2.d.g(a6, 2, c(interfaceC0144j04) ? H2.s1.f1898j : a0.C0238s.b(a0.C0238s.f3361c, 0.12f), A.e.a(f9)), lVar3);
                        c0164u.a0(-908173366);
                        java.lang.Object Q32 = c0164u.Q();
                        if (Q32 == c0136f05) {
                            Q32 = new B.f(interfaceC0144j04, 5);
                            c0164u.m0(Q32);
                        }
                        c0164u.x();
                        U.o d5 = androidx.compose.foundation.layout.b.d(androidx.compose.ui.input.key.a.a(androidx.compose.ui.focus.a.a(androidx.compose.foundation.b.a(androidx.compose.ui.focus.a.c(b16, (X1.c) Q32)), H2.C0107q0.f1873m), new H2.C0076b(cVar7, interfaceC0525w2, rememberScrollState, 2)), 28);
                        c0164u.a0(-483455358);
                        u.u uVar = u.AbstractC0911g.f8051c;
                        n0.F columnMeasurePolicy3 = u.t.columnMeasurePolicy(uVar, eVar, c0164u, 0);
                        c0164u.a0(-1323940314);
                        int currentCompositeKeyHash7 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                        I.InterfaceC0167v0 D9 = c0164u.D();
                        p0.C0670f a26 = p0.C0671g.a();
                        Q.a a27 = n0.AbstractC0606q.a(d5);
                        if (!(c0164u.C() instanceof I.InterfaceC0133e)) {
                            I.AbstractC0147l.a();
                            throw th;
                        }
                        c0164u.d0();
                        if (c0164u.G()) {
                            c0164u.p(a26);
                        } else {
                            c0164u.p0();
                        }
                        I.AbstractC0168w.C(c0164u, columnMeasurePolicy3, p0.C0671g.c());
                        I.AbstractC0168w.C(c0164u, D9, p0.C0671g.d());
                        p0.C0669e b17 = p0.C0671g.b();
                        if (c0164u.G() || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash7))) {
                            q.AbstractC0731s.b(currentCompositeKeyHash7, c0164u, currentCompositeKeyHash7, b17);
                        }
                        a27.i(I.O0.a(c0164u), c0164u, 0);
                        c0164u.a0(2058660585);
                        G.l0.m33Text4IGK_g("MODE D’EMPLOI", (U.o) null, H2.s1.a(), y2.d.u(12), (B0.l) null, nVar3, (B0.f) null, y2.d.u(2), (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 12782982, 0, 130898);
                        u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, 8), c0164u, 6);
                        G.l0.m33Text4IGK_g("Plex-Pix", (U.o) null, H2.s1.b(), y2.d.u(22), (B0.l) null, nVar, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 200070, 0, 131026);
                        f4 = f3;
                        u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, f4), c0164u, 6);
                        if (1.0f <= 0.0d) {
                            throw new java.lang.IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
                        }
                        U.o a28 = q.w0.a(new androidx.compose.foundation.layout.LayoutWeightElement(android.support.v4.media.session.b.h(1.0f, Float.MAX_VALUE), false), rememberScrollState);
                        c0164u.a0(-483455358);
                        n0.F columnMeasurePolicy4 = u.t.columnMeasurePolicy(uVar, eVar, c0164u, 0);
                        c0164u.a0(-1323940314);
                        int currentCompositeKeyHash8 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                        I.InterfaceC0167v0 D10 = c0164u.D();
                        p0.C0670f a29 = p0.C0671g.a();
                        Q.a a30 = n0.AbstractC0606q.a(a28);
                        if (!(c0164u.C() instanceof I.InterfaceC0133e)) {
                            I.AbstractC0147l.a();
                            throw th;
                        }
                        c0164u.d0();
                        if (c0164u.G()) {
                            c0164u.p(a29);
                        } else {
                            c0164u.p0();
                        }
                        I.AbstractC0168w.C(c0164u, columnMeasurePolicy4, p0.C0671g.c());
                        I.AbstractC0168w.C(c0164u, D10, p0.C0671g.d());
                        p0.C0669e b18 = p0.C0671g.b();
                        if (c0164u.G() || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash8))) {
                            q.AbstractC0731s.b(currentCompositeKeyHash8, c0164u, currentCompositeKeyHash8, b18);
                        }
                        q.AbstractC0731s.c(0, a30, I.O0.a(c0164u), c0164u, 2058660585);
                        HelpLine("Connexion", "Allez sur plex.tv/link depuis un téléphone ou un ordinateur, puis saisissez le code affiché.", c0164u, 54);
                        HelpLine("Dossiers", "La colonne de gauche liste les albums. OK ouvre le dossier à droite.", c0164u, 54);
                        HelpLine("Filtres", "Au-dessus des miniatures : photos, vidéos, ou les deux.", c0164u, 54);
                        HelpLine("Lecture", "OK sur une miniature l’ouvre en grand. Flèches gauche/droite : fichier précédent / suivant.", c0164u, 54);
                        HelpLine("Barre du bas", "Infos, lecture, rotation 90°, diaporama, plein écran, retour à la grille.", c0164u, 54);
                        HelpLine("Diaporama", "Démarre à partir de la photo en cours (5 secondes par image). Un nouvel appui l’arrête.", c0164u, 54);
                        HelpLine("Lecture enchaînée", "Dans Paramètres. À la fin d’une vidéo, le fichier suivant se lance.", c0164u, 54);
                        HelpLine("Navigation cloisonnée", "Les flèches restent dans les miniatures. Retour ramène au menu de gauche.", c0164u, 54);
                        HelpLine("Retour", "Retour ramène à l’écran précédent. Seul Quitter ferme l’application.", c0164u, 54);
                        c0164u.x();
                        c0164u.w();
                        c0164u.x();
                        c0164u.x();
                        u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, 14), c0164u, 6);
                        G.l0.m33Text4IGK_g("↑ ↓ pour défiler  ·  OK ou Retour pour fermer", (U.o) null, H2.s1.f1895g, y2.d.u(13), (B0.l) null, (B0.n) null, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 3462, 0, 131058);
                        c0164u.x();
                        c0164u.w();
                        c0164u.x();
                        c0164u.x();
                        c0164u.x();
                        c0164u.w();
                        c0164u.x();
                        c0164u.x();
                    } else {
                        f4 = f3;
                    }
                    c0164u.x();
                    c0164u.a0(-74807933);
                    if (a(interfaceC0144j0) != t1Var) {
                        a3 = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.c.b(), a0.C0238s.b(a0.C0238s.f3360b, 0.72f), a0.H.f3290a);
                        c0164u.a0(733328855);
                        n0.F rememberBoxMeasurePolicy4 = u.AbstractC0915k.rememberBoxMeasurePolicy(gVar, false, c0164u, 6);
                        c0164u.a0(-1323940314);
                        int currentCompositeKeyHash9 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                        I.InterfaceC0167v0 D11 = c0164u.D();
                        p0.C0670f a31 = p0.C0671g.a();
                        Q.a a32 = n0.AbstractC0606q.a(a3);
                        if (!(c0164u.C() instanceof I.InterfaceC0133e)) {
                            I.AbstractC0147l.a();
                            throw th;
                        }
                        c0164u.d0();
                        if (c0164u.G()) {
                            c0164u.p(a31);
                        } else {
                            c0164u.p0();
                        }
                        I.AbstractC0168w.C(c0164u, rememberBoxMeasurePolicy4, p0.C0671g.c());
                        I.AbstractC0168w.C(c0164u, D11, p0.C0671g.d());
                        p0.C0669e b19 = p0.C0671g.b();
                        if (c0164u.G() || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash9))) {
                            q.AbstractC0731s.b(currentCompositeKeyHash9, c0164u, currentCompositeKeyHash9, b19);
                        }
                        q.AbstractC0731s.c(0, a32, I.O0.a(c0164u), c0164u, 2058660585);
                        float f10 = 16;
                        a4 = androidx.compose.foundation.a.a(a.AbstractC0217a.v(androidx.compose.foundation.layout.c.j(lVar4, 520), A.e.a(f10)), H2.s1.f1891c, a0.H.f3290a);
                        U.o d6 = androidx.compose.foundation.layout.b.d(y2.d.g(a4, 1, a0.C0238s.b(a0.C0238s.f3361c, 0.12f), A.e.a(f10)), 28);
                        c0164u.a0(-483455358);
                        n0.F columnMeasurePolicy5 = u.t.columnMeasurePolicy(u.AbstractC0911g.f8051c, eVar, c0164u, 0);
                        c0164u.a0(-1323940314);
                        int currentCompositeKeyHash10 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                        I.InterfaceC0167v0 D12 = c0164u.D();
                        p0.C0670f a33 = p0.C0671g.a();
                        Q.a a34 = n0.AbstractC0606q.a(d6);
                        if (!(c0164u.C() instanceof I.InterfaceC0133e)) {
                            I.AbstractC0147l.a();
                            throw th;
                        }
                        c0164u.d0();
                        if (c0164u.G()) {
                            c0164u.p(a33);
                        } else {
                            c0164u.p0();
                        }
                        I.AbstractC0168w.C(c0164u, columnMeasurePolicy5, p0.C0671g.c());
                        I.AbstractC0168w.C(c0164u, D12, p0.C0671g.d());
                        p0.C0669e b20 = p0.C0671g.b();
                        if (c0164u.G() || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash10))) {
                            q.AbstractC0731s.b(currentCompositeKeyHash10, c0164u, currentCompositeKeyHash10, b20);
                        }
                        a34.i(I.O0.a(c0164u), c0164u, 0);
                        c0164u.a0(2058660585);
                        G.l0.m33Text4IGK_g("MISE À JOUR", (U.o) null, H2.s1.a(), y2.d.u(12), (B0.l) null, nVar3, (B0.f) null, y2.d.u(2), (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 12782982, 0, 130898);
                        u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, 10), c0164u, 6);
                        G.l0.m33Text4IGK_g("Plex-Pix", (U.o) null, H2.s1.b(), y2.d.u(22), (B0.l) null, nVar, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 200070, 0, 131026);
                        u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, f4), c0164u, 6);
                        G.l0.m33Text4IGK_g(b(interfaceC0144j02), (U.o) null, H2.s1.b(), y2.d.u(15), (B0.l) null, (B0.n) null, (B0.f) null, 0L, (H0.g) null, (H0.f) null, y2.d.u(22), 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 3456, 6, 130034);
                        c0164u.a0(-1223388599);
                        if (a(interfaceC0144j0) == H2.t1.f1910j) {
                            u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, 18), c0164u, 6);
                            G.V.m11CircularProgressIndicatorLxG7B9w(androidx.compose.foundation.layout.c.h(lVar4, 36).e(new androidx.compose.foundation.layout.HorizontalAlignElement()), H2.s1.a(), 0.0f, 0L, 0, c0164u, 48, 28);
                        }
                        c0164u.x();
                        c0164u.a0(-1223379439);
                        if (a(interfaceC0144j0) == H2.t1.f1914n) {
                            u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, 18), c0164u, 6);
                            c0164u.a0(-1223373987);
                            java.lang.Object Q33 = c0164u.Q();
                            if (Q33 == c0136f05) {
                                c0152n0 = c0152n02;
                                Q33 = new C.h(8, c0152n0);
                                c0164u.m0(Q33);
                            } else {
                                c0152n0 = c0152n02;
                            }
                            X1.a aVar3 = (X1.a) Q33;
                            c0164u.x();
                            c8 = androidx.compose.foundation.layout.c.c(lVar4, 1.0f);
                            float f11 = 8;
                            G.V.m17LinearProgressIndicator_5eSRE(aVar3, a.AbstractC0217a.v(androidx.compose.foundation.layout.c.e(c8, f11), A.e.a(4)), H2.s1.a(), H2.s1.f1892d, 0, c0164u, 3462, 16);
                            u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, f11), c0164u, 6);
                            G.l0.m33Text4IGK_g(((int) (c0152n0.g() * 100)) + " %", (U.o) null, H2.s1.c(), y2.d.u(13), (B0.l) null, (B0.n) null, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 3456, 0, 131058);
                        } else {
                            c0152n0 = c0152n02;
                        }
                        c0164u.x();
                        c0164u.a0(-1223359311);
                        if (a(interfaceC0144j0) == H2.t1.f1915o) {
                            u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, 18), c0164u, 6);
                            G.V.m11CircularProgressIndicatorLxG7B9w(androidx.compose.foundation.layout.c.h(lVar4, 36).e(new androidx.compose.foundation.layout.HorizontalAlignElement()), H2.s1.a(), 0.0f, 0L, 0, c0164u, 48, 28);
                            u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, f4), c0164u, 6);
                            G.l0.m33Text4IGK_g("Confirmez l’installation sur l’écran suivant.", (U.o) null, H2.s1.c(), y2.d.u(13), (B0.l) null, (B0.n) null, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, 3462, 0, 131058);
                        }
                        c0164u.x();
                        u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.e(lVar4, 20), c0164u, 6);
                        int ordinal = a(interfaceC0144j0).ordinal();
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                c0164u.a0(731124312);
                                u.C0908d g5 = u.AbstractC0911g.g(f4);
                                c6 = androidx.compose.foundation.layout.c.c(lVar4, 1.0f);
                                c0164u.a0(693286680);
                                n0.F rowMeasurePolicy2 = u.AbstractC0897H.rowMeasurePolicy(g5, fVar3, c0164u, 6);
                                c0164u.a0(-1323940314);
                                int currentCompositeKeyHash11 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                                I.InterfaceC0167v0 D13 = c0164u.D();
                                p0.C0670f a35 = p0.C0671g.a();
                                Q.a a36 = n0.AbstractC0606q.a(c6);
                                if (!(c0164u.C() instanceof I.InterfaceC0133e)) {
                                    I.AbstractC0147l.a();
                                    throw th;
                                }
                                c0164u.d0();
                                if (c0164u.G()) {
                                    c0164u.p(a35);
                                } else {
                                    c0164u.p0();
                                }
                                I.AbstractC0168w.C(c0164u, rowMeasurePolicy2, p0.C0671g.c());
                                I.AbstractC0168w.C(c0164u, D13, p0.C0671g.d());
                                p0.C0669e b21 = p0.C0671g.b();
                                if (c0164u.G() || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash11))) {
                                    q.AbstractC0731s.b(currentCompositeKeyHash11, c0164u, currentCompositeKeyHash11, b21);
                                }
                                a36.i(I.O0.a(c0164u), c0164u, 0);
                                c0164u.a0(2058660585);
                                U.o a37 = u.InterfaceC0898I.a();
                                c0164u.a0(-627126853);
                                java.lang.Object Q34 = c0164u.Q();
                                if (Q34 == c0136f05) {
                                    Q34 = new H2.a1(interfaceC0144j0, interfaceC0144j02, c0152n0, interfaceC0144j03, 1);
                                    c0164u.m0(Q34);
                                }
                                c0164u.x();
                                eVar2 = null;
                                H2.L0.PixButton("Non", a37, null, false, false, null, (X1.a) Q34, c0164u, 1572870, 60);
                                b3 = androidx.compose.ui.focus.a.b(u.InterfaceC0898I.a(), lVar);
                                z12 = false;
                                aVar = null;
                                str = "Oui";
                                z13 = false;
                                i6 = 6;
                                i7 = 60;
                                i1Var = new H2.i1(interfaceC0144j03, context, interfaceC0144j0, interfaceC0144j02, interfaceC0525w, c0152n0, mVar);
                                c0164u2 = c0164u;
                            } else if (ordinal == 4) {
                                c0164u.a0(731619382);
                                u.C0908d g6 = u.AbstractC0911g.g(f4);
                                c7 = androidx.compose.foundation.layout.c.c(lVar4, 1.0f);
                                c0164u.a0(693286680);
                                n0.F rowMeasurePolicy3 = u.AbstractC0897H.rowMeasurePolicy(g6, fVar3, c0164u, 6);
                                c0164u.a0(-1323940314);
                                int currentCompositeKeyHash12 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
                                I.InterfaceC0167v0 D14 = c0164u.D();
                                p0.C0670f a38 = p0.C0671g.a();
                                Q.a a39 = n0.AbstractC0606q.a(c7);
                                if (!(c0164u.C() instanceof I.InterfaceC0133e)) {
                                    I.AbstractC0147l.a();
                                    throw th;
                                }
                                c0164u.d0();
                                if (c0164u.G()) {
                                    c0164u.p(a38);
                                } else {
                                    c0164u.p0();
                                }
                                I.AbstractC0168w.C(c0164u, rowMeasurePolicy3, p0.C0671g.c());
                                I.AbstractC0168w.C(c0164u, D14, p0.C0671g.d());
                                p0.C0669e b22 = p0.C0671g.b();
                                if (c0164u.G() || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash12))) {
                                    q.AbstractC0731s.b(currentCompositeKeyHash12, c0164u, currentCompositeKeyHash12, b22);
                                }
                                a39.i(I.O0.a(c0164u), c0164u, 0);
                                c0164u.a0(2058660585);
                                U.o a40 = u.InterfaceC0898I.a();
                                c0164u.a0(-627110789);
                                java.lang.Object Q35 = c0164u.Q();
                                if (Q35 == c0136f05) {
                                    Q35 = new H2.a1(interfaceC0144j0, interfaceC0144j02, c0152n0, interfaceC0144j03, 2);
                                    c0164u.m0(Q35);
                                }
                                c0164u.x();
                                z12 = false;
                                aVar = null;
                                eVar2 = null;
                                z13 = false;
                                i7 = 60;
                                c0164u2 = c0164u;
                                H2.L0.PixButton("Annuler", a40, null, false, false, null, (X1.a) Q35, c0164u2, 1572870, 60);
                                b3 = androidx.compose.ui.focus.a.b(u.InterfaceC0898I.a(), lVar);
                                str = "Ouvrir les paramètres";
                                i6 = 6;
                                i1Var = new C.h(9, context);
                            } else if (ordinal != 6 && ordinal != 7) {
                                c0164u.a0(-1223301201);
                                c0164u.x();
                                c0164u.x();
                                c0164u.w();
                                c0164u.x();
                                c0164u.x();
                                c0164u.x();
                                c0164u.w();
                                c0164u.x();
                                c0164u.x();
                            }
                            H2.L0.PixButton(str, b3, eVar2, z13, z12, aVar, i1Var, c0164u2, i6, i7);
                            c0164u.x();
                            c0164u.w();
                            c0164u.x();
                            c0164u.x();
                            c0164u.x();
                            c0164u.x();
                            c0164u.w();
                            c0164u.x();
                            c0164u.x();
                            c0164u.x();
                            c0164u.w();
                            c0164u.x();
                            c0164u.x();
                        }
                        c0164u.a0(732177971);
                        c5 = androidx.compose.foundation.layout.c.c(lVar4, 1.0f);
                        U.o b23 = androidx.compose.ui.focus.a.b(c5, lVar);
                        c0164u.a0(-1223303652);
                        java.lang.Object Q36 = c0164u.Q();
                        if (Q36 == c0136f05) {
                            Q36 = new H2.a1(interfaceC0144j0, interfaceC0144j02, c0152n0, interfaceC0144j03, 3);
                            c0164u.m0(Q36);
                        }
                        c0164u.x();
                        H2.L0.PixButton("OK", b23, null, false, false, null, (X1.a) Q36, c0164u, 1572870, 60);
                        c0164u.x();
                        c0164u.x();
                        c0164u.w();
                        c0164u.x();
                        c0164u.x();
                        c0164u.x();
                        c0164u.w();
                        c0164u.x();
                        c0164u.x();
                    }
                    c0164u.x();
                    c0164u.x();
                    c0164u.w();
                    c0164u.x();
                    c0164u.x();
                }
            }
            fVar2 = fVar;
            nVar = nVar2;
            cVar4 = cVar;
            Q23 = new H2.f1(cVar4, fVar2, 0);
            c0164u3.m0(Q23);
            c0164u3.x();
            I.C0136f0 c0136f052 = c0136f02;
            c0164u = c0164u3;
            ThumbChoice("tiny", "Très compacte", "Le plus grand nombre de miniatures", b8, (X1.c) Q23, c0164u3, 438);
            java.lang.String b92 = fVar.b();
            c0164u.a0(-908330055);
            z4 = (i9 != 2048) | (i10 != 4);
            Q2 = c0164u.Q();
            if (!z4) {
            }
            Q2 = new H2.f1(cVar4, fVar2, 2);
            c0164u.m0(Q2);
            c0164u.x();
            ThumbChoice("small", "Compacte", "Plus de photos à l’écran", b92, (X1.c) Q2, c0164u, 438);
            java.lang.String b102 = fVar.b();
            c0164u.a0(-908325831);
            z5 = (i9 != 2048) | (i10 != 4);
            Q3 = c0164u.Q();
            if (!z5) {
            }
            Q3 = new H2.f1(cVar4, fVar2, 3);
            c0164u.m0(Q3);
            c0164u.x();
            ThumbChoice("medium", "Normale", "Taille équilibrée", b102, (X1.c) Q3, c0164u, 438);
            java.lang.String b112 = fVar.b();
            c0164u.a0(-908321447);
            z6 = (i9 != 2048) | (i10 != 4);
            Q4 = c0164u.Q();
            if (!z6) {
            }
            Q4 = new H2.f1(cVar4, fVar2, 4);
            c0164u.m0(Q4);
            c0164u.x();
            ThumbChoice("large", "Grande", "Miniatures plus lisibles", b112, (X1.c) Q4, c0164u, 438);
            c0164u.a0(-908315589);
            z7 = (i9 != 2048) | (i10 != 4);
            Q5 = c0164u.Q();
            if (!z7) {
            }
            Q5 = new H2.f1(cVar4, fVar2, 5);
            c0164u.m0(Q5);
            c0164u.x();
            SettingToggle("Démarrage des vidéos en plein écran", "Ouvre directement la vidéo en plein écran", fVar2.f1109b, null, null, (X1.c) Q5, c0164u, 54, 24);
            c0164u.a0(-908308167);
            z8 = (i9 != 2048) | (i10 != 4);
            Q6 = c0164u.Q();
            if (!z8) {
            }
            Q6 = new H2.f1(cVar4, fVar2, 6);
            c0164u.m0(Q6);
            c0164u.x();
            SettingToggle("Navigation cloisonnée", "Les flèches restent dans les miniatures. Retour ramène au menu de gauche.", fVar2.f1110c, null, null, (X1.c) Q6, c0164u, 54, 24);
            c0164u.a0(-908300939);
            z9 = (i9 != 2048) | (i10 != 4);
            Q7 = c0164u.Q();
            if (!z9) {
            }
            Q7 = new H2.f1(cVar4, fVar2, 7);
            c0164u.m0(Q7);
            c0164u.x();
            SettingToggle("Lecture enchaînée", "À la fin d’une vidéo, enchaîne automatiquement le fichier suivant du dossier.", fVar2.f1111d, null, null, (X1.c) Q7, c0164u, 54, 24);
            c0164u.a0(-908292296);
            z10 = (i9 != 2048) | (i10 != 4);
            Q8 = c0164u.Q();
            if (!z10) {
            }
            Q8 = new H2.f1(cVar4, fVar2, 8);
            c0164u.m0(Q8);
            c0164u.x();
            SettingToggle("Modif Taille en lecture continue", "Plein écran ou fenêtre : la vidéo continue au même endroit. Suivant / précédent : toujours depuis le début.", fVar2.f1112e, null, null, (X1.c) Q8, c0164u, 54, 24);
            c0164u.a0(-908284648);
            z11 = (i9 != 2048) | (i10 != 4);
            Q9 = c0164u.Q();
            if (!z11) {
            }
            Q9 = new H2.f1(cVar4, fVar2, 9);
            c0164u.m0(Q9);
            c0164u.x();
            SettingToggle("Navigation optimisée", "En plein écran seulement : gauche / droite change de fichier, bas affiche les icônes.", fVar2.f1113f, null, null, (X1.c) Q9, c0164u, 54, 24);
            float f52 = 12;
            u.C0908d g42 = u.AbstractC0911g.g(f52);
            c3 = androidx.compose.foundation.layout.c.c(lVar4, 1.0f);
            c0164u.a0(693286680);
            U.f fVar32 = U.a.f3039o;
            n0.F rowMeasurePolicy4 = u.AbstractC0897H.rowMeasurePolicy(g42, fVar32, c0164u, 6);
            c0164u.a0(-1323940314);
            int currentCompositeKeyHash32 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
            I.InterfaceC0167v0 D52 = c0164u.D();
            p0.C0670f a152 = p0.C0671g.a();
            Q.a a162 = n0.AbstractC0606q.a(c3);
            if (c0164u.C() instanceof I.InterfaceC0133e) {
            }
        }
        I.B0 y3 = c0164u.y();
        if (y3 != null) {
            y3.f2026d = new H2.j1(fVar, z, z3, cVar, cVar2, cVar3, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019b, code lost:
    
        if (Y1.j.a(r0.Q(), java.lang.Integer.valueOf(r12)) == false) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ThumbChoice(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, X1.c cVar, I.InterfaceC0155p interfaceC0155p, int i3) {
        int i4;
        int i5;
        ?? r6;
        I.C0164u c0164u = (I.C0164u) interfaceC0155p;
        c0164u.b0(-1299764868);
        if ((i3 & 14) == 0) {
            i4 = (c0164u.h(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= c0164u.h(str2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= c0164u.h(str3) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i4 |= c0164u.h(str4) ? 2048 : 1024;
        }
        if ((i3 & 57344) == 0) {
            i4 |= c0164u.j(cVar) ? 16384 : 8192;
        }
        if ((46811 & i4) == 9362 && c0164u.H()) {
            c0164u.V();
        } else {
            c0164u.a0(-580420522);
            java.lang.Object Q2 = c0164u.Q();
            java.lang.Object obj = I.C0153o.f2276a;
            if (Q2 == obj) {
                Q2 = I.Z0.b(java.lang.Boolean.FALSE, I.C0136f0.f2234m);
                c0164u.m0(Q2);
            }
            I.InterfaceC0144j0 interfaceC0144j0 = (I.InterfaceC0144j0) Q2;
            c0164u.u(false);
            boolean a3 = Y1.j.a(str4, str);
            U.l lVar = U.l.f3053b;
            float f3 = 12;
            U.o v3 = a.AbstractC0217a.v(androidx.compose.foundation.layout.c.c(lVar, 1.0f), A.e.a(f3));
            long j3 = a3 ? H2.s1.f1892d : a0.C0238s.f3364f;
            B0.a aVar = a0.H.f3290a;
            U.o a4 = androidx.compose.foundation.a.a(v3, j3, aVar);
            c0164u.a0(-580412850);
            java.lang.Object Q3 = c0164u.Q();
            if (Q3 == obj) {
                Q3 = new B.f(interfaceC0144j0, 6);
                c0164u.m0(Q3);
            }
            c0164u.u(false);
            U.o c3 = androidx.compose.ui.focus.a.c(a4, (X1.c) Q3);
            float f4 = 2;
            U.o g3 = y2.d.g(c3, f4, ((java.lang.Boolean) interfaceC0144j0.getValue()).booleanValue() ? H2.s1.f1898j : a0.C0238s.f3364f, A.e.a(f3));
            c0164u.a0(-580408062);
            boolean z = ((57344 & i4) == 16384) | ((i4 & 14) == 4);
            java.lang.Object Q4 = c0164u.Q();
            if (z || Q4 == obj) {
                Q4 = new H2.H(cVar, str, 1);
                c0164u.m0(Q4);
            }
            c0164u.u(false);
            float f5 = 14;
            U.o e3 = androidx.compose.foundation.layout.b.e(androidx.compose.foundation.a.e(g3, (X1.a) Q4), f5, f3);
            U.f fVar = U.a.f3040p;
            c0164u.a0(693286680);
            n0.F rowMeasurePolicy = u.AbstractC0897H.rowMeasurePolicy(u.AbstractC0911g.f8049a, fVar, c0164u, 48);
            c0164u.a0(-1323940314);
            int currentCompositeKeyHash = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
            I.InterfaceC0167v0 q3 = c0164u.q();
            p0.InterfaceC0672h.f6471g.getClass();
            p0.C0670f c0670f = p0.C0671g.f6465b;
            Q.a a5 = n0.AbstractC0606q.a(e3);
            boolean z3 = c0164u.f2317a instanceof I.InterfaceC0133e;
            if (!z3) {
                I.AbstractC0147l.a();
                throw null;
            }
            c0164u.d0();
            if (c0164u.f2315O) {
                c0164u.p(c0670f);
            } else {
                c0164u.p0();
            }
            p0.C0669e c0669e = p0.C0671g.f6469f;
            I.AbstractC0168w.C(c0164u, rowMeasurePolicy, c0669e);
            p0.C0669e c0669e2 = p0.C0671g.f6468e;
            I.AbstractC0168w.C(c0164u, q3, c0669e2);
            p0.C0669e c0669e3 = p0.C0671g.f6470g;
            if (c0164u.f2315O) {
                i5 = i4;
            } else {
                i5 = i4;
            }
            q.AbstractC0731s.b(currentCompositeKeyHash, c0164u, currentCompositeKeyHash, c0669e3);
            q.AbstractC0731s.c(0, a5, new I.O0(c0164u), c0164u, 2058660585);
            U.o h3 = androidx.compose.foundation.layout.c.h(lVar, 22);
            A.d dVar = A.e.f6a;
            U.o g4 = y2.d.g(a.AbstractC0217a.v(h3, dVar), f4, a3 ? H2.s1.f1896h : H2.s1.f1894f, dVar);
            U.g gVar = U.a.f3036l;
            c0164u.a0(733328855);
            n0.F rememberBoxMeasurePolicy = u.AbstractC0915k.rememberBoxMeasurePolicy(gVar, false, c0164u, 6);
            c0164u.a0(-1323940314);
            int currentCompositeKeyHash2 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, 0);
            I.InterfaceC0167v0 q4 = c0164u.q();
            Q.a a6 = n0.AbstractC0606q.a(g4);
            if (!z3) {
                I.AbstractC0147l.a();
                throw null;
            }
            c0164u.d0();
            if (c0164u.f2315O) {
                c0164u.p(c0670f);
            } else {
                c0164u.p0();
            }
            I.AbstractC0168w.C(c0164u, rememberBoxMeasurePolicy, c0669e);
            I.AbstractC0168w.C(c0164u, q4, c0669e2);
            if (c0164u.f2315O || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                q.AbstractC0731s.b(currentCompositeKeyHash2, c0164u, currentCompositeKeyHash2, c0669e3);
            }
            q.AbstractC0731s.c(0, a6, new I.O0(c0164u), c0164u, 2058660585);
            c0164u.a0(2018071646);
            if (a3) {
                r6 = 0;
                u.AbstractC0915k.Box(androidx.compose.foundation.a.a(a.AbstractC0217a.v(androidx.compose.foundation.layout.c.h(lVar, f3), dVar), H2.s1.f1896h, aVar), c0164u, 0);
            } else {
                r6 = 0;
            }
            q.AbstractC0731s.e(c0164u, r6, r6, true, r6);
            c0164u.u(r6);
            u.AbstractC0901L.Spacer(androidx.compose.foundation.layout.c.j(lVar, f5), c0164u, 6);
            c0164u.a0(-483455358);
            n0.F columnMeasurePolicy = u.t.columnMeasurePolicy(u.AbstractC0911g.f8051c, U.a.f3041q, c0164u, r6);
            c0164u.a0(-1323940314);
            int currentCompositeKeyHash3 = I.AbstractC0147l.getCurrentCompositeKeyHash(c0164u, r6);
            I.InterfaceC0167v0 q5 = c0164u.q();
            Q.a a7 = n0.AbstractC0606q.a(lVar);
            if (!z3) {
                I.AbstractC0147l.a();
                throw null;
            }
            c0164u.d0();
            if (c0164u.f2315O) {
                c0164u.p(c0670f);
            } else {
                c0164u.p0();
            }
            I.AbstractC0168w.C(c0164u, columnMeasurePolicy, c0669e);
            I.AbstractC0168w.C(c0164u, q5, c0669e2);
            if (c0164u.f2315O || !Y1.j.a(c0164u.Q(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                q.AbstractC0731s.b(currentCompositeKeyHash3, c0164u, currentCompositeKeyHash3, c0669e3);
            }
            q.AbstractC0731s.c(0, a7, new I.O0(c0164u), c0164u, 2058660585);
            G.l0.m33Text4IGK_g(str2, (U.o) null, H2.s1.f1893e, 0L, (B0.l) null, B0.n.f96l, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, ((i5 >> 3) & 14) | 196992, 0, 131034);
            G.l0.m33Text4IGK_g(str3, (U.o) null, H2.s1.f1894f, y2.d.u(13), (B0.l) null, (B0.n) null, (B0.f) null, 0L, (H0.g) null, (H0.f) null, 0L, 0, false, 0, 0, (X1.c) null, (w0.t) null, (I.InterfaceC0155p) c0164u, (14 & (i5 >> 6)) | 3456, 0, 131058);
            q.AbstractC0731s.e(c0164u, false, true, false, false);
            q.AbstractC0731s.e(c0164u, false, true, false, false);
        }
        I.B0 y3 = c0164u.y();
        if (y3 != null) {
            y3.f2026d = new H2.p1(str, str2, str3, str4, cVar, i3);
        }
    }

    public static final H2.t1 a(I.InterfaceC0144j0 interfaceC0144j0) {
        return (H2.t1) interfaceC0144j0.getValue();
    }

    public static final java.lang.String b(I.InterfaceC0144j0 interfaceC0144j0) {
        return (java.lang.String) interfaceC0144j0.getValue();
    }

    public static final boolean c(I.InterfaceC0144j0 interfaceC0144j0) {
        return ((java.lang.Boolean) interfaceC0144j0.getValue()).booleanValue();
    }

    public static final void d(h2.InterfaceC0525w interfaceC0525w, I.InterfaceC0144j0 interfaceC0144j0, I.C0152n0 c0152n0, I.InterfaceC0144j0 interfaceC0144j02, android.content.Context context, G2.m mVar, G2.k kVar) {
        interfaceC0144j0.setValue(H2.t1.f1914n);
        c0152n0.h(0.0f);
        interfaceC0144j02.setValue("Téléchargement de la version " + kVar.f1126a + "…");
        h2.AbstractC0526x.p(interfaceC0525w, null, 0, new H2.m1(context, kVar, mVar, c0152n0, interfaceC0144j0, interfaceC0144j02, null), 3);
    }

    public static final void g(I.InterfaceC0144j0 interfaceC0144j0, I.InterfaceC0144j0 interfaceC0144j02, I.C0152n0 c0152n0, I.InterfaceC0144j0 interfaceC0144j03) {
        interfaceC0144j0.setValue(H2.t1.f1909i);
        interfaceC0144j02.setValue("");
        c0152n0.h(0.0f);
        interfaceC0144j03.setValue(null);
    }
}
