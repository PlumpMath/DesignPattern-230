package visitor.visitor;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Rémy Pocquerusse on 26/11/2016.
 */
public class VisiteurTest {

    VisiteurCompte visiteurCompte;

    @BeforeMethod
    public void setUp() throws Exception {
        visiteurCompte = new VisiteurCompte();
    }

    @Test
    public void testVisiteurCompte() {
        Univers u = new Univers("Maison");
        Piece piece = new Piece("Chambre");
        Piece piece2 = new Piece("Cuisine");
        Bureau bureau = new Bureau("Bureau chambre");
        Lampe lampe = new Lampe("Lampe bureau");
        Vetement vetement = new Vetement("Chemise");
        GardeRobe gardeRobe = new GardeRobe("Garde robe cuisine");

        gardeRobe.addObjet(vetement);
        u.addObjet(piece);
        u.addObjet(piece2);
        piece.addObjet(bureau);
        bureau.addPetitObjetBasique(lampe);
        piece2.addObjet(gardeRobe);

        u.accept(visiteurCompte);
        assertEquals(visiteurCompte.getCompteur(), 7);
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

}