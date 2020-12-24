
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.sql.DriverManager.println;
import java.util.Scanner;


public class OrdenarGenero {
    Scanner sc;
//------------------------------------------------------------------------------CLASE MOSTRAR
    public String Ordenar() throws IOException{
        Scanner in=new Scanner(System.in);
        String Busqueda="";
        String Contenido="";
        String Ruta="";
        int matricula = 0;
        int Contador=100;
        int opc = 0;
        int op = 0;
        String Matriz [][] = new String [Contador][5];//Creamos la matriz
         
        
        System.out.println("---------------------------------------------------");
        System.out.println("         MENU: MOSTRAR / BUSCAR / MODIFICAR                 ");
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
        System.out.println("-------------CONTENIDO ORDENADO----------------");
//------------------------------------------------------------------------------ORDENAR   
        String Man="Hombre";
        String Woman="Mujer";
        Contador=5;
            for(int i=0; i<=Contador; i++){
                System.out.println("              MUJERES");
                System.out.println("----------------------------------------");
                for(int w=0; w<=Contador; w++){
                    if(Woman.equals(Matriz[w][4])){
                    System.out.print(Matriz[w][0]+" ");
                    System.out.print(Matriz[w][1]+" ");
                    System.out.print(Matriz[w][2]+" ");
                    System.out.print(Matriz[w][3]+" ");
                    System.out.println(Matriz[w][4]);
                    }
                }
                System.out.println("----------------------------------------");
                System.out.println("              HOMBRES");
                System.out.println("----------------------------------------");
                for(int w=0; w<=Contador; w++){
                    if(Man.equals(Matriz[w][4])){
                    System.out.print(Matriz[w][0]+" ");
                    System.out.print(Matriz[w][1]+" ");
                    System.out.print(Matriz[w][2]+" ");
                    System.out.print(Matriz[w][3]+" ");
                    System.out.println(Matriz[w][4]);
                    }
                }
                i=Contador;                             
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