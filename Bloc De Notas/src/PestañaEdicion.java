
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PestañaEdicion {
    public static void Deshacer(){
        System.out.println("Deshacer Acción");
              
    }
    
    public static void Cortar(TextArea ta){
        System.out.println("Contenido Cortado");                                  
    }
    
    public static void Copiar(TextArea ta){
        System.out.println("Contenido Copiado");
        String seleccionado = ta.getSelectedText();
            if(seleccionado != null){
                StringSelection stringSelection = new StringSelection(seleccionado);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null);
            }
    }
    
    public static void Pegar(TextArea ta){
        System.out.println("Contenido Pegado");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        if(clipboard != null){
            clipboard.getContents(ta);
            String textopegado;
            try {
                textopegado = (String) clipboard.getData(DataFlavor.stringFlavor);
                ta.insert(textopegado, ta.getCaretPosition());
            } catch (UnsupportedFlavorException | IOException ex) {
                Logger.getLogger(PestañaEdicion.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    
    public static void Eliminar(TextArea ta){
        System.out.println("Eliminar Contenido");
        try{
        ta.replaceRange("", ta.getSelectionStart(), ta.getSelectionEnd());
       }
       catch(StringIndexOutOfBoundsException e){}     
    }
    
    public static void Buscar(){
        System.out.println("Buscar Contenido");
              
    }
    
    public static void IrA(){
        System.out.println("Ir A Linea Numero");
              
    }
    
    public static void SeleccionarTodo(TextArea ta){
        System.out.println("Contenido Seleccionado");
        ta.selectAll();              
    }
    
    public static void FechayHora(TextArea ta){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        ta.append(dtf.format(now) + " ");                      
    }
}
