/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class FirstArray {
    public static void main(final String[] args) {
        int[] daysInMonths = new int[12];
        daysInMonths[0] = 31;
        daysInMonths[1] = 28;
        daysInMonths[7] = 31;
        //...
        daysInMonths[11] = 31;

        int august = daysInMonths[7];

        System.out.println("August has " + august + " days");

        for (int i = 0; i < daysInMonths.length; i++) {
            System.out.print(" " + daysInMonths[i]);

        }

        System.out.println();

        int[] nums = new int[100];

        //loop "for"

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 10;
            System.out.print(" " + nums[i]);
            if ( i % 10 == 0)
                System.out.println();
        }

        //Loop foreach
        for (int num : nums) {
            System.out.println(num);
        }


    }
}
