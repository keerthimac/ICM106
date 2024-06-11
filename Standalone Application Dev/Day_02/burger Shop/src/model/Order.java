package model;

public class Order {
    private String orderId;
    private String customerId;
    private String customerName;
    private int qty;
    private double total;
    private int status;

    public Order(String orderId, String customerId, String customerName, int qty, double total, int status) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.qty = qty;
        this.total = total;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
