package org.example;

public class BubbleSort {
    public static Integer[] bubbleSort(Integer[] A) {
        if (A == null) return null;
        int N = A.length;
        boolean swapped = false;
        for (int i = 0; i < N -1; i++) {
            for (int j = 0; j < N - i - 1; j++){
                if (A[j] > A[j + 1]){
                    int temp = A[j];
                    A[j] = A[j +1];
                    A[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return A;
    }
}
