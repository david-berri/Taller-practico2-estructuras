import java.util.HashMap;

public class TestAlgoritmo {
    public static void main(String[] args) {
        prueba1();
        prueba2();
        prueba3();
        prueba4();
        prueba5();

        Algoritmo p1 = new Algoritmo();

        String hola = p1.fraseAleatoria(10);
        System.out.println(hola);
         HashMap<String, Integer> p2 = Algoritmo.FrecuenciaPares(hola);
         System.out.println(p2);
        

       

    }

    public static void prueba1() {
        try {
            HashMap<String, Integer> resultado = Algoritmo.FrecuenciaPares("jota jose");
            assert resultado.get("jo") == 2;
            System.out.println("Prueba 1 aprobada");
        } 
        
        catch (AssertionError e) {
            System.err.println("Prueba 1 falló: " + e.getMessage());
        }
    }

    public static void prueba2() {
        try {
            HashMap<String, Integer> resultado = Algoritmo.FrecuenciaPares("banana");
            // "an" aparece 2 veces
            assert resultado.get("an") == 2;
            System.out.println("Prueba 2 aprobada");
        } 
        
        catch (AssertionError e) {
            System.err.println("Prueba 2 falló: " + e.getMessage());
        }
    }

    public static void prueba3() {
        try {
            HashMap<String, Integer> resultado = Algoritmo.FrecuenciaPares("aaaa");
            // "aa" aparece 3 veces
            assert resultado.get("aa") == 3;
            System.out.println("Prueba 3 aprobada");
        } 
        
        catch (AssertionError e) {
            System.err.println("Prueba 3 falló: " + e.getMessage());
        }
    }

    public static void prueba4() {
        try {
            HashMap<String, Integer> resultado = Algoritmo.FrecuenciaPares("hola");
            // Pares esperados
            assert resultado.get("ho") == 1;
            assert resultado.get("ol") == 1;
            assert resultado.get("la") == 1;
            System.out.println("Prueba 4 aprobada");
        } 
        
        catch (AssertionError e) {
            System.err.println("Prueba 4 falló: " + e.getMessage());
        }
    }

    public static void prueba5() {
        try {
            HashMap<String, Integer> resultado = Algoritmo.FrecuenciaPares("abc abc");
            // "ab" aparece 2 veces
            assert resultado.get("ab") == 2;
            // "c " aparece 1 vez
            assert resultado.get("c ") == 1;
            System.out.println("Prueba 5 aprobada");
        } 
        
        catch (AssertionError e) {
            System.err.println("Prueba 5 falló: " + e.getMessage());
        }
    }
}
