package CodeForces.Petr.Contest.C_1055;

import java.io.PrintWriter;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */

public class B {
        public void solve(int testNumber, Main.InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            long l = in.nextInt();
            long[] a = new long[n + 2];
            for (int i = 1; i <= n; ++i) a[i] = in.nextInt();
            int count = 0;
            for (int i = 1; i <= n; ++i) {
                if (a[i] > l && a[i - 1] <= l) ++count;
            }
            for (int qi = 0; qi < m; ++qi) {
                int t = in.nextInt();
                if (t == 0) out.println(count);
                else {
                    int p = in.nextInt();
                    long d = in.nextInt();
                    if (a[p] > l && a[p - 1] <= l) --count;
                    if (a[p + 1] > l && a[p] <= l) --count;
                    a[p] += d;
                    if (a[p] > l && a[p - 1] <= l) ++count;
                    if (a[p + 1] > l && a[p] <= l) ++count;
                }
            }
        }

    }



