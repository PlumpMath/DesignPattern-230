package visitor.visitor;

/**
 * Created by Rémy Pocquerusse on 26/11/2016.
 */
public class Vetement {

    private String name;

    public Vetement(String name) {
        this.name = name;
    }

    public void accept(Visiteur v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vetement{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
