package visitor.visitor;

/**
 * Created by Rémy Pocquerusse on 26/11/2016.
 */
public class Lampe implements PetitObjetBasique {

    private String name;

    public Lampe(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visiteur v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lampe{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
