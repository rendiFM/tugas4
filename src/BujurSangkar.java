
class bujursangkar extends Bentuk {

    private double sisi;

    bujursangkar(int s) {
        sisi = s;
    }

    @Override
    public double luas() {
        System.out.println("dalam objek bujursangkar");
        return (sisi * sisi);
    }
}