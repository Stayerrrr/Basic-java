public class Apartment extends Building {
    private double monthlyRevenue;

    public Apartment(String name, String address, int floors, double monthlyRevenue) {
        super(name, address, floors);
        this.monthlyRevenue = monthlyRevenue;
    }

    @Override
    public void showBuilding() {
        super.showBuilding();
        System.out.println("Type: Apartment | Monthly Revenue: $" + monthlyRevenue);
    }
}