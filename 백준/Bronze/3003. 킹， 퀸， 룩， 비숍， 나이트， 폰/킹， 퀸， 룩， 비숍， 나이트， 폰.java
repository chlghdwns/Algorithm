import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        int[] b = {1,1,2,2,2,8};
        int[] c = new int[6];

        for (int i = 0 ; i < 6 ; i++) {
            a[i] = sc.nextInt();
            if (a[i] >= b[i]) c[i] = -a[i] + b[i];
            else if(a[i] <= b[i]) c[i] = b[i] - a[i];
        }
        for (int i : c) System.out.printf("%d ",i);

    }
}