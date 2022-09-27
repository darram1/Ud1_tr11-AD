package eje2;

import java.io.File;
import java.io.FileFilter;

public class Main 
{
	public static void main(String[] args) 
	{
		File miUbicacion = new File(".");
		
		System.out.println("Tu ubicacion es: " + miUbicacion.getAbsolutePath());
		
	}
}
