import java.util.ArrayList;
import java.util.Scanner;

/*
Dati in input un array ordinato A di lunghezza n, e un intero non negativo
x, restituire in output il primo elemento di A non più piccolo di x. Nota che x
è sempre compreso tra il minimo e il massimo valore in A. Inoltre, A contiene
sempre numeri interi non negativi.
Esempi
• Con input A = [10,12,14,22,22,24,60,180,920,921] e x = 123,
l’output sarà 180;
• Con input A = [1,2,3,4,5,6,7,7,7,7,7] e x = 6, l’output sarà 7.
*/
public class nltx {
    public static void main(String[] args) {
        ArrayList<Integer> risultati = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        int numTest = s.nextInt();
        while(numTest > 0){
            numTest--;
            int lunghezza = s.nextInt();
            int x = s.nextInt();
            int corrente;
            int valore = 0;
            boolean fine = false;
            for(int i = 0; i < lunghezza; i++){
                corrente = s.nextInt();
                if(corrente > x && !fine){
                    valore = corrente;
                    fine = true;
                }
            }
            risultati.add(valore);    
        }
        s.close();
        for(Integer i : risultati)
            System.out.println(i);
    }
}
