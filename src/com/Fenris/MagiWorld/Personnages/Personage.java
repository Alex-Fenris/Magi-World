package com.Fenris.MagiWorld.Personnages;

import com.Fenris.MagiWorld.Tools.Tools;

import java.util.Scanner;

/**
 * @author AlexFenris
 */
public class Personage {

    /**
     * Construction du Personnage Type
     */
    public Personage (String name) {
        // For receive the values with the keyboard
        this.scan = new Scanner(System.in);

        boolean goodChoice = false;

        while (!goodChoice) {
            // Receives the characteristics of the personage
            creationOfCharacteristics();

            if ((this.strength + this.agility + this.intelligence) != this.level) {
                // Displays the terminal messages
                System.out.println("La somme Force + Agilité + Intelligence doit être égale au niveau du personnage !");
                System.out.println("Recommencez la boucle de saisie");
            }
            else
                goodChoice = true;
        }

        // Name:
        this.name = name;

        // Initial vitality:
        this.INITIAL_VITALITY = this.vitality;

        // Displays the description
        this.description();
    }

    //---------------------------------------------------------------------------------------------


    // ====== GETTER ======

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    public int getVitality() {
        return this.vitality;
    }

    public int getInitialVitality() {
        return this.INITIAL_VITALITY;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getAgility() {
        return this.agility;
    }

    public int getIntelligence() {
        return this.intelligence;
    }


    // ====== ATTACK ======

    /**
     * Lance une attaque de base sur un ennemis
     */
    public void throwBasicAttack(Personage personage) {
        // Displays a terminal message
        System.out.println(this.getName() + " est un simple personnage. Il n'attaque pas.");
    }

    /**
     * Lance l'attaque spèciale
     */
    public void throwSpecialAttack(Personage personage) {
        // Displays a terminal message
        System.out.println(this.getName() + " est un simple personnage. Il n'attaque pas.");
    }


    // ====== DESCRIPTION ======

    /**
     * Descrition du Personnage
     */
    public void description() {
        System.out.println(this.name         + " niveau "       + this.level + " je possède " +
                this.vitality     + " de vitalité, " +
                this.strength     + " de force, "    +
                this.agility      + " d'agilité et " +
                this.intelligence + " d'intelligence !");
    }


    // ====== GAIN and LOSS ======

    /**
     * Attaque reçu par l'ennemis (dommage)
     */
    protected void takeAttack(int damages) {
        // Displays a terminal message
        System.out.println(this.name + " perd " + damages + " points de vie.");

        // Allows to know if the vitality lost is possible
        int vitalityTest = this.vitality - damages;

        // Vitality lost
        if (vitalityTest >= 0)
            this.vitality -= damages;
        else
            this.vitality = 0;

        // Displays a terminal message
        if (this.vitality == 0)
            System.out.println(this.name + " est mort.");
    }

    /**
     * Gains reçu
     */
    protected void takeGains(int gainType, int gains) {
        // gainType determines the gain choice
        switch (gainType) {
            case 1:
                this.level += gains;
                break;
            case 2:
                this.vitality += gains;
                break;
            case 3:
                this.strength += gains;
                break;
            case 4:
                this.agility += gains;
                break;
            case 5:
                this.intelligence += gains;
                break;
        }
    }

    // ====== ASK ======

    /**
     * Demande à l'utilisateur d'entrer un entier avec le clavier
     * @param scope un objet String contenant l'étendue
     * @param minValue un entier contenant la limite minimale de validité
     * @param maxValue un entier contenant la limite de validité maximale
     * @retour la valeur renvoyée
     */
    private int askToUser(String scope, int minValue, int maxValue) {
        // Displays a terminal message
        System.out.println(scope + " du personnage ?");

        // Gets back the choice
        int choice = Tools.askToUser(this.scan, minValue, maxValue);

        return choice;
    }


    // ====== CHARACTERISTICS ======

    /**
     * Permet d'initialiser les caractéristiques du personnage
     */
    private void creationOfCharacteristics() {
        // Level:
        this.level = askToUser("Niveau", 1, 100);

        // Vitality:
        this.vitality = 5 * this.level;

        // Strength:
        this.strength = askToUser("Force", 0, 100);

        // Agility:
        this.agility = askToUser("Agilité", 0, 100);

        // Intelligence:
        this.intelligence = askToUser("Intelligence", 0, 100);
    }

    //---------------------------------------------------------------------------------------------

    private String name;
    private int level;
    private int vitality;
    private int strength;
    private int agility;
    private int intelligence;
    private final int INITIAL_VITALITY;

    private Scanner scan;
}
