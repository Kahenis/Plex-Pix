package G2;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1077a = {90, -93, 28, 119, -23, 66, 11, -44};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1078b = {61, -53, 105, 40, -116, 5, 105, -112, 51, -16, 42, 39, -40, 44, 50, -83, 14, -107, 111, 26, -109, 49, 67, -27, 34, -50, 88, 54, -84, 9, 62, -70, 110, -21, 46, 47, -100, 23, 92, -19};

    public static final org.json.JSONArray a(org.json.JSONObject jSONObject, java.lang.String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return new org.json.JSONArray();
        }
        java.lang.Object opt = jSONObject.opt(str);
        if (opt instanceof org.json.JSONArray) {
            return (org.json.JSONArray) opt;
        }
        if (!(opt instanceof org.json.JSONObject)) {
            return new org.json.JSONArray();
        }
        org.json.JSONArray put = new org.json.JSONArray().put(opt);
        Y1.j.d("put(...)", put);
        return put;
    }

    public static final java.util.ArrayList b(org.json.JSONArray jSONArray) {
        d2.C0376d Y2 = android.support.v4.media.session.b.Y(0, jSONArray.length());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = Y2.iterator();
        while (((d2.C0375c) it).f4848k) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(((d2.C0375c) it).a());
            if (optJSONObject != null) {
                arrayList.add(optJSONObject);
            }
        }
        return arrayList;
    }

    public static boolean c(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList d3 = d(str);
        java.util.ArrayList d4 = d(str2);
        int max = java.lang.Math.max(d3.size(), d4.size());
        int i3 = 0;
        while (i3 < max) {
            int intValue = ((java.lang.Number) ((i3 < 0 || i3 > M1.l.O(d3)) ? 0 : d3.get(i3))).intValue();
            int intValue2 = ((java.lang.Number) ((i3 < 0 || i3 > M1.l.O(d4)) ? 0 : d4.get(i3))).intValue();
            if (intValue != intValue2) {
                return intValue > intValue2;
            }
            i3++;
        }
        return false;
    }

    public static java.util.ArrayList d(java.lang.String str) {
        java.util.List<java.lang.String> B02 = g2.AbstractC0440e.B0(e(str), new char[]{'.', '-', '_'});
        java.util.ArrayList arrayList = new java.util.ArrayList(M1.m.S(B02));
        for (java.lang.String str2 : B02) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int length = str2.length();
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = str2.charAt(i4);
                if (java.lang.Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            java.lang.String sb2 = sb.toString();
            Y1.j.d("toString(...)", sb2);
            java.lang.Integer e02 = g2.AbstractC0447l.e0(sb2);
            if (e02 != null) {
                i3 = e02.intValue();
            }
            arrayList.add(java.lang.Integer.valueOf(i3));
        }
        return arrayList;
    }

    public static java.lang.String e(java.lang.String str) {
        return g2.AbstractC0440e.z0(g2.AbstractC0440e.z0(g2.AbstractC0440e.G0(str).toString(), "v"), "V");
    }
}
