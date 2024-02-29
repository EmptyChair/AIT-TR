package lesson_032_Enum;

import java.util.Scanner;

enum MoonPhase {
    NEW_MOON(0, "0%", "\uD83C\uDF11"),
    WAXING_CRESCENT(1, "20%", "\uD83C\uDF12"),
    FIRST_QUARTER(2, "50%", "\uD83C\uDF13"),
    WAXING_GIBBOUS(3, "70%", "\uD83C\uDF14"),
    FULL_MOON(4, "100%", "\uD83C\uDF15"),
    WANNING_GIBBOUS(5, "70%", "\uD83C\uDF16"),
    LAST_QUARTER(6, "50%", "\uD83C\uDF17"),
    WANING_CRESCENT(7, "20%", "\uD83C\uDF18");

    private int seq;
    private String illumination;

    private String emoji;

    MoonPhase(int seq, String illumination, String emoji) {
        this.seq = seq;
        this.illumination = illumination;
        this.emoji = emoji;
    }

    public int getSeq() {
        return this.seq;
    }

    public String getPic() {
        return this.illumination;
    }

    public String getEmoji() { return this.emoji; }

    @Override
    public String toString() {
        return "Phase "+this.seq+" of the moon cycle means there are "+this.illumination +" of the Moon visible in the sky like this: "+this.emoji;
    }

}

class MoonPhaseMain {
    public static void main(String[] args) {
        System.out.println("Cycle through all Moon Phases...");
        for (MoonPhase mf : MoonPhase.values()) {
            System.out.println(mf.toString());
        }

        //Loop
        String word;
        System.out.println("Choose what phase of the moon you wish to get information about (case doesn't matter)...");
        System.out.println("Or print exit to quit...");
        do {
            System.out.println("PLEASE ENTER A MOON PHASE: ");
            Scanner s1 = new Scanner(System.in);
            word = s1.nextLine();
            //turn to upper case to simplyfy word
            word = word.toUpperCase();
            System.out.println("Received: "+word);
            switch (word) {
                case "NEW_MOON":
                    System.out.println(MoonPhase.NEW_MOON.toString());
                    break;
                case "WAXING_CRESCENT":
                    System.out.println(MoonPhase.WAXING_CRESCENT.toString());
                    break;
                case "FIRST_QUARTER":
                    System.out.println(MoonPhase.FIRST_QUARTER.toString());
                    break;
                case "WAXING_GIBBOUS":
                    System.out.println(MoonPhase.WAXING_GIBBOUS.toString());
                    break;
                case "FULL_MOON":
                    System.out.println(MoonPhase.FULL_MOON.toString());
                    break;
                case "WANNING_GIBBOUS":
                    System.out.println(MoonPhase.WANNING_GIBBOUS.toString());
                    break;
                case "LAST_QUARTER":
                    System.out.println(MoonPhase.LAST_QUARTER.toString());
                    break;
                case "WANING_CRESCENT":
                    System.out.println(MoonPhase.WANING_CRESCENT.toString());
                    break;
                case "DEATH_STAR":
                    System.out.println("That's no moon phase... That's a battle station.");
                    System.out.println("You have been terminated for disclosing Death Star's location as per Grand Moff Tarkin's orders.");
                    System.out.println("RIP.");
                    System.exit(-1);
                    break;
                case "EXIT":
                    System.out.println("Exiting...");
                    System.exit(-1);
                    break;
                default:
                    System.out.println("That's no moon phase... But that ain't no battlestar either.");
                    System.out.println("Try again.");
            }
        } while (!word.equalsIgnoreCase("exit"));


    }

}

