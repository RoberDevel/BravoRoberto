public class Main {
    /*Crear una clase "Animal" con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación (con sus métodos y constructores correspondientes).
    Agregar también un método llamado saludar que emita un mensaje por pantalla que diga “Hola, soy un animal”.
    A partir de esto hacer lo siguientes pasos:

a) Crear sus clases hijas que compartan sus atributos y métodos:

"Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.

"Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.

"Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.

b)  Una vez creadas las clases, crear los siguientes métodos:

"Mamífero": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".

"Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".

"Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".

c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.

d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?

E) Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?*/
    public static void main(String[] args) {

        //c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.

        Mamifero mamifero1 = new Mamifero();
        Ave ave1 = new Ave();
        Reptil reptil1 = new Reptil();
        mamifero1.saludar();
        ave1.saludar();
        reptil1.saludar();

        //d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?
        Animal animal1 = mamifero1;
        animal1.saludar();
        System.out.println(animal1.getClass().getName());
        //Pinta el mensaje del metodo de la clase Mamifero, asi que si es posible


        //E) Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?
        //Si se pone en private en las clases hijas, da un error diciendo que estás asignando un privilegio (private) donde era publico.
        //En cambio si pones private en la clase Animal, no puedes utilizar el metodo en sus clases hijas, ya que al ser privado no se puede acceder a este.
        //Asi que no seria posible hacer esto.

    }
}