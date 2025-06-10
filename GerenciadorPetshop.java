public class GerenciadorPetshop {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Rex", "Labrador", 5, "João", "grande");
        Gato cat = new Gato("Mimi", "Siamês", 3, "Maria", "azul");

        Servico banho = new Banho();
        Servico tosa = new Tosa();
        Servico consulta = new ConsultaVet();

        System.out.println(dog);
        System.out.println("Preço Banho: R$" + banho.calcularPreco(dog));
        System.out.println("Preço Tosa: R$" + tosa.calcularPreco(dog));
        System.out.println("Preço Consulta: R$" + consulta.calcularPreco(dog));
        System.out.println();

        System.out.println(cat);
        System.out.println("Preço Banho: R$" + banho.calcularPreco(cat));
        System.out.println("Preço Tosa: R$" + tosa.calcularPreco(cat));
        System.out.println("Preço Consulta: R$" + consulta.calcularPreco(cat));
        System.out.println();

        System.out.println("Comparando dois cachorros iguais:");
        Cachorro outroDog = new Cachorro("Rex", "Labrador", 5, "João", "grande");
        System.out.println("dog.equals(outroDog)? " + dog.equals(outroDog));
        System.out.println("HashCodes: " + dog.hashCode() + " e " + outroDog.hashCode());
    }
}