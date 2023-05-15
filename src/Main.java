import java.util.Scanner;

/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/14/2023 12:31 PM
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kac tane sayi giriceksiniz: ");
        int n =input.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i<=n ; i++){
            System.out.print(i + ". Sayi giriniz: ");
            int mum = input.nextInt();
            if (mum>max){
                max = mum;
            }
            if (mum<min){
                min = mum;
            }
        }
        System.out.println("En buyuk sayi: " + max);
        System.out.println("En kucuk sayi: " + min );
    }
}
