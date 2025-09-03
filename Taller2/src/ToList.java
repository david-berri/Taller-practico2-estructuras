public class ToList {

    public static ListaEnlazada StringALista(String frase){

        ListaEnlazada letras = new ListaEnlazada();

        for(int i = 0; i <= frase.length()- 1; i++){

            letras.add(frase.charAt(i));

        }

        return letras;
    }    

}
