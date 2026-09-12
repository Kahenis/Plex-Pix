package G2;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.SharedPreferences f1130a;

    public l(android.content.Context context) {
        Y1.j.e("context", context);
        this.f1130a = context.getSharedPreferences("plexpix", 0);
    }

    public final java.lang.String a() {
        android.content.SharedPreferences sharedPreferences = this.f1130a;
        java.lang.String string = sharedPreferences.getString("clientId", null);
        if (string != null && !g2.AbstractC0448m.i0(string)) {
            return string;
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        Y1.j.d("toString(...)", uuid);
        sharedPreferences.edit().putString("clientId", uuid).apply();
        return uuid;
    }

    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Y1.j.e("token", str);
        Y1.j.e("serverUri", str2);
        Y1.j.e("serverToken", str3);
        Y1.j.e("serverName", str4);
        Y1.j.e("userTitle", str5);
        this.f1130a.edit().putString("authToken", str).putString("serverUri", str2).putString("serverToken", str3).putString("serverName", str4).putString("userTitle", str5).apply();
    }
}
