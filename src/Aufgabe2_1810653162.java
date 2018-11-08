public class Aufgabe2_1810653162
{
    public static void main(String[] args)
    {
        // String.length is int also ist maximale anzahl an Zeichen = Interger.MAX_VALUE
        String name = "Axel";

        // -2,147,483,648 to 2,147,483, 647
        int alter = 25;

        /*approximately ±1.79769313486231570E+308
            (15 significant decimal digits)
        */
        double geld = 1.5;

        // true or false
        boolean istMaenlich = true;

        // -9,223,372,036,854,775,808 to
        //9,223,372,036,854,775,807
        long highScore = 1000000000;

        // 0 to 65,536
        char nachnameAnfangsbuchstabe = 'B';

        // 	-128 to 127
        byte kleineZahl = 1;

        // -32,768 to 32,767
        short bisslGroessereZahl = 23;

        /*approximately ±3.40282347E+38F
            (6-7 significant decimal digits)
        */
        float dezimalzahl = 3.1415f;

        //final = Konstant d.h. nach der zuweisung ist diese nicht mehr änderbar, der wert bleibt.
        //Variable kann jederzeit geändert werden
        final int RANDOM_VALUE = 218;


    }
}
