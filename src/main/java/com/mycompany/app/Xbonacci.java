package com.mycompany.app;

public class Xbonacci {

    /**
    * По первым 3м числам вычисляется n чисел трибоначчи
     */

    public double[] tribonacci(double[] s, int n) {

        double[] arr = new double [n+3];
        double[] result = new double [n];
        if (n == 0)
            return result;
        for (int i = 0; i < 3; i++)
        {
            arr[i] = s[i];
        }

        for (int i = 3; i < n+3; i++)
        {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        for (int i = 0; i < n; i++)
        {
            result[i] = arr[i];
        }
        return result;
    }
}