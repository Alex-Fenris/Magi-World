package com.Fenris.MagiWorld.Tools;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tools {

    /**
     * Demander à l'utilisateur d'entrer un entier avec le clavier
     * @param scan un objet Scanner qui reçoit les valeurs du clavier
     * @param minValue un entier contenant la limite minimale de validité
     * @param maxValue un entier contenant la limite de validité maximale
     * @retour la valeur renvoyée
     */
    public static int askToUser(Scanner scan, int minValue, int maxValue) {
        // Gets back the choice
        int choice = -1;

        // The choice must be in the range [minValue ; maxValue]
        do {
            try {
                choice = scan.nextInt();

                if (choice < minValue || choice > maxValue)
                    System.out.println("L'intervalle de validité est [" + minValue + " ; " + maxValue + "].");
            }
            catch (InputMismatchException e) {
                scan.next();
                System.out.println("Veuilliez saisir un entier, s'il vous plaît !");
            }
        } while (choice < minValue || choice > maxValue);

        return choice;
    }
}
