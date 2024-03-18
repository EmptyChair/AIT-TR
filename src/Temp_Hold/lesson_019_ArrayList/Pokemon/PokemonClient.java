package Temp_Hold.lesson_019_ArrayList.Pokemon;

import java.util.Scanner;

public class PokemonClient {
    public static void main(String[] args) {
        //set up some pokemons
        Pokemon p1 = new Pokemon("Slachu", "Pikachu", 35, 35, 55, 40, 90, "Payback", "Sideroll", false);
        Pokemon p2 = new Pokemon("Cringey", "Pidgey", 40, 40, 45, 40, 56, "Dive", "Flight", false);
        Pokemon p3 = new Pokemon("Kitty-Ta", "Rattata", 30, 30, 56, 35, 72, "Roar", "Sideroll", false);
        Pokemon p4 = new Pokemon("Riddler", "Weedle", 40, 40, 35, 30, 50, "Acid", "Bury", false);
        Pokemon p5 = new Pokemon("Cheburan", "Squirtle", 44, 44, 48, 65, 43, "Payback", "Bury", false);

        Pokemon p6 = new Pokemon("Stomper", "Bulbasaur", 45, 45, 49, 49, 45, "Charge", "Cover", false);
        Pokemon p7 = new Pokemon("The Burning One", "Charmander", 39, 39, 52, 43, 65, "Inferno", "Sideroll", false);
        Pokemon p8 = new Pokemon("Rogal Dorn", "Nidoran", 46, 46, 57, 40, 50, "Roar", "Cover", false);
        Pokemon p9 = new Pokemon("Crawler", "Weedle", 40, 40, 35, 30, 50, "Acid", "Bury", false);
        Pokemon p10 = new Pokemon("Fighting Pidgeon", "Pidgey", 40, 40, 45, 40, 56, "Dive", "Flight", false);

        Pokemon p11 = new Pokemon("Smiley", "Pidgey", 40, 40, 45, 40, 56, "Dive", "Flight", false);
        Pokemon p12 = new Pokemon("Pyro", "Charmander", 39, 39, 52, 43, 65, "Inferno", "Sideroll", false);
        Pokemon p13 = new Pokemon("Hawkeye", "Pidgey", 40, 40, 45, 40, 56, "Dive", "Flight", false);
        Pokemon p14 = new Pokemon("Flacon-Ra", "Pidgey", 40, 40, 45, 40, 56, "Dive", "Flight", false);
        Pokemon p15 = new Pokemon("Iosep", "Squirtle", 44, 44, 48, 65, 43, "Payback", "Bury", false);

        //arcanine is OP
        Pokemon p21 = new Pokemon("Lion El'Johnson", "Arcanine", 90, 90, 110, 80, 95, "Roar", "Cover", false);

        // Set up teams
        ArrayList attackers = new ArrayList(5);
        attackers.add(p1);
        attackers.add(p2);
        attackers.add(p3);
        attackers.add(p4);
        attackers.add(p5);
        attackers.add(p11);
        attackers.add(p13);
        attackers.remove(31);
        attackers.remove(3);
        ArrayList defenders = new ArrayList(5);
        defenders.add(p6);
        defenders.add(p7);
        defenders.add(p8);
        defenders.add(p9);
        defenders.add(p10);
        defenders.add(p12);
        defenders.add(p14);
        defenders.remove(6);
        //Introduce the teams
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        String answer;
        System.out.println("WELCOME TO POKEMON BATTLE SIMULATOR!!!");
        System.out.println("Two 5-pokemon teams were assembled to fight a brutal battle for your perverse enjoyment!");
        System.out.println("Would you like to see the attackers' roster?");
        System.out.println("yes/no");
        answer = s1.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            attackers.teamIntro();
        }
        System.out.println("Would you like to see the defenders' roster?");
        System.out.println("yes/no");
        answer = s2.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            defenders.teamIntro();
        }

        //sort the teams by speed

        attackers.speedSort();
        Scanner s3 = new Scanner(System.in);
        System.out.println("Attackers were sorted by speed, would you like to see the results?");
        System.out.println("yes/no");
        answer = s3.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            attackers.speedRanking();
        }

        defenders.speedSort();
        Scanner s4 = new Scanner(System.in);
        System.out.println("Defenders were sorted by speed, would you like to see the results?");
        System.out.println("yes/no");
        answer = s4.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            defenders.speedRanking();
        }

        //set up victory condition
        //each team's overall HP must not fall below zero
        int lowestHp = 1;

        //set the round counter
        int round = 0;

        //Let the battle commence!
        System.out.println("THIS BATTLE SHALL BE LEGENDARY!");
        do {
            //Round announcement
            round++;
            System.out.println("ROUND "+round+" !!!");

            //check the teams for sleepers, wake them up and raise their health
            attackers.sleepersCheck();
            defenders.sleepersCheck();

            //let attackers and defenders whack each other - 1st attacker, 1st defender, 2nd attacker, 2nd defender etc
            for (int i = 0; i<attackers.getCount(); i++) {
                defenders = attackers.getTeam()[i].attack(defenders);
                attackers = defenders.getTeam()[i].attack(attackers);
            }
            //check for victory conditions - one team runs out of health
            lowestHp = victoryCheck(attackers, defenders, round);



        } while ( lowestHp > 0 );
        //as long as attackers HP AND defendersHP does not fall below 1
        System.out.println("The battle is over!");
        System.out.println("It only took... How many rounds?");
        System.out.println(round);
        System.out.println("All right then, bye-bye!");
        System.exit(-1);
    }



    private static int victoryCheck(ArrayList attackers, ArrayList defenders, int round) {
        int attackerHp = 0;
        int defenderHp = 0;
        for (int i = 0; i<attackers.getCount(); i++) {
            attackerHp = attackerHp+attackers.getTeam()[i].getCurrentHp();
            defenderHp = defenderHp+defenders.getTeam()[i].getCurrentHp();
        }
        if (round>49 && defenderHp>0) {
            System.out.println("By Jove, the battle has drawn out for 50 rounds!");
            System.out.println("The ATTACKERS have failed to destroy the DEFENDERS!");
            System.out.println("The DEFENDERS are victorious with their "+defenderHp+" HP!");
            System.out.println("Let this victory be a monument to their resilience!");
            return 0;
        }
        if (attackerHp < 0) {
            System.out.println("The ATTACKERS have failed!");
            System.out.println("The DEFENDERS are victorious!");
            return 0;
        }
        if (defenderHp < 0) {
            System.out.println("The DEFENDERS have failed!");
            System.out.println("The ATTACKERS are victorious!");
            return 0;
        }
        if (attackerHp>defenderHp){
            System.out.println("Defenders are running out of steam, only "+defenderHp+" HP left as opposed to attackers' "+attackerHp+" HP.");
            return defenderHp;
        } else {
            System.out.println("Attackers are losing the momentum, they have "+attackerHp+" HP left compared to defenders' "+defenderHp+" HP.");
            return attackerHp;
        }
    }

}


