package org.example;

import static org.example.BubbleSort.bubbleSort;
import java.util.Arrays;

public class App {
    public static void main() {
        Integer[][] inputs = { {70,61,72,83,38 },
                               {7,2,76,4,99},
                               {28,9,13,78,19 },
                               {68,84,41,62,18 }};

        for (int i =0; i < inputs.length; i++) {
            Integer[] sorted = bubbleSort(inputs[i]);
            System.out.println("Sorted: " + Arrays.toString(sorted));
        }
    }
}



