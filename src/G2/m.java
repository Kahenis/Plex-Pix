package G2;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final q2.u f1131a;

    public m() {
        q2.t tVar = new q2.t();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        Y1.j.e("unit", timeUnit);
        tVar.f7411r = r2.b.b(15L, timeUnit);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MINUTES;
        Y1.j.e("unit", timeUnit2);
        tVar.s = r2.b.b(5L, timeUnit2);
        tVar.f7401h = true;
        tVar.f7402i = true;
        this.f1131a = new q2.u(tVar);
    }

    public final G2.k a(boolean z) {
        java.lang.String b3;
        java.lang.CharSequence charSequence;
        org.json.JSONObject jSONObject;
        java.lang.String b4 = (z || (b3 = b("https://api.github.com/repos/Kahenis/Plex-Pix/releases/latest", null)) == null) ? b("https://api.github.com/repos/Kahenis/Plex-Pix/releases", null) : b3;
        if (b4 == null) {
            return null;
        }
        int length = b4.length();
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                charSequence = "";
                break;
            }
            if (!a.AbstractC0217a.S(b4.charAt(i3))) {
                charSequence = b4.subSequence(i3, b4.length());
                break;
            }
            i3++;
        }
        java.lang.String obj = charSequence.toString();
        if (g2.AbstractC0448m.m0(obj, "[", false)) {
            org.json.JSONArray jSONArray = new org.json.JSONArray(obj);
            if (jSONArray.length() == 0) {
                return null;
            }
            int length2 = jSONArray.length();
            java.lang.String str = "0";
            jSONObject = null;
            for (int i4 = 0; i4 < length2; i4++) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                if (!jSONObject2.optBoolean("draft", false) && (z || !jSONObject2.optBoolean("prerelease", false))) {
                    java.lang.String optString = jSONObject2.optString("tag_name");
                    Y1.j.d("optString(...)", optString);
                    java.lang.String e3 = G2.a.e(optString);
                    if (jSONObject == null || G2.a.c(e3, str)) {
                        jSONObject = jSONObject2;
                        str = e3;
                    }
                }
            }
            if (jSONObject == null) {
                return null;
            }
        } else {
            jSONObject = new org.json.JSONObject(obj);
        }
        java.lang.String optString2 = jSONObject.optString("tag_name");
        Y1.j.d("optString(...)", optString2);
        java.lang.String e4 = G2.a.e(optString2);
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("assets");
        if (optJSONArray == null) {
            return null;
        }
        int length3 = optJSONArray.length();
        long j3 = 0;
        java.lang.String str2 = null;
        for (int i5 = 0; i5 < length3; i5++) {
            org.json.JSONObject jSONObject3 = optJSONArray.getJSONObject(i5);
            java.lang.String optString3 = jSONObject3.optString("name");
            Y1.j.b(optString3);
            if (g2.AbstractC0448m.g0(optString3, ".apk", true)) {
                str2 = jSONObject3.optString("browser_download_url");
                j3 = jSONObject3.optLong("size");
                if (g2.AbstractC0440e.n0(optString3, "Plex-Pix", true)) {
                    break;
                }
            }
        }
        long j4 = j3;
        java.lang.String str3 = str2;
        if (str3 == null || g2.AbstractC0448m.i0(str3)) {
            return null;
        }
        return new G2.k(e4, str3, j4, false);
    }

    public final java.lang.String b(java.lang.String str, java.lang.String str2) {
        I.A a3 = new I.A();
        a3.m(str);
        a3.j("User-Agent", "Plex-Pix/1.3.13");
        a3.j("Accept", "application/vnd.github+json");
        if (str2 != null && !g2.AbstractC0448m.i0(str2)) {
            a3.j("Authorization", "Bearer ".concat(str2));
        }
        q2.z e3 = this.f1131a.a(a3.f()).e();
        try {
            q1.n nVar = e3.f7468o;
            java.lang.String t3 = nVar != null ? nVar.t() : null;
            if (t3 == null) {
                t3 = "";
            }
            int i3 = e3.f7465l;
            if (i3 == 404) {
                a.AbstractC0217a.x(e3, null);
                return null;
            }
            if (i3 == 401 || i3 == 403) {
                a.AbstractC0217a.x(e3, null);
                return null;
            }
            if (e3.r()) {
                if (g2.AbstractC0448m.i0(t3)) {
                    t3 = null;
                }
                a.AbstractC0217a.x(e3, null);
                return t3;
            }
            throw new java.lang.IllegalStateException("Impossible de joindre GitHub (" + i3 + ").");
        } finally {
        }
    }
}
