public class Planete {

    static String forme = "Sphérique";
    static int nbPlanetesDecouvertes;

    String nom;
    long diametre;
    int totalVisiteurs;
    Atmosphere atmosphere;
    Vaisseau vaisseauStock;



    Planete(String nom) {
        nbPlanetesDecouvertes++;
        this.nom = nom;
        System.out.println("Planete " + nom + " est créée.");
    }

    static String expansion(double distanceEntrePlanete) {
        if (distanceEntrePlanete < 14L) {
            return "Oh la la mais c'est super rapide !";
        } else {
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }
    }

    int revolution(int angleAjouter) {
        return angleAjouter / 360;
    }

    int rotation(int angleAjouter) {
        return angleAjouter / 360;
    }

    void accueillirVaisseau(int nbNewHuman) {
        totalVisiteurs = totalVisiteurs + nbNewHuman;
    }

    void accueillirVaisseau(String typeDeVaisseau) {
        if (typeDeVaisseau.equals("CHASSEUR")) {
            totalVisiteurs = totalVisiteurs + 3;
        } else if (typeDeVaisseau.equals("FREGATE")) {
            totalVisiteurs = totalVisiteurs + 12;
        } else if (typeDeVaisseau.equals("CROISEUR")) {
            totalVisiteurs = totalVisiteurs + 50;
        }
    }

    Vaisseau accueillirVaisseau(Vaisseau vaisseau) {
        if (vaisseauStock == null) {
            System.out.println("Aucun vaisseau ne s'en va.");
        } else {
            System.out.println("Un vaisseau de type " + vaisseauStock.type + " doit s'en aller.");
        }
        totalVisiteurs = totalVisiteurs + vaisseau.nbPassagers;
        Vaisseau vaisseauPrecedent = vaisseauStock;
        vaisseauStock = vaisseau;
        return vaisseauPrecedent;
    }
}

