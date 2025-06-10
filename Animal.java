public abstract class Animal {
    protected String nome;
    protected String racaTipo;
    protected int idade;
    protected String proprietario;

    public Animal(String nome, String racaTipo, int idade, String proprietario) {
        this.nome = nome;
        this.racaTipo = racaTipo;
        this.idade = idade;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", racaTipo=" + racaTipo + ", idade=" + idade + ", proprietario=" + proprietario + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Animal)) return false;
        Animal outro = (Animal) obj;
        return this.nome.equals(outro.nome) && this.racaTipo.equals(outro.racaTipo);
    }

    @Override
    public int hashCode() {
        return nome.hashCode() + racaTipo.hashCode();
    }
}
