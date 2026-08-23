public class Personaje {

    // Atributos
    String nombre;
    int nivel;
    int salud;
    int ataque;
    int defensa;
    int experiencia;

    // Constructor
    Personaje(String nombre, int salud, int ataque, int defensa) {

        this.nombre = nombre;
        this.nivel = 1;
        this.salud = salud;
        this.ataque = ataque;
        this.defensa = defensa;
        this.experiencia = 0;

    }

    // Recibir daño
    void recibirDano(int cantidad) {

        salud = salud - cantidad;

        if (salud < 0) {
            salud = 0;
        }

        System.out.println(nombre + " recibio " + cantidad + " de dano.");
    }

    // Recuperar salud
    void recuperarSalud(int cantidad) {

        salud = salud + cantidad;

        System.out.println(nombre + " recupero " + cantidad + " de salud.");
    }

    // Ganar experiencia y subir de nivel
    void ganarExperiencia(int cantidad) {

        experiencia = experiencia + cantidad;

        System.out.println(nombre + " gano " + cantidad + " de experiencia.");

        if (experiencia >= 100) {

            nivel = nivel + 1;
            experiencia = 0;

            System.out.println(nombre + " subio al nivel " + nivel);
        }
    }

    // Mostrar estado
    void mostrarEstado() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Salud: " + salud);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("");
    }

    public static void main(String[] args) {

        // Crear personajes
        Personaje personaje1 = new Personaje("Mateo", 100, 20, 10);
        Personaje personaje2 = new Personaje("Goblin", 80, 15, 5);

        personaje1.mostrarEstado();
        personaje2.mostrarEstado();

        // Enfrentamiento
        System.out.println("COMBATE");

        personaje2.recibirDano(20);
        personaje1.recibirDano(10);

        personaje2.recibirDano(20);

        // Recuperar salud
        personaje1.recuperarSalud(10);

        // Ganar experiencia
        personaje1.ganarExperiencia(100);

        System.out.println("FINAL");
        System.out.println("");

        personaje1.mostrarEstado();
        personaje2.mostrarEstado();
    }
}