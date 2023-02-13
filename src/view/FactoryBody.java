package view;

public class FactoryBody extends FactoryMenu {
    private static final String HANDS_ONE = " short hands ";
    private static final String HANDS_TWO = " long hands ";
    private static final String HANDS_THREE = " midl hands ";
    private static final String LEGS_ONE = " short legs ";
    private static final String LEGS_TWO = " long legs";
    private static final String LEGS_THREE = " midl legs ";
    protected String bodyOne = HANDS_ONE + "," + LEGS_ONE;
    protected String bodyTwo = HANDS_TWO + "," + LEGS_TWO;
    protected String bodyThree = HANDS_THREE + "," + LEGS_THREE;
    String TEXT = " bodyOne " + " bodyTwo"  + " bodyThree ";

    public String getBodyOne() {
        return bodyOne;
    }

    public void setBodyOne() {
        this.bodyOne = bodyOne;
    }

    public String getBodyTwo() {
        return bodyTwo;
    }

    public void setBodyTwo() {
        this.bodyTwo = bodyTwo;
    }

    public String getBodyThree() {
        return bodyThree;
    }

    public void setBodyThree() {
        this.bodyThree = bodyThree;
    }

    @Override
    public String toString() {
        return "FactoryBody{" +
                "bodyOne='" + bodyOne + '\'' +
                ", bodyTwo='" + bodyTwo + '\'' +
                ", bodyThree='" + bodyThree + '\'' +
                ", TEXT='" + TEXT + '\'' +
                '}';
    }

    @Override
    public void gather() {
        System.out.println("Тела для робота : " + TEXT + ", готовы.");
    }
}




