import java.io.IOException;
import static javafx.application.Platform.exit;

public class Principal {//LLAVE CLASS
    public static void main(String[] args) throws IOException{
//------------------------------------------------------------------------------VARIABLES
       int Temporal=0;             
//------------------------------------------------------------------------------REPETIR MENU
       do{
            Menu Traer = new Menu();
            int opc = Traer.Impresiones();
            Temporal = opc;//La asignamos a Temporal
//------------------------------------------------------------------------------SWITCH
        switch(Temporal){
//------------------------------------------------------------------------------CASE 1: CREAR Y LLENAR ARCHIVO
            case 1:    
                LlenarDatos Traer1 = new LlenarDatos();
                Traer1.Crear();
                break;
//------------------------------------------------------------------------------CASE 2: MOSTRAR/BUSCAR/MODIFICAR
            case 2:                
                MostrarModificar Traer2 = new MostrarModificar();
                Traer2.Mostrar();                
                break;
//------------------------------------------------------------------------------CASE 3: ELIMINAR DATOS
            case 3:
                EliminarDatos Traer3 = new EliminarDatos();
                Traer3.Eliminar();
                break;
//------------------------------------------------------------------------------CASE 4: AGREGAR DATOS
            case 4:
                AgregarDatos Traer4 = new AgregarDatos();
                Traer4.Agregar();
                break;
//------------------------------------------------------------------------------CASE 5: ORDENAR DATOS POR GENERO            
            case 5:
                OrdenarGenero Traer5 = new OrdenarGenero();
                Traer5.Ordenar();
                break;
//------------------------------------------------------------------------------CASE 6: SALIR             
            case 6:
                System.out.println("MENSAJE SALIDA...[GOODBYE]");
                exit();
                break;
            default:
                System.out.println("ERROR:DATO NO VALIDO");
                Temporal=1;
                System.out.println("PRESIONA ENTER PARA CONTINUAR...");
                System.in.read(); 
                break;
            
        }//LLAVE SWITCH

       
        
        }while(Temporal<=5 && Temporal>=1);
        
    }//LLAVE VOID
    
}//LLAVE CLASS
