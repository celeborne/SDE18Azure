package com.payroll;

public class Sales extends Employee {
    private float totalSales;
    private float commissionRate;
    private Receipts receipts;

    public Sales(int id) {
        super(id);
    }

    public Sales(String name, int id, float commissionRate) {
        this(id);
        setName(name);
        receipts = new Receipts();
        this.commissionRate = commissionRate;
    }
    public float getCurrentSalesTotal() { return receipts.getTotalSales(); }
    public void makeSale(Sale sale){
        receipts.makeSale(sale);
    }

    public float getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(float commissionRate) {
        this.commissionRate = commissionRate;
    }

    public float getTotalSales(){
        return totalSales;
    }

    @Override
    public float calculatePay() {
        float totalPay = receipts.getTotalSales()*commissionRate;
        return totalPay;
    }

    @Override
    public String toString() {
        return super.toString() + "Sales{" +
                "totalSales=" + totalSales +
                ", commissionRate=" + commissionRate +
                '}';
    }
}
