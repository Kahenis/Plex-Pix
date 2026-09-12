package H2;

/* renamed from: H2.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105p0 extends Y1.k implements X1.e {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f1857j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f1858k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ X1.c f1859l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X1.a f1860m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1861n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0105p0(long j3, long j4, X1.c cVar, X1.a aVar, int i3) {
        super(2);
        this.f1857j = j3;
        this.f1858k = j4;
        this.f1859l = cVar;
        this.f1860m = aVar;
        this.f1861n = i3;
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int D3 = I.AbstractC0168w.D(this.f1861n | 1);
        X1.c cVar = this.f1859l;
        X1.a aVar = this.f1860m;
        H2.L0.VideoSeekBar(this.f1857j, this.f1858k, cVar, aVar, (I.InterfaceC0155p) obj, D3);
        return L1.k.f2619a;
    }
}
