package clase13.ejercicio26;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class GenerarPassword {

	private int    longuitud=8; 
	private String contrasena;
	
	public GenerarPassword() {
		
	}
	
	public GenerarPassword(int longuitud, String contrasena) {
		
		super();
		this.longuitud = longuitud;
		this.contrasena = contrasena;
			
	}
	
	public String esFuerte(String password) {
		
		String Password=password;
		int Mayuscula=0,Minuscula=0,Numeros=0,i=0,lenght=0;
		
		lenght=Password.length();
		
		for (i=0;i<lenght;i++) {
			
			if (Character.isUpperCase(Password.charAt(i))){
				Mayuscula=Mayuscula+1;
						
			}
			if  (Character.isLowerCase(Password.charAt(i)))
			{
				Minuscula=Minuscula+1;
				
			}

			if (Password.charAt(i)=='0'||Password.charAt(i)=='1'||
					Password.charAt(i)=='2'||Password.charAt(i)=='3'||
					Password.charAt(i)=='4'||Password.charAt(i)=='5'||
					Password.charAt(i)=='6'||Password.charAt(i)=='7'||
					Password.charAt(i)=='8'||Password.charAt(i)=='9')
				{
				Numeros=Numeros+1;
				}
			
				}
		
		if (Mayuscula>2&&Minuscula>1&&Numeros>5) {
			
			return "Es fuerte";
			} 
		else {
			return "es debil";
		}
		
	}

		    public static String generarPassword() {
		        String uuid = UUID.randomUUID().toString();
		        return uuid;
		    }
			
		    
	public int getLonguitud() {
		return longuitud;
	}

	public void setLonguitud(int longuitud) {
		this.longuitud = longuitud;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
