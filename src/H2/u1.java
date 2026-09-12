package H2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: i, reason: collision with root package name */
    public static final H2.u1 f1936i;

    /* renamed from: j, reason: collision with root package name */
    public static final H2.u1 f1937j;

    /* renamed from: k, reason: collision with root package name */
    public static final H2.u1 f1938k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ H2.u1[] f1939l;

    static {
        H2.u1 u1Var = new H2.u1("Grid", 0);
        f1936i = u1Var;
        H2.u1 u1Var2 = new H2.u1("Wide", 1);
        f1937j = u1Var2;
        H2.u1 u1Var3 = new H2.u1("Full", 2);
        f1938k = u1Var3;
        f1939l = new H2.u1[]{u1Var, u1Var2, u1Var3};
    }

    public static H2.u1 valueOf(java.lang.String str) {
        return (H2.u1) java.lang.Enum.valueOf(H2.u1.class, str);
    }

    public static H2.u1[] values() {
        return (H2.u1[]) f1939l.clone();
    }
}
