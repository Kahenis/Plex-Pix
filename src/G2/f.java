package G2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f1108a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1109b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1110c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1111d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1112e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1113f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1114g;

    public f(java.lang.String str, boolean z, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f1108a = str;
        this.f1109b = z;
        this.f1110c = z3;
        this.f1111d = z4;
        this.f1112e = z5;
        this.f1113f = z6;
        this.f1114g = z7;
    }

    public static G2.f a(G2.f fVar, java.lang.String str, boolean z, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i3) {
        java.lang.String str2 = (i3 & 1) != 0 ? fVar.f1108a : str;
        boolean z8 = (i3 & 2) != 0 ? fVar.f1109b : z;
        boolean z9 = (i3 & 4) != 0 ? fVar.f1110c : z3;
        boolean z10 = (i3 & 8) != 0 ? fVar.f1111d : z4;
        boolean z11 = (i3 & 16) != 0 ? fVar.f1112e : z5;
        boolean z12 = (i3 & 32) != 0 ? fVar.f1113f : z6;
        boolean z13 = (i3 & 64) != 0 ? fVar.f1114g : z7;
        fVar.getClass();
        Y1.j.e("thumbSize", str2);
        return new G2.f(str2, z8, z9, z10, z11, z12, z13);
    }

    public final java.lang.String b() {
        return this.f1108a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2.f)) {
            return false;
        }
        G2.f fVar = (G2.f) obj;
        return Y1.j.a(this.f1108a, fVar.f1108a) && this.f1109b == fVar.f1109b && this.f1110c == fVar.f1110c && this.f1111d == fVar.f1111d && this.f1112e == fVar.f1112e && this.f1113f == fVar.f1113f && this.f1114g == fVar.f1114g;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f1114g) + q.AbstractC0731s.a(q.AbstractC0731s.a(q.AbstractC0731s.a(q.AbstractC0731s.a(q.AbstractC0731s.a(this.f1108a.hashCode() * 31, 31, this.f1109b), 31, this.f1110c), 31, this.f1111d), 31, this.f1112e), 31, this.f1113f);
    }

    public final java.lang.String toString() {
        return "PixSettings(thumbSize=" + this.f1108a + ", videoFullscreen=" + this.f1109b + ", cloisteredNav=" + this.f1110c + ", chainPlay=" + this.f1111d + ", keepOnResize=" + this.f1112e + ", optimizedNav=" + this.f1113f + ", updateBeta=" + this.f1114g + ")";
    }
}
