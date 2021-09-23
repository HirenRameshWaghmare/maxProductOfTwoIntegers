package com.nisren.maxproduct;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] numberArray = {1,2,3,4,7};
        int[] result = main.maxProduct(numberArray);
        System.out.println("The max product is of numbers "+Arrays.toString(result));
    }

    public int[] maxProduct(int[] numberArray){
        int maxProduct = 0;
        int[] result = new int[2];
        for(int i=0; i<numberArray.length;i++){
            for (int j=i+1; j<numberArray.length;j++){
                if (numberArray[i]*numberArray[j]>maxProduct){
                    maxProduct = numberArray[i]*numberArray[j];
                    result[0]=numberArray[i];
                    result[1]=numberArray[j];
                }
            }
        }
        return result;
    }
}
