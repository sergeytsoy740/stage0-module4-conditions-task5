package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    //1, 3, 5, 7, 8, 10, 12 - 31
    //2 - 28
    //4, 6, 9, 11
    public void amountOfDays(int month) {
        switch (month) {
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                System.out.println(31);
                break;
            case (2):
                System.out.println(28);
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                System.out.println(30);
                break;
            default:
                System.out.println("wrong data!");
                break;
        }
    }
}
