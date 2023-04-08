import java.util.Scanner;
public class exercicio5 {
    

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);


      System.out.println("Digite a medida em metros");
      double metros = sc.nextDouble();

      double centimetros = metros * 100;

      System.out.println("Quantidade metros correspondem a" + centimetros + "centimetros.");

      sc.close();
    }




}
