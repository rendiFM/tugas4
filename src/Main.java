
public class Main {

    public static void main(String[] agrs) {
        // TODO code application logic here
        Bentuk obj;
        persegipanjang pp = new persegipanjang(5, 3);
        bujursangkar bs = new bujursangkar(4);
        segitiga st = new segitiga(4, 3);
        Lingkaran lk = new Lingkaran(2);
        //objek mengacu pada oabjek persegipanjang
        obj = pp;
        System.out.println("luas :" + obj.luas());
        System.out.println();
        obj = bs;
        System.out.println("luas :" + obj.luas());
        System.out.println();
        obj = st;
        System.out.println("luas :" + obj.luas());
        System.out.println();
        obj = lk;
        System.out.println("luas :" + obj.luas());
        System.out.println();
    }
}
