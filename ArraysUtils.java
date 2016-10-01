package module6;

public final class ArraysUtils {

    static int sum(int array[]) {
        int arraySum = 0;
        for (int massive : array) {
            arraySum += massive;
        }
        return arraySum;
    }

    static int min(int array[]) {
        int arrayMin = array[0];
        for (int i = 1; i < array.length; i++) {
            if (arrayMin > array[i]) {
                arrayMin = array[i];
            }
        }
        return arrayMin;
    }

    static int max(int array[]) {
        int arrayMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (arrayMax < array[i]) {
                arrayMax = array[i];
            }
        }
        return arrayMax;
    }

    static int maxPositive(int array[]) {
        int arrayMaxPos = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > 0) {
                if (arrayMaxPos < array[i]) {
                    arrayMaxPos = array[i];
                }
            }
        }
        return arrayMaxPos;
    }

    static long multiplication(int array[]) {
        long arrayMult = 1;
        for (int massive : array) {
            arrayMult *= massive;
        }
        return arrayMult;
    }

    static int modulus(int array[]) {
        int mod;
        int i = array.length - 1;
        mod = array[0] % array[i];

        return mod;
    }

    static int secondLargest(int array[]) {
        int arrayMax = array[0];
        int secondMax = min(array);
        for (int i = 0; i < array.length; i++) {
            if (arrayMax < array[i]) {
                secondMax = arrayMax;
                arrayMax = array[i];
            } else if (secondMax < array[i] && array[i] != arrayMax) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    static int[] reverse(int[] array) {

        for (int i = 0; i < (array.length / 2); i++) {
            int temporary = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temporary;
        }
        return array;
    }

    static int[] findEvenElements(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                j++;
            }
        }

        int[] arrayOfEven = new int[j];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                arrayOfEven[k] = array[i];
                k++;
            }
        }

        return arrayOfEven;
    }
}
