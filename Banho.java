public class Banho extends Servico {

    public Banho() {
        super("Banho", 30.0);
    }

    @Override
    public double calcularPreco(Animal animal) {
        if (animal instanceof Cachorro cachorro) {
            String porte = cachorro.getPorte();
            switch (porte.toLowerCase()) {
                case "pequeno" -> {
                    return precoBase;
                }
                case "médio" -> {
                    return precoBase + 10;
                }
                case "grande" -> {
                    return precoBase + 20;
                }
            }
        }
        return precoBase;
    }
}
