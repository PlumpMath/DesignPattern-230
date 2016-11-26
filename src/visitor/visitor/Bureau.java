package visitor.visitor;

import java.util.ArrayList;

/**
 * Created by Rémy Pocquerusse on 26/11/2016.
 */
public class Bureau implements ObjetBasique {

    private String name;
    public ArrayList<PetitObjetBasique> objetBasiques;

    public Bureau(String name) {
        this.name = name;
        this.objetBasiques = new ArrayList<>();
    }

    public Bureau(String name, ArrayList<PetitObjetBasique> objetBasiques) {
        this.name = name;
        this.objetBasiques = objetBasiques;
    }

    @Override
    public void accept(Visiteur v) {
        v.visit(this);
    }

    public void addPetitObjetBasique(PetitObjetBasique petitObjetBasique) {
        objetBasiques.add(petitObjetBasique);
    }

    public ArrayList<PetitObjetBasique> getObjetBasiques() {
        return objetBasiques;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bureau{");
        sb.append("name='").append(name).append('\'');
        sb.append(", objetBasiques=").append(objetBasiques);
        sb.append('}');
        return sb.toString();
    }
}
