public class WebScraperMock {
    public static void main(String[] args) {
        String[] titles = {
            "A Light in the Attic", "Tipping the Velvet", "Sharp Objects"
        };
        String[] prices = {
            "£51.77", "£53.74", "£47.82"
        };

        System.out.println("Scraped Product Data (Simulated):");
        for (int i = 0; i < titles.length; i++) {
            System.out.println("Title: " + titles[i]);
            System.out.println("Price: " + prices[i]);
            System.out.println("--------------------------");
        }
    }
}