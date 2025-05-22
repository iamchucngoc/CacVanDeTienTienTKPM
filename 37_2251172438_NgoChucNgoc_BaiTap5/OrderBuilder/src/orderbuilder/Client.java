
package orderbuilder;

public class Client {
    public static void main(String[] args) {
        // Online Order
        OnlineOrderBuilder onlineBuilder = new OnlineOrderBuilder();
        Director director = new Director(onlineBuilder);
        director.makeOnlineOrder();
        OnlineOrder onlineOrder = onlineBuilder.getResult();

        System.out.println("-----------");

        // Offline Order
        OfflineOrderBuilder offlineBuilder = new OfflineOrderBuilder();
        director.changeBuilder(offlineBuilder);
        director.makeOnlineOrder();
        OfflineOrder offlineOrder = offlineBuilder.getResult();
    }
}

