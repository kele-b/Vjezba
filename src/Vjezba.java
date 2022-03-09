public class Vjezba {

    public static void main(String[] args) {
        patern1(5);
        patern2(5);
        patern3(5);
    }

    static void patern1(int brojRedova){
        /*
        1.Zadatak: 5  redova

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
        2.Zadatak: 5  redova

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

    static void patern3(int brojRedova){
        /*
        3.Zadatak: 5  redova

         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5

         */

        //Prolazak kroz redove
        for(int red = 1; red<=brojRedova; red++){

            //Prolazak kroz kolone, broj kolona je jednak broju reda, npr. dugi red ---> dve kolone
            for(int kolona = 1; kolona<=red; kolona++){
                System.out.print(kolona+" ");   //Printanje brojeva od 1 do broja kolona
            }
            //Prelazak u sledecu liniju za printanje iduceg reda
            System.out.println();
        }
    }
}
