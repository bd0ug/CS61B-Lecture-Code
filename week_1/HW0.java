public class HW0 {
    public static void windowPosSum(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            int sum = 0;                                    // number that will replace index
            if (a[i] < 0) { continue; }                     // if num is neg, skip

            for (int j = 0; j <= n; j ++) {                 // new loop to keep track of current num and 3 nums after sum
                if (i + j + 1 > a.length) { break; }        // if current index + additional index + 1 is out of bounds, leave loop
                sum += a[i + j];
            }
            a[i] = sum;
        }

    }


    public static void main(String[] args) {
        /**
         * Make a triangle
         */

//            int n = 1;
//            while (n <= 5) {
//                for (int i = 1; i <= n; i++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//                n += 1;
//            }

        /**
         * Replaces each element a[i] with the sum of a[i] through a[i + n], but only if a[i] is positive values
         */

        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));

    }

}
