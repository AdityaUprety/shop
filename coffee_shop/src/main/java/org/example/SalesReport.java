import java.util.Date;

public class SalesReport {
    private Date reportDate;
    private double totalSales;
    private int totalOrders;

    public SalesReport(Date reportDate, double totalSales, int totalOrders) {
        this.reportDate = reportDate;
        this.totalSales = totalSales;
        this.totalOrders = totalOrders;
    }

    // Getter methods
    public Date getReportDate() {
        return reportDate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    // Setter methods
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }
}
