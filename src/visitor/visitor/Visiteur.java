package visitor.visitor;

/**
 * Created by Rémy Pocquerusse on 26/11/2016.
 */
public interface Visiteur {

    void visit(Bureau bureau);
    void visit(CollectionLivres collectionLivres);
    void visit(GardeRobe gardeRobe);
    void visit(Lampe lampe);
    void visit(Lit lit);
    void visit(Livre livre);
    void visit(Piece piece);
    void visit(Porte porte);
    void visit(Tiroir tiroir);
    void visit(Univers univers);
    void visit(Vetement vetement);
}
