package lesson_021_Junit;

import lesson_021_Junit.Pokemon.PokemonTeam;
import lesson_021_Junit.Pokemon.Pokemon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Main21 {
    @Test
    public void Main21() {
        //import Java Unit Test
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
        PokemonTeam attackers = new PokemonTeam(5);
        attackers.add(p1);
        attackers.add(p2);
        attackers.add(p3);
        attackers.add(p4);
        attackers.add(p5);
        attackers.add(p11);
        attackers.add(p13);
        PokemonTeam defenders = new PokemonTeam(5);
        defenders.add(p6);
        defenders.add(p7);
        defenders.add(p8);
        defenders.add(p9);
        defenders.add(p10);
        defenders.add(p12);
        defenders.add(p14);

        //Intro
        System.out.println("Let's see the teams.");
        attackers.speedRanking();
        defenders.speedRanking();

        Assertions.assertEquals(5, defenders.getCount());
        Assertions.assertEquals(7, defenders.getCount());




    }
}
