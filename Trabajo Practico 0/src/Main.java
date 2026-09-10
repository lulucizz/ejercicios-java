public class Main {
    public static void main(String[] args) {
        //utilizando el constructor sin parámetros
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Juan");
        estudiante1.setApellido("Lopez");
        estudiante1.setEdad(21);
        estudiante1.setCarrera("Ingeniería");
        estudiante1.setPromedio(8.5);

        //utilizando el constructor con parámetros
        Estudiante estudiante2 = new Estudiante("Maria", "Gómez", 25, "Medicina", 9.0);
        Estudiante estudiante3 = new Estudiante("Carlos", "Pérez", 19, "Economía", 8.5);

        //almacena los objetos en un arreglo
        Estudiante[] listaEstudiantes = new Estudiante[3];
        listaEstudiantes[0] = estudiante1;
        listaEstudiantes[1] = estudiante2;
        listaEstudiantes[2] = estudiante3;

        // print in
        System.out.println("--- LISTA DE ESTUDIANTES Y PROMEDIOS ---");
        for (int i = 0; i < listaEstudiantes.length; i++) {
            //operador punto (.)
            System.out.println("Estudiante: " + listaEstudiantes[i].getNombre() + " " + listaEstudiantes[i].getApellido() + 
                               " | Promedio: " + listaEstudiantes[i].getPromedio());
        }
    }
}
