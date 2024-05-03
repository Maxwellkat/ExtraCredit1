package org.example;

public class Problem2 {
    public static void merge(int[] a, int a2, int[] b, int b2){
        int i = a2 - 1;
        int j = b2 - 1;
        int k = a2+ b2 - 1;
//This function creates two arrays being a and b, and 3 other ints to be used as pointers for each
        // Merge arrays A and B from the end
        while (i >= 0 && j >= 0) {
            //first compares the ends of each array
            if (a[i] > b[j]) {
                a[k--] = a[i--];
            } else {

                a[k--] = b[j--];
            }//If a is greater, it gets put at the end, if b is greater it is placed at the end
        }

        // Copy remaining elements from array B to array A if any
        while (j >= 0) {
            a[k--] = b[j--];
        }
    }

}
