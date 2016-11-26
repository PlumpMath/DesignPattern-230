package visitor.visitor;

/**
 * Created by Rémy Pocquerusse on 26/11/2016.
 */
public interface PetitObjetBasique extends ObjetBasique {

    @Override
    void accept(Visiteur v);
}
