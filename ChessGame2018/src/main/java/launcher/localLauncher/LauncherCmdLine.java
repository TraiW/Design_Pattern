package launcher.localLauncher;

import controler.controlerLocal.ChessGameControler;
import model.ChessGame;
import vue.ChessGameCmdLine;



/**
 * @author francoise.perrin
 * Lance l'exécution d'un jeu d'échec en mode console.
 */
public class LauncherCmdLine {

	public static void main(String[] args) {

		ChessGame model;
		ChessGameControler controler;
		ChessGameCmdLine vue;

		model = new ChessGame();
		controler = new ChessGameControler(model);

		new ChessGameCmdLine(controler);

		vue = new ChessGameCmdLine(controler);

		vue.go();
	}

}
