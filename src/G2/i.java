package G2;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f1118a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f1119b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f1120c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f1121d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1122e;

    public i(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        Y1.j.e("name", str);
        Y1.j.e("machineId", str2);
        Y1.j.e("accessToken", str3);
        Y1.j.e("uri", str4);
        this.f1118a = str;
        this.f1119b = str2;
        this.f1120c = str3;
        this.f1121d = str4;
        this.f1122e = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2.i)) {
            return false;
        }
        G2.i iVar = (G2.i) obj;
        return Y1.j.a(this.f1118a, iVar.f1118a) && Y1.j.a(this.f1119b, iVar.f1119b) && Y1.j.a(this.f1120c, iVar.f1120c) && Y1.j.a(this.f1121d, iVar.f1121d) && this.f1122e == iVar.f1122e;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f1122e) + B.n.c(B.n.c(B.n.c(this.f1118a.hashCode() * 31, 31, this.f1119b), 31, this.f1120c), 31, this.f1121d);
    }

    public final java.lang.String toString() {
        return "PlexServer(name=" + this.f1118a + ", machineId=" + this.f1119b + ", accessToken=" + this.f1120c + ", uri=" + this.f1121d + ", owned=" + this.f1122e + ")";
    }
}
