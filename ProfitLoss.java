public class ProfitLoss {
    public static void main(String[] args) {
        double costPrice = 100.0; // Example cost price
        double sellingPrice = 120.0; // Example selling price

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("Profit: " + profit);
        } else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No profit, no loss.");
        }
    }
    
}
