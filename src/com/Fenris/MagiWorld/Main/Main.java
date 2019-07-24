package com.Fenris.MagiWorld.Main;

import com.Fenris.MagiWorld.Game.MagiWorld;

/**
 * @author AlexFenris
 */
public class Main {

    /**
     * Objet contenant les arguments de la ligne de commande
     */
    public static void main(String[] args) {

        MagiWorld game = new MagiWorld();
        game.run();
    }
}