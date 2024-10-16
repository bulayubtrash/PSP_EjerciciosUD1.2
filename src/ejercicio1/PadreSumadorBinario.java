package ejercicio1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class PadreSumadorBinario {
	public static void main(String[] args) {
		ProcessBuilder pb;
		Process proceso;
		
		Scanner sc= new Scanner(System.in);
		
		OutputStream os;
		OutputStreamWriter osw;
		PrintWriter pw;
		
		InputStream is;
		InputStreamReader isr;
		BufferedReader br;
		
		int n;
		
		System.out.println("Introduzca la ruta del archivo");
		                                          
		pb= new ProcessBuilder(args);
		
		try {
			proceso= pb.start();
			
			DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\usuario\\Desktop\\numeros.dat"));
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	

	

}
