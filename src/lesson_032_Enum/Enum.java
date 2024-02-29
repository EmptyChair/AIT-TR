package lesson_032_Enum;

enum Season {
    WINTER("cold"), SPRING("warm"), SUMMER("hot"), AUTUMN("cool");


    private final String description;

    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
