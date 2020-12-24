import java.awt.*;
import java.awt.event.*;

public class DialogoGuardar extends Principal implements ActionListener {

  public static Frame f;
  public static Dialog d;
  public static Panel dp;
  public static Button db1;
  public static Button db2;
  public static Label dl;

  public void go (TextArea ta) {      

    d = new Dialog(f, "Dialogo", true);
    dp = new Panel();
    dp.setLayout(new FlowLayout());
    db1 = new Button("Si");
    db2 = new Button("No");
    dp.add(db1);
    dp.add(db2);
    dl = new Label ("Deseas Guadar El Contenido Del Area De Texto???");
    d.add(dl,BorderLayout.NORTH);
    d.add(dp,BorderLayout.SOUTH);
    d.pack();

    db1.addActionListener(this);
    db2.addActionListener(this);

    d.setVisible(true);
  }

  public void actionPerformed( ActionEvent ae) {
    String buttonPressed = ae.getActionCommand();
        if (buttonPressed.equals("No")) {
            System.out.println("El Contenido Anterior No Se Guardara");
            d.setVisible(false);
            d.dispose ();
         
        } else if (buttonPressed.equals("Si")) {
            System.out.println("Guardando");
            PestañaArchivos.Guardar(ta);
            d.setVisible(false);
            d.dispose (); 
        }
  }
}

