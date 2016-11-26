package visitor.visitor;

/**
 * Created by Rémy Pocquerusse on 26/11/2016.
 */
public class VisiteurCompte implements Visiteur {

    public static int compteur = 0;

    @Override
    public void visit(Bureau bureau) {
        compteur++;
        for(PetitObjetBasique p : bureau.getObjetBasiques()) {
            p.accept(this);
        }
    }

    @Override
    public void visit(CollectionLivres collectionLivres) {
        compteur++;
        for(Livre l : collectionLivres.getLivres()) {
            l.accept(this);
        }
    }

    @Override
    public void visit(GardeRobe gardeRobe) {
        compteur++;
        for(Vetement v : gardeRobe.getVetements()) {
            v.accept(this);
        }
    }

    @Override
    public void visit(Lampe lampe) {
        compteur++;
    }

    @Override
    public void visit(Lit lit) {
        compteur++;
    }

    @Override
    public void visit(Livre livre) {
        compteur++;
    }

    @Override
    public void visit(Piece piece) {
        compteur++;
        for(ObjetBasique o : piece.getObjetsBasiques()) {
            o.accept(this);
        }
    }

    @Override
    public void visit(Porte porte) {
        compteur++;
    }

    @Override
    public void visit(Tiroir tiroir) {
        compteur++;
    }

    @Override
    public void visit(Univers univers) {
        compteur++;
        for(Piece p : univers.getPieces()) {
            p.accept(this);
        }
    }

    @Override
    public void visit(Vetement vetement) {
        compteur++;
    }

    public void resetCompteur() {
        compteur = 0;
    }

    public int getCompteur() {
        return compteur;
    }
}
