package pages;
public class CartPage {

    public void cart(){
        String nameDT1 = "Dev 1";
        System.out.println("Changes by dev 1");
        if (nameDT1 == null) {
            System.out.println("Cart page empty");
        } else if (nameDT1 == "1") {
            System.out.println("Cart page has 1 item");
        }

        switch (1){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
            default:
                System.out.println("3");
        }
    }
}
