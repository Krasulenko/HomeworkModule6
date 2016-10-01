package module6;

public class Homework21 {

    static double sum(double array[]) {
        double arraySum = 0;
        for (double massive : array) {
            arraySum += massive;
        }
        return arraySum;
    }

    static double min(double array[]) {
        double arrayMin = array[0];
        for (int i = 1; i < array.length; i++) {
            if (arrayMin > array[i]) {
                arrayMin = array[i];
            }
        }
        return arrayMin;
    }

    static double max(double array[]) {
        double arrayMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (arrayMax < array[i]) {
                arrayMax = array[i];
            }
        }
        return arrayMax;
    }

    static double maxPositive(double array[]) {
        double arrayMaxPos = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > 0) {
                if (arrayMaxPos < array[i]) {
                    arrayMaxPos = array[i];
                }
            }
        }
        return arrayMaxPos;
    }

    static double multiplication(double array[]) {
        double arrayMult = 1;
        for (double massive : array) {
            arrayMult *= massive;
        }
        return arrayMult;
    }

    static double modulus(double array[]) {
        double mod;
        int i = array.length - 1;
        mod = array[0] % array[i];

        return mod;
    }

    static double secondLargest(double array[]) {
        double arrayMax = array[0];
        double secondMax = min(array);
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


    public static void main(String[] args) {
        int array[] = {100, 100, 67, 100, 43, -5, 32, 90, 47, 87};
        double array1[] = {393.8, 54.7, 52.9, 43.7, 76.8, 65.4, 24.5, 12.4, 90.7, 35.6};

        System.out.println("Array " + java.util.Arrays.toString(array));

        int resSum = ArraysUtils.sum(array);
        double resSum2 = sum(array1);
        System.out.println("sum int " + resSum);
        System.out.println("sum double " + resSum2);


        int resMin = ArraysUtils.min(array);
        double resMin1 = min(array1);
        System.out.println("min int " + resMin);
        System.out.println("min double " + resMin1);

        int resMax = ArraysUtils.max(array);
        double resMax1 = max(array1);
        System.out.println("max int " + resMax);
        System.out.println("max double " + resMax1);

        int resMaxPos = ArraysUtils.maxPositive(array);
        double resMaxPos1 = maxPositive(array1);
        System.out.println("maxPositive int " + resMaxPos);
        System.out.println("maxPositive double " + resMaxPos1);

        long resMult = ArraysUtils.multiplication(array);
        double resMult2 = multiplication(array1);
        System.out.println("multiplication int " + resMult);
        System.out.println("multiplication double " + resMult2);

        int resMod = ArraysUtils.modulus(array);
        double resMod2 = modulus(array1);
        System.out.println("modulus int " + resMod);
        System.out.println("modulus double " + resMod2);

        int resSecond = ArraysUtils.secondLargest(array);
        double resSecond2 = secondLargest(array1);
        System.out.println("secondLargest int " + resSecond);
        System.out.println("secondLargest double " + resSecond2);

        System.out.println("Array " + java.util.Arrays.toString(array));

        System.out.println("Array in reverse " + java.util.Arrays.toString(ArraysUtils.reverse(array)));

        System.out.println("Even elements of array " + java.util.Arrays.toString(ArraysUtils.findEvenElements(array)));

    }

}
