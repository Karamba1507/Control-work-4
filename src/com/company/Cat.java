package com.company;

public class Cat {
    private int id;
    private String name;
    private int age;
    private int satiety;
    private int mood;
    private int health;
    private int averageLevel;
    private boolean availableAction = true;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety=satiety;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood=mood;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health=health;
    }

    public int getAverageLevel() {

        return (health + satiety + mood) / 3;

    }

    public boolean isAvailableAction() {
        return availableAction;
    }

    public void setAvailableAction(boolean availableAction) {
        this.availableAction=availableAction;
    }

    @Override
    public String toString() {
        return "{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", satiety=" + satiety +
                ", mood=" + mood +
                ", health=" + health +
                ", averageLevel=" + getAverageLevel() +
                '}';
    }
}


