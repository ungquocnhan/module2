package case_study_module_1;

public class Exercise13 {
    public static void main(String[] args) {
        String str = "cabca";
//        int[] counter = new int[256];
//        for (int i = 0; i < str.length(); i++)
//            counter[str.charAt(i)]++;
        char[] array = new char[str.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j]) {
                    flag++;
                }
            }
            if (flag == 1)
                System.out.println(str.charAt(i));
        }
    }
}
