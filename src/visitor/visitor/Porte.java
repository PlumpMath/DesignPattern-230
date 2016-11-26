package visitor.visitor;

/**
 * Created by Rémy Pocquerusse on 26/11/2016.
 */
public class Porte implements ObjetBasique {

    private String name;

    public Porte(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visiteur v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Porte{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
