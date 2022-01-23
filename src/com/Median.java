package com;

public class Median {
    private Median() {
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }

    private static void sortArray(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            double smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }

    public static float median(int[] array) {
        sortArray(array);
        if (array.length % 2 != 0) return array[array.length / 2];
        else {
            return (float) (array[(array.length / 2) - 1] + array[array.length / 2]) / 2;
        }
    }

    public static double median(double[] array) {
        sortArray(array);
        if (array.length % 2 != 0) return array[array.length / 2];
        else {
            return (array[(array.length / 2) - 1] + array[array.length / 2]) / 2;
        }
    }
}
