package basics;

public class BubbleIntDivision {
    public static void main(String[] args) {
        double x = 10;
        int y = 3;
        int z = 7;

        int a = z / y;  // a = 2
//        int b = x / y;  // b = 3.333333   if there is red underline, it ignores the syntax
        double b = x / y;  // b2 = 3.33333

        // 'casting' -> force to change the type to convert
        int c = (int) x / y;  // c = 3  : cast just 'x' and do the division
        int e = (int) (y / x);  // e = 0 : cast after the division

        double d = (double) z / y;  // 2.33333333
        double f = (double) (z / y);  // 2.0  : z / y -> 2 -> (double) 2 -> 2.0

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        System.out.println(d);
        System.out.println(f);
    }
}
