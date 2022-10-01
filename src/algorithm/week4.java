package algorithm;

public class week4 {
    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    static void sort(int[] list) {
        int pos;
        int x;
        for (int i = 1; i < list.length; i++) {
            if (list[i] != -1) {
                x = list[i];
                pos = i;
                while (pos > 0 && x < list[pos - 1]) {
                    list[pos] = list[pos - 1];
                    pos--;
                }
                list[pos] = x;
            }
        }
    }
}
