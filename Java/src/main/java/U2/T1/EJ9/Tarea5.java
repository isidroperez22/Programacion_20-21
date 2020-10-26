package U2.T1.EJ9;
// Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus
// frases con "Javalín, javalón",
// para después hacer una pausa más o menos larga (la pausa se representa mediante
// espacios en blanco)
// y a continuación expresan el mensaje. Existe un dialecto que no comienza sus frases con la
// muletilla anterior,
// pero siempre las terminan con un silencio, más o menos prolongado y la coletilla "javalén, len,
// len".
// Se pide diseñar un traductor que, en primer lugar, nos diga si la frase está escrita en el idioma
// de Javalandia
// (en cualquiera de sus dialectos), y en caso afirmativo, nos muestre el mensaje sin muletillas.
import java.util.Scanner;

public class Tarea5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe una frase: ");
    String frase = sc.nextLine();
    int largo = frase.length();
    String m1 = "Javalín, javalón"; // frase.substring(0, 15);
    String m2 = "javalén, len, len"; // frase.substring(frase.length() - 16, largo);
    //  if ((frase.substring())) {
    //  System.out.println(frase);
    // } else {
    // System.out.println("tu ere de otro sitio");
    // }
  }
}
