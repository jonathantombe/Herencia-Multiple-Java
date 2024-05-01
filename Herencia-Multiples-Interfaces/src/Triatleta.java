public class Triatleta  implements Ciclista, Nadador, Corredor{
    @Override
    public void montarBicicleta() {
        System.out.println("El triatleta está montando en bicicleta.");
    }

    @Override
    public void nadar() {
        System.out.println("El triatleta está nadando.");
    }

    @Override
    public void correr() {
        System.out.println("El triatleta está corriendo.");
    }
}
