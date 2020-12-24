//------------------------------------------------------------------------------CLASE
public class Alumnos {
//-------------------------------------------------------------------------------ATRIBUTOS DE LA CLASE
    int matricula;
    String nombreCompleto;
    int edad;
    String sexo;

//------------------------------------------------------------------------------CONSTRUCTOR
    public Alumnos(int matricula, String nombreCompleto, int edad, String sexo){
        this.matricula = matricula;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.sexo = sexo;
    }
//------------------------------------------------------------------------------MÉTODOS PUBLICOS   
    /*
    public int getMatricula() {//[GET] MOSTRAR, SIEMPRE SON PUBLIC.
        return matricula;
    }

    public void setMatricula(int matricula) {//[SET] MODIFICAR.
        this.matricula = matricula;
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }   
*/
}
