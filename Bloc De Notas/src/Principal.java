import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Principal extends WindowAdapter implements ActionListener{
    private Frame f;//---------------------------------------------------VENTANA
    private MenuBar mb;//------------------------------------------BARRA DE MENU
    static TextArea ta;//------------------------------------------AREA DE TEXTO
    
    private Menu m1;//-----------------------------------------PESTAÑA 1:ARCHIVO
    private Menu m2;//-----------------------------------------PESTAÑA 2:EDICION
    private Menu m3;//-----------------------------------------PESTAÑA 3:FORMATO
    private Menu m4;//---------------------------------------------PESTAÑA 4:VER
    private Menu m5;//-------------------------------------------PESTAÑA 5:AYUDA
//------------------------------------------------------------------------------BOTONES DE LA PESTAÑA 1: ARCHIVO
    private MenuItem nuevo;
    private MenuItem nuevaVentana;
    private MenuItem abrir;
    private MenuItem guardar;
    private MenuItem guardarComo;
    private MenuItem imprimir;
    private MenuItem salir;
//------------------------------------------------------------------------------BOTONES DE LA PESTAÑA 2: EDICION
    private MenuItem deshacer;
    private MenuItem cortar;
    private MenuItem copiar;
    private MenuItem pegar;
    private MenuItem eliminar;
    private MenuItem buscar;
    private MenuItem irA;
    private MenuItem seleccionarTodo;
    private MenuItem fechayHora;
//------------------------------------------------------------------------------BOTONES DE LA PESTAÑA 3: FORMATO
    private MenuItem ajusteDeLinea;
    private MenuItem fuente;
//------------------------------------------------------------------------------BOTONES DE LA PESTAÑA 4: VER
    private MenuItem zoom;
    private MenuItem barraDeEstado;
//------------------------------------------------------------------------------BOTONES DE LA PESTAÑA 5: AYUDA  
    private MenuItem verAyuda;
    private MenuItem enviarComentarios;
    private MenuItem acercaDelBloc;        
    
//------------------------------------------------------------------------------MAIN DE EJECUCIÓN
  public static void main (String args[]) {
    Principal Traer1 = new Principal();
    Traer1.go();
  }
//------------------------------------------------------------------------------VOID: PARAMETROS DE ACCIÓN
  public void go() {
//------------------------------------------------------------------------------ACCIONES DEL PROGRAMA
    f = new Frame("Sin Titulo: Bloc De Notas");//-------------------------------TITULO DE LA VENTANA
    f.setSize(400,400);//-------------TAMAÑO DE LA VENTA (HORIZONTAL * VERTICAL)
    f.setVisible(true);//--------------------------------------------VER VENTANA
    f.addWindowListener((WindowListener) this);
    ta = new TextArea("", 4, 30);//----------------------TAMAÑO DEL AREA DE TEXO
    f.add(ta, BorderLayout.CENTER);//--POSICIONAR EL AREA DE TEXTO EN LA VENTANA
    
//------------------------------------------------------------------------------ACCIONES DE LA BARRA DE MENU
    mb = new MenuBar();//------------------------------------------BARRA DE MENU
    f.setMenuBar(mb);//----------------------COLOCAR BARRA DE MENU EN LA VENTANA        
//------------------------------------------------------------------------------PESTAÑAS
    m1 = new Menu("Archivo");//----------------------------------NOMBRAR PESTAÑA
    m2 = new Menu("Edicion");
    m3 = new Menu("Formato");
    m4 = new Menu("Ver");
    m5 = new Menu("Ayuda");    
//------------------------------------------------------------------------------COLOCAR PESTAÑAS EN LA BARRA DE MENU
    mb.add(m1);
    mb.add(m2);
    mb.add(m3);
    mb.add(m4);
    mb.add(m5);    
//------------------------------------------------------------------------------BOTONES DE PESTAÑA "ARCHIVO"    
    nuevo = new MenuItem("Nuevo");//--------------NOMBRAR BOTONES DE LA PESTAÑA"
    nuevaVentana = new MenuItem("Nueva Ventana");
    abrir = new MenuItem("Abrir");
    guardar = new MenuItem("Guardar");
    guardarComo = new MenuItem("Guardar Como");
    imprimir = new MenuItem("Imprimir");
    salir = new MenuItem("Salir");
        
    m1.add(nuevo);//------------------------METER BOTONES A LA PESTAÑA "ARCHIVO"
    m1.add(nuevaVentana);
    m1.add(abrir);
    m1.add(guardar);
    m1.add(guardarComo);
    m1.add(imprimir);
    m1.add(salir);
//------------------------------------------------------------------------------BOTONES DE PESTAÑA "EDICION"     
    deshacer = new MenuItem("Deshacer");
    cortar = new MenuItem("Cortar");
    copiar = new MenuItem("Copiar");
    pegar = new MenuItem("Pegar");
    eliminar = new MenuItem("Eliminar");
    buscar = new MenuItem("Buscar");
    irA = new MenuItem("Ir A...");
    seleccionarTodo = new MenuItem("Seleccionar Todo");
    fechayHora = new MenuItem("Fecha y Hora");
    
    m2.add(deshacer);//------------------------METER BOTONES A LA PESTAÑA "ARCHIVO"
    m2.add(cortar);
    m2.add(copiar);
    m2.add(pegar);
    m2.add(eliminar);
    m2.add(buscar);
    m2.add(irA);
    m2.add(seleccionarTodo);
    m2.add(fechayHora);
//------------------------------------------------------------------------------BOTONES DE PESTAÑA "FORMATO" 
    ajusteDeLinea = new MenuItem("Ajuste De Linea");//--------------NOMBRAR BOTONES DE LA PESTAÑA"
    fuente = new MenuItem("fuente");

        
    m3.add(ajusteDeLinea);//------------------------METER BOTONES A LA PESTAÑA "ARCHIVO"
    m3.add(fuente);

//------------------------------------------------------------------------------BOTONES DE PESTAÑA "VER"

//------------------------------------------------------------------------------BOTONES DE PESTAÑA "AYUDA"  

    
//------------------------------------------------------------------------------IMPLEMENTAR BOTONES ALL  
    nuevo.addActionListener(this);
    nuevaVentana.addActionListener(this);
    abrir.addActionListener(this);
    guardar.addActionListener(this);
    guardarComo.addActionListener(this);
    imprimir.addActionListener(this);
    salir.addActionListener(this);
    
    deshacer.addActionListener(this);
    cortar.addActionListener(this);
    copiar.addActionListener(this);
    pegar.addActionListener(this);
    eliminar.addActionListener(this);
    buscar.addActionListener(this);
    irA.addActionListener(this);
    seleccionarTodo.addActionListener(this);
    fechayHora.addActionListener(this);
    
    ajusteDeLinea.addActionListener(this);
    fuente.addActionListener(this);
    
  }
//------------------------------------------------------------------------------CIERRE GO

 
  
//------------------------------------------------------------------------------VOID: EVENTOS
    public void actionPerformed(ActionEvent ev){
        System.out.println("Opcion \"" + ev.getActionCommand() + "\" Elegida.");
        switch(ev.getActionCommand()){
//------------------------------------------------------------------------------PESTAÑA ARCHIVO            
            case "Nuevo":
            PestañaArchivos.Nuevo(ta);           
            break;
            case "Nueva Ventana":
                PestañaArchivos.NuevaVentana();
            break;
            case "Abrir":                
                PestañaArchivos.Abrir(f,ta);
            break;
            case "Guardar":
                PestañaArchivos.Guardar(ta);//Falta comparar INCOMPLETO
            break;
            case "Guardar Como":
                PestañaArchivos.GuardarComo(ta);
            break;
            case "Imprimir":
                //Instrucciones.nuevo(ta);//INCOMPLETO
            break;
            case "Salir":
                PestañaArchivos.Salir(f,ta);
            break;
//------------------------------------------------------------------------------PESTAÑA EDICION            
            case "Deshacer":
                //PestañaEdicion.Copiar(ta);
            break;
            case "Cortar":
                //PestañaEdicion.Cortar(ta);////////INCOMPLETO
            break;
            case "Copiar":
                PestañaEdicion.Copiar(ta);//TEAM
            break; 
            case "Pegar":
                PestañaEdicion.Pegar(ta);//TEAM
            break;
            case "Eliminar":
                PestañaEdicion.Eliminar(ta);//TEAM
            break;
            case "Buscar":
                //PestañaEdicion.Copiar(ta);    
            break;
            case "Ir A...":
                //PestañaEdicion.Copiar(ta);
            break;            
            case "Seleccionar Todo":
                PestañaEdicion.SeleccionarTodo(ta);//TEAM
            break;         
            case "Fecha y Hora":
                PestañaEdicion.FechayHora(ta);//TEAM
            break;
//------------------------------------------------------------------------------PESTAÑA FORMATO
            case "Ajuste De Linea":
                PestañaEdicion.FechayHora(ta);//INCOMPLETO
            break;
            case "Fuente":
                PestañaEdicion.FechayHora(ta);
            break;
        }
      
    }
//------------------------------------------------------------------------------VOID: BOTON CERRAR VENTANA
    public void windowClosing(WindowEvent ev){
        System.out.println("Bloc De Notas Cerrado.");
        PestañaArchivos.Salir(f, ta);
    }
//------------------------------------------------------------------------------VOID: ITEM STATE  
    public void itemStateChanged(ItemEvent ie) {
        String state = "deselected";
        if (ie.getStateChange() == ItemEvent.SELECTED) {
            state = "selected";
        }
        System.out.println(ie.getItem() + " " + state);
    }        
}