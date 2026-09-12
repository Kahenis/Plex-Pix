package G2;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f1106a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f1107b;

    public e(int i3, java.lang.String str) {
        this.f1106a = i3;
        this.f1107b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G2.e)) {
            return false;
        }
        G2.e eVar = (G2.e) obj;
        return this.f1106a == eVar.f1106a && Y1.j.a(this.f1107b, eVar.f1107b);
    }

    public final int hashCode() {
        return this.f1107b.hashCode() + (java.lang.Integer.hashCode(this.f1106a) * 31);
    }

    public final java.lang.String toString() {
        return "PinState(id=" + this.f1106a + ", code=" + this.f1107b + ")";
    }
}
