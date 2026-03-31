import java.util.ArrayList;
public class SistemaMacotas {
    private ArrayList<Mascota> lista;
    public SistemaMacotas () {
        lista = new ArrayList<>();
    }

    public void RegistrarMascota (int tipo, int id, String nombre, int edad){
        if (id <= 0){
            System.out.println("ID inválido");
            return;
        }

        if (nombre.isEmpty()){
            System.out.println("Nombre vacío");
            return;
        }

        if (edad <= 0){
            System.out.println("Edad inválida");
            return;
        }

        Mascota m;
        if (tipo == 1) {
            m = new Perro(id, nombre, edad);
        } else if (tipo == 2) {
            m = new Gato(id, nombre, edad);
        } else {
            System.out.println("Tipo inválido");
            return;
        }
        lista.add(m);
        System.out.println("Mascota registrada correctamente");
    }

    public void MostarMascotas () {
        if (lista.isEmpty()) {
            System.out.println("Lista Vacía");
            return;
        }

        for (Mascota m : lista){
            m.Imprimir();
            System.out.println("Sonido: " + m.Sonido());
            System.out.println("==========================");
        }
    }

    public void EjecutarSonido (int id){
        for (Mascota m : lista) {
            if (m.getId() == id) {
                System.out.println(m.Sonido());
                return;
            }
        }
        System.out.println("Mascota no encontrada");
    }
}
