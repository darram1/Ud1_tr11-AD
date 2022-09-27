package eje3;

import java.io.File;
import java.io.FileFilter;

public class Main 
{
	public static void main(String[] args) 
	{
		File miCarpeta = new File(".");
		
		listado(miCarpeta);
	}
	
	public static void listado (File miCarpeta) 
	{
		
		if(!miCarpeta.exists())
		{
			System.out.println(miCarpeta.getName() + " no encontrado.");
		}else if(miCarpeta.isFile())
		{
			System.out.println(miCarpeta.getParentFile());
		}else if(miCarpeta.isDirectory())
		{
			File[] files = miCarpeta.listFiles();
			
			for(File f : files)
			{
				listado(f);
			}
		}else 
		{
			System.out.println("Carpeta vacia");
		}
	}
}