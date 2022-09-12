package case_study_module_1;

import java.util.Arrays;

public class Exercise9 {
    public static void main(String[] args) {

        double[] numerators = {5, 2, 5};
        double[] denominators = {6, 3, 4};
        double[] maxFraction = new double[3];

        for (int i = 0; i < numerators.length; i++) {
            for (int j = 0; j < denominators.length; j++) {
                if (i == j) {
                    maxFraction[i] = numerators[i] / denominators[j];
                }
            }
        }
        System.out.println(Arrays.toString(maxFraction));

        double max = maxFraction[0];
        int index = 0;
        for (int i = 0; i < maxFraction.length; i++) {
            if (max < maxFraction[i]) {
                max = maxFraction[i];
                index = i;
            }

        }
        System.out.printf(" %.2f , %d", max, index);
    }
}
