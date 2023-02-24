import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main
{
  public static void main (String[]hola)
  {
      String linea;
      try (Scanner sc = new Scanner (System.in)) {
          System.out.print ("Ingrese caracteres ");
          linea = sc.nextLine ();
      }
    char caracterMasFrecuente = obtenerCaracterMasFrecuente (linea);
      System.
      out.println ("El caracter que mas se repite es " +
		   caracterMasFrecuente);
    String lineaModificada = sustituirVocales (linea, caracterMasFrecuente);
      System.out.println ("La modificada es " + lineaModificada);
    String lineaInvertida = invertirLinea (linea);
      System.out.println ("La invertida es " + lineaInvertida);
  }
  private static char obtenerCaracterMasFrecuente (String cadena)
  {
    Map < Character, Integer > contador = new HashMap <> ();
  for (char caracter:cadena.toCharArray ())
      {
	if (contador.containsKey (caracter))
	  {
	    contador.put (caracter, contador.get (caracter) + 1);
	  }
	else
	  {
	    contador.put (caracter, 1);
	  }
      }
    char caracterMasFrecuente = '\0';
    int frecuenciaMaxima = 0;
  for (Map.Entry < Character, Integer > entrada:contador.entrySet ())
      {
	char caracter = entrada.getKey ();
	int frecuencia = entrada.getValue ();
	if (frecuencia > frecuenciaMaxima)
	  {
	    caracterMasFrecuente = caracter;
	    frecuenciaMaxima = frecuencia;
	  }
      }
    return caracterMasFrecuente;
  }
  private static String sustituirVocales (String linea, char caracter)
  {
    String nuevaLinea = "";
  for (char x:linea.toCharArray ())
      {
	if (esVocal (x))
	  {
	    nuevaLinea += caracter;
	  }
	else
	  {
	    nuevaLinea += x;
	  }
      }
    return nuevaLinea;
  }
  private static boolean esVocal (char x)
  {
    return "AEIOU aeiou".indexOf (x) != -1;
  }
  private static String invertirLinea (String linea)
  {
    String nuevaLinea = "";
    for (int i = linea.length () - 1; i >= 0; i--)
      {
	nuevaLinea += linea.charAt (i);
      }
    return nuevaLinea;
  }
}
