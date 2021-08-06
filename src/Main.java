import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number[] = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        int X;
        int index;
        System.out.println("Nhập số cần chèn");
        X = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        index = scanner.nextInt();
        if (check(index, number)) {
            add(number, index, X);
        }
        for (int element : number) {
            System.out.print(element + " , ");
        }
    }

    public static boolean check(int index, int[] arr) {
        while (index <= 1 && index >= arr.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
            System.out.println("Nhập vị trí cần chèn");
            index = scanner.nextInt();
        }
        return true;
    }

    public static int[] add(int[] arr, int index, int X) {
        int temp = arr[index];
        int temp1;
        arr[index] = X;
        for (int i = index + 1; i < arr.length; i++) {
            temp1 = arr[i];
            arr[i] = temp;
            temp = temp1;
        }
        return arr;
    }
}