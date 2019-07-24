package com.Fenris.MagiWorld.Personnages;

public class Mage extends Personage {

    /**
     * Construction du Mage
     */
    public Mage(String name) {
        super(name);
    }

    //---------------------------------------------------------------------------------------------

    @Override
    public void throwBasicAttack(Personage personage) {
        // Contains the damage value
        int damages = this.getIntelligence();

        // Displays a terminal message
        System.out.println(this.getName() + " utilise Boule de Feu et inflige " + damages + " dommages.");

        // The enemy receives the damages
        personage.takeAttack(damages);
    }

    @Override
    public void throwSpecialAttack(Personage personage) {
        // Contains the vitality gains
        int gains = 2 * this.getIntelligence();

        // Displays a terminal message
        System.out.println(this.getName() + " utilise Soin et gagne " + gains + " en vitalité.");

        // Allows to know if the vitality gains are possible
        int vitalityTest = this.getVitality() + gains;

        // Add the gain to the vitality (Never greater than the initial vitality
        if (vitalityTest <= this.getInitialVitality())
            this.takeGains(2, gains);
        else
            this.takeGains(2, gains - (vitalityTest - this.getInitialVitality()));
    }

    @Override
    public void description() {
        // Displays the specific characteristic
        System.out.print("Abracadabra je suis le Mage ");

        // From Personage SuperClass
        super.description();
    }
}
