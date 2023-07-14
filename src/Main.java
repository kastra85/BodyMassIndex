public class Main {
    public static void main(String[] args) {
        BmiServise service = new BmiServise();
        int weightInKg = 98;
        double heightInMeters = 1.87;
        int index = service.calculate(weightInKg,heightInMeters); // должно быть 28
        System.out.println(index);
    }
}
