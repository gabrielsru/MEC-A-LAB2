import java.util.Arrays;
public class Modamedianamedia
{
  public static void main (String[]args)
  {
    calcularM ();
  }
  public static void calcularM()
  {
    int n_elementos = 20;
    int numeros[] = new int[n_elementos];

     for (int posN = 0; posN < numeros.length; posN++)
      {
	int n = (int) (Math.random () * 10) + 1;
	numeros[posN] = n;

      }
    Arrays.sort (numeros);
    for (int i = 0; i < numeros.length; i++)
      {
    System.out.print ("  " + numeros[i]);
      }

    System.out.println ("");

    double med = 0.0;
     for (int i = 0; i < numeros.length; i++)
      {

	med = med + numeros[i];

      }
    med = med / numeros.length;

    System.out.println ("Media =  " + med);


    int median = 0;

    if (numeros.length == 1)
      {

	median = numeros[0];

      }
    else
      {

	if (numeros.length % 2 == 0)
	  {

	    median =
	      (numeros[numeros.length / 2 - 1] +
	       numeros[numeros.length / 2]) / 2;

	  }
	else
	  {

	    median = numeros[numeros.length / 2];

	  }

      }

    System.out.println ("mediana = " + median);


    int numerosDisitintos[] = new int[numeros.length];

    for (int i = 0; i < numerosDisitintos.length; i++)
      {

	numerosDisitintos[i] = -1;

      }
    int posND = 0;

    int posR = 0;


    while (posR < numerosDisitintos.length)
      {

	int nr = numeros[posR];

	int contarNexiste = 0;

	for (int i = 0; i < numerosDisitintos.length; i++)
	  {

	    if (nr == numerosDisitintos[i])
	      {

		contarNexiste++;

	      }

	  }

	if (contarNexiste == 0)
	  {

	    numerosDisitintos[posND] = nr;

	    posND++;

	  }

	posR++;

      }

    int cuentanumeros[] = new int[posND];

    for (int i = 0; i < posND; i++)
      {

	int nd = numerosDisitintos[i];

	for (int j = 0; j < numeros.length; j++)
	  {

	    if (nd == numeros[j])
	      {

		cuentanumeros[i]++;
	      }

	  }

      }

    int max = Integer.MIN_VALUE;
    int Nencontrado = -1;

    for (int i = 0; i < cuentanumeros.length; i++)
      {

	if (max < cuentanumeros[i])
	  {

	    Nencontrado = numerosDisitintos[i];
	    max = cuentanumeros[i];
	  }

      }

    int moda = Nencontrado;

    System.out.println ("Moda= " + moda);
  }
}