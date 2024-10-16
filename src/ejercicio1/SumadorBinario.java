package ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SumadorBinario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File fichero = new File("C:\\Users\\usuario\\Desktop\\numeros.txt");
		BufferedReader br;
		String line;
		String n1=sc.nextLine();
		String n2=sc.nextLine();

		try {
			br = new BufferedReader(new FileReader(fichero));
			
			while((line=br.readLine())!=null) {
				
				if(n1.equals(line)) {
					//conitnuar qui, la idea es pasar dos valores que seran las lineas, si coinciden pues ir sumadno hasta cerrar
				}
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
