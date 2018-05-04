package com.kys.stucture;


import java.io.IOException;
import java.util.Scanner;

public class CricketMatchTossDecision {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String weather = sc.next();
        String isDayNight = sc.next();
        System.out.println(teamDecsion(isDayNight, weather, "Lengaburu"));
        System.out.println(teamDecsion(isDayNight, weather, "Enchai"));

    }

    private static String teamDecsion(String isDayNight, String weather, String team) {
        String decision = team + " wins toss and Bats";
        if ((team.equalsIgnoreCase("Lengaburu") && isDayNight.equalsIgnoreCase("Night") && weather.equalsIgnoreCase("Cloudy"))
                || (team.equalsIgnoreCase("Enchai") && isDayNight.equalsIgnoreCase("Day") && weather.equalsIgnoreCase("Clear"))) {
            decision = team + " wins toss and Bowls";
        }

        return decision;

    }
}
