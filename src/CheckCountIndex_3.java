public class CheckCountIndex_3 {
    public static void main(String[] args) {
        //3.Feladat
        String texts = "big best";
        int result = b_Counter(texts);
        System.out.println("That many b are in this text: " + result);
        char[] array = texts.toCharArray();
        allPositionOf_B(array);
    }

    //Számoljuk meg, hogy hány ’b’ eleme van egy csak betűket tartalmazó String-nek!
    private static int b_Counter(String text) {
        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            char target = text.charAt(i);
            if (target == 'b') {
                counter++;
            }
        }
        return counter;
    }

    //Bővítsük úgy a megoldást, hogy kiírja az összes ’b’-t tartalmazó elem pozícióját!
    private static void allPositionOf_B(char[] array) {
        System.out.print("All b postion in the text: ");

        for (int i = 0; i < array.length; i++) {
            char letter = array[i];
            if (letter == 'b') {
                System.out.print("|" + i + "|\t");
            }
        }
    }


}
