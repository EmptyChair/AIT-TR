package Temp_Hold.lesson_019_ArrayList.Pokemon;

public class ArrayList {
    //ATTRIBUTES

    private static int defaultSize = 5;

    private Pokemon[] team;

    private int count;

    public static int getDefaultSize() {
        return defaultSize;
    }

    public static void setDefaultSize(int defaultSize) {
        ArrayList.defaultSize = defaultSize;
    }

    public Pokemon[] getTeam() {
        return team;
    }

    public void setTeam(Pokemon[] team) {
        this.team = team;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    //CONSTRUCTORS - with nothing and with provided list length

    public ArrayList() {
        this.team = new Pokemon[defaultSize];
        this.count = 0;
    }

    public ArrayList(int teamSize) {
        this.team = new Pokemon[teamSize];
        this.count = 0;
    }

    //adding elements
    public void add(Pokemon pok) {
        // case 1 - we need to resize list
        if (count+1 > team.length) {
            resize(this.team.length+1);
        }
        this.team[count] = pok;
        count++;
    }

    // resizing arrayList
    public void resize(int size) {
        Pokemon[] team2 = new Pokemon[size];
        for (int i=0; i<this.count; i++) {
            team2[i] = this.team[i];
        }
        this.team = team2;
    }

    //removing nth element of the list
    public void remove(int index) {
        if (index>=this.team.length) {
            System.out.println("Sorry, the index provided is too high for the length of this array list.");
        } else {
            for (int i=index; i<this.team.length-1; i++) {
                this.team[i] = this.team[i+1];
            }
            this.count--;
            resize(this.team.length-1);
        }
    }

    //Show AList
    public void teamIntro() {
        for (int i = 0; i<this.team.length; i++ ) {
            this.team[i].displayPokemon();
        }
    }

    public void speedSort() {
        Pokemon temp;
        for (int i = 0; i<this.team.length; i++) {
            temp = this.team[i];
            for (int c = i+1; c<this.team.length; c++) {
                if (this.team[i] !=null && this.team[c]!=null && this.team[i].getSpeed() < this.team[c].getSpeed()) {
                    this.team[i] = this.team[c];
                    this.team[c] = temp;
                    temp = this.team[i];
                }
            }
        }
    }

    public void speedRanking() {
        for (int i = 0; i<this.team.length; i++ ) {
            if (this.team[i]!=null) {
                System.out.println((i+1)+". "+this.team[i].getName()+" with a speed of "+this.team[i].getSpeed());
            }
        }
    }

    public void sleepersCheck() {
        int recoveredHp;
        for (int i = 0; i<this.team.length; i++ ) {
            if (this.team[i].isAsleep()) {
                //calculate recovered HP - a pokemon put asleep in the last round recovers 20%
                recoveredHp = this.team[i].getHp()/5;
                this.team[i].setCurrentHp( this.team[i].getCurrentHp()+recoveredHp);
                //check if the pokemon is ready to get up yet
                if (this.team[i].getCurrentHp()>0) {
                    this.team[i].setAsleep(false);
                    System.out.println(this.team[i].getName()+" recovers from its sleep and is now at "+this.team[i].getCurrentHp()+" HP.");
                } else {
                    System.out.println(this.team[i].getName()+" has recovered a little bit and is now at "+this.team[i].getCurrentHp()+" HP, but it can not return to battle yet.");
                }

            }

        }
    }




}
