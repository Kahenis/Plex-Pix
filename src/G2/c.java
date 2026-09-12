package G2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f1089a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f1090b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1091c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f1092d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f1093e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f1094f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1095g;

    public c(java.lang.String str, java.lang.String str2, int i3, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, int i4) {
        str4 = (i4 & 16) != 0 ? null : str4;
        str5 = (i4 & 32) != 0 ? null : str5;
        z = (i4 & 64) != 0 ? false : z;
        Y1.j.e(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_ID, str);
        Y1.j.e("title", str2);
        this.f1089a = str;
        this.f1090b = str2;
        this.f1091c = i3;
        this.f1092d = str3;
        this.f1093e = str4;
        this.f1094f = str5;
        this.f1095g = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2.c)) {
            return false;
        }
        G2.c cVar = (G2.c) obj;
        return Y1.j.a(this.f1089a, cVar.f1089a) && Y1.j.a(this.f1090b, cVar.f1090b) && this.f1091c == cVar.f1091c && Y1.j.a(this.f1092d, cVar.f1092d) && Y1.j.a(this.f1093e, cVar.f1093e) && Y1.j.a(this.f1094f, cVar.f1094f) && this.f1095g == cVar.f1095g;
    }

    public final int hashCode() {
        int b3 = B.n.b(this.f1091c, B.n.c(this.f1089a.hashCode() * 31, 31, this.f1090b), 31);
        java.lang.String str = this.f1092d;
        int hashCode = (b3 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f1093e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f1094f;
        return java.lang.Boolean.hashCode(this.f1095g) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return "PhotoFolder(id=" + this.f1089a + ", title=" + this.f1090b + ", count=" + this.f1091c + ", thumb=" + this.f1092d + ", ratingKey=" + this.f1093e + ", libraryTitle=" + this.f1094f + ", demo=" + this.f1095g + ")";
    }
}
