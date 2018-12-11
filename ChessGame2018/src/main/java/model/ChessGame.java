package model;
// Pattern proxy
public class ChessGame  implements BoardGames {

    private Echiquier echiquier;

    public ChessGame() {
        this.echiquier = new Echiquier();
    }

    @Override
    public String toString() {
        return echiquier.toString() + echiquier.getMessage();
    }

    @Override
    public boolean move(int xInit, int yInit, int xFinal, int yFinal) {
        boolean moveDone;
        moveDone = false;

        if(echiquier.isMoveOk(xInit, yInit, xFinal, yFinal) == true) {
            moveDone = echiquier.move(xInit, yInit, xFinal, yFinal); // We do the mvmt
            if(moveDone == true) {
                echiquier.switchJoueur();
            }
        }

        return  moveDone;
    }

    @Override
    public boolean isEnd() {
        return echiquier.isEnd();
    }

    @Override
    public String getMessage() {
        return echiquier.getMessage();
    }

    @Override
    public Couleur getColorCurrentPlayer() {
        return echiquier.getColorCurrentPlayer();
    }

    @Override
    public Couleur getPieceColor(int x, int y) {
        return echiquier.getPieceColor(x, y);

    }
}
