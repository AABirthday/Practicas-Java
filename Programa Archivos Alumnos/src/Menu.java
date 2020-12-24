import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public int Impresiones() throws IOException{//Llave VOID
//VARIABLES---------------------------------------------------------------------
        int opc=0;
        Scanner in = new Scanner(System.in);
//------------------------------------------------------------------------------         
        System.out.println(">>>>>>>>>>>>>>> SISTEMA DE CONTROL DE ALUMNOS <<<<<<<<<<<<<<<");
        System.out.println("[1] CREAR ARCHIVO                 [3] ELIMINAR DATOS");
        System.out.println("[2] MOSTRAR/BUSCAR/MODIFICAR      [4] AGREGAR DATOS");
        System.out.println("[5] ORDENAR DATOS POR GENERO      [6] SALIR");
        System.out.println("-------------------------------------------------------------");
        System.out.print("Seleccionar >> ");
        opc = Validacion.leeEnteroSimple(opc);
        return opc;
    }//LLAVE VOID
}
