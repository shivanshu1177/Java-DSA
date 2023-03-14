import java.util.Scanner;

/**
 * permutaition
 */
public class permutaition {
    public static int fact(int x){
        int rv = 1;
        for(int i = 1; i<=x; i++){
            rv *= i;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nf = fact(n);
        int nmrf = fact(n-r);
        int npr = nf/nmrf;
        System.out.println(npr);
    }
}