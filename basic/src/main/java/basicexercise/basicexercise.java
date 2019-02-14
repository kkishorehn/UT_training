package basicexercise;

public class basicexercise {
    public int getIntergerValue(String number)
    {
        int num;
        if ("one".equals(number)) {
            num = 1;

        } else if ("two".equals(number)) {
            num = 2;

        } else if ("three".equals(number)) {
            num = 3;

        } else {
            num = 0;
        }
        return num;
    }
}
