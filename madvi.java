import java.util.ArrayList;
import java.util.Scanner;

/*
Il nostro eroe Fan Tocci, Ph.D., si trova attualmente a fronteggiare un difficile
colloquio nella Ipergalattica Megaditta. Spinto dal bellissimo corso di Algoritmi
e Strutture Dati iniziato qualche giorno fa, vuole rispondere perfettamente a
tutte le possibili domande.
Il recruiter si presenta, illustrandogli il seguente problema: dato un array V
di numeri interi, determinare la differenza assoluta degli indici e dei valori
corrispondenti più grande tra i valori e gli indici. Ovvero, dato V , si deve
determinare il valore massimo della seguente espressione
f(i, j) = |V [i] − V [j]| + |i − j|
dove i, j sono indici dell’array V (0 ≤ i < |V |, 0 ≤ j < |V |).
*/
public class madvi {
    public static int massimo(ArrayList<Integer>l){
        int max = 0;
        int tmp = 0;
        for(int i = 0; i < l.size()/2+1; ++i){
            for(int j = i+1; j < l.size(); ++j){
                if((tmp = (Math.abs(l.get(i) - l.get(j)) + (Math.abs(i - j)) )) > max)
                    max = tmp;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numTest = s.nextInt();
        ArrayList<Integer> risultati = new ArrayList<Integer>();
        while(numTest > 0){
            numTest--;
            ArrayList<Integer> vettore = new ArrayList<Integer>();
            int x = s.nextInt();
            for(int i = 0; i < x; ++i)
                vettore.add(s.nextInt());
            risultati.add(massimo(vettore));
        }
        
        s.close();
        for(Integer i : risultati)
            System.out.println(i);
    }
}
