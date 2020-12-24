import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LlenarDatos {
    public String Crear() throws IOException{//Llave VOID
//------------------------------------------------------------------------------VARIABLES       
        Scanner in = new Scanner(System.in); 
        Scanner nom = new Scanner(System.in);
        Scanner Per = new Scanner(System.in); 
        String sexo = "";
        String nombreCompleto = "";
        String nombreArchivo = "";
        String Permiso = "";
        String Permiso1 = new String("Si");
        String Permiso2 = new String("si");
        int matricula = 0;
        int edad = 0;        
        int Registros = 0;
        int Token = 0;
           
        //Alumnos Entrada = new Alumnos();
//------------------------------------------------------------------------------EJECUCIÓN        
    do{
        System.out.println("---------------------------------------------------");
        System.out.println("                 MENU: LLENAR DATOS                 ");
        System.out.println("---------------------------------------------------");
        System.out.println("NOMBRE DEL ARCHIVO A CREAR >> ");
        nombreArchivo = nom.nextLine();
//------------------------------------------------------------------------------COMPROBAR SI EXISTE EL ARCHIVO        
        File archivo = new File(nombreArchivo + ".txt");//----------------------ARCHIVO TEMPORAL
        if(archivo.exists()){
            System.out.println("ERROR: EL ARCHIVO YA EXISTE");
            System.out.println("DESEAS INTENTAR OTRA VEZ??? ESCRIBE: SI / NO");
            System.out.println("---------------------------------------------------------");
            System.out.print("ELECCIÓN >> ");
            Permiso = Per.nextLine();                    
        }//---------------------------------------------------------------------CIERRE IF
        else{
//------------------------------------------------------------------------------CREAMOS EL ARCHIVO            
            String Ruta = nombreArchivo + ".txt";//-----------------------------GUARDAMOS EL NOMBRE DEL ARCHIVO
            FileWriter Archivo = new FileWriter(Ruta);//------------------------CREAMOS EL ARCHIVO
            System.out.println("SE CREARA EL ARCHIVO");
            System.out.println("---------------------------------------------------------");           
            System.out.println("CUANTOS ALUMNOS REGISTRARAS?");//-------------------CANTIDAD DE REGISTROS
            System.out.print("CANTIDAD >> ");
            Registros = Validacion.leeEnteroSimple(Registros);
            Alumnos vector[] = new Alumnos [Registros];
            for(int i=0; i<Registros; i++){
                System.out.print("INGRESA MATRICULA >> ");
                matricula = Validacion.leeEnteroSimple(matricula);
                //Entrada.setMatricula(matricula);
                System.out.print("INGRESA NOMBRE COMPLETO >> ");
                nombreCompleto = Validacion.leeStringCompuesto(nombreCompleto);
                //Entrada.setNombreCompleto(nombreCompleto);
                System.out.print("INGRESA EDAD >> ");
                edad = Validacion.leeEnteroSimple(edad);
                //Entrada.setEdad(edad);
                System.out.print("INGRESA SEXO [HOMBRE] [MUJER] >> ");
                sexo = Validacion.leeStringDefinido(sexo);
                //Entrada.setSexo(sexo);            
                vector [i] = new Alumnos(matricula, nombreCompleto, edad, sexo);
                Archivo.write(vector[i].matricula + " " + vector[i].nombreCompleto
                + " " + vector[i].edad + " " + vector[i].sexo);//----------------------------------GUARDAMOS LOS DATOS EN EL ARCHIVO
                System.out.println("");
                Archivo.append("\r\n");//---------------------------------------SALTO DE LINEA EN EL ARCHIVO
        }
            Archivo.close();//Cerramos el archivo
//------------------------------------------------------------------------------SALIDA        
                System.out.println("---------------------------------------------------");
                System.out.println("                 DATOS GENERADOS                 ");
                System.out.println("---------------------------------------------------");
                    for(int i=0; i<Registros; i++){
                        System.out.println("ALUMNO ["+i+"]");
                        System.out.println(vector[i].matricula + " / "
                        + vector[i].nombreCompleto + " / "+
                          vector[i].edad + " / "+ vector[i].sexo);                
                    }
                System.out.println("---------------------------------------------------");
                System.out.println("ARCHIVO CREADO CON EXITO");
        }//---------------------------------------------------------------------CIERRE ELSE        
    }while(Permiso.equalsIgnoreCase(Permiso1) || Permiso.equalsIgnoreCase(Permiso2));
            System.out.println("SE TE REGRESARA AL MENU");
            System.out.println("---------------------------------------------------");
            System.out.println("PRESIONA ENTER PARA CONTINUAR...");
            System.in.read();
        return null;
    }
}
