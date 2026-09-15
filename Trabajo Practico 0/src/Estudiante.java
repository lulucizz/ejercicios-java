public class Estudiante {
    String nombre;
    String apellido;
    int edad;
    String carrera;
    double promedio;

    public Estudiante() {

        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.carrera = "";
        this.promedio = 0.0;
    }

    public Estudiante(String nombre, String apellido, int edad, String carrera, double promedio) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }
}
