public class DiziOrtalamasi {

	public static void main(String[] args) {

        double[] liste = {1, 2, 3, 4, 5, 6, 7, 8};
        double harmonikSeriToplami = 0.0;
        double harmonikSeriOrtalamasi;

        for (double i : liste) {
            harmonikSeriToplami += (1 / i);
        }
        harmonikSeriOrtalamasi = liste.length / harmonikSeriToplami;

        System.out.println("Harmonik Seri Toplamý\t: " + harmonikSeriToplami);
        System.out.println("Harmonik Seri Ortalamasý: " + harmonikSeriOrtalamasi);

    }
}
