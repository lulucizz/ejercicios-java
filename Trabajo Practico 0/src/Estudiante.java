public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;

    public Estudiante() {
        // Constructor sin parametros   
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.carrera = "";
        this.promedio = 0.0;
    }

    public Estudiante(String nombre, String apellido, int edad, String carrera, double promedio) {
        //constructor con parametros
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    //metodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
