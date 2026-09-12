package H2;

/* renamed from: H2.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103o0 extends Y1.k implements X1.f {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1844j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I.InterfaceC0144j0 f1845k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0103o0(float f3, I.InterfaceC0144j0 interfaceC0144j0) {
        super(3);
        this.f1844j = f3;
        this.f1845k = interfaceC0144j0;
    }

    @Override // X1.f
    public final /* bridge */ /* synthetic */ java.lang.Object i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        invoke((u.r) obj, (I.InterfaceC0155p) obj2, ((java.lang.Number) obj3).intValue());
        return L1.k.f2619a;
    }

    public final void invoke(u.r rVar, I.InterfaceC0155p interfaceC0155p, int i3) {
        Y1.j.e("$this$BoxWithConstraints", rVar);
        if ((i3 & 14) == 0) {
            i3 |= ((I.C0164u) interfaceC0155p).h(rVar) ? 4 : 2;
        }
        if ((i3 & 91) == 18) {
            I.C0164u c0164u = (I.C0164u) interfaceC0155p;
            if (c0164u.H()) {
                c0164u.V();
                return;
            }
        }
        U.l lVar = U.l.f3053b;
        float f3 = 6;
        float f4 = 4;
        U.o v3 = a.AbstractC0217a.v(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.c(lVar, 1.0f), f3), A.e.a(f4));
        long j3 = H2.s1.f1892d;
        B0.a aVar = a0.H.f3290a;
        u.AbstractC0915k.Box(androidx.compose.foundation.a.a(v3, j3, aVar), interfaceC0155p, 0);
        float f5 = this.f1844j;
        u.AbstractC0915k.Box(androidx.compose.foundation.a.a(a.AbstractC0217a.v(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.c(lVar, f5), f3), A.e.a(f4)), H2.s1.f1896h, aVar), interfaceC0155p, 0);
        float f6 = 12;
        u.s sVar = (u.s) rVar;
        long j4 = sVar.f8088b;
        I0.e eVar = new I0.e(((I0.a.d(j4) ? sVar.f8087a.e0(I0.a.h(j4)) : Float.POSITIVE_INFINITY) - f6) * f5);
        I0.e eVar2 = new I0.e(0);
        if (eVar.compareTo(eVar2) < 0) {
            eVar = eVar2;
        }
        u.AbstractC0915k.Box(androidx.compose.foundation.a.a(a.AbstractC0217a.v(androidx.compose.foundation.layout.c.h(androidx.compose.foundation.layout.b.h(lVar, eVar.f2370i, 0.0f, 0.0f, 14), f6), A.e.f6a), ((java.lang.Boolean) this.f1845k.getValue()).booleanValue() ? H2.s1.f1898j : H2.s1.f1893e, aVar), interfaceC0155p, 0);
    }
}
