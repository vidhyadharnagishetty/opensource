import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            String left = "", right = "";
            for (int j = 1; j <= i; j++) {
                left += j;
            }
            for (int j = i; j >= 1; j--) {
                right += j;
            }
            System.out.println(left + " " + right);
        }
    }
}
