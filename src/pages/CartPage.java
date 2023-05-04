package pages;
public class CartPage {

    public void cart(){
        String nameDT1 = "Dev 1";
        System.out.println("Changes by dev 1");
        if (nameDT1 == null) {
            System.out.println("Cart page empty");
        } else {
            System.out.println("Cart page not empty");
        }
    }
}
