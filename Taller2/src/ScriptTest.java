public class ScriptTest {  
    public static void main(String[] args) {
        int length = (int)(Math.random() * 500) + 1; // Números aleatorios para la longitud de la frase
        String randomStr = Algoritmo.FraseAleatoria(length);

        long start = System.nanoTime();
        Algoritmo.FrecuenciaPares(randomStr);
        long end = System.nanoTime();

        long duration = (end - start) / 1_000_000; // ms

        // print CSV row
        System.out.println(length + "," + duration);
    }

    /* Llamamos esta clase en bash con el script guardado en CompiledClasses/script.sh, :

    (Recordar ejecutar javac -d CompiledClasses *.java
    en bash antes del script y correr con bash script.sh)
     */
}
