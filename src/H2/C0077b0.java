package H2;

/* renamed from: H2.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077b0 extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1664m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1665n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0077b0(java.lang.String str, java.lang.String str2, P1.d dVar) {
        super(2, dVar);
        this.f1664m = str;
        this.f1665n = str2;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.C0077b0(this.f1664m, this.f1665n, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.C0077b0) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        java.lang.Object u3;
        android.support.v4.media.session.b.R(obj);
        if (g2.AbstractC0448m.i0(this.f1664m)) {
            return null;
        }
        java.lang.String str = this.f1665n;
        if (g2.AbstractC0448m.i0(str)) {
            return null;
        }
        try {
            com.google.zxing.common.BitMatrix encode = new com.google.zxing.qrcode.QRCodeWriter().encode(B.n.w("https://www.plex.tv/link/?pin=", java.net.URLEncoder.encode(str, "UTF-8")), com.google.zxing.BarcodeFormat.QR_CODE, 512, 512, M1.w.U(new L1.f(com.google.zxing.EncodeHintType.MARGIN, 1), new L1.f(com.google.zxing.EncodeHintType.ERROR_CORRECTION, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.M), new L1.f(com.google.zxing.EncodeHintType.CHARACTER_SET, "UTF-8")));
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(512, 512, android.graphics.Bitmap.Config.ARGB_8888);
            Y1.j.d("createBitmap(...)", createBitmap);
            for (int i3 = 0; i3 < 512; i3++) {
                for (int i4 = 0; i4 < 512; i4++) {
                    createBitmap.setPixel(i3, i4, encode.get(i3, i4) ? -16777216 : -1);
                }
            }
            u3 = new a0.C0225e(createBitmap);
        } catch (java.lang.Throwable th) {
            u3 = android.support.v4.media.session.b.u(th);
        }
        return (a0.InterfaceC0220C) (u3 instanceof L1.g ? null : u3);
    }
}
