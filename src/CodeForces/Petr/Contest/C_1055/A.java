package CodeForces.Petr.Contest.C_1055;

import java.io.PrintWriter;

public class A {
    private static final String NO = "NO";
    private static final String YES = "YES";

    public void solve(int testNumber, Main.InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int s = in.nextInt() - 1;
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            b[i] = in.nextInt();
        }
        if (a[0] == 0) {
            out.println(NO);
            return;
        }
        if (a[s] > 0) {
            out.println(YES);
            return;
        }
        if (b[s] == 0) {
            out.println(NO);
            return;
        }
        for (int i = s + 1; i < n; ++i) {
            if (a[i] > 0 && b[i] > 0) {
                out.println(YES);
                return;
            }
        }
        out.println(NO);
    }

}
