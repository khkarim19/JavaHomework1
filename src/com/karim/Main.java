package com.karim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // 1 - для массива сделать двумерный массив значение-количество
        // 2 - для массива вывести массив из четных значений
        Random rnd = new Random();

        // int size = rnd.nextInt(10);
        int size = 10;
        int nums[] = new int[size];
        System.out.println("Изначальный массив");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(10);
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int evenNums[] = nums.clone();
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        int firstTask[][] = new int[2][size];
        int count = 1;
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int cur = nums[i];
            int next = nums[i + 1];
            if (cur == next) {
                count++;
            } else {
                firstTask[0][j] = nums[i];
                firstTask[1][j] = count;
                count = 1;
                j++;
            }
            firstTask[0][j] = nums[size - 1];
            firstTask[1][j] = count;
        }
        System.out.println("Массив значение - количество");
        for (int i = 0; i < firstTask.length; i++) {
            for (int y = 0; y < j + 1; y++) {
                System.out.print(firstTask[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println("Массив из четных чисел");
        for (int u=0; u < evenNums.length;u++){
            if(evenNums[u]%2==0){
                System.out.print(evenNums[u]+" ");
            }
        }

    }
}
