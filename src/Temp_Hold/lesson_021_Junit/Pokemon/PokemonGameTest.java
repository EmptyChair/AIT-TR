package Temp_Hold.lesson_021_Junit.Pokemon;

import Temp_Hold.lesson_021_Junit.Pokemon.Pokemon;
import Temp_Hold.lesson_021_Junit.Pokemon.PokemonTeam;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


public class PokemonGameTest {

    private Pokemon p1 = new Pokemon();
    private Pokemon p2 = new Pokemon("Cringey", "Pidgey", 40, 40, 45, 40, 56, "Dive", "Flight", false);
    private PokemonTeam team1 = new PokemonTeam();

    private Pokemon p3 = new Pokemon();

    @BeforeEach
    public void setUp() {
        team1.add(p1);
        team1.add(p2);
        team1.add(p1);
    }

    @Test
    public void firstPokemonTest() {
        Assertions.assertEquals("Cringey", p2.getName());
        Assertions.assertEquals("Pidgey", p2.getPokemonType());
        Assertions.assertEquals(40, p2.getHp());
        Assertions.assertEquals(40, p2.getCurrentHp());
        Assertions.assertEquals(45, p2.getAttack());
        Assertions.assertEquals(40, p2.getDefence());
        Assertions.assertEquals(56, p2.getSpeed());
        Assertions.assertEquals("Dive", p2.getSpecialAttack());
        Assertions.assertEquals("Flight", p2.getSpecialDefence());
        Assertions.assertEquals(false, p2.isAsleep());
    }

    @Test
    public void attackTest() {
        PokemonTeam beatenUp = p2.attack(team1);
        Assertions.assertEquals(30, beatenUp.getTeam()[0].getCurrentHp());
    }

    @Test
    public void teamTest() {
        PokemonTeam team2 = new PokemonTeam();
        team2.add(p1);
        team2.add(p1);
        team2.add(p1);
        team2.add(p1);
        team2.add(p1);
        team2.resize(6);
        Assertions.assertEquals(5, team2.getCount());

        PokemonTeam team3 = new PokemonTeam();
        team3.resize(10);
        Assertions.assertEquals(0, team3.getCount());

        PokemonTeam team4 = new PokemonTeam(9);

        Assertions.assertEquals(0, team4.getCount());
        team4.add(p1);
        team4.add(p1);
        Assertions.assertEquals(2, team4.getCount());
    }

    @Test
    public void teamFunctionsTest() {
        team1.remove(10);
        Assertions.assertEquals(3, team1.getCount());
        team1.remove(2);
        Assertions.assertEquals(2, team1.getCount());



    }











}
