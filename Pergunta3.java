/**
 * Pergunta3
 */

public class Pergunta3 {
    public static void main(String[] args) {
        
        // questão a
        System.out.print("A: ");
        for(int i = 1; i<10; i++){
            if (i%2 != 0) {
                System.err.print(i+",");
            }
        }
        System.err.println();

        // questao b
        System.out.print("B: ");
        for(int i = 1; i<8; i++){
            System.out.print((int)Math.pow(2, i)+",");
        }
        System.out.println();

        // questão c
        System.out.print("C: ");
        for(int i = 0; i<8; i++){
            System.out.print((int)Math.pow(i, 2)+",");
        }
        System.out.println();

        // questão d
        System.out.print("D: ");
        for(int i = 1; i<11; i++){
            if (i%2 == 0) {
                System.out.print((int)Math.pow(i, 2)+",");
            }
        }
        System.out.println();


        // questão e
        System.out.print("E: ");
        int farst = 0;
        int after = 1;
        int next = 0;

        for(int i = 0; next<=13; i++){
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
        }
        System.out.println();

        // questao f
        


    }
}
