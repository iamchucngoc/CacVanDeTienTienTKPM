
package javaapplication26;

public class Main {
    public static void main(String[] args) {
        // Online Order
        OnlineOrder online = new OnlineOrder();
        Order onlineAdapter = new OnlineOrderAdapter(online);
        onlineAdapter.Processor();

        // Offline Order
        OfflineOrder offline = new OfflineOrder();
        Order offlineAdapter = new OfflineOrderAdapter(offline);
        offlineAdapter.Processor();
    }
}
