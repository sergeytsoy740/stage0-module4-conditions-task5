package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        /*год должен быть кратен 400
         или год должен быть кратен 4, но не 100.*/

        boolean isLeap = false;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            isLeap = true;
        }
        System.out.println(isLeap);
    }
}
