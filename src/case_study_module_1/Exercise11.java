package case_study_module_1;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        int inputAmount;
        int sumPrice = 0;
        int price;
        int[] sum = new int[6];

        do {
            System.out.println("Menu");
            System.out.println("1. Cafe");
            System.out.println("2. Nước ép cà rốt");
            System.out.println("3. Nước ép cà chua");
            System.out.println("4. Nước lọc");
            System.out.println("5. Nước dừa");
            System.out.println("6. Cam vắt");
            System.out.println("7. Thoát gọi món");
            System.out.print("Enter choice : ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    price = 14000;
                    System.out.println("Giá tiền : " + price + " đồng");
                    System.out.print("Nhập số lượng đồ uống : ");
                    inputAmount = Integer.parseInt(scanner.nextLine());
                    sum[0] = price * inputAmount;
                    break;
                case 2:
                    price = 17000;
                    System.out.println("Giá tiền : " + price + " đồng");
                    System.out.print("Nhập số lượng đồ uống : ");
                    inputAmount = Integer.parseInt(scanner.nextLine());
                    sum[1] = price * inputAmount;
                    break;
                case 3:
                    price = 16000;
                    System.out.println("Giá tiền : " + price + " đồng");
                    System.out.print("Nhập số lượng đồ uống : ");
                    inputAmount = Integer.parseInt(scanner.nextLine());
                    sum[2] = price * inputAmount;
                    break;
                case 4:
                    price = 10000;
                    System.out.println("Giá tiền : " + price + " đồng");
                    System.out.print("Nhập số lượng đồ uống : ");
                    inputAmount = Integer.parseInt(scanner.nextLine());
                    sum[3] = price * inputAmount;
                    break;
                case 5:
                    price = 20000;
                    System.out.println("Giá tiền : " + price + " đồng");
                    System.out.print("Nhập số lượng đồ uống : ");
                    inputAmount = Integer.parseInt(scanner.nextLine());
                    sum[4] = price * inputAmount;
                    break;
                case 6:
                    price = 15000;
                    System.out.println("Giá tiền : " + price + " đồng");
                    System.out.print("Nhập số lượng đồ uống : ");
                    inputAmount = Integer.parseInt(scanner.nextLine());
                    sum[5] = price * inputAmount;
                    break;
                case 7:
                    for (int value : sum) {
                        sumPrice += value;
                    }
                    System.out.println("Hóa đơn tổng :" + sumPrice + " đồng");
                    break;
            }

        } while (choice < 7);
    }
}
