public class Gato extends Animal {
    private final String cor_Olhos;

    public Gato(String nome, String racaTipo, int idade, String proprietario, String corOlhos) {
        super(nome, racaTipo, idade, proprietario);
        this.cor_Olhos = corOlhos;
    }

    @Override
    public String toString() {
        return super.toString() + ", corOlhos=" + cor_Olhos;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Gato)) return false;
        Gato outro = (Gato) obj;
        return super.equals(obj) && this.cor_Olhos.equals(outro.cor_Olhos);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + cor_Olhos.hashCode();
    }
}
