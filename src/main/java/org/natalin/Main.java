package org.natalin;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
      /*  int x =1;
        while(x < 3){

            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }

        if(x == 3){

            System.out.print("Do");

        }*/

        //Ejercicio 2

       /* int bottlesNum = 10;
        String word = "bottles";
        while (bottlesNum > 0) {
            if (bottlesNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");
            bottlesNum = bottlesNum - 1;
            if (bottlesNum > 1) {
                System.out.println("There'll be " + bottlesNum +
                        " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            } // end else
        } // end while loop*/


        //Ejercicio 3
        //1.The first step is to create three String arrays—the containers that will hold all the words.
        String [] personas = {"Juli", "Mamá", "Papá", "Abuela Mery", "Abuela Susana", "Tía Romina"};
        String [] acciones = {"come", "duerme", "baila", "canta", "hace caca"};
        String [] cantidad = {"todo el dia", "pocas veces", "sin parar", "a veces", "siempre"};

        //2. For each of the three lists (arrays), the goal is to pick a random word, so we have to know
        //how many words are in each list.
        int personasLenght = personas.length;
        int accionesLenght = acciones.length;
        int cantidadLenght = cantidad.length;

        //3.We need three random numbers. Java ships out of the box with several ways to generate
        //random numbers, including java.util.Random. The nextInt() method returns a random number between 0 and some-num-
        //ber-we-give-it, not including the number that we give it. So we’ll give it the number of elements
        //(the array length) in the list we’re using. Then we assign each result to a new variable.

        java.util.Random randomGenerator = new java.util.Random();
        int randomPersonas = randomGenerator.nextInt(personasLenght);
        int randomAcciones = randomGenerator.nextInt(accionesLenght);
        int randomCantidad = randomGenerator.nextInt(cantidadLenght);

        //4. Now we get to build the phrase, by picking a word from each of the three lists and
        //smooshing them together (also inserting spaces between words). We use the “+” operator,
        //which concatenates (we prefer the more technical smooshes) the String objects together. To get an
        //element from an array, you give the array the index number (position) of the thing you want by
        //using:

        String phrase = personas[randomPersonas] + " " + acciones[randomAcciones] + " " + cantidad[randomCantidad];

        System.out.println(phrase);


        //Ejercicio 4

        /*int x = 3;

        while (x > 0) {

            if (x > 2) {
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-");

            if (x == 2) {
                System.out.print("b c");
            }

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }




        }*/


    }
}