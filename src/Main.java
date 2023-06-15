import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap chi so vi tri cua 1 phan tu bat ky: ");

        try {
            int x = scanner.nextInt();
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}