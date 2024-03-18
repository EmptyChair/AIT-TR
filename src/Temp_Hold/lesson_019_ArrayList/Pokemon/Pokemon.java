package Temp_Hold.lesson_019_ArrayList.Pokemon;

public class Pokemon {

    //Attributes
    private String name;
    private String pokemonType;
    private int hp;
    private int currentHp;
    private int attack;
    private int defence;
    private int speed;
    private String specialAttack;
    private String specialDefence;
    private boolean asleep;

    //////////////////
    // CONSTRUCTORS
    //////////////////

    //default constructor()
    Pokemon() {
        setName("Nameless Pokemon");
        setPokemonType("Pikachu");
        setHp(35);
        setCurrentHp(35);
        setAttack(55);
        setDefence(40);
        setSpeed(90);
        setSpecialAttack("Payback");
        setSpecialDefence("Side Roll");
        setAsleep(false);
    }

    // normal constructor with all variables provided
    Pokemon(String name, String pokemonType, int hp, int currentHp, int attack, int defence, int speed, String specialAttack, String specialDefence, boolean asleep) {
        setName(name);
        setPokemonType(pokemonType);
        setHp(hp);
        setCurrentHp(currentHp);
        setAttack(attack);
        setDefence(defence);
        setSpeed(speed);
        setSpecialAttack(specialAttack);
        setSpecialDefence(specialDefence);
        setAsleep(asleep);
    }

    //////////////////
    // GETTERS AND SETTERS
    //////////////////


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        this.specialAttack = specialAttack;
    }

    public String getSpecialDefence() {
        return specialDefence;
    }

    public void setSpecialDefence(String specialDefence) {
        this.specialDefence = specialDefence;
    }

    public boolean isAsleep() {
        return asleep;
    }

    public void setAsleep(boolean asleep) {
        this.asleep = asleep;
    }

    //////////////////
    // OTHER METHODS
    //////////////////

    //displayPokemon

    public void displayPokemon() {
        System.out.println("Accessing pokemon...");
        System.out.println("Name : "+getName());
        System.out.println("Type : "+getPokemonType());
        System.out.println("Regular HP : "+getHp());
        System.out.println("Current HP : "+getCurrentHp());
        System.out.println("Attack : "+getAttack());
        System.out.println("Defence : "+getDefence());
        System.out.println("Speed : "+getSpeed());
        System.out.println("Special Attack :"+getSpecialAttack());
        System.out.println("Special Defence :"+getSpecialDefence());
        if (this.asleep) {
            System.out.println("This one is fast asleep.");
        } else {
            System.out.println("This one is awake and ready.");
        }
        System.out.println("###############################################");
    }

    //attack method - resolves
    public ArrayList attack(ArrayList team) {
        int damage;
        for (int i = 0; i<team.getCount(); i++) {
            //the first member of the opposing team not to be asleep gets whacked, then the loop stops
            if (!team.getTeam()[i].isAsleep()) {
                System.out.println(getName() + " (" + getPokemonType() + ") strikes at " + team.getTeam()[i].getName() + " (" + team.getTeam()[i].getPokemonType() + ") with all its might!");
                // calculate damage, if any
                if (getAttack() > team.getTeam()[i].getDefence()) {
                    damage = getAttack() - team.getTeam()[i].getDefence();
                    team.getTeam()[i].setCurrentHp(team.getTeam()[i].getCurrentHp()-damage);
                    System.out.println(getName() + " deals " + (getAttack() - team.getTeam()[i].getDefence()) + " HP of damage!!!");
                    //if the whacked pokemon has fallen below 1 Hp, put him to sleep
                    if (team.getTeam()[i].getCurrentHp()<1) {
                        team.getTeam()[i].setAsleep(true);
                        System.out.println(team.getTeam()[i].getName()+" ("+team.getTeam()[i].getPokemonType()+") has fallen asleep! It might recover yet, but its part in this round is over...");
                    }
                } else {
                    System.out.println("The attack fails miserably, inflicting no damage!");
                    System.out.println(getName() + " is humiliated!");
                    System.out.println(team.getTeam()[i].getName() + " is making mocking noises!");
                }
                //one pokemon is meant to attack one other pokemon per round, so we break the loop
                break;
            }
        }
        // return the team's new condition, slightly beaten up
        return team;
    }



}
