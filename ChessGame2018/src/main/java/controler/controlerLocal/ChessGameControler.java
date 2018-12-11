package controler.controlerLocal;

import controler.ChessGameControlers;
import model.ChessGame;
import model.Coord;
import model.Couleur;

public class ChessGameControler implements ChessGameControlers {

    private ChessGame chessGame;

    public ChessGameControler(ChessGame chessGame) {
        this.chessGame = chessGame;
    }
    /**
     * @param initCoord
     * @param finalCoord
     * @return true si le déplacement s'est bien passé
     */
    public boolean move(Coord initCoord, Coord finalCoord) {
        return chessGame.move(initCoord.x, initCoord.y, finalCoord.x, finalCoord.y);
    }

    /**
     * @return message relatif aux déplacement, capture, etc.
     */
    public String getMessage() {
        return chessGame.getMessage();
    }

    /**
     * @return true si fin de partie OK (echec et mat, pat, etc.)
     */
    public boolean isEnd() {
        return chessGame.isEnd();
    }

    @Override
    public boolean isPlayerOK(Coord initCoord) {
        if(initCoord != null) {
            Couleur colorCurrentPlayer = this.chessGame.getColorCurrentPlayer();
            Couleur colorTargetPlayer = this.chessGame.getPieceColor(initCoord.x, initCoord.y);

            if(colorCurrentPlayer.equals(colorTargetPlayer)) { //Good color for the good guy
                return true;
            }
        }
        return false;
    }

}
