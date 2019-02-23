public class VaisseauDeGuerre extends Vaisseau {

    void attaque(Vaisseau vaisseauAttaque, String armeUtilisee, int dureeDeLAttaque) {

        System.out.println("Un vaisseau de type " + type + " attaque un vaisseau de type " + vaisseauAttaque.type + " en utilisant l'arme " + armeUtilisee + " pendant " + dureeDeLAttaque + " minutes.");
        vaisseauAttaque.resistanceDuBouclier = 0;
        vaisseauAttaque.blindage = vaisseauAttaque.blindage / 2;
    }
}
