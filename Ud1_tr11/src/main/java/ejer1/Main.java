package ejer1;

import java.io.File;
import java.io.FileFilter;

public class Main 
{
	public static void main(String[] args) 
	{
		File miCarpeta = new File("C:\\Windows");
		
		for (File contenido: miCarpeta.listFiles()) {
			System.out.println(contenido.getName());
		}
	}
}
