import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Pergunta5
 */

public class Pergunta5 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         List<Character> characters = new ArrayList<>();

         try{
            System.out.print("Digite uma String : ");

            String string = input.nextLine();

            for(int i = 0; i<string.length(); i++){
                characters.add(string.charAt(i));
            }
            

            for(int i = 1; i <=characters.size(); i++){
                int index = characters.size()-i;
                System.out.print(characters.get(index));
            }

         }catch(InputMismatchException e){
            System.out.println("Erro de entradsa");
         }finally{
            input.close();
         }

    }
}
