
package task4;

public class Main {
    public static void main(String[] args) {
        OrderFactory factoryA = new FashionAOrderFactory();
        JeanOrder jeanA = factoryA.createJeanOrder();
        DressOrder dressA = factoryA.createDressOrder();

        System.out.println("Fashion A Jean Order Total: " + jeanA.getTotalAmount());
        System.out.println("Fashion A Dress Order Total: " + dressA.getTotalAmount());

        OrderFactory factoryB = new FashionBOrderFactory();
        JeanOrder jeanB = factoryB.createJeanOrder();
        DressOrder dressB = factoryB.createDressOrder();

        System.out.println("Fashion B Jean Order Total: " + jeanB.getTotalAmount());
        System.out.println("Fashion B Dress Order Total: " + dressB.getTotalAmount());
    }
}

