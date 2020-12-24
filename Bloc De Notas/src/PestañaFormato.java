
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;


public class PestañaFormato {
    
    public static void Fuente(Frame f, TextArea ta){
        
               
    }

    PestañaFormato(Principal aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
