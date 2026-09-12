package G2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f1115a;

    /* renamed from: b, reason: collision with root package name */
    public final q2.u f1116b;

    /* renamed from: c, reason: collision with root package name */
    public final q2.u f1117c;

    public h(java.lang.String str) {
        Y1.j.e("clientId", str);
        this.f1115a = str;
        G2.g gVar = new G2.g();
        q2.t tVar = new q2.t();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        Y1.j.e("unit", timeUnit);
        tVar.f7411r = r2.b.b(12L, timeUnit);
        tVar.s = r2.b.b(20L, timeUnit);
        tVar.f7401h = true;
        tVar.f7409p = gVar;
        this.f1116b = new q2.u(tVar);
        q2.t tVar2 = new q2.t();
        tVar2.f7411r = r2.b.b(4L, timeUnit);
        tVar2.s = r2.b.b(4L, timeUnit);
        tVar2.f7401h = true;
        tVar2.f7409p = gVar;
        this.f1117c = new q2.u(tVar2);
    }

    public static java.lang.String d(G2.i iVar, java.lang.String str, int i3) {
        Y1.j.e("server", iVar);
        Y1.j.e("path", str);
        java.lang.String encode = java.net.URLEncoder.encode(str, "UTF-8");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(iVar.f1121d);
        sb.append("/photo/:/transcode?width=");
        sb.append(i3);
        sb.append("&height=");
        B.n.v(sb, i3, "&minSize=1&upscale=1&url=", encode, "&X-Plex-Token=");
        sb.append(iVar.f1120c);
        return sb.toString();
    }

    public static java.util.ArrayList e(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("MediaContainer");
        if (optJSONObject != null) {
            jSONObject = optJSONObject;
        }
        java.util.List P2 = M1.l.P("Directory", "Metadata", "Photo", "Video");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = P2.iterator();
        while (it.hasNext()) {
            M1.q.V(arrayList, G2.a.b(G2.a.a(jSONObject, (java.lang.String) it.next())));
        }
        return arrayList;
    }

    public static java.lang.String f(org.json.JSONObject jSONObject, java.lang.String... strArr) {
        java.lang.String obj;
        int length = strArr.length;
        int i3 = 0;
        while (true) {
            java.lang.String str = null;
            if (i3 >= length) {
                return null;
            }
            java.lang.String str2 = strArr[i3];
            if (jSONObject.has(str2) && !jSONObject.isNull(str2)) {
                java.lang.Object opt = jSONObject.opt(str2);
                if (opt != null && (obj = opt.toString()) != null) {
                    str = g2.AbstractC0440e.G0(obj).toString();
                }
                if (str == null) {
                    str = "";
                }
                if ((!g2.AbstractC0448m.i0(str)) && !str.equals("null")) {
                    return str;
                }
            }
            i3++;
        }
    }

    public static final void i(G2.h hVar, java.util.LinkedHashSet linkedHashSet, java.util.ArrayList arrayList, org.json.JSONObject jSONObject) {
        G2.b p3 = hVar.p(jSONObject);
        if (p3 != null && linkedHashSet.add(p3.f1079a)) {
            arrayList.add(p3);
        }
    }

    public static java.lang.String o(G2.h hVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3) {
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        if ((i3 & 4) != 0) {
            str3 = "GET";
        }
        hVar.getClass();
        if (str2 != null && !g2.AbstractC0448m.i0(str2)) {
            str = s(str, str2);
        }
        I.A a3 = new I.A();
        a3.m(str);
        for (java.util.Map.Entry entry : hVar.c(str2).entrySet()) {
            a3.j((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        boolean a4 = Y1.j.a(str3, "POST");
        java.lang.String str4 = "";
        if (a4) {
            java.util.regex.Pattern pattern = q2.s.f7390c;
            q2.s f3 = q2.r.f("application/json");
            java.nio.charset.Charset charset = g2.AbstractC0436a.f5192a;
            java.nio.charset.Charset a5 = f3.a(null);
            if (a5 == null) {
                java.lang.String str5 = f3 + "; charset=utf-8";
                Y1.j.e("<this>", str5);
                try {
                    f3 = q2.r.f(str5);
                } catch (java.lang.IllegalArgumentException unused) {
                    f3 = null;
                }
            } else {
                charset = a5;
            }
            byte[] bytes = "".getBytes(charset);
            Y1.j.d("this as java.lang.String).getBytes(charset)", bytes);
            int length = bytes.length;
            r2.b.c(bytes.length, 0, length);
            a3.k("POST", new q2.x(f3, length, bytes, 0));
        }
        q2.z e3 = hVar.f1116b.a(a3.f()).e();
        try {
            q1.n nVar = e3.f7468o;
            java.lang.String t3 = nVar != null ? nVar.t() : null;
            if (t3 != null) {
                str4 = t3;
            }
            if (e3.r()) {
                a.AbstractC0217a.x(e3, null);
                return str4;
            }
            int i4 = e3.f7465l;
            if (i4 == 401) {
                throw new java.lang.IllegalStateException("Accès Plex refusé. Restez sur le Wi-Fi du serveur, ou activez l’accès distant dans Plex.");
            }
            throw new java.lang.IllegalStateException("Plex " + i4 + ": " + g2.AbstractC0440e.F0(160, str4));
        } finally {
        }
    }

    public static final java.lang.String q(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, G2.h hVar, java.lang.String... strArr) {
        java.util.Iterator it = M1.l.Q(jSONObject, jSONObject2, jSONObject3).iterator();
        while (it.hasNext()) {
            org.json.JSONObject jSONObject4 = (org.json.JSONObject) it.next();
            java.lang.String[] strArr2 = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
            hVar.getClass();
            java.lang.String f3 = f(jSONObject4, strArr2);
            if (f3 != null) {
                return f3;
            }
        }
        return null;
    }

    public static final java.lang.Double r(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, java.lang.String... strArr) {
        java.util.Iterator it = M1.l.Q(jSONObject, jSONObject2, jSONObject3).iterator();
        while (it.hasNext()) {
            org.json.JSONObject jSONObject4 = (org.json.JSONObject) it.next();
            for (java.lang.String str : strArr) {
                if (jSONObject4.has(str) && !jSONObject4.isNull(str)) {
                    double optDouble = jSONObject4.optDouble(str);
                    if (!java.lang.Double.isNaN(optDouble)) {
                        return java.lang.Double.valueOf(optDouble);
                    }
                }
            }
        }
        return null;
    }

    public static java.lang.String s(java.lang.String str, java.lang.String str2) {
        java.lang.String encode = java.net.URLEncoder.encode(str2, "UTF-8");
        if (g2.AbstractC0440e.n0(str, "X-Plex-Token=", false)) {
            return str;
        }
        return str + (g2.AbstractC0440e.n0(str, "?", false) ? "&" : "?") + "X-Plex-Token=" + encode;
    }

    public final G2.e a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject(o(this, "https://plex.tv/api/v2/pins", null, "POST", 2));
        int i3 = jSONObject.getInt(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_ID);
        java.lang.String string = jSONObject.getString("code");
        Y1.j.d("getString(...)", string);
        return new G2.e(i3, string);
    }

    public final G2.j b(java.lang.String str) {
        Y1.j.e("token", str);
        org.json.JSONObject jSONObject = new org.json.JSONObject(o(this, "https://plex.tv/api/v2/user", str, null, 4));
        java.lang.String optString = jSONObject.optString("title");
        if (g2.AbstractC0448m.i0(optString)) {
            optString = jSONObject.optString("username", "Plex");
        }
        java.lang.String optString2 = jSONObject.optString(androidx.media3.extractor.text.ttml.TtmlNode.ATTR_ID, "user");
        Y1.j.d("optString(...)", optString2);
        java.lang.String optString3 = jSONObject.optString("username", optString);
        Y1.j.d("optString(...)", optString3);
        Y1.j.b(optString);
        return new G2.j(optString2, optString3, optString);
    }

    public final java.util.LinkedHashMap c(java.lang.String str) {
        L1.f[] fVarArr = {new L1.f("Accept", "application/json"), new L1.f("X-Plex-Product", "Plex-Pix"), new L1.f("X-Plex-Version", tv.plexpix.app.BuildConfig.VERSION_NAME), new L1.f("X-Plex-Client-Identifier", this.f1115a), new L1.f("X-Plex-Platform", "Android TV"), new L1.f("X-Plex-Platform-Version", "14"), new L1.f("X-Plex-Device", "Android TV"), new L1.f("X-Plex-Device-Name", "Plex-Pix"), new L1.f("X-Plex-Provides", "client"), new L1.f("X-Plex-Language", "fr")};
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(M1.w.T(10));
        M1.w.V(linkedHashMap, fVarArr);
        if (str != null && !g2.AbstractC0448m.i0(str)) {
            linkedHashMap.put("X-Plex-Token", str);
        }
        return linkedHashMap;
    }

    public final java.util.ArrayList g(G2.i iVar, java.lang.String str) {
        Y1.j.e("server", iVar);
        try {
            return h(iVar);
        } catch (java.lang.Exception e3) {
            if (str == null || g2.AbstractC0448m.i0(str) || str.equals(iVar.f1120c)) {
                throw e3;
            }
            java.lang.String str2 = iVar.f1118a;
            Y1.j.e("name", str2);
            java.lang.String str3 = iVar.f1119b;
            Y1.j.e("machineId", str3);
            java.lang.String str4 = iVar.f1121d;
            Y1.j.e("uri", str4);
            return h(new G2.i(str2, str3, str, str4, iVar.f1122e));
        }
    }

    public final java.util.ArrayList h(G2.i iVar) {
        java.lang.String str;
        org.json.JSONObject l3 = l(iVar, "/library/sections");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = e(l3).iterator();
        while (it.hasNext()) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) it.next();
            if (Y1.j.a(jSONObject.optString("type"), "photo")) {
                java.lang.String optString = jSONObject.optString("key");
                Y1.j.b(optString);
                if (!g2.AbstractC0448m.i0(optString)) {
                    java.lang.String optString2 = jSONObject.optString("title", "Photos");
                    java.lang.String concat = "all:".concat(optString);
                    java.lang.String w3 = B.n.w("Toutes les photos · ", optString2);
                    int optInt = jSONObject.optInt("size");
                    java.lang.String optString3 = jSONObject.optString("composite");
                    java.util.Iterator it2 = it;
                    if (g2.AbstractC0448m.i0(optString3)) {
                        optString3 = jSONObject.optString("thumb");
                    }
                    if (g2.AbstractC0448m.i0(optString3)) {
                        optString3 = null;
                    }
                    java.lang.String str2 = "composite";
                    java.lang.String str3 = "thumb";
                    java.lang.String str4 = "size";
                    java.lang.String str5 = "title";
                    arrayList.add(new G2.c(concat, w3, optInt, optString3, optString, optString2, false, 64));
                    java.util.Iterator it3 = e(l(iVar, "/library/sections/" + optString + "/all")).iterator();
                    while (it3.hasNext()) {
                        org.json.JSONObject jSONObject2 = (org.json.JSONObject) it3.next();
                        java.lang.String optString4 = jSONObject2.optString("type");
                        boolean z = false;
                        boolean z3 = Y1.j.a(optString4, "photoalbum") || Y1.j.a(optString4, "album") || Y1.j.a(optString4, "folder");
                        if (Y1.j.a(optString4, "photo")) {
                            java.lang.String optString5 = jSONObject2.optString("key");
                            Y1.j.d("optString(...)", optString5);
                            if (g2.AbstractC0440e.n0(optString5, "/children", false)) {
                                z = true;
                            }
                        }
                        if (z3 || z) {
                            java.lang.String optString6 = jSONObject2.optString("ratingKey");
                            if (g2.AbstractC0448m.i0(optString6)) {
                                optString6 = jSONObject2.optString("key");
                            }
                            Y1.j.b(optString6);
                            if (!g2.AbstractC0448m.i0(optString6)) {
                                java.lang.String concat2 = "album:".concat(optString6);
                                java.lang.String str6 = str5;
                                java.lang.String optString7 = jSONObject2.optString(str6, "Album");
                                Y1.j.d("optString(...)", optString7);
                                java.lang.String str7 = str4;
                                int optInt2 = jSONObject2.optInt(str7);
                                java.lang.String str8 = str3;
                                java.lang.String optString8 = jSONObject2.optString(str8);
                                if (g2.AbstractC0448m.i0(optString8)) {
                                    str = str2;
                                    optString8 = jSONObject2.optString(str);
                                } else {
                                    str = str2;
                                }
                                arrayList.add(new G2.c(concat2, optString7, optInt2, g2.AbstractC0448m.i0(optString8) ? null : optString8, optString6, optString2, false, 64));
                                str5 = str6;
                                str4 = str7;
                                str3 = str8;
                                str2 = str;
                            }
                        }
                    }
                    it = it2;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList j(java.lang.String str) {
        org.json.JSONArray optJSONArray;
        boolean i02;
        boolean z;
        java.lang.String f3;
        org.json.JSONArray jSONArray;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object obj;
        java.lang.String optString;
        java.lang.String str4;
        java.lang.String obj2;
        java.lang.String obj3;
        Y1.j.e("token", str);
        java.lang.String str5 = null;
        java.lang.String o3 = o(this, "https://plex.tv/api/v2/resources?includeHttps=1&includeRelay=1", str, null, 4);
        if (g2.AbstractC0448m.m0(g2.AbstractC0440e.G0(o3).toString(), "[", false)) {
            optJSONArray = new org.json.JSONArray(o3);
        } else {
            optJSONArray = new org.json.JSONObject(o3).optJSONArray("resources");
            if (optJSONArray == null) {
                optJSONArray = new org.json.JSONArray();
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = optJSONArray.length();
        int i3 = 0;
        while (i3 < length) {
            org.json.JSONObject jSONObject = optJSONArray.getJSONObject(i3);
            java.lang.String optString2 = jSONObject.optString("provides");
            Y1.j.b(optString2);
            if (g2.AbstractC0440e.n0(optString2, "server", false) || Y1.j.a(jSONObject.optString("product"), "Plex Media Server")) {
                if (jSONObject.has("owned") && !jSONObject.isNull("owned")) {
                    java.lang.Object opt = jSONObject.opt("owned");
                    if (opt instanceof java.lang.Boolean) {
                        i02 = ((java.lang.Boolean) opt).booleanValue();
                    } else if (opt instanceof java.lang.Number) {
                        i02 = ((java.lang.Number) opt).intValue() != 0;
                    } else {
                        if (opt == null || (obj2 = opt.toString()) == null || (obj3 = g2.AbstractC0440e.G0(obj2).toString()) == null) {
                            str4 = str5;
                        } else {
                            str4 = obj3.toLowerCase(java.util.Locale.ROOT);
                            Y1.j.d("toLowerCase(...)", str4);
                        }
                        if (str4 == null) {
                            str4 = "";
                        }
                        if (str4.equals("true") || str4.equals(androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                            z = true;
                        } else if (str4.equals("false") || str4.equals("0") || str4.length() == 0) {
                            z = false;
                        }
                        f3 = f(jSONObject, "accessToken", "access_token");
                        if (f3 != null) {
                            java.util.List j02 = M1.k.j0(G2.a.b(G2.a.a(jSONObject, "connections")), new E2.h(1));
                            java.util.Iterator it = j02.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    jSONArray = optJSONArray;
                                    str2 = null;
                                    break;
                                }
                                java.lang.String optString3 = ((org.json.JSONObject) it.next()).optString("uri");
                                Y1.j.d("optString(...)", optString3);
                                jSONArray = optJSONArray;
                                str2 = g2.AbstractC0440e.H0(optString3, '/');
                                if (!g2.AbstractC0448m.i0(str2) && (m(str2, f3) || m(str2, str))) {
                                    break;
                                }
                                optJSONArray = jSONArray;
                            }
                            if (str2 == null) {
                                java.util.Iterator it2 = j02.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it2.next();
                                    Y1.j.d("optString(...)", ((org.json.JSONObject) obj).optString("uri"));
                                    if (!g2.AbstractC0448m.i0(r14)) {
                                        break;
                                    }
                                }
                                org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
                                str3 = (jSONObject2 == null || (optString = jSONObject2.optString("uri")) == null) ? null : g2.AbstractC0440e.H0(optString, '/');
                            } else {
                                str3 = str2;
                            }
                            if (str3 != null && !g2.AbstractC0448m.i0(str3)) {
                                java.lang.String optString4 = jSONObject.optString("name", "Plex Media Server");
                                Y1.j.d("optString(...)", optString4);
                                java.lang.String optString5 = jSONObject.optString("clientIdentifier", str3);
                                Y1.j.d("optString(...)", optString5);
                                arrayList.add(new G2.i(optString4, optString5, f3, str3, z));
                            }
                            i3++;
                            optJSONArray = jSONArray;
                            str5 = null;
                        }
                    }
                    z = i02;
                    f3 = f(jSONObject, "accessToken", "access_token");
                    if (f3 != null) {
                    }
                }
                java.lang.String optString6 = jSONObject.optString("sourceTitle");
                Y1.j.d("optString(...)", optString6);
                i02 = g2.AbstractC0448m.i0(optString6);
                z = i02;
                f3 = f(jSONObject, "accessToken", "access_token");
                if (f3 != null) {
                }
            }
            jSONArray = optJSONArray;
            i3++;
            optJSONArray = jSONArray;
            str5 = null;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final G2.d k(G2.i iVar, G2.b bVar) {
        java.lang.String str;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Integer num3;
        java.lang.Integer num4;
        java.lang.Long l3;
        java.lang.Long l4;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.Long l5;
        java.lang.Long l6;
        G2.b p3;
        Y1.j.e("server", iVar);
        Y1.j.e("item", bVar);
        org.json.JSONObject jSONObject = (org.json.JSONObject) M1.k.a0(e(l(iVar, "/library/metadata/" + bVar.f1079a)));
        G2.d dVar = (jSONObject == null || (p3 = p(jSONObject)) == null) ? null : p3.f1088j;
        G2.d dVar2 = bVar.f1088j;
        if (dVar == null) {
            return dVar2 == null ? new G2.d(null, null, null, null, null, null, null, null, null, null) : dVar2;
        }
        java.lang.String str12 = dVar.f1096a;
        if (str12 == null) {
            if (dVar2 == null) {
                str = null;
                num = dVar.f1097b;
                if (num == null) {
                    if (dVar2 == null) {
                        num2 = null;
                        num3 = dVar.f1098c;
                        if (num3 == null) {
                            if (dVar2 == null) {
                                num4 = null;
                                l3 = dVar.f1099d;
                                if (l3 == null) {
                                    if (dVar2 == null) {
                                        l4 = null;
                                        str2 = dVar.f1100e;
                                        if (str2 == null) {
                                            if (dVar2 == null) {
                                                str3 = null;
                                                str4 = dVar.f1101f;
                                                if (str4 == null) {
                                                    if (dVar2 == null) {
                                                        str5 = null;
                                                        str6 = dVar.f1102g;
                                                        if (str6 == null) {
                                                            if (dVar2 == null) {
                                                                str7 = null;
                                                                str8 = dVar.f1103h;
                                                                if (str8 == null) {
                                                                    if (dVar2 == null) {
                                                                        str9 = null;
                                                                        str10 = dVar.f1104i;
                                                                        if (str10 == null) {
                                                                            if (dVar2 == null) {
                                                                                str11 = null;
                                                                                l5 = dVar.f1105j;
                                                                                if (l5 != null) {
                                                                                    l6 = dVar2 != null ? dVar2.f1105j : null;
                                                                                } else {
                                                                                    l6 = l5;
                                                                                }
                                                                                return new G2.d(str, num2, num4, l4, str3, str5, str7, str9, str11, l6);
                                                                            }
                                                                            str10 = dVar2.f1104i;
                                                                        }
                                                                        str11 = str10;
                                                                        l5 = dVar.f1105j;
                                                                        if (l5 != null) {
                                                                        }
                                                                        return new G2.d(str, num2, num4, l4, str3, str5, str7, str9, str11, l6);
                                                                    }
                                                                    str8 = dVar2.f1103h;
                                                                }
                                                                str9 = str8;
                                                                str10 = dVar.f1104i;
                                                                if (str10 == null) {
                                                                }
                                                                str11 = str10;
                                                                l5 = dVar.f1105j;
                                                                if (l5 != null) {
                                                                }
                                                                return new G2.d(str, num2, num4, l4, str3, str5, str7, str9, str11, l6);
                                                            }
                                                            str6 = dVar2.f1102g;
                                                        }
                                                        str7 = str6;
                                                        str8 = dVar.f1103h;
                                                        if (str8 == null) {
                                                        }
                                                        str9 = str8;
                                                        str10 = dVar.f1104i;
                                                        if (str10 == null) {
                                                        }
                                                        str11 = str10;
                                                        l5 = dVar.f1105j;
                                                        if (l5 != null) {
                                                        }
                                                        return new G2.d(str, num2, num4, l4, str3, str5, str7, str9, str11, l6);
                                                    }
                                                    str4 = dVar2.f1101f;
                                                }
                                                str5 = str4;
                                                str6 = dVar.f1102g;
                                                if (str6 == null) {
                                                }
                                                str7 = str6;
                                                str8 = dVar.f1103h;
                                                if (str8 == null) {
                                                }
                                                str9 = str8;
                                                str10 = dVar.f1104i;
                                                if (str10 == null) {
                                                }
                                                str11 = str10;
                                                l5 = dVar.f1105j;
                                                if (l5 != null) {
                                                }
                                                return new G2.d(str, num2, num4, l4, str3, str5, str7, str9, str11, l6);
                                            }
                                            str2 = dVar2.f1100e;
                                        }
                                        str3 = str2;
                                        str4 = dVar.f1101f;
                                        if (str4 == null) {
                                        }
                                        str5 = str4;
                                        str6 = dVar.f1102g;
                                        if (str6 == null) {
                                        }
                                        str7 = str6;
                                        str8 = dVar.f1103h;
                                        if (str8 == null) {
                                        }
                                        str9 = str8;
                                        str10 = dVar.f1104i;
                                        if (str10 == null) {
                                        }
                                        str11 = str10;
                                        l5 = dVar.f1105j;
                                        if (l5 != null) {
                                        }
                                        return new G2.d(str, num2, num4, l4, str3, str5, str7, str9, str11, l6);
                                    }
                                    l3 = dVar2.f1099d;
                                }
                                l4 = l3;
                                str2 = dVar.f1100e;
                                if (str2 == null) {
                                }
                                str3 = str2;
                                str4 = dVar.f1101f;
                                if (str4 == null) {
                                }
                                str5 = str4;
                                str6 = dVar.f1102g;
                                if (str6 == null) {
                                }
                                str7 = str6;
                                str8 = dVar.f1103h;
                                if (str8 == null) {
                                }
                                str9 = str8;
                                str10 = dVar.f1104i;
                                if (str10 == null) {
                                }
                                str11 = str10;
                                l5 = dVar.f1105j;
                                if (l5 != null) {
                                }
                                return new G2.d(str, num2, num4, l4, str3, str5, str7, str9, str11, l6);
                            }
                            num3 = dVar2.f1098c;
                        }
                        num4 = num3;
                        l3 = dVar.f1099d;
                        if (l3 == null) {
                        }
                        l4 = l3;
                        str2 = dVar.f1100e;
                        if (str2 == null) {
                        }
                        str3 = str2;
                        str4 = dVar.f1101f;
                        if (str4 == null) {
                        }
                        str5 = str4;
                        str6 = dVar.f1102g;
                        if (str6 == null) {
                        }
                        str7 = str6;
                        str8 = dVar.f1103h;
                        if (str8 == null) {
                        }
                        str9 = str8;
                        str10 = dVar.f1104i;
                        if (str10 == null) {
                        }
                        str11 = str10;
                        l5 = dVar.f1105j;
                        if (l5 != null) {
                        }
                        return new G2.d(str, num2, num4, l4, str3, str5, str7, str9, str11, l6);
                    }
                    num = dVar2.f1097b;
                }
                num2 = num;
                num3 = dVar.f1098c;
                if (num3 == null) {
                }
                num4 = num3;
                l3 = dVar.f1099d;
                if (l3 == null) {
                }
                l4 = l3;
                str2 = dVar.f1100e;
                if (str2 == null) {
                }
                str3 = str2;
                str4 = dVar.f1101f;
                if (str4 == null) {
                }
                str5 = str4;
                str6 = dVar.f1102g;
                if (str6 == null) {
                }
                str7 = str6;
                str8 = dVar.f1103h;
                if (str8 == null) {
                }
                str9 = str8;
                str10 = dVar.f1104i;
                if (str10 == null) {
                }
                str11 = str10;
                l5 = dVar.f1105j;
                if (l5 != null) {
                }
                return new G2.d(str, num2, num4, l4, str3, str5, str7, str9, str11, l6);
            }
            str12 = dVar2.f1096a;
        }
        str = str12;
        num = dVar.f1097b;
        if (num == null) {
        }
        num2 = num;
        num3 = dVar.f1098c;
        if (num3 == null) {
        }
        num4 = num3;
        l3 = dVar.f1099d;
        if (l3 == null) {
        }
        l4 = l3;
        str2 = dVar.f1100e;
        if (str2 == null) {
        }
        str3 = str2;
        str4 = dVar.f1101f;
        if (str4 == null) {
        }
        str5 = str4;
        str6 = dVar.f1102g;
        if (str6 == null) {
        }
        str7 = str6;
        str8 = dVar.f1103h;
        if (str8 == null) {
        }
        str9 = str8;
        str10 = dVar.f1104i;
        if (str10 == null) {
        }
        str11 = str10;
        l5 = dVar.f1105j;
        if (l5 != null) {
        }
        return new G2.d(str, num2, num4, l4, str3, str5, str7, str9, str11, l6);
    }

    public final org.json.JSONObject l(G2.i iVar, java.lang.String str) {
        if (!g2.AbstractC0448m.m0(str, "/", false)) {
            str = "/".concat(str);
        }
        return new org.json.JSONObject(o(this, B.n.j(iVar.f1121d, str), iVar.f1120c, null, 4));
    }

    public final boolean m(java.lang.String str, java.lang.String str2) {
        try {
            I.A a3 = new I.A();
            a3.m(s(str + "/identity", str2));
            for (java.util.Map.Entry entry : c(str2).entrySet()) {
                a3.j((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            q2.z e3 = this.f1117c.a(a3.f()).e();
            try {
                boolean r3 = e3.r();
                a.AbstractC0217a.x(e3, null);
                return r3;
            } finally {
            }
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public final java.lang.String n(G2.i iVar, G2.b bVar) {
        Y1.j.e("server", iVar);
        Y1.j.e("item", bVar);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(iVar.f1121d);
        sb.append("/video/:/transcode/universal/start.mp4?path=/library/metadata/");
        java.lang.String str = bVar.f1079a;
        sb.append(str);
        sb.append("&mediaIndex=0&partIndex=0&protocol=http&fastSeek=1&copyts=1&directPlay=1&directStream=1&videoQuality=100&maxVideoBitrate=20000&session=ppx");
        sb.append(str);
        sb.append("copy&X-Plex-Platform=Android&X-Plex-Product=Plex-Pix&X-Plex-Client-Identifier=");
        sb.append(this.f1115a);
        sb.append("&X-Plex-Token=");
        sb.append(iVar.f1120c);
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02f6, code lost:
    
        if (r14 > 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01e8, code lost:
    
        if (r8 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0174, code lost:
    
        if (r12.equals("jpg") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0139, code lost:
    
        if (r12.equals("jpeg") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0187, code lost:
    
        r5 = "JPEG";
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02e6, code lost:
    
        if (r14 > 0) goto L158;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final G2.b p(org.json.JSONObject jSONObject) {
        java.lang.String optString;
        java.lang.String upperCase;
        java.lang.String str;
        java.lang.Double r3;
        java.lang.String q3;
        long optLong;
        java.lang.String optString2;
        java.lang.String str2;
        java.lang.String optString3;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.Long l3;
        org.json.JSONArray a3;
        java.lang.String optString4 = jSONObject.optString("type", "photo");
        Y1.j.d("optString(...)", optString4);
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String lowerCase = optString4.toLowerCase(locale);
        Y1.j.d("toLowerCase(...)", lowerCase);
        if (a.AbstractC0217a.a0("photoalbum", "album", "folder", "playlist").contains(lowerCase)) {
            return null;
        }
        if (lowerCase.equals("photo")) {
            java.lang.String optString5 = jSONObject.optString("key");
            Y1.j.d("optString(...)", optString5);
            if (g2.AbstractC0440e.n0(optString5, "/children", false)) {
                return null;
            }
        }
        org.json.JSONObject jSONObject2 = (org.json.JSONObject) M1.k.a0(G2.a.b(G2.a.a(jSONObject, "Media")));
        org.json.JSONObject jSONObject3 = (jSONObject2 == null || (a3 = G2.a.a(jSONObject2, "Part")) == null) ? null : (org.json.JSONObject) M1.k.a0(G2.a.b(a3));
        if (jSONObject2 == null || (optString = jSONObject2.optString(androidx.media3.extractor.text.ttml.TtmlNode.RUBY_CONTAINER)) == null) {
            optString = jSONObject3 != null ? jSONObject3.optString(androidx.media3.extractor.text.ttml.TtmlNode.RUBY_CONTAINER) : null;
            if (optString == null) {
                optString = "";
            }
        }
        java.lang.String lowerCase2 = optString.toLowerCase(locale);
        Y1.j.d("toLowerCase(...)", lowerCase2);
        java.lang.String optString6 = jSONObject2 != null ? jSONObject2.optString("videoCodec") : null;
        if (optString6 == null) {
            optString6 = "";
        }
        boolean z = a.AbstractC0217a.a0("clip", androidx.media3.common.MimeTypes.BASE_TYPE_VIDEO, "movie", "extra", "trailer").contains(lowerCase) || (g2.AbstractC0448m.i0(optString6) ^ true) || a.AbstractC0217a.a0("mp4", "m4v", "mov", "mkv", "avi", "webm", "mpegts", "ts").contains(lowerCase2);
        if (!z && !a.AbstractC0217a.a0("photo", "image", "picture").contains(lowerCase)) {
            return null;
        }
        java.lang.String optString7 = jSONObject.optString("ratingKey");
        if (g2.AbstractC0448m.i0(optString7)) {
            optString7 = jSONObject.optString("key");
        }
        Y1.j.b(optString7);
        if (g2.AbstractC0448m.i0(optString7)) {
            return null;
        }
        java.lang.String optString8 = jSONObject3 != null ? jSONObject3.optString("file") : null;
        if (optString8 == null) {
            optString8 = "";
        }
        java.lang.String D02 = g2.AbstractC0440e.D0(optString8, '/', optString8);
        switch (lowerCase2.hashCode()) {
            case 105441:
                break;
            case 108184:
                if (lowerCase2.equals("mkv")) {
                    upperCase = "MKV";
                    break;
                }
                upperCase = lowerCase2.toUpperCase(locale);
                Y1.j.d("toUpperCase(...)", upperCase);
                if (g2.AbstractC0448m.i0(upperCase)) {
                    upperCase = null;
                    break;
                }
                break;
            case 108273:
                if (lowerCase2.equals("mp4")) {
                    upperCase = "MP4";
                    break;
                }
                upperCase = lowerCase2.toUpperCase(locale);
                Y1.j.d("toUpperCase(...)", upperCase);
                if (g2.AbstractC0448m.i0(upperCase)) {
                }
                break;
            case 108308:
                if (lowerCase2.equals("mov")) {
                    upperCase = "MOV";
                    break;
                }
                upperCase = lowerCase2.toUpperCase(locale);
                Y1.j.d("toUpperCase(...)", upperCase);
                if (g2.AbstractC0448m.i0(upperCase)) {
                }
                break;
            case 111145:
                if (lowerCase2.equals("png")) {
                    upperCase = "PNG";
                    break;
                }
                upperCase = lowerCase2.toUpperCase(locale);
                Y1.j.d("toUpperCase(...)", upperCase);
                if (g2.AbstractC0448m.i0(upperCase)) {
                }
                break;
            case 3268712:
                break;
            default:
                upperCase = lowerCase2.toUpperCase(locale);
                Y1.j.d("toUpperCase(...)", upperCase);
                if (g2.AbstractC0448m.i0(upperCase)) {
                }
                break;
        }
        java.lang.String str3 = upperCase;
        java.lang.String q4 = q(jSONObject2, jSONObject3, jSONObject, this, "make", "cameraMake", "manufacturer");
        java.lang.String q5 = q(jSONObject2, jSONObject3, jSONObject, this, "model", "cameraModel", "device");
        if (q4 == null || g2.AbstractC0448m.i0(q4) || q5 == null || g2.AbstractC0448m.i0(q5) || !g2.AbstractC0440e.n0(q5, q4, true)) {
            if (q4 != null && !g2.AbstractC0448m.i0(q4) && q5 != null && !g2.AbstractC0448m.i0(q5)) {
                q4 = q4 + " " + q5;
            }
            str = q4;
            r3 = r(jSONObject2, jSONObject3, jSONObject, "latitude", "lat");
            java.lang.Double r4 = r(jSONObject2, jSONObject3, jSONObject, "longitude", "lng", "lon");
            if (r3 != null || r4 == null || (r3.doubleValue() == 0.0d && r4.doubleValue() == 0.0d)) {
                q3 = q(jSONObject2, jSONObject3, jSONObject, this, "location", "city", "place");
            } else {
                q3 = java.lang.String.format("%.5f", java.util.Arrays.copyOf(new java.lang.Object[]{r3}, 1)) + "°, " + java.lang.String.format("%.5f", java.util.Arrays.copyOf(new java.lang.Object[]{r4}, 1)) + "°";
            }
            java.lang.String str4 = q3;
            optLong = jSONObject.optLong("duration", jSONObject2 == null ? jSONObject2.optLong("duration") : 0L);
            java.lang.Long valueOf = java.lang.Long.valueOf(optLong);
            if (optLong <= 0) {
                valueOf = null;
            }
            java.lang.String optString9 = jSONObject.optString("title", !z ? "Vidéo" : "Photo");
            Y1.j.d("optString(...)", optString9);
            java.lang.String str5 = z ? androidx.media3.common.MimeTypes.BASE_TYPE_VIDEO : "photo";
            optString2 = jSONObject.optString("thumb");
            if (g2.AbstractC0448m.i0(optString2)) {
                optString2 = "/library/metadata/" + optString7 + "/thumb";
            }
            Y1.j.d("ifBlank(...)", optString2);
            if (jSONObject3 != null || (str2 = jSONObject3.optString("key")) == null || g2.AbstractC0448m.i0(str2)) {
                str2 = null;
            }
            optString3 = jSONObject.optString("originallyAvailableAt");
            if (g2.AbstractC0448m.i0(optString3)) {
                optString3 = null;
            }
            if (g2.AbstractC0448m.i0(optString6)) {
                optString6 = null;
            }
            if (jSONObject2 != null) {
                int optInt = jSONObject2.optInt("width");
                num = java.lang.Integer.valueOf(optInt);
            }
            num = null;
            if (jSONObject2 != null) {
                int optInt2 = jSONObject2.optInt("height");
                num2 = java.lang.Integer.valueOf(optInt2);
            }
            num2 = null;
            if (jSONObject3 != null) {
                long optLong2 = jSONObject3.optLong("size");
                java.lang.Long valueOf2 = java.lang.Long.valueOf(optLong2);
                if (optLong2 > 0) {
                    l3 = valueOf2;
                    java.lang.String str6 = optString6;
                    java.lang.String q6 = q(jSONObject2, jSONObject3, jSONObject, this, "lens", "lensModel");
                    java.lang.String optString10 = jSONObject.optString("originallyAvailableAt");
                    return new G2.b(optString7, optString9, str5, optString2, str2, optString3, valueOf, str6, null, new G2.d(str3, num, num2, l3, str, q6, str4, g2.AbstractC0448m.i0(optString10) ? null : optString10, g2.AbstractC0448m.i0(D02) ? null : D02, valueOf), 256);
                }
            }
            l3 = null;
            java.lang.String str62 = optString6;
            java.lang.String q62 = q(jSONObject2, jSONObject3, jSONObject, this, "lens", "lensModel");
            java.lang.String optString102 = jSONObject.optString("originallyAvailableAt");
            return new G2.b(optString7, optString9, str5, optString2, str2, optString3, valueOf, str62, null, new G2.d(str3, num, num2, l3, str, q62, str4, g2.AbstractC0448m.i0(optString102) ? null : optString102, g2.AbstractC0448m.i0(D02) ? null : D02, valueOf), 256);
        }
        str = q5;
        r3 = r(jSONObject2, jSONObject3, jSONObject, "latitude", "lat");
        java.lang.Double r42 = r(jSONObject2, jSONObject3, jSONObject, "longitude", "lng", "lon");
        if (r3 != null) {
        }
        q3 = q(jSONObject2, jSONObject3, jSONObject, this, "location", "city", "place");
        java.lang.String str42 = q3;
        optLong = jSONObject.optLong("duration", jSONObject2 == null ? jSONObject2.optLong("duration") : 0L);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(optLong);
        if (optLong <= 0) {
        }
        java.lang.String optString92 = jSONObject.optString("title", !z ? "Vidéo" : "Photo");
        Y1.j.d("optString(...)", optString92);
        if (z) {
        }
        optString2 = jSONObject.optString("thumb");
        if (g2.AbstractC0448m.i0(optString2)) {
        }
        Y1.j.d("ifBlank(...)", optString2);
        if (jSONObject3 != null) {
        }
        str2 = null;
        optString3 = jSONObject.optString("originallyAvailableAt");
        if (g2.AbstractC0448m.i0(optString3)) {
        }
        if (g2.AbstractC0448m.i0(optString6)) {
        }
        if (jSONObject2 != null) {
        }
        num = null;
        if (jSONObject2 != null) {
        }
        num2 = null;
        if (jSONObject3 != null) {
        }
        l3 = null;
        java.lang.String str622 = optString6;
        java.lang.String q622 = q(jSONObject2, jSONObject3, jSONObject, this, "lens", "lensModel");
        java.lang.String optString1022 = jSONObject.optString("originallyAvailableAt");
        return new G2.b(optString7, optString92, str5, optString2, str2, optString3, valueOf3, str622, null, new G2.d(str3, num, num2, l3, str, q622, str42, g2.AbstractC0448m.i0(optString1022) ? null : optString1022, g2.AbstractC0448m.i0(D02) ? null : D02, valueOf3), 256);
    }
}
