public class Vjezba {

    public static void main(String[] args) {
        patern1(5);
        patern2(5);
    }

    static void patern1(int brojRedova){
        /*
        Zadatak: 5  redova

         *
         **
         ***
         ****
         *****

         */

        //Prolazak kroz svaki red
        for(int red = 1; red<=brojRedova; red++){

            //Prolazak kroz kolonu
            for(int kolona = 1; kolona<=red; kolona++){
               System.out.print("*");  // Printanje zvjezdica u zavisnosti od reda, jedan red jedna zvjezdica
           }

            System.out.println();//Prelazak u naredni red za printanje
        }

    }

    static void patern2(int brojRedova){
       /*
        Zadatak: 5  redova

         *****
         ****
         ***
         **
         *

         */

        //Prolazak kroz svaki red
        for(int red = 1; red<=brojRedova; red++){

            //Prolazak kroz kolonu
            for(int kolona = brojRedova-red+1; kolona>=1; kolona--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
