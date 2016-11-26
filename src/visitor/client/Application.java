package visitor.client;

import visitor.visitor.*;

/**
 * Created by Rémy Pocquerusse on 26/11/2016.
 */
public class Application {

    public static void main(String[] args) {

        Univers u = new Univers("Maison");
        Piece piece = new Piece("Chambre");
        Piece piece2 = new Piece("Cuisine");

        u.addObjet(piece);
        u.addObjet(piece2);

        Bureau bureau = new Bureau("Bureau chambre");
        Lampe lampe = new Lampe("Lampe bureau");

        piece.addObjet(bureau);
        bureau.addPetitObjetBasique(lampe);

        Visiteur visiteur = new VisiteurPrefixe();
        u.accept(visiteur);
    }
}
