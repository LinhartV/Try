package com.mycompany.dali;
import java.util.ArrayList;
import java.util.Random;

public class Manager {

    public static ArrayList<Character> list = new ArrayList<>();

    public static void addCharacter(int health, int damage, String name, int agility) {
        list.add(new Character(health, damage, name, agility));
    }

    public static void fight(String input, int index) {
        Random rnd = new Random();
        int toMiss;
        toMiss = rnd.nextInt(list.get(index).agility)+1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(input)) {
                if (toMiss == 1) {
                    list.get(index).attack(list.get(i), list);

                } else {
                    System.out.println("Minul jsi, cha cha.");
                }
            }
        }
    }

    public static boolean winner(int index) {
        boolean winner = false;

        if (list.size() < 2) {
            winner = true;
        }
        return winner;
    }

}