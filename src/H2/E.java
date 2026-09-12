package H2;

/* loaded from: classes.dex */
public final class E extends Y1.k implements X1.c {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1446j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(float f3) {
        super(1);
        this.f1446j = f3;
    }

    @Override // X1.c
    public final java.lang.Object invoke(java.lang.Object obj) {
        long j3;
        c0.InterfaceC0346d interfaceC0346d = (c0.InterfaceC0346d) obj;
        Y1.j.e("$this$Canvas", interfaceC0346d);
        long c3 = a0.H.c(4279899922L);
        long c4 = a0.H.c(4278913805L);
        long c5 = a0.H.c(4281215524L);
        long j4 = H2.s1.f1896h;
        long b3 = a0.H.b(1726530922);
        float d3 = Z.f.d(interfaceC0346d.b());
        float b4 = Z.f.b(interfaceC0346d.b());
        float f3 = 8;
        long j5 = j4;
        c0.InterfaceC0346d.i(interfaceC0346d, c3, 0L, 0L, y2.d.a(interfaceC0346d.r(f3), interfaceC0346d.r(f3)), null, 246);
        float f4 = (float) 1.5d;
        float f5 = f4;
        float f6 = f3;
        c0.InterfaceC0346d.i(interfaceC0346d, b3, 0L, 0L, y2.d.a(interfaceC0346d.r(f3), interfaceC0346d.r(f3)), new c0.g(0, 0, interfaceC0346d.r(f4), 0.0f, 30), 230);
        float f7 = 7;
        float r3 = interfaceC0346d.r(f7);
        float f8 = 5;
        float r4 = interfaceC0346d.r(f8);
        int i3 = 16;
        float f9 = 16;
        float r5 = ((d3 - interfaceC0346d.r(f9)) - (f9 * r3)) / 15;
        int i4 = 0;
        while (i4 < i3) {
            float r6 = ((r3 + r5) * i4) + interfaceC0346d.r(f6);
            long c6 = a.AbstractC0217a.c(r6, interfaceC0346d.r(f8));
            long d4 = y2.d.d(r3, r4);
            float f10 = f5;
            float r7 = interfaceC0346d.r(f10);
            int i5 = i4;
            float f11 = r4;
            float f12 = f6;
            float f13 = f8;
            float f14 = f7;
            float f15 = r3;
            c0.InterfaceC0346d.i(interfaceC0346d, c4, c6, d4, y2.d.a(r7, r7), null, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
            long c7 = a.AbstractC0217a.c(r6, (b4 - interfaceC0346d.r(f13)) - f11);
            long d5 = y2.d.d(f15, f11);
            float r8 = interfaceC0346d.r(f10);
            c0.InterfaceC0346d.i(interfaceC0346d, c4, c7, d5, y2.d.a(r8, r8), null, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
            i4 = i5 + 1;
            f8 = f13;
            r3 = f15;
            i3 = i3;
            f6 = f12;
            f7 = f14;
            r4 = f11;
            f5 = f10;
        }
        float f16 = f6;
        float f17 = f7;
        float r9 = interfaceC0346d.r(10);
        float r10 = interfaceC0346d.r(14);
        float r11 = b4 - interfaceC0346d.r(28);
        float r12 = interfaceC0346d.r(3);
        float f18 = 2;
        float f19 = ((d3 - (r9 * f18)) - (r12 * f17)) / f16;
        float f20 = this.f1446j * f16;
        int i6 = 0;
        int i7 = 8;
        while (i6 < i7) {
            float f21 = i6;
            float f22 = ((f19 + r12) * f21) + r9;
            long c8 = a.AbstractC0217a.c(f22, r10);
            long d6 = y2.d.d(f19, r11);
            float r13 = interfaceC0346d.r(f18);
            int i8 = i7;
            int i9 = i6;
            float f23 = f19;
            float f24 = r9;
            float f25 = f18;
            c0.InterfaceC0346d.i(interfaceC0346d, c5, c8, d6, y2.d.a(r13, r13), null, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
            float j6 = android.support.v4.media.session.b.j(f20 - f21, 0.0f, 1.0f);
            if (j6 > 0.0f) {
                long j7 = j5;
                long b5 = a0.C0238s.b(j7, (0.45f * j6) + 0.55f);
                long c9 = a.AbstractC0217a.c(f22, r10);
                long d7 = y2.d.d(j6 * f23, r11);
                float r14 = interfaceC0346d.r(f25);
                j3 = j7;
                c0.InterfaceC0346d.i(interfaceC0346d, b5, c9, d7, y2.d.a(r14, r14), null, androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
            } else {
                j3 = j5;
            }
            i6 = i9 + 1;
            f18 = f25;
            i7 = i8;
            f19 = f23;
            j5 = j3;
            r9 = f24;
        }
        return L1.k.f2619a;
    }
}
