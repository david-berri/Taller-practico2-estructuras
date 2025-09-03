import java.util.HashMap;

public class Algoritmo {

    public static HashMap<String, Integer> FrecuenciaPares(String input){

        ListaEnlazada frase = ToList.StringALista(input);

        HashMap<String, Integer> frecuencias = new HashMap<>();

        for(Nodo x = frase.getHead(); x != null && x.next != null; x = x.next){
            
            String par = "" + x.item + x.next.item;
            frecuencias.put(par, frecuencias.getOrDefault(par, 0) + 1);
        }

        return frecuencias;
    }
}
