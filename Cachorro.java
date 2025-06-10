public class Cachorro extends Animal {
    private final String porte;

    public Cachorro(String nome, String racaTipo, int idade, String proprietario, String porte) {
        super(nome, racaTipo, idade, proprietario);
        this.porte = porte;
    }

    @Override
    public String toString() {
        return super.toString() + ", porte=" + porte;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cachorro)) return false;
        Cachorro outro = (Cachorro) obj;
        return super.equals(obj) && this.porte.equals(outro.porte);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + porte.hashCode();
    }

    public String getPorte() {
        return porte;
    }
}
