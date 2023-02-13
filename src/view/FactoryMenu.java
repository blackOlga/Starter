package view;

public class FactoryMenu {
    public static void main(String[] args) {
        FactoryHad factoryHad = new FactoryHad();
        FactoryBody factoryBody = new FactoryBody();
        FactoryRobot factoryRobot = new FactoryRobot();
        factoryHad.gather();
        factoryBody.gather();
        factoryBody.getBodyOne();
        factoryBody.getBodyTwo();
        factoryBody.getBodyThree();
        factoryRobot.letsDo();
        factoryHad.getHadOne();
        factoryHad.getHadTwo();
        factoryHad.getHadThree();

        Robot RQ1 = Robot.RQ1;
        Robot RQ2 = Robot.RQ2;
        Robot RQ3 = Robot.RQ3;
        Robot RQ4 = Robot.RQ4;
        Robot RQ5 = Robot.RQ5;
        Robot RQ7 = Robot.RQ7;
        Robot RQ6 = Robot.RQ6;
        Robot RQ8 = Robot.RQ8;
        Robot RQ9 = Robot.RQ9;

        if (Robot.RQ1.equals(RQ1)) {
            System.out.println
                    ("It's " + RQ1 + "." + "He consists of " + factoryBody.getBodyOne() + factoryHad.getHadOne());
        }
        if (Robot.RQ2.equals(RQ2)) {
            System.out.println
                    ("It's " + RQ2 + "." + "He consists of " + factoryBody.getBodyTwo() + factoryHad.getHadTwo());

        }
        if (Robot.RQ3.equals(RQ3)) {
            System.out.println
                    ("It's " + RQ3 + "." + "He consists of " + factoryBody.getBodyThree() + factoryHad.getHadThree());
        }
        if (Robot.RQ4.equals(RQ4)) {
            System.out.println
                    ("It's " + RQ4 + "." + "He consists of " + factoryBody.getBodyOne() + factoryHad.getHadTwo());
        }
        if (Robot.RQ5.equals(RQ5)) {
            System.out.println
                    ("It's " + RQ5 + "." + "He consists of " + factoryBody.getBodyOne() + factoryHad.getHadThree());
        }
        if (Robot.RQ6.equals(RQ6)) {
            System.out.println
                    ("It's " + RQ6 + "." + "He consists of " + factoryBody.getBodyTwo() + factoryHad.getHadOne());
        }
        if (Robot.RQ7.equals(RQ7)) {
            System.out.println
                    ("It's " + RQ7 + "." + "He consists of " + factoryBody.getBodyTwo() + factoryHad.getHadThree());
        }
        if (Robot.RQ8.equals(RQ8)) {
            System.out.println
                    ("It's " + RQ8 + "." + "He consists of " + factoryBody.getBodyThree() + factoryHad.getHadOne());
        }
        if (Robot.RQ9.equals(RQ9)) {
            System.out.println
                    ("It's " + RQ9 + "." + "He consists of " + factoryBody.getBodyThree() + factoryHad.getHadTwo());
        }
    }

    public void gather() {
        System.out.println("Первый робот : "
                + " голова" + " и " + " тело," + " готов!");
    }

}
