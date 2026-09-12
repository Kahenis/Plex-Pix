package G2;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements javax.net.ssl.HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        Y1.j.b(str);
        return g2.AbstractC0448m.g0(str, ".plex.direct", true) || javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
    }
}
