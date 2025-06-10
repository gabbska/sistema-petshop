public class Tosa extends Servico {

    public Tosa() {
        super("Tosa", 25.0);
    }

    @Override
    public double calcularPreco(Animal animal) {
        return precoBase + (animal.racaTipo.length() % 5);
    }
}
