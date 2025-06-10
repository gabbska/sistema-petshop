public abstract class Servico {
    protected String nome;
    protected double precoBase;

    public Servico(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public abstract double calcularPreco(Animal animal);

    @Override
    public String toString() {
        return "Servico{" + "nome=" + nome + ", precoBase=" + precoBase + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Servico)) return false;
        Servico outro = (Servico) obj;
        return this.nome.equals(outro.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }
}
