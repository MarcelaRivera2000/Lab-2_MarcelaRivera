
package lab.pkg2_marcelarivera;

/**
 *
 * @author Mvrivera
 */
public class Personajes {
    private String tipo,name,raza,descripcion,nacionalidad;
    private double estatura,peso;
    private int edad;

    public Personajes() {
    }

    public Personajes(String tipo, String name, String raza, String descripcion, String nacionalidad, double estatura, double peso, int edad) {
        this.tipo = tipo;
        this.name = name;
        this.raza = raza;
        this.descripcion = descripcion;
        this.nacionalidad = nacionalidad;
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getName() {
        return name;
    }

    public String getRaza() {
        return raza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Personajes{" + "tipo=" + tipo + ", name=" + name + ", raza=" + raza + ", descripcion=" + descripcion + ", nacionalidad=" + nacionalidad + ", estatura=" + estatura + ", peso=" + peso + ", edad=" + edad + '}';
    }
    
    
    
}
