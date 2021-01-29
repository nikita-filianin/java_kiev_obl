import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {10, 27, 45, 84 , 34, 62, 2};
        System.out.println("Массив: ");
        for (int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите количество элементов масива, которые нужно сложить: ");
        int num = scan.nextInt();
        getResult(arr, num);
    }
    static void getResult(int[] arr, int num){
        if (num < arr.length && num >= 0){
            for (int i = 0; i < arr.length; i++){
                int temp = 0;
                for (int j = 0; j <= num; j++){
                    temp += arr[j];
                }
                System.out.println("Сумма: " + temp);
                break;
            }
        } else {
            System.out.println("Ошибочное значение, размер массива: " + arr.length);
        }
    }
}