package view;

public class FactoryHad extends FactoryMenu {
    private static final String EYES_ONE = " eyes blu ";
    private static final String EYES_TWO = "  eyes green ";
    private final static String EYES_THREE = "eyes black ";
    private final static String MOUTH_ONE = " mouth round ";
    private final static String MOUTH_TWO = "  mouth square ";
    private final static String MOUTH_THREE = " mouth oval ";
    protected String hadOne =","+ EYES_ONE +","+ MOUTH_ONE + ".";
    protected String hadTwo ="," +EYES_TWO + "," + MOUTH_TWO + ".";
    protected String hadThree =","+ EYES_THREE + "," + MOUTH_THREE + ".";
    protected String text = "hadOne" +  " hadTwo " + " hadThree ";
    @Override
    public String toString() {
        return "FactoryHad{" +
                "hadOne='" + hadOne + '\'' +
                ", hadTwo='" + hadTwo + '\'' +
                ", hadThree='" + hadThree + '\'' +
                ", text='" + text + '\'' +
                '}';
    }


    public String getHadOne() {
        return hadOne;
    }

    public void setHadOne(String hadOne) {
        this.hadOne = hadOne;
    }

    public String getHadTwo() {
        return hadTwo;
    }

    public void setHadTwo(String hadTwo) {
        this.hadTwo = hadTwo;
    }

    public String getHadThree() {
        return hadThree;
    }

    public void setHadThree(String hadThree) {
        this.hadThree = hadThree;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void gather() {
        System.out.println(" Головы для робота : " + text + " , готовы.");
    }
}





