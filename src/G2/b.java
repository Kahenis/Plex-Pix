package G2;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f1079a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f1080b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f1081c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f1082d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f1083e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f1084f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Long f1085g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f1086h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f1087i;

    /* renamed from: j, reason: collision with root package name */
    public final G2.d f1088j;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Long l3, java.lang.String str7, java.lang.String str8, G2.d dVar) {
        Y1.j.e(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_ID, str);
        Y1.j.e("title", str2);
        Y1.j.e("kind", str3);
        Y1.j.e("thumb", str4);
        this.f1079a = str;
        this.f1080b = str2;
        this.f1081c = str3;
        this.f1082d = str4;
        this.f1083e = str5;
        this.f1084f = str6;
        this.f1085g = l3;
        this.f1086h = str7;
        this.f1087i = str8;
        this.f1088j = dVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2.b)) {
            return false;
        }
        G2.b bVar = (G2.b) obj;
        return Y1.j.a(this.f1079a, bVar.f1079a) && Y1.j.a(this.f1080b, bVar.f1080b) && Y1.j.a(this.f1081c, bVar.f1081c) && Y1.j.a(this.f1082d, bVar.f1082d) && Y1.j.a(this.f1083e, bVar.f1083e) && Y1.j.a(this.f1084f, bVar.f1084f) && Y1.j.a(this.f1085g, bVar.f1085g) && Y1.j.a(this.f1086h, bVar.f1086h) && Y1.j.a(this.f1087i, bVar.f1087i) && Y1.j.a(this.f1088j, bVar.f1088j);
    }

    public final int hashCode() {
        int c3 = B.n.c(B.n.c(B.n.c(this.f1079a.hashCode() * 31, 31, this.f1080b), 31, this.f1081c), 31, this.f1082d);
        java.lang.String str = this.f1083e;
        int hashCode = (c3 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f1084f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Long l3 = this.f1085g;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        java.lang.String str3 = this.f1086h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f1087i;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        G2.d dVar = this.f1088j;
        return hashCode5 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "MediaItem(id=" + this.f1079a + ", title=" + this.f1080b + ", kind=" + this.f1081c + ", thumb=" + this.f1082d + ", partKey=" + this.f1083e + ", takenAt=" + this.f1084f + ", durationMs=" + this.f1085g + ", videoCodec=" + this.f1086h + ", demoSrc=" + this.f1087i + ", meta=" + this.f1088j + ")";
    }

    public /* synthetic */ b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Long l3, java.lang.String str7, java.lang.String str8, G2.d dVar, int i3) {
        this(str, str2, str3, str4, (i3 & 16) != 0 ? null : str5, (i3 & 32) != 0 ? null : str6, (i3 & 64) != 0 ? null : l3, (i3 & 128) != 0 ? null : str7, (i3 & 256) != 0 ? null : str8, (i3 & 512) != 0 ? null : dVar);
    }
}
