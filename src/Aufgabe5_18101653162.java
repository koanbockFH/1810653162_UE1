public class Aufgabe5_18101653162
{
    public static void main(String[] args)
    {
        //Deklaration und Zuweisung meiner 2 zahlen
        int zahl1 = 1, zahl2 = 2;

        //Inkementiert die zahl NACHDEM sie ausgegebn wurde
        System.out.println(zahl1++);
        System.out.println(zahl2++);

        // Beweis für das obere: Zahlen sind nun um 1 erhöht
        System.out.println(zahl1);
        System.out.println(zahl2);

        //Inkementiert die zahl BEVOR sie ausgegebn wurde
        System.out.println(++zahl1);
        System.out.println(++zahl2);

        // Beweis für das obere: Zahlen sind nun um 1 erhöht
        System.out.println(zahl1);
        System.out.println(zahl2);

        /*
        * ++zahl auch pre-increment genannt heißt das die variable zuerst
        * inkrementiert und gespeichert wird bevor diese verwendet wird
        *
        *  zahl++ auch post-increment genannt heißt das die variable zuerst
        *  verwendet wird und anschließend inkrementiert und gespeichert wird
         */
    }
}
