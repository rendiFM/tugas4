
class segitiga extends Bentuk {

    private double alas;
    private double tinggi;

    segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    @Override
    public double luas() {
        System.out.println("dalam objek segitiga");
        return ((alas * tinggi) / 2);
    }
}
