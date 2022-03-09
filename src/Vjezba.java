public class Vjezba {

    public static void main(String[] args) {
        patern1(5);
        System.out.println("---");
        patern2(5);
        System.out.println("---");
        patern3(5);
        System.out.println("---");
        patern4(5);
        System.out.println("---");
    }

    static void patern1(int n){
        /*
        1.Zadatak:  Za n = 5:

         *
         **
         ***
         ****
         *****

         */

        //Prolazak kroz svaki red
        for(int red = 1; red<=n; red++){

            //Prolazak kroz kolonu
            for(int kolona = 1; kolona<=red; kolona++){
               System.out.print("*");  // Printanje zvjezdica u zavisnosti od reda, jedan red jedna zvjezdica
           }

            System.out.println();//Prelazak u naredni red za printanje
        }

    }

    static void patern2(int n){
       /*
        2.Zadatak:  Za n = 5:

         *****
         ****
         ***
         **
         *

         */

        //Prolazak kroz svaki red
        for(int red = 1; red<=n; red++){

            //Prolazak kroz kolonu
            for(int kolona = n-red+1; kolona>=1; kolona--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void patern3(int n){
        /*
        3.Zadatak: Za n = 5:

         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5

         */

        //Prolazak kroz redove
        for(int red = 1; red<=n; red++){

            //Prolazak kroz kolone, broj kolona je jednak broju reda, npr. dugi red ---> dve kolone
            for(int kolona = 1; kolona<=red; kolona++){
                System.out.print(kolona+" ");   //Printanje brojeva od 1 do broja kolona
            }
            //Prelazak u sledecu liniju za printanje iduceg reda
            System.out.println();
        }
    }

    static void patern4(int n){
        /*
        3.Zadatak: Za n = 5:

         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *

         */

        //Prolaz kroz redove
        for (int red = 1; red < n*2 ; red++) {  //za uneseni n, broj redova je n*2-1, za n=5, broj redova je 9
            int brojZvjzdica = red;

            //Prolaz kroz kolone i upis u redove do maksimalnog broja kolona
            if(brojZvjzdica<=n) {
                for (int kolona = 1; kolona <= red; kolona++) { //maksimalni broj kolona je jednak n
                    System.out.print("*");
                }
            }
            //Prolaz kroz kolono i upis u redove kad broj redova dostigne n
            else {
                for (int kolona = 1; kolona<=n*2-brojZvjzdica; kolona++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
