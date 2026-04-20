public class Cinema extends Building {
    private double monthlyRevenue;

    public Cinema(String name, String address, int floors, double monthlyRevenue) {
        super(name, address, floors);
        this.monthlyRevenue = monthlyRevenue;
    }

    @Override
    public void showBuilding() {
        super.showBuilding();
        System.out.println("Type: Cinema | Monthly Revenue: $" + monthlyRevenue);
    }
}