import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PestañaArchivos {
    public static Dialog dialogoGuardar;
    public static Frame f;
    public static Label etiquetaGuardar;
    public static Button botonSi;
    public static Button botonNo;
    public static TextField nombreArchivo;
    public static FileDialog fd;
    
//------------------------------------------------------------------------------NUEVO
    public static void Nuevo(TextArea ta){        
           if(ta.getText().length()==0){               
                System.out.println("Area De Texto Vacia");                  
           }else{               
                DialogoGuardar Dialogo = new DialogoGuardar();
                Dialogo.go(ta);               
                ta.setText(" ");
           }
        
        System.out.println("Area De Texto Nueva Ha Sido Creada");  
    }
//------------------------------------------------------------------------------NUEVA VENTANA
    public static void NuevaVentana(){
        System.out.println("Ventana Nueva Abierta");
        Principal Traer1 = new Principal();
        Traer1.go();        
    }
//------------------------------------------------------------------------------ABRIR VENTANA NUEVA    
    public static void Abrir(Frame fr,TextArea ta){//Falta opcion filedialog
        System.out.println("Abriendo Nuevo Archivo");
        ta.setText(" ");
        Scanner entrada = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivo de Texto", "txt"));
        fileChooser.showOpenDialog(fileChooser);
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();  
            File fichero = new File(ruta);
            System.out.println("Ruta Seleccionada "+ruta);
            String nombre = fileChooser.getName(fichero);
            entrada = new Scanner(fichero);
            fr.setTitle(nombre + " - Bloc de notas");
            ta.setText("");
            while (entrada.hasNext()) {
                ta.append(entrada.nextLine());
                ta.append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("No se ha seleccionado ningún fichero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
    }
//------------------------------------------------------------------------------GUARDAR
    public static void Guardar(TextArea ta){
        System.out.println("Proceso De Guardado");
        JFileChooser seleccion = new JFileChooser();
        seleccion.setFileFilter(new FileNameExtensionFilter("Archivo de Texto", "txt"));
        int opcion = seleccion.showSaveDialog(null);
            if (opcion == JFileChooser.APPROVE_OPTION) {                                
                String nombreArchivo = "";
                //String carpeta = System.getProperty("user.dir");
                String ruta = seleccion.getSelectedFile().getAbsolutePath()+nombreArchivo +".txt";
                FileWriter ubicacion = null;      
                try {
                    ubicacion = new FileWriter(ruta);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }      
                BufferedWriter escritor = new BufferedWriter(ubicacion);
                try {
                    escritor.write(ta.getText());//RECOJE LO QUE HAY EN EL AREA DE TEXTO
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    escritor.close();
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Guardado En La Ruta "+ruta);
            }      
    }
//------------------------------------------------------------------------------GUARDAR COMO   
    public static void GuardarComo(TextArea ta){
        System.out.println("Proceso De Guardado");
        JFileChooser seleccion = new JFileChooser();
        seleccion.setFileFilter(new FileNameExtensionFilter("Archivo de Texto", "txt"));
        int opcion = seleccion.showSaveDialog(null);
            if (opcion == JFileChooser.APPROVE_OPTION) {                                
                String nombreArchivo = "";
                //String carpeta = System.getProperty("user.dir");
                String ruta = seleccion.getSelectedFile().getAbsolutePath()+nombreArchivo +".txt";
                FileWriter ubicacion = null;      
                try {
                    ubicacion = new FileWriter(ruta);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }      
                BufferedWriter escritor = new BufferedWriter(ubicacion);
                try {
                    escritor.write(ta.getText());//RECOJE LO QUE HAY EN EL AREA DE TEXTO
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    escritor.close();
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Guardado En La Ruta "+ruta);
            }      
    }
//------------------------------------------------------------------------------NUEVA VENTANA
    public static void Salir(Frame f, TextArea ta){
        if(ta.getText().length()==0){               
                System.out.println("Area De Texto Vacia"); 
                
           }else{
                System.out.println("Texto Existente"); 
                DialogoGuardar Dialogo = new DialogoGuardar();
                Dialogo.go(ta);               
                ta.setText(" ");
           }
        System.out.println("Cerrando Bloc De Notas");
        f.setVisible (false);
        f.dispose ();
               
    }
//------------------------------------------------------------------------------    
    public void actionPerformed(ActionEvent ae) {
		String buttonPressed = ae.getActionCommand();                
		if (buttonPressed.equals("Si")) {
			                 System.out.println("Guardadr");
		}
		else if (buttonPressed.equals("No")) {
			System.out.println("Proceso terminado!!!");
			System.exit(0);
		}		
	}
    
    public void itemStateChanged(ItemEvent ie) {
        String state = "deselected";
            if (ie.getStateChange() == ItemEvent.SELECTED) {
                state = "selected";
            }
            System.out.println(ie.getItem() + " " + state);
    }
    
    
}
