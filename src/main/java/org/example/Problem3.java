package org.example;

public class Problem3 {

    public static long divisible(long rows) {
        long numbers = 1L << (rows - 1);  //The formula used to test the method, is 2 to the power of n-1 which is then squared
        numbers *= numbers;
        long aredivisible = 0; //initializes long
        long n = rows;
        while (n > 0) {
            aredivisible += rows / 7;
            n = n / 7;
        }
        return numbers - aredivisible;

//The time complexity would be O(log(n)) because it depends on how many are divisible by 7
    }
}



}
