package CodeForces.Petr.Contest.C_1055;

import java.io.PrintWriter;

public class C {

    public void solve(int testNumber, Main.InputReader in, PrintWriter out) {
        long la = in.nextLong();
        long ra = in.nextLong();
        long ta = in.nextLong();
        long lb = in.nextLong();
        long rb = in.nextLong();
        long tb = in.nextLong();
        long g = gcd(ta, tb);
        long by = la / g * g;
        la -= by;
        ra -= by;
        by = lb / g * g;
        lb -= by;
        rb -= by;
        out.println(Math.max(intersect(la, ra, lb, rb), Math.max(intersect(la + g, ra + g, lb, rb), intersect(la, ra, lb + g, rb + g))));
    }

    private long intersect(long la, long ra, long lb, long rb) {
        long res = Math.min(ra, rb) - Math.max(la, lb) + 1;
        if (res < 0) res = 0;
        return res;
    }

    private long gcd(long a, long b) {
        while (b > 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

}
