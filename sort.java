import java.util.ArrayList;
import java.util.Scanner;

/*
Data una lista di numeri interi, restituire la lista ordinata. I numeri verranno presi tramite
standard input stream fino a quando non verrà inserito il valore -1.L’output deve essere dato
in standard output stream
*/
public class sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int x = s.nextInt();
        while(x != -1){
            lista.add(x);
            x = s.nextInt();
        }
        s.close();
        lista.sort(null);
        for(Integer i : lista)
            System.out.println(i);
    }
}
