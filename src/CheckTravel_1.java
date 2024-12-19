public class CheckTravel_1 {

    public static void main(String[] args) {
        //1.Feladat
        //Írjuk le az alábbi utazási biztosítással kapcsolatos relációkat helyes szintaktikával!
        //Változó nevek tetszőlegesen választhatók.


        boolean aloneTravel = true;
        boolean business = true;
        boolean europeCountry = true;
        boolean firstResult = checkingFirstAnswer(aloneTravel, business, europeCountry);



        boolean sportGoal = true;
        int age = 18;
        boolean injured = false;
        boolean secondResult = checkingSecondAnswer(sportGoal, age, injured);


        boolean abroadBootCamp = true;
        boolean thirdResult = checkingThirdAnswer(aloneTravel, abroadBootCamp);


        int parents = 2;
        int children = 2;
        boolean beachParty = true;
        boolean fourthResult = checkingFourthAnswer(parents, children, beachParty, injured);


        boolean cityVisit = true;
        boolean fifthResult = checkingFifthAnswer(cityVisit, europeCountry, injured);

    }

    //Igaz, ha egyedül utazik és üzleti úton vesz részt és európai országba utazik
    private static boolean checkingFirstAnswer(boolean isAlone, boolean isBusiness, boolean isEuropeCountry) {
        return isAlone && isBusiness && isEuropeCountry;
    }

    //akkor is igaz, ha sportolási céllal utazik, legalább 18 éves és még nem volt balesete
    private static boolean checkingSecondAnswer(boolean isItSportGoal, int age, boolean hadInjury) {

        return isItSportGoal && age >= 18 && !hadInjury;

    }

    //Igaz, ha egyedül utazik és külföldi tanulmányúton vesz részt
    private static boolean checkingThirdAnswer(boolean isAlone, boolean isAbroadBootCamp) {
        return isAlone && isAbroadBootCamp;
    }

    //akkor is igaz, ha családdal utazik (2 felnőtt és legalább 2 gyerek) és tengerpari nyaraláson vesz részt és még nem volt balesete
    private static boolean checkingFourthAnswer(int parents, int children, boolean beachParty, boolean hadInjury) {
        return parents == 2 && children >= 2 && beachParty && !hadInjury;
    }

    //és akkor is igaz, (3) ha városnézésen vesz részt és európai országba utazik, vagy nem európai országba utazik, de még nem volt balesete.
    private static boolean checkingFifthAnswer(boolean cityVisit, boolean isInEuropeCountry, boolean hadInjury) {
        return (cityVisit && isInEuropeCountry) || (!isInEuropeCountry && !hadInjury);
    }

}