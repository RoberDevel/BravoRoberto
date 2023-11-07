public class Main {
    /*Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono (tener en cuenta todos sus atributos, constructores y métodos getters y setters).

a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.

b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.

c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.

d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.*/
    public static void main(String[] args) {

        //a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
        Persona [] personas=new Persona[5];
        personas[0]= new Persona(1, "Roberto", 41, "Calle 1","666666666");
        personas[1]= new Persona(2, "Paco", 40, "Calle 2","666555555");
        personas[2]= new Persona(3, "Maria", 25, "Calle 3","666444444");
        personas[3]= new Persona(4, "Lara", 35, "Calle 4","666333333");
        personas[4]= new Persona(5, "Ismael", 20, "Calle 5","666222222");

        //b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: "+personas[i].getNombre()+", edad: "+personas[i].getEdad());
        }
        System.out.println();
        //c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.
        System.out.println("Antes:");
        System.out.println("Nombre 1: "+personas[0].getNombre());
        System.out.println("Nombre 2: "+personas[1].getNombre());
        personas[0].setNombre("Cristian");
        personas[1].setNombre("Fran");
        System.out.println("Despues:");
        System.out.println("Nombre 1: "+personas[0].getNombre());
        System.out.println("Nombre 2: "+personas[1].getNombre());
        System.out.println();
        //d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
        for (Persona persona:personas ) {
            if(persona.getEdad()>30){
                System.out.println(persona.toString());
            }
        }

    }
}