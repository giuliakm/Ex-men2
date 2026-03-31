public class Mascota {
    private int id;
    private String nombre;
    private int edad;

    public Mascota (int id, String nombre, int edad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public void Imprimir () {
        System.out.println("ID: " + this.id + "\n Nombre: " + this.nombre + "\n Edad: " + this.edad);
    }


    public String Sonido () {
        return "*sonido*";
    }

    public int getId () {
        return this.id;
    }
    public String getNombre () {
        return this.nombre;
    } 

    public int getEdad () {
        return this.edad;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setEdad (int edad) {
        this.edad = edad;
    }
}