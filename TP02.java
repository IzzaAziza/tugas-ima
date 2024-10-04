import java.util.Scanner;

public class TP02 {

  public static void main(final String[]args)  {
    Scanner input= new Scanner(System.in);

    System.out.print("Masukkan jumlah permen: ") ;
    int N = input.nextInt() ;

    System.out.print("Masukkan jumlah teman: ") ;
    int T = input.nextInt();

    int jumlahOrang = T + 1 ;
    int permenPerOrang = N / jumlahOrang ;
    int sisaPermen = N % jumlahOrang ;

    System.out.println(permenPerOrang);
    System.out.println(sisaPermen);
    

    input.close();
  }
}
