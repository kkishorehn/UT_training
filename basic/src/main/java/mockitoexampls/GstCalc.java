package mockitoexampls;

public class GstCalc {

    public int getGST()
    {
        return 5;
    }

    public int getGSTForProduct(String category) {
        int gstrate = 0;
        if ("Books".equals(category)) {
            gstrate = 2;


        } else if ("phones".equals(category)) {
            gstrate = 12;

        } else {
            gstrate = 8;
        }
         return gstrate;
    }

    public void simpleMethod(String category) {
        try {
            Thread.sleep(1);
            System.out.println(category);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
