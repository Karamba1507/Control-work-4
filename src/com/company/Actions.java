package com.company;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Actions {
    private final List<Cat> cats;
    Scanner scanner = new Scanner(System.in);


    public Actions(List<Cat> cats) {
        this.cats=cats;
    }

    public void addCat() {

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter cat name: ");
            String name = scanner.nextLine();

            System.out.println("Enter cat age from 0...18: ");
            int age = scanner.nextInt();

            if (name.length() < 2 || age < 1 || age > 18) {
                throw new Exception("Wrong data!");
            }

            Random random = new Random();

            Cat cat = new Cat();
            cat.setName(name);
            cat.setAge(age);
            cat.setMood(random.nextInt(60) + 20);
            cat.setHealth(random.nextInt(60) + 20);
            cat.setSatiety(random.nextInt(60) + 20);

            cats.add(cat);

            printCats();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    void printCats() {
        System.out.println("                            START PROGRAM!!!                              ");
        System.out.println("|---+---------+----------+--------+-----------+-----------+--------------|");
        System.out.println("| # | Name    | Age      | Health | Mood      | Satiety   | Average level ");
        System.out.println("|---+---------+----------+--------+-----------+-----------+--------------|");
        cats.sort(new CatAverageLevelComparator());

        int num = 1;

        for (Cat cat : cats) {
            System.out.printf("| %d | %-7s | %-8s | %-6s | %-9s | %-9s | %-3s",
                    num, cat.getName(),cat.getAge(),cat.getHealth(),cat.getMood(),cat.getSatiety(), cat.getAverageLevel() + "\n");
            num++;
        }
        System.out.println("|---+---------+----------+--------+-----------+-----------+--------------|");

    }

   public void feedCat() {

        System.out.println("******************************* Feed the cat!*****************************");
        System.out.println("   Enter number cat... ");
        int numCat = scanner.nextInt();

        System.out.println("Feed the cat " + cats.get(numCat - 1).getName());

        if (cats.get(numCat - 1).isAvailableAction()) {

            if (cats.get(numCat - 1).getAge() >= 1 && cats.get(numCat - 1).getAge() <= 5) {
                cats.get(numCat - 1).setSatiety(cats.get(numCat - 1).getSatiety() + 7);
                cats.get(numCat - 1).setHealth(cats.get(numCat - 1).getHealth() + 7);
            } else if (cats.get(numCat - 1).getAge() >= 6 && cats.get(numCat - 1).getAge() <= 10) {
                cats.get(numCat - 1).setSatiety(cats.get(numCat - 1).getSatiety() + 5);
                cats.get(numCat - 1).setHealth(cats.get(numCat - 1).getHealth() + 5);
            } else if (cats.get(numCat - 1).getAge() >= 11) {
                cats.get(numCat - 1).setSatiety(cats.get(numCat - 1).getSatiety() + 4);
                cats.get(numCat - 1).setHealth(cats.get(numCat - 1).getHealth() + 4);
            }

            cats.get(numCat - 1).setAvailableAction(false);

        } else {
            System.out.println("You can't do anything with the cat today!");
        }

    }

    public void treatCat() {

        System.out.println("*******************************Heal the cat!******************************");
        System.out.println("   Enter number cat...  ");
        int numCat = scanner.nextInt();

        System.out.println("We treat a cat " + cats.get(numCat - 1).getName());

        if (cats.get(numCat - 1).isAvailableAction()) {

        if (cats.get(numCat-1).getAge() >= 1 && cats.get(numCat-1).getAge() <= 5) {
            cats.get(numCat - 1).setHealth(cats.get(numCat - 1).getHealth()+7);
            cats.get(numCat - 1).setMood(cats.get(numCat - 1).getMood()-3);
            cats.get(numCat - 1).setSatiety(cats.get(numCat - 1).getSatiety()-3);
        } else if (cats.get(numCat-1).getAge() >= 6 && cats.get(numCat-1).getAge() <= 10) {
            cats.get(numCat - 1).setHealth(cats.get(numCat - 1).getHealth()+5);
            cats.get(numCat - 1).setMood(cats.get(numCat - 1).getMood()-5);
            cats.get(numCat - 1).setSatiety(cats.get(numCat - 1).getSatiety()-5);
        } else if (cats.get(numCat-1).getAge() >= 11 ){
            cats.get(numCat - 1).setHealth(cats.get(numCat - 1).getHealth()+4);
            cats.get(numCat - 1).setMood(cats.get(numCat - 1).getMood()-6);
            cats.get(numCat - 1).setSatiety(cats.get(numCat - 1).getSatiety()-6);
        }
            cats.get(numCat - 1).setAvailableAction(false);

        } else {
            System.out.println("You can't do anything with the cat today!");
        }
    }

    public void playCat() {

        System.out.println("***************************Play with the cat!*****************************");
        System.out.println("   Enter number cat... ");
        int numCat = scanner.nextInt();

        System.out.println("Play with the cat " + cats.get(numCat - 1).getName());

        if (cats.get(numCat - 1).isAvailableAction()) {

        if (cats.get(numCat-1).getAge() >= 1 && cats.get(numCat-1).getAge() <= 5) {
            cats.get(numCat - 1).setMood(cats.get(numCat - 1).getMood()+7);
            cats.get(numCat - 1).setHealth(cats.get(numCat - 1).getHealth()+7);
            cats.get(numCat - 1).setSatiety(cats.get(numCat - 1).getSatiety()-6);
        } else if (cats.get(numCat-1).getAge() >= 6 && cats.get(numCat-1).getAge() <= 10) {
            cats.get(numCat - 1).setMood(cats.get(numCat - 1).getMood()+5);
            cats.get(numCat - 1).setHealth(cats.get(numCat - 1).getHealth()+5);
            cats.get(numCat - 1).setSatiety(cats.get(numCat - 1).getSatiety()-5);
        } else if (cats.get(numCat-1).getAge() >= 11 ){
            cats.get(numCat - 1).setMood(cats.get(numCat - 1).getMood()+4);
            cats.get(numCat - 1).setHealth(cats.get(numCat - 1).getHealth()+4);
            cats.get(numCat - 1).setSatiety(cats.get(numCat - 1).getSatiety()-6);
        }
            cats.get(numCat - 1).setAvailableAction(false);

        } else {
            System.out.println("You can't do anything with the cat today!");
        }
    }

    public void nextDay() {

        Random random = new Random();
        for (Cat cat :cats) {
            cat.setSatiety(cat.getSatiety() - random.nextInt(4) + 1);
            cat.setMood(cat.getMood() - random.nextInt(7) - 3);
            cat.setHealth(cat.getHealth() - random.nextInt(7) - 3);
            cat.setAvailableAction(true);
        }
    }
}
