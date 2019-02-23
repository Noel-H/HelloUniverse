public class HelloUniverse {
    public static void main(String... args) {
        Planete mercure = new Planete("Mercure");
        mercure.matiere = "telluriques";
        mercure.diametre = 4880L;

        Planete venus = new Planete("Venus");
        venus.matiere = "telluriques";
        venus.diametre = 12100L;

        Planete terre = new Planete("Terre");
        terre.matiere = "telluriques";
        terre.diametre = 12756L;

        Planete mars = new Planete("Mars");
        mars.matiere = "telluriques";
        mars.diametre = 6792L;

//        Planete soleil = new Planete();
//        soleil.nom = "Soleil";
//        soleil.matiere = "Gazeuse";
//        soleil.diametre = 1391000L;

        Planete jupiter = new Planete("Jupiter");
        jupiter.matiere = "Gazeuse";
        jupiter.diametre = 142984L;

        Planete saturne = new Planete("Saturne");
        saturne.matiere = "Gazeuse";
        saturne.diametre = 120536L;

        Planete uranus = new Planete("Uranus");
        uranus.matiere = "Gazeuse";
        uranus.diametre = 51118L;

        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.hydrogene = 83f;
        atmosphereUranus.helium = 15f;
        atmosphereUranus.methane = 2.5f;

        uranus.atmosphere = atmosphereUranus;

        Planete neptune = new Planete("Neptune");
        neptune.matiere = "Gazeuse";
        neptune.diametre = 49532L;

//        Planete pluton = new Planete();
//        pluton.nom = "Pluton";
//        pluton.matiere = "Gazeuse";
//        pluton.diametre = 2300L;

//        Planete sedna = new Planete();
//
//        System.out.println(sedna.nom + " est une planète " + sedna.matiere + " avec un diamètre de " + sedna.diametre + " kilomètres.");

        System.out.println(neptune.nom + " a effectué " + neptune.revolution(-3542) + " tours complets autour de son étoile.");

        System.out.println(mars.nom + " a effectué " + mars.revolution(-684) + " tours complets sur elle-même.");
        System.out.println(mars.nom + " a effectué " + mars.revolution(-3240) + " tours complets sur elle-même.");


        System.out.println(venus.nom + " a effectué " + venus.revolution(1250) + " tours complets sur elle-même.");

//        mars.accueillirVaisseau(8);
//        mars.accueillirVaisseau("FREGATE");
//
//        System.out.println("Le nombre d'humains ayant déjà séjourné sur " + mars.nom + " est actuellement de " + mars.totalVisiteurs);

        System.out.println("L'atmosphère de " + uranus.nom + " est composée :");
        System.out.println("A " + uranus.atmosphere.hydrogene + "% d'hydrogène");
        System.out.println("A " + uranus.atmosphere.helium + "% d'hélium");
        System.out.println("A " + uranus.atmosphere.methane + "% de méthane");

        Vaisseau vaisseau = new Vaisseau();
        vaisseau.type = "FREGATE";
        vaisseau.nbPassagers = 9;

        Vaisseau newVaisseau = new Vaisseau();
        newVaisseau.type = "CROISEUR";
        newVaisseau.nbPassagers = 42;

        mars.accueillirVaisseau(vaisseau);
        //System.out.println(mars.accueillirVaisseau(vaisseau));

        mars.accueillirVaisseau(newVaisseau);
        //System.out.println(mars.accueillirVaisseau(newVaisseau));

        System.out.println("Le nombre d'humains ayant déjà séjourné sur " + mars.nom + " est actuellemet de " + mars.totalVisiteurs);


        System.out.println("La forme d'une planète est : " + Planete.forme);
        System.out.println("La forme de " + mars.nom + " est : " + mars.forme);

        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));

        System.out.println("Le nombre de planete découverte actuelle est de " + Planete.nbPlanetesDecouvertes);

        VaisseauDeGuerre ship = new VaisseauDeGuerre();
        ship.type = "Chasseur";
        ship.blindage = 156;
        ship.resistanceDuBouclier = 2;

        VaisseauCivil ship2 = new VaisseauCivil();
        ship2.type = "Vaisseau-Monde";
        ship2.blindage = 4784;
        ship2.resistanceDuBouclier = 30;

        ship.activerBouclier();
        ship2.activerBouclier();

        ship.attaque(ship2, "lasers photoniques", 3);

        ship2.desactiverBouclier();

        System.out.println("La durée de protection résiduelle du bouclier du " + ship2.type + " est de " + ship2.resistanceDuBouclier);
        System.out.println("La valeur du blindage du " + ship2.type + " est de " + ship2.blindage);
    }
}
