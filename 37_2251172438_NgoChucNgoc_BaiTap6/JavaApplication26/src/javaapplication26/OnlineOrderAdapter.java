/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication26;

public class OnlineOrderAdapter implements Order {
    private OnlineOrder onlineOrder;

    public OnlineOrderAdapter(OnlineOrder onlineOrder) {
        this.onlineOrder = onlineOrder;
    }

    @Override
    public void Processor() {
        onlineOrder.processOnlineOrder();
    }
}

