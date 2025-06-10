public class OutroAnimal extends Animal {
    private final String tipoEspecifico;

    public OutroAnimal(String nome, String racaTipo, int idade, String proprietario, String tipoEspecifico) {
        super(nome, racaTipo, idade, proprietario);
        this.tipoEspecifico = tipoEspecifico;
    }

    @Override
    public String toString() {
        return super.toString() + ", tipoEspecifico=" + tipoEspecifico;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof OutroAnimal)) return false;
        OutroAnimal outro = (OutroAnimal) obj;
        return super.equals(obj) && this.tipoEspecifico.equals(outro.tipoEspecifico);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + tipoEspecifico.hashCode();
    }
}
