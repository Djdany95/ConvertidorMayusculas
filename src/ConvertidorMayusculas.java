import java.util.Scanner;

public class ConvertidorMayusculas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String texto;

		System.out.println("Introduzca la palabra a convertir: ");
		texto = sc.nextLine();

		texto = texto.toUpperCase();

		System.out.println(texto);

	}

}
