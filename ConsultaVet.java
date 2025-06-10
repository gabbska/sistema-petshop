public class ConsultaVet extends Servico {

    public ConsultaVet() {
        super("Consulta Veterinária", 50.0);
    }

    @Override
    public double calcularPreco(Animal animal) {
        return precoBase + animal.idade * 2;
    }
}
