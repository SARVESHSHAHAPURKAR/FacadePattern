package org.example;

import com.sun.org.apache.xpath.internal.operations.Or;

public class OrderFacade {

    PaymentService paymentService;
    OrderService orderService;
    NotificationService notificationService;
    InvoiceService invoiceService;

    public OrderFacade() {
        this.paymentService = new PaymentService();
        this.orderService = new OrderService();
        this.notificationService = new NotificationService();
        this.invoiceService = new InvoiceService();

    }

    public void createOrder(){
        orderService.createOrder();
        paymentService.makePayment();
        invoiceService.generateInvoice();
        notificationService.sendNotification();
    }
}
