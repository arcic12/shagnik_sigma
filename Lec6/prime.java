package Lec6;
import java.util.*;

public class prime {

  public static boolean check_prime(int n) {
    if(n<=1)
    {
        return false;
    }
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }  
     }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number ");
    int n = sc.nextInt();

    System.out.println(check_prime(n));

    sc.close();
  }
}
