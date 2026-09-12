package G2;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f1123a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f1124b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f1125c;

    public j(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f1123a = str;
        this.f1124b = str2;
        this.f1125c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2.j)) {
            return false;
        }
        G2.j jVar = (G2.j) obj;
        return Y1.j.a(this.f1123a, jVar.f1123a) && Y1.j.a(this.f1124b, jVar.f1124b) && Y1.j.a(this.f1125c, jVar.f1125c);
    }

    public final int hashCode() {
        return this.f1125c.hashCode() + B.n.c(this.f1123a.hashCode() * 31, 31, this.f1124b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlexUser(id=");
        sb.append(this.f1123a);
        sb.append(", username=");
        sb.append(this.f1124b);
        sb.append(", title=");
        return B.n.n(sb, this.f1125c, ")");
    }
}
