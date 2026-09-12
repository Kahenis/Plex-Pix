package H2;

/* renamed from: H2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078c extends R1.j implements X1.e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G2.h f1670m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G2.i f1671n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ G2.c f1672o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0078c(G2.h hVar, G2.i iVar, G2.c cVar, P1.d dVar) {
        super(2, dVar);
        this.f1670m = hVar;
        this.f1671n = iVar;
        this.f1672o = cVar;
    }

    @Override // R1.a
    public final P1.d a(P1.d dVar, java.lang.Object obj) {
        return new H2.C0078c(this.f1670m, this.f1671n, this.f1672o, dVar);
    }

    @Override // X1.e
    public final java.lang.Object j(java.lang.Object obj, java.lang.Object obj2) {
        return ((H2.C0078c) a((P1.d) obj2, (h2.InterfaceC0525w) obj)).l(L1.k.f2619a);
    }

    @Override // R1.a
    public final java.lang.Object l(java.lang.Object obj) {
        android.support.v4.media.session.b.R(obj);
        G2.h hVar = this.f1670m;
        hVar.getClass();
        G2.i iVar = this.f1671n;
        Y1.j.e("server", iVar);
        G2.c cVar = this.f1672o;
        Y1.j.e("folder", cVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.lang.String str = cVar.f1089a;
        if (g2.AbstractC0448m.m0(str, "all:", false)) {
            java.lang.String z02 = g2.AbstractC0440e.z0(str, "all:");
            java.util.Iterator it = M1.l.P("13", androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE).iterator();
            while (it.hasNext()) {
                try {
                    java.util.Iterator it2 = G2.h.e(hVar.l(iVar, "/library/sections/" + z02 + "/all?type=" + ((java.lang.String) it.next()) + "&X-Plex-Container-Start=0&X-Plex-Container-Size=400")).iterator();
                    while (it2.hasNext()) {
                        G2.h.i(hVar, linkedHashSet, arrayList, (org.json.JSONObject) it2.next());
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        } else {
            java.lang.String str2 = cVar.f1093e;
            if (str2 == null) {
                str2 = g2.AbstractC0440e.z0(str, "album:");
            }
            java.util.Iterator it3 = G2.h.e(hVar.l(iVar, "/library/metadata/" + str2 + "/children?X-Plex-Container-Start=0&X-Plex-Container-Size=400")).iterator();
            while (it3.hasNext()) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) it3.next();
                java.lang.String optString = jSONObject.optString("type");
                if (!Y1.j.a(optString, "photoalbum")) {
                    if (Y1.j.a(optString, "photo")) {
                        java.lang.String optString2 = jSONObject.optString("key");
                        Y1.j.d("optString(...)", optString2);
                        if (g2.AbstractC0440e.n0(optString2, "/children", false)) {
                        }
                    }
                    G2.h.i(hVar, linkedHashSet, arrayList, jSONObject);
                }
                java.lang.String optString3 = jSONObject.optString("ratingKey");
                Y1.j.b(optString3);
                if (!g2.AbstractC0448m.i0(optString3)) {
                    java.util.Iterator it4 = G2.h.e(hVar.l(iVar, "/library/metadata/" + optString3 + "/children?X-Plex-Container-Size=400")).iterator();
                    while (it4.hasNext()) {
                        G2.h.i(hVar, linkedHashSet, arrayList, (org.json.JSONObject) it4.next());
                    }
                }
            }
        }
        return arrayList;
    }
}
