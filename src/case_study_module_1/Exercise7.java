package case_study_module_1;

import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {

        int[] arrA = {1, 2, 3};
        int[] arrB = new int[3];
        int sum = 0;
        for (int i = 0; i < arrA.length; i++) {
            sum += arrA[i];
            arrB[i] = sum;
        }
        System.out.println(Arrays.toString(arrB));
    }
}
