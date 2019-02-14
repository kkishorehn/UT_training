package mockitoexampls;

public class Ecom {


    public int getTotalPrice(User user)
    {
        int total = 0;
        for(Product ob:user.getCart().getProducts())
        {
            total+=ob.getPrice();
        }
        return total;
    }

    public int getTotalWithGST(User user,GstCalc gstCalc)
    {
        int total = 0;
        for(Product ob:user.getCart().getProducts())
        {
            total+=ob.getPrice();
        }
        total+= (total*gstCalc.getGST()/100);
        return total;
    }

    public int getTotalWithGSTBasedOnProductCategory(User user,GstCalc gstCalc,String category)
    {
        int total = 0;
        for(Product ob:user.getCart().getProducts())
        {
            total+=ob.getPrice();
        }
        total+= (total*gstCalc.getGSTForProduct(category)/100);
        return total;
    }

    public int getTotalWithGSTSimple(User user,GstCalc gstCalc,String category)
    {
        int total = 0;
        for(Product ob:user.getCart().getProducts())
        {
            total+=ob.getPrice();
        }
        if(category.equals("Books")){
            gstCalc.simpleMethod(category);
        }

        return total;
    }


}
