
public class EmploiDuTemps {    
    public static void main(String[] args) {

        // 1. Declarer les listes
        String[] cours = {"Java", "C", "Python"};
        String[] professeurs = {"M. X", "M. Y", "M. Z"};
        String[] jours = {
            "Lundi", "Mardi", "Mercredi",
            "Jeudi", "Vendredi", "Samedi"
        };

        // 2. Construire l'emploi du temps
        String[][] emploiDuTemps = new String[6][4];

        // 3. Programmer les cours
        int nombreSeances = 0;

        for (int i = 0; i < jours.length; i++) {

            // Choisir un cours et son professeur
            int indiceCours = i % cours.length;

            String coursActuel = cours[indiceCours];
            String professeurActuel = professeurs[indiceCours];

            // 4. Verifier la contrainte
            if (nombreSeances == 0 ||
                !professeurActuel.equals(
                    emploiDuTemps[nombreSeances - 1][3])) {

                emploiDuTemps[nombreSeances][0] = jours[i];
                emploiDuTemps[nombreSeances][1] = "8h-12h";
                emploiDuTemps[nombreSeances][2] = coursActuel;
                emploiDuTemps[nombreSeances][3] = professeurActuel;

                nombreSeances++;
            }
        }

        // 5. Afficher l'emploi du temps
        System.out.println("EMPLOI DU TEMPS");
        System.out.printf("%-12s %-12s %-12s %-12s%n",
                          "Jour", "Horaire", "Cours", "Professeur");

        for (int i = 0; i < nombreSeances; i++) {
            System.out.printf("%-12s %-12s %-12s %-12s%n",
                emploiDuTemps[i][0],
                emploiDuTemps[i][1],
                emploiDuTemps[i][2],
                emploiDuTemps[i][3]);
        }
    }
}
