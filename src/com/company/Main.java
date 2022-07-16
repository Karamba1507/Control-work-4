package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    Actions actions;
    private boolean continueProgram = true;

    public Main() {
        FileService fileService = new FileService();
        List<Cat> cats = fileService.readString();

        this.actions = new Actions(cats);
    }

    Scanner scanner = new Scanner(System.in);

    public void printMenu() {
        System.out.println();
        System.out.println("|------------------------------------------------------------------------|");
        System.out.println("|                          Select an action...                           |");
        System.out.println("|                          1. Print list of cats!                        |");
        System.out.println("|                          2. Add a cat!                                 |");
        System.out.println("|                          3. Feed the cat!                              |");
        System.out.println("|                          4. Treat a cat!                               |");
        System.out.println("|                          5. Play with the cat!                         |");
        System.out.println("|                          6. Next day!                                  |");
        System.out.println("|                          7. Exit program!!!                            |");


        int number = scanner.nextInt();

        switch (number) {
            case 1:
               actions.printCats();
               break;
            case 2:
                actions.addCat();
                break;
            case 3:
                actions.feedCat();
                break;
            case 4 :
                actions.treatCat();
                break;
            case 5 :
                actions.playCat();
                break;
            case 6 :
                actions.nextDay();
            case 7:
                continueProgram = false;
                System.out.println("|                          Exit program!!!                               |");
        }
    }

    public void startProgram() {

        while (continueProgram) {
            actions.printCats();
            printMenu();

        }


    }

    public static void main(String[] args) {
	     Main main = new Main();
         main.startProgram();

    }
}
