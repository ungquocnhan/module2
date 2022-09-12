package case_study_module_1;

import java.util.Arrays;

public class Exercise8 {
    public static void main(String[] args) {

        int[] arrA = {7, 2, 5, 3, 5, 3};
        int[] arrB = {7, 4, 6, 2, 3, 5, 5, 3};
        int[] arrC = new int[arrB.length];
        int count = 0;
        for (int i = 0; i < arrB.length; i++) {
            for (int j = 0; j < arrA.length; j++) {
                if (arrB[i] == arrA[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                arrC[i] = arrB[i];
            }
            count = 0;
        }
        System.out.println(Arrays.toString(arrC));
    }
}
