package view;

public enum Robot implements Describable {
    RQ1("bodyOne + hadOne"),
    RQ2("bodyTwo + hadTwo"),
    RQ3("bodyThree + hadThree"),
    RQ4("bodyOne + hadTwo"),
    RQ5("bodyOne + hadThree"),
    RQ6("bodyTwo + hadOne"),
    RQ7("bodyTwo + hadThree"),
    RQ8("bodyThree + hadOne"),
    RQ9("bodyThree + hadTwo");

    private final String name;

    Robot(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    @Override
    public String describe() {
        return "Описание робота";
    }
}


