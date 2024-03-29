package com.Fenris.MagiWorld.Personnages;

public class Guerrier extends Personage {

    /**
     * Construction du Guerrier
     */
    public Guerrier(String name) {
        super(name);
    }

    //---------------------------------------------------------------------------------------------

    @Override
    public void throwBasicAttack(Personage personage) {
        // Contains the damage value
        int damages = this.getStrength();

        // Displays a terminal message
        System.out.println(this.getName() + " utilise Coup d'Epée et inflige " + damages + " dommages.");

        // The enemy receives the damages
        personage.takeAttack(damages);
    }

    @Override
    public void throwSpecialAttack(Personage personage) {
        // Contains the damage value
        int damages = 2 * this.getStrength();

        // Displays a terminal message
        System.out.println(this.getName() + " utilise Coup de Rage et inflige " + damages + " dommages.");

        // The enemy receives the damages
        personage.takeAttack(damages);

        // The personage receives also damages
        damages = this.getStrength() / 2;
        this.takeAttack(damages);
    }

    @Override
    public void description() {
        // Displays the specific characteristic
        System.out.print("Woarg je suis le Guerrier ");

        // From Personage SuperClass
        super.description();
    }
}
