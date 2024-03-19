
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Pergunta2
 */

public class Pergunta2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{

            System.out.print("Digite um valor: ");
            int value = input.nextInt();

            int farst = 0;
            int after = 1;
            int next = 0;

            boolean contain = false;

            for(int i = 0; next<= value; i++){
                if (i == 0) {
                    next = after+farst;
                    System.out.print(after+",");
                    System.out.print(next+",");
                }else{
                    farst = after;
                    after = next;
                    next = after+farst;
                    System.out.print(next+",");
                }

                if (next == value) {
                    contain = true;
                }
            }

            if (contain) {
                System.out.println("\nO numero existe na sequencia de fibonate");
            }else{
                System.out.println("\nO numero não existe na sequencia");
            }


        }catch(InputMismatchException e){
            System.out.println("Erro de input");
        }finally{
            input.close();
        }
        
    }
}
