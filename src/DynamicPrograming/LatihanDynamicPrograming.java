package DynamicPrograming;
import java.math.BigInteger;
import java.util.Scanner;
public class LatihanDynamicPrograming {
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21\n");
    }
    public static void main(String[] args) {
        String identitas = "Rahul Fahmi Satria / X RPL 2 / 28";
        tampilJudul(identitas);
        int n = tampilInput();
    }
    private static int tampilInput() {
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Bilangan Ke - : ");
        int n = scanner.nextInt();
        BigInteger hasil = fibo(n);
        
        return n;
    }
     private static BigInteger fibo(int n) {
        
        BigInteger[] hasil = new BigInteger[n];
        
        hasil[0] = BigInteger.ONE;
        hasil[1] =  BigInteger.ONE;
        
        for(int i = 2; i < n; i++) {
        hasil[i] = hasil[i-1].add(hasil[i-2]);
        }
        return hasil[n-1];
    }
}
