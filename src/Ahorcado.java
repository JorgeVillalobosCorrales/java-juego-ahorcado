import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        // Clase scanner permite al usurio escribir
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos =0;
        boolean palabraAdivinada = false;


        //Arreglos

        char[] letrasAdvinidas = new char[palabraSecreta.length()]; //letras adivinadas es igual al tama;o de palabra secreta

        //Estructura de control: Iterativa (Bucle)
        for(int i=0; i<letrasAdvinidas.length; i++){
            letrasAdvinidas[i] = '_';
           // System.out.print(letrasAdvinidas[i]);
        }
      //  System.out.println("");
      //  System.out.print("Inteligencia");

      while(!palabraAdivinada && intentos< intentosMaximos){
                                                    //Esto se usa cuando teenmos una palabra de chars
        System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdvinidas) + " ("+ palabraSecreta.length() + " letras)");

        System.out.println("Introduce una letra, por favor");
        char letra = Character.toLowerCase(scanner.next().charAt(0)) ;

        boolean letraCorrecta = false;

        for(int i= 0; i<palabraSecreta.length(); i++){
            if(palabraSecreta.charAt(i) == letra){
                letrasAdvinidas[i] = letra;
                letraCorrecta = true;
            }
        }

        if(!letraCorrecta){
            intentos++;
            System.out.println("¡Incorrectas! Te quedan  " + (intentosMaximos - intentos) + " intentos.");
        }

        if (String.valueOf(letrasAdvinidas).equals(palabraSecreta)) {
            palabraAdivinada= true;
            System.out.println("Felicidades has adivinado palabra secreta: " + palabraSecreta);
        }

    }

        if(!palabraAdivinada){
            System.out.println("Te quedastes sin intentos GAME OVER");
        }

        scanner.close();
      

    }
}
