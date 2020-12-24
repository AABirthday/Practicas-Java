import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExistenciaArchivo {//----------------------------------------------CLASE
    static int Comprobar (int Token)throws FileNotFoundException, IOException {//------------COMPROBAR
        Scanner in = new Scanner(System.in); 
        Scanner Per = new Scanner(System.in); 
        String nombre = "";
        String Permiso = "";
        String Permiso1 = new String("Si");
        String Permiso2 = new String("si");
        int Validacion = 0;//[0] Si / [1] No
        
        //System.out.println("NOMBRE DEL ARCHIVO A VALIDAR >> ");
        nombre = in.nextLine();
        System.out.println("---------------------------------------------------");
//------------------------------------------------------------------------------COMPROBAR SI EXISTE EL ARCHIVO
        do{
            File archivo = new File(nombre + ".txt");//Creamos Archivo Temporal
                if(archivo.exists()){
                    System.out.println("ERROR: EL ARCHIVO YA EXISTE");
                    System.out.println("DESEAS INTENTAR OTRA VEZ??? ESCRIBE: SI / NO");
                    System.out.println("---------------------------------------------------------");
                    System.out.print("ELECCIÓN >> ");
                    Permiso = Per.nextLine();
                    Validacion = 0;
                }
                else{
                    System.out.println("EL ARCHIVO NO EXISTE");
                    System.out.println("SE CREARA EL ARCHIVO");
                    System.out.println("---------------------------------------------------------");
                    Validacion = 1;
                    Permiso = "";
                    return Validacion;        
                }
        }while(Permiso.equalsIgnoreCase(Permiso1) || Permiso.equalsIgnoreCase(Permiso2));
        return Validacion;                
    }    
}
