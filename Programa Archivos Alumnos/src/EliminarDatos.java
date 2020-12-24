
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.sql.DriverManager.println;
import java.util.Scanner;


public class EliminarDatos {
    Scanner sc;
//------------------------------------------------------------------------------CLASE MOSTRAR
    public String Eliminar() throws IOException{
        Scanner in=new Scanner(System.in);
        String Busqueda="";
        String Contenido="";
        String Ruta="";
        int matricula = 0;
        int Contador=100;
        int opc = 0;
        String Matriz [][] = new String [Contador][5];//Creamos la matriz
         
        
        System.out.println("---------------------------------------------------");
        System.out.println("             MENU: ELIMINAR DATOS                 ");
        System.out.println("---------------------------------------------------");
        System.out.println("INGRESA EL NOMBRE DEL ARCHIVO");
        System.out.println("---------------------------------------------------");
        System.out.print(">> ");
        Busqueda=in.nextLine();
        //Ruta = ("C:\\Users\\Aarón\\Desktop\\ProgNuevo\\"+Busqueda+".txt");        
//------------------------------------------------------------------------------COMPROBAR SI EXISTE EL ARCHIVO           
        File archivo = new File(Busqueda + ".txt");//---------------------------ARCHIVO TEMPORAL
           if(archivo.exists()){
               FileReader Leer = new FileReader("C:\\Users\\Aarón\\Desktop\\ProgNuevo\\"+Busqueda+".txt");
               String Cadena;
                BufferedReader br = new BufferedReader(Leer);
                System.out.println("----------------------------------------------");
                System.out.println("ARCHIVO: "+Busqueda);
                System.out.println("-----------------CONTENIDO--------------------");
                sc = new Scanner(System.in);
                int j=0;
//------------------------------------------------------------------------------GUARDA LOS DATOS DEL ARCHIVO                
        while((Cadena = br.readLine()) !=null){                        
                String[] Alumnos = Cadena.split(" ");//Por cada espacio, se guardara la palabra               
                System.out.print(Alumnos[0]+" ");    
                System.out.print(Alumnos[1]+" "); 
                System.out.print(Alumnos[2]+" ");
                System.out.print(Alumnos[3]+" ");
                System.out.println(Alumnos[4]);
                
                
                Matriz [j][0] = Alumnos[0];
                Matriz [j][1] = Alumnos[1];
                Matriz [j][2] = Alumnos[2];
                Matriz [j][3] = Alumnos[3];
                Matriz [j][4] = Alumnos[4];
                j=j+1;
        }       
//------------------------------------------------------------------------------BUSCA UN DATO EN ESPECIFICO        
        System.out.println("----------------------------------------------");
        System.out.println("INGRESA LA MATRICULA A ELIMINAR");
        System.out.println("----------------------------------------------");
        System.out.print(">> ");
        matricula = Validacion.leeEnteroSimple(matricula);
        String matriculaCadena= Integer.toString(matricula);
        Contador=5;
            for(int i=0; i<=Contador; i++){
                if(matriculaCadena.equals(Matriz[i][0])){
                    System.out.print(Matriz[i][0]+" ");
                    System.out.print(Matriz[i][1]+" ");
                    System.out.print(Matriz[i][2]+" ");
                    System.out.print(Matriz[i][3]+" ");
                    System.out.println(Matriz[i][4]);
//------------------------------------------------------------------------------MODIFICA LOS DATOS DEL ARCHIVO     
                    System.out.println("----------------------------------------------");
                    System.out.println("¿SEGURO QUIERES ELIMINAR ESTE REGISTRO? 1[SI] / 2[NO]");
                    System.out.println("----------------------------------------------");
                    System.out.print(">> ");
                    opc=Validacion.leeEnteroSimple(opc);
                        if(opc==1){
                            
                            int nuevaMatricula = 0;
                            String nuevoNombre = "";
                            String nuevoApellido = "";
                            int nuevaEdad = 0;
                            String nuevoSexo = "";
                            
                            Matriz[i][0]=null;                           
                            Matriz[i][1]=null;                         
                            Matriz[i][2]=null;                          
                            Matriz[i][3]=null;                          
                            Matriz[i][4]=null;
//------------------------------------------------------------------------------CREAR Y GUARDAR ARCHIVO    
                            FileWriter Archivo = new FileWriter("C:\\Users\\Aarón\\Desktop\\ProgNuevo\\"+Busqueda+".txt");
                            System.out.println("----------------------------------------------");
                            System.out.println("DATOS NUEVOS");
                            System.out.println("----------------------------------------------");
                            for(int x=0; x<j; x++){//Repetimos la matriz                                
                                    for(int Columnas=0; Columnas<5; Columnas++){
                                        System.out.print(Matriz[x][Columnas]+" | ");
                                        Archivo.write(Matriz[x][Columnas]+" ");//Guardamos los datos en el archivo
                                    }
                                System.out.println("");//Creamos un salto de linea en el archivo
                                Archivo.append("\r\n");      
                            }
                            Archivo.close();//Cerramos el archivo
                        }
                }             
            }                        
           }
           else{
               System.err.println("ARCHIVO NO ENCONTRADO: VOLVERAS AL MENU");
           }                               
        System.out.println("REGRESARAS AL MENU");
        System.out.println("PRESIONA ENTER PARA CONTINUAR...");
                System.in.read(); 
        return null;          
    }   
}

