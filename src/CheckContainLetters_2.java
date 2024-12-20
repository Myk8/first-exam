public class CheckContainLetters_2 {
    public static void main(String[] args) {
        //2.Feladat

        String word = "smsacwAcsc";
        boolean isJustLetters = checkLetters(word);
        boolean isItContains = checkContains(word);

        System.out.println(isItContains);
        System.out.println(isJustLetters);

        // Az órán látott módon, tömbben történő kereséssel oldjuk meg. Ne használjuk a String keresési metódusait!
        //Segítség: egy String-et a toCharArray() metódussal bonthatunk karakterek tömbjére.
        char[] array = word.toCharArray();

        int result = a_IndexSearch(array);
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("The first 'a' positon in : " + result);
        }

    }


    // A szó csak betűket tartalmazhat!
    private static boolean checkLetters(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                return false;
            }
        }
        return true;
    }


    //Döntsük el, hogy egy adott szó (String) tartalmaz-e ’a’ betűt (igaz/hamis)!
    private static boolean checkContains(String text) {
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == 'a' || letter == 'A') {
                return true;
            }
        }
        return false;
    }

    //Bővítsük úgy a megoldást, hogy kiírja az első ’a’-t tartalmazó elem pozícióját (nem biztos, hogy van ilyen elem)!
    private static int a_IndexSearch(char[] array) {
        for (int i = 0; i < array.length; i++) {
            char letter = array[i];
            if (letter == 'a' || letter == 'A') {
                return i;
            }
        }
        return -1;
    }

}
