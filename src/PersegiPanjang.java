
class persegipanjang extends Bentuk {

    private double panjang;
    private double lebar;

    persegipanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    @Override
    public double luas() {
        System.out.println("dalam objek persegi panjang");
        return (panjang * lebar);
    }
}