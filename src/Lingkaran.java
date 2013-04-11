
class Lingkaran extends Bentuk {

    private double jarijari;
    private double phi = 3.14;

    Lingkaran(int r) {
        jarijari = r;
    }

    @Override
    public double luas() {
        System.out.println("dalam objek lingkaran");
        return (phi * jarijari * jarijari);
    }
}
