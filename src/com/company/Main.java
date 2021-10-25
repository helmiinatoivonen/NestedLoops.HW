package com.company;

public class Main {

    public static void main(String[] args)
    {

        // Ex. 1.1

        /*int [] array = {1,2,3,4,5};
        int i = 1;

        // outer loop
        while (i <= 5) {
            // inner loop
            for (int j : array)
                System.out.print (j + " ");
                System.out.println ();
            i++;


        // Ex. 1.2

        int [] array = {1,2,3,4,5};
        int i = 0;

        // outer loop
        while (i <= 4) {
            // inner loop
            for (int j : array)
                System.out.print (j + i + " ");
            System.out.println ();
            i++;
        }

        // Ex. 2

        2.1: when N and M have the same value, the program outputs the flag
        2.2: it is not very efficient because


        Ex. 3.4 */

        int [] nums = {3,7,4};

        for (int k = 0; k < 3; k++)
            for (int l = 0; l < 3; l++)
                if (k != l)
                {
                    System.out.println(10 * nums[k] + nums[l]);
                    l++;
                }
                else if (l >= 3)
                    k++;
                else if (k >= 3)
                    System.out.println(nums);
                else
                    l++;
    }
}
