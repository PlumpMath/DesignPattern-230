package visitor.visitor;

import java.util.ArrayList;

/**
 * Created by Rémy Pocquerusse on 26/11/2016.
 */
public class GardeRobe implements ObjetBasique {

    private String name;
    private ArrayList<Vetement> vetements;

    public GardeRobe(String name) {
        this.name = name;
        this.vetements = new ArrayList<>();
    }

    public GardeRobe(String name, ArrayList<Vetement> vetements) {
        this.name = name;
        this.vetements = vetements;
    }

    @Override
    public void accept(Visiteur v) {
        v.visit(this);
    }

    public void addObjet(Vetement vetement) {
        this.vetements.add(vetement);
    }

    public ArrayList<Vetement> getVetements() {
        return vetements;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GardeRobe{");
        sb.append("name='").append(name).append('\'');
        sb.append(", vetements=").append(vetements);
        sb.append('}');
        return sb.toString();
    }
}
