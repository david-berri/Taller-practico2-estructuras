import java.util.HashMap;
import java.util.Random;

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

    public static String FraseAleatoria(int tam){
         
        String resultado = "";
       final int min = 65,  max = 90; // Código ASCII de 'A'
        Random random = new Random();

        for(int indice = 0; indice < tam; indice++){

    int codigoAsciiAleatorio = random.nextInt(max - min + 1) + min;
        char letraAleatoria = (char) codigoAsciiAleatorio;

        resultado +=  letraAleatoria;

        }

        return resultado;

    }

}
