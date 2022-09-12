package case_study_module_1;

import java.util.Locale;

public class Exercise12 {
    public static void main(String[] args) {
        String str = "tRuong    TaN   HAI";
        String str1 = str.toLowerCase(Locale.forLanguageTag(str));
        System.out.println(str1);
        //replaceAll xoa khoang trong
        //trim() xoa khoang trong 2 dau
        //replaceAll (" " , "" ) xoa het khoang trong
        //replaceAll("\\s\\s+"," ") xoa khoang trong con chua lai 1 khoang trong
        String str2 = str1.replaceAll("\\s\\s+", " ");
        System.out.println(str2);
        // chuyen chuoi thanh mang kieu char
        char[] str3 = str2.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < str3.length; i++) {
            // phan tu trong mang la mot chu cai
            if (Character.isLetter(str3[i])) {
                //kiem tra khoang trang co truoc chu cai
                if (foundSpace) {
                    str3[i] = Character.toUpperCase(str3[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        //chuyen doi mang char thanh string
        String str4 = String.valueOf(str3);
        System.out.println(str4);


//        split cat chuoi thanh mang
//        String[] str3 = str2.split(" ");
//        System.out.println(Arrays.toString(str3));


//        Viet hoa chu dau tien
//        String firstLetter = str2.substring(0,1);
//        String remainingLetter = str2.substring(1,str2.length());
//        firstLetter = firstLetter.toUpperCase();
//        str2 = firstLetter + remainingLetter;
//        System.out.println(str2);


    }
}
