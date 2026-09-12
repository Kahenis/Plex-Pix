package G2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f1096a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f1097b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f1098c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Long f1099d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f1100e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f1101f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f1102g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f1103h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f1104i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Long f1105j;

    public d(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.Long l3, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Long l4) {
        this.f1096a = str;
        this.f1097b = num;
        this.f1098c = num2;
        this.f1099d = l3;
        this.f1100e = str2;
        this.f1101f = str3;
        this.f1102g = str4;
        this.f1103h = str5;
        this.f1104i = str6;
        this.f1105j = l4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2.d)) {
            return false;
        }
        G2.d dVar = (G2.d) obj;
        return Y1.j.a(this.f1096a, dVar.f1096a) && Y1.j.a(this.f1097b, dVar.f1097b) && Y1.j.a(this.f1098c, dVar.f1098c) && Y1.j.a(this.f1099d, dVar.f1099d) && Y1.j.a(this.f1100e, dVar.f1100e) && Y1.j.a(this.f1101f, dVar.f1101f) && Y1.j.a(this.f1102g, dVar.f1102g) && Y1.j.a(this.f1103h, dVar.f1103h) && Y1.j.a(this.f1104i, dVar.f1104i) && Y1.j.a(this.f1105j, dVar.f1105j);
    }

    public final int hashCode() {
        java.lang.String str = this.f1096a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Integer num = this.f1097b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f1098c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Long l3 = this.f1099d;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        java.lang.String str2 = this.f1100e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f1101f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f1102g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f1103h;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f1104i;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.Long l4 = this.f1105j;
        return hashCode9 + (l4 != null ? l4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "PhotoMeta(format=" + this.f1096a + ", width=" + this.f1097b + ", height=" + this.f1098c + ", bytes=" + this.f1099d + ", camera=" + this.f1100e + ", lens=" + this.f1101f + ", location=" + this.f1102g + ", takenAt=" + this.f1103h + ", fileName=" + this.f1104i + ", durationMs=" + this.f1105j + ")";
    }
}
