package com.kv.sort;

/**
 * Created by Administrator on 2018/4/1.
 */

public class BubbleSort {

    public static final void main(String[] args) {
        int[] sourceArray = {5, 8, 16, 7, 8, 9, 11, 34, 55, 99, 333, 66, 2123};
        sort3(sourceArray, sourceArray.length);
    }

    public static void sort3(int r[], int n) {
        int low = 0;
        int high = n - 1; //设置变量的初始值
        int tmp, j;
        int count = 0;
        while (low < high) {
            for (j = low; j < high; ++j) {
                count++;
                if (r[j] > r[j + 1]) {
                    tmp = r[j];
                    r[j] = r[j + 1];
                    r[j + 1] = tmp;
                }
            } //正向冒泡,找到最大者
            --high;                 //修改high值, 前移一位
            for (j = high; j > low; --j) {
                count++;
                if (r[j] < r[j - 1]) {
                    tmp = r[j];
                    r[j] = r[j - 1];
                    r[j - 1] = tmp;
                }
            }//反向冒泡,找到最小者
            ++low;                  //修改low值,后移一位
        }
        System.err.println("对比次数:" + count);
    }

    public static int[] sortUp2Down2(int[] sourceArray) {
        int temp;
        if (sourceArray != null && sourceArray.length > 0) {
            int count = 0;
            for (int i = 0; i < sourceArray.length - 1; i++) {
                for (int j = 0; j < sourceArray.length - 1 - i; j++) {
                    count++;
                    if (sourceArray[j] < sourceArray[j + 1]) {
                        temp = sourceArray[j];
                        sourceArray[j] = sourceArray[j + 1];
                        sourceArray[j + 1] = temp;
                    }
                }
                System.out.println("第" + i + "次:");
                printArray(sourceArray);
                System.out.println("");
            }
            System.err.println("对比次数:" + count);
        }
        return sourceArray;
    }

    public static int[] sortUp2Down(int[] sourceArray) {
        int temp;
        if (sourceArray != null && sourceArray.length > 0) {
            int count = 0;
            for (int i = 0; i < sourceArray.length; i++) {
                for (int j = i + 1; j < sourceArray.length; j++) {
                    count++;
                    if (sourceArray[i] < sourceArray[j]) {
                        temp = sourceArray[j];
                        sourceArray[j] = sourceArray[i];
                        sourceArray[i] = temp;
                    }
                }
                System.out.println("第" + i + "次:");
                printArray(sourceArray);
                System.out.println("");
            }
            System.err.println("对比次数:" + count);
        }
        return sourceArray;
    }

    private static void printArray(int[] array) {
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
