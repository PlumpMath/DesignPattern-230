package visitor.visitor;

/**
 * Created by Rémy Pocquerusse on 26/11/2016.
 */
public class VisiteurPrefixe implements Visiteur {

    @Override
    public void visit(Bureau bureau) {
        System.out.println(bureau.toString());
        for(PetitObjetBasique p : bureau.getObjetBasiques()) {
            p.accept(this);
        }
    }

    @Override
    public void visit(CollectionLivres collectionLivres) {
        System.out.println(collectionLivres.toString());
        for(Livre l : collectionLivres.getLivres()) {
            l.accept(this);
        }
    }

    @Override
    public void visit(GardeRobe gardeRobe) {
        System.out.println(gardeRobe.toString());
        for(Vetement v : gardeRobe.getVetements()) {
            v.accept(this);
        }
    }

    @Override
    public void visit(Lampe lampe) {
        System.out.println(lampe.toString());
    }

    @Override
    public void visit(Lit lit) {
        System.out.println(lit.toString());
    }

    @Override
    public void visit(Livre livre) {
        System.out.println(livre.toString());
    }

    @Override
    public void visit(Piece piece) {
        System.out.println(piece.toString());
        for(ObjetBasique o : piece.getObjetsBasiques()) {
            o.accept(this);
        }
    }

    @Override
    public void visit(Porte porte) {
        System.out.println(porte.toString());
    }

    @Override
    public void visit(Tiroir tiroir) {
        System.out.println(tiroir.toString());
    }

    @Override
    public void visit(Univers univers) {
        System.out.println(univers.toString());
        for(Piece p : univers.getPieces()) {
            p.accept(this);
        }
    }

    @Override
    public void visit(Vetement vetement) {
        System.out.println(vetement.toString());
    }
}
