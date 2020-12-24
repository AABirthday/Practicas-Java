import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Validacion {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static String cadena;
//------------------------------------------------------------------------------LEER CADENA INICIAL
    public static String leeCadena() throws ReaderException {
        try {
            cadena = br.readLine();
            return cadena;
        } catch (IOException ioe) {
        	throw new ReaderException("Error al leer los datos de entrada");
          }
    }
//------------------------------------------------------------------------------PUBLIC: VALIDAR ENTERO SIMPLE
    public static int leeEnteroSimple(int numero) throws ReaderException, IOException {
        int Validar = 0;        
        //cadena = br.readLine();
//------------------------------------------------------------------------------SENTENCIA DE VALIDACIÓN      
        try {
    	    numero = Integer.parseInt(leeCadena());
            System.out.print("  >> DATO VALIDO\n");
            return numero;//----------------------------------------------------RETURN TRY         
    	} catch (NumberFormatException nfe) {           
            while(Validar==0){
                System.err.println("  >> DATO NO NUMERICO");
                System.out.print("INGRESAR UN DATO NUMERICO >> ");
                cadena = br.readLine();
//------------------------------------------------------------------------------CICLO DE VALIDACIÓN            
                    if(cadena.matches("[0-9]*")){
                        Validar=1;
                        System.out.print("  >> DATO VALIDO\n");
                        numero = Integer.parseInt(cadena);                
                    }                    
            }
            return numero;//----------------------------------------------------RETURN CATCH                
    	  }
    }
//------------------------------------------------------------------------------PUBLIC: VALIDAR STRING CON UN ESPACIO
    public static String leeStringCompuesto(String nombreCompleto) throws ReaderException, IOException {
    	int Validar = 0; 
    	    nombreCompleto = String.valueOf(leeCadena());           
//------------------------------------------------------------------------------SENTENCIA DE VALIDACIÓN                  
            while(Validar==0){ 
                    if(cadena.matches("[a-zA-Z]*( )[a-zA-Z]*")){
                        Validar=1;
                        System.out.print("  >> DATO VALIDO\n");
                        nombreCompleto = String.valueOf(cadena);                
                    }else if(cadena.matches("[0-9]*")){
                        System.err.println("  >> DATO NO ALFABETICO");
                        System.out.print("INGRESAR UN DATO ALFABETICO >> ");
                        cadena = br.readLine();
                    }else if(cadena.matches("[a-zA-Z]*")){
                        System.err.println("  >> DATO NO COMPLETO");
                        System.out.print("INGRESAR NOMBRE Y APELLIDO >> ");
                        cadena = br.readLine();
                    }
            }
            return nombreCompleto;//----------------------------------------------------RETURN                  	         
    }
//------------------------------------------------------------------------------PUBLIC: VALIDAR STRING HOMBRE/MUJER
    public static String leeStringDefinido(String sexo) throws ReaderException, IOException {
    	int Validar = 0; 
    	    sexo = String.valueOf(leeCadena());           
//------------------------------------------------------------------------------SENTENCIA DE VALIDACIÓN                  
            while(Validar==0){ 
                    if(cadena.matches("Hombre") || cadena.matches("Mujer")
                      || cadena.matches("HOMBRE") || cadena.matches("MUJER")
                      || cadena.matches("hombre") || cadena.matches("mujer")){
                        Validar=1;
                        System.out.print("  >> DATO VALIDO\n");
                        sexo = String.valueOf(cadena);                
                    }else if(cadena.matches("[0-9]*")){
                        System.err.println("  >> DATO NO ALFABETICO");
                        System.out.print("INGRESAR UN DATO ALFABETICO >> ");
                        cadena = br.readLine();
                    }else if(cadena.matches("[a-zA-Z]*")){
                        System.err.println("  >> DATO NO VALIDO");
                        System.out.print("NO INGRESASTE UN SEXO VALIDO >> ");
                        cadena = br.readLine();
                    }
            }
            return sexo;//----------------------------------------------------RETURN                  	         
    }
//------------------------------------------------------------------------------PUBLIC: VALIDAR STRING SIMPLE 
    public static String leeStringSimple(String cadenaSimple) throws ReaderException, IOException {
    	int Validar = 0; 
    	    cadenaSimple = String.valueOf(leeCadena());           
//------------------------------------------------------------------------------SENTENCIA DE VALIDACIÓN                  
            while(Validar==0){ 
                    if(cadena.matches("[a-zA-Z]*")){
                        Validar=1;
                        System.out.print("  >> DATO VALIDO\n");
                        cadenaSimple = String.valueOf(cadena);                
                    }else if(cadena.matches("[0-9]*")){
                        System.err.println("  >> DATO NO ALFABETICO");
                        System.out.print("INGRESAR UN DATO ALFABETICO >> ");
                        cadena = br.readLine();
                    }
            }
            return cadenaSimple;//----------------------------------------------------RETURN                  	         
    }
}
