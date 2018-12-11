package model;

public class PionBlanc extends AbstractPion {
    public PionBlanc(Couleur couleur, Coord coord) {
        super(couleur, coord);
    }

    public boolean isMoveOk(int xFinal, int yFinal, boolean isCatchOk, boolean isCastlingPossible) {
        return false;
    }

    public boolean checkOutOfBounds(int yFinal) {
        return false;
    }

    public boolean checkDiago(int xFinal, int yFinal) {
        return false;
    }
}
