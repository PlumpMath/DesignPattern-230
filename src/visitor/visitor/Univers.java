package visitor.visitor;

import java.util.ArrayList;

/**
 * Created by Rémy Pocquerusse on 26/11/2016.
 */
public class Univers {

    private ArrayList<Piece> pieces;
    private String name;

    public Univers(String name) {
        this.name = name;
        this.pieces = new ArrayList<>();
    }

    public Univers(String name, ArrayList<Piece> pieces) {
        this.pieces = pieces;
        this.name = name;
    }

    public void accept(Visiteur v) {
        v.visit(this);
    }

    public void addObjet(Piece piece) {
        pieces.add(piece);
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Univers{");
        sb.append("pieces=").append(pieces);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
