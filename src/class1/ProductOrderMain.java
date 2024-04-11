package class1;


public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder menu1 = new ProductOrder();
        menu1.menu = "두부한모";
        menu1.price = 2000;
        menu1.quantity = 2;

        ProductOrder menu2 = new ProductOrder();
        menu2.menu = "김치";
        menu2.price = 5000;
        menu2.quantity = 1;

        ProductOrder menu3 = new ProductOrder();
        menu3.menu = "콜라";
        menu3.price = 1500;
        menu3.quantity = 2;

        int sum = 0;

        ProductOrder[] menu = {menu1, menu2, menu3};
        for( ProductOrder i: menu){
            System.out.println("메뉴 : " + i.menu + " 가격 " + i.price + " 갯수 : " + i.quantity);

            sum += i.price * i.quantity;

        }
        System.out.println("총 금액 : " + sum);
    }
}
