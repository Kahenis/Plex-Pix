package G2;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f1126a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f1127b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1128c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1129d;

    public k(java.lang.String str, java.lang.String str2, long j3, boolean z) {
        Y1.j.e("apkUrl", str2);
        this.f1126a = str;
        this.f1127b = str2;
        this.f1128c = j3;
        this.f1129d = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2.k)) {
            return false;
        }
        G2.k kVar = (G2.k) obj;
        return Y1.j.a(this.f1126a, kVar.f1126a) && Y1.j.a(this.f1127b, kVar.f1127b) && this.f1128c == kVar.f1128c && this.f1129d == kVar.f1129d;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f1129d) + B.n.d(B.n.c(this.f1126a.hashCode() * 31, 31, this.f1127b), this.f1128c, 31);
    }

    public final java.lang.String toString() {
        return "RemoteRelease(version=" + this.f1126a + ", apkUrl=" + this.f1127b + ", sizeBytes=" + this.f1128c + ", authed=" + this.f1129d + ")";
    }
}
