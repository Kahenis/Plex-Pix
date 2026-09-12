package H2;

/* renamed from: H2.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083e0 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1713j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1714k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1715l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1716m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1717n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1718o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083e0(G2.b bVar, java.lang.String str, U.o oVar, int i3, int i4) {
        super(2);
        this.f1713j = 0;
        this.f1717n = bVar;
        this.f1718o = str;
        this.f1714k = oVar;
        this.f1715l = i3;
        this.f1716m = i4;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f1713j) {
            case 0:
                ((java.lang.Number) obj2).intValue();
                int D3 = I.AbstractC0168w.D(this.f1715l | 1);
                java.lang.String str = (java.lang.String) this.f1718o;
                U.o oVar = (U.o) this.f1714k;
                H2.L0.MetaCard((G2.b) this.f1717n, str, oVar, (I.InterfaceC0155p) obj, D3, this.f1716m);
                break;
            case 1:
                ((java.lang.Number) obj2).intValue();
                int D4 = I.AbstractC0168w.D(this.f1715l | 1);
                U.o oVar2 = (U.o) this.f1714k;
                X1.c cVar = (X1.c) this.f1718o;
                L0.p.AndroidView((X1.c) this.f1717n, oVar2, cVar, (I.InterfaceC0155p) obj, D4, this.f1716m);
                break;
            case 2:
                ((java.lang.Number) obj2).intValue();
                int D5 = I.AbstractC0168w.D(this.f1715l | 1);
                X1.e eVar = (X1.e) this.f1717n;
                n0.F f3 = (n0.F) this.f1718o;
                n0.AbstractC0606q.MultiMeasureLayout((U.o) this.f1714k, eVar, f3, (I.InterfaceC0155p) obj, D5, this.f1716m);
                break;
            case 3:
                ((java.lang.Number) obj2).intValue();
                int D6 = I.AbstractC0168w.D(this.f1715l | 1);
                U.o oVar3 = (U.o) this.f1714k;
                X1.e eVar2 = (X1.e) this.f1718o;
                n0.U.SubcomposeLayout((n0.X) this.f1717n, oVar3, eVar2, (I.InterfaceC0155p) obj, D6, this.f1716m);
                break;
            case 4:
                ((java.lang.Number) obj2).intValue();
                int D7 = I.AbstractC0168w.D(this.f1716m | 1);
                int i3 = this.f1715l;
                java.lang.Object obj3 = this.f1714k;
                x.AbstractC1003u.m67SkippableItemJVlU9Rs((x.InterfaceC1004v) this.f1717n, this.f1718o, i3, obj3, (I.InterfaceC0155p) obj, D7);
                break;
            default:
                ((java.lang.Number) obj2).intValue();
                int D8 = I.AbstractC0168w.D(this.f1716m | 1);
                x.C0981E c0981e = (x.C0981E) this.f1718o;
                X1.e eVar3 = (X1.e) this.f1714k;
                x.AbstractC0980D.LazyLayoutPinnableItem(this.f1717n, this.f1715l, c0981e, eVar3, (I.InterfaceC0155p) obj, D8);
                break;
        }
        return L1.k.f2619a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083e0(U.o oVar, X1.e eVar, n0.F f3, int i3, int i4) {
        super(2);
        this.f1713j = 2;
        this.f1714k = oVar;
        this.f1717n = eVar;
        this.f1718o = f3;
        this.f1715l = i3;
        this.f1716m = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083e0(java.lang.Object obj, int i3, x.C0981E c0981e, X1.e eVar, int i4) {
        super(2);
        this.f1713j = 5;
        this.f1717n = obj;
        this.f1715l = i3;
        this.f1718o = c0981e;
        this.f1714k = eVar;
        this.f1716m = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0083e0(java.lang.Object obj, U.o oVar, L1.a aVar, int i3, int i4, int i5) {
        super(2);
        this.f1713j = i5;
        this.f1717n = obj;
        this.f1714k = oVar;
        this.f1718o = aVar;
        this.f1715l = i3;
        this.f1716m = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083e0(x.InterfaceC1004v interfaceC1004v, java.lang.Object obj, int i3, java.lang.Object obj2, int i4) {
        super(2);
        this.f1713j = 4;
        this.f1717n = interfaceC1004v;
        this.f1718o = obj;
        this.f1715l = i3;
        this.f1714k = obj2;
        this.f1716m = i4;
    }
}
