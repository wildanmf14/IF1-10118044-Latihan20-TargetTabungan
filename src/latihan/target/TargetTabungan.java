package latihan.target;

public class TargetTabungan {

	public static void main(String[] args) {
		float saldoAwal = 3500000;
		float bunga = 0.08f;
		float saldoTarget = 6000000;
		float saldoSekarang = saldoAwal;
		int i = 1;
		while(saldoSekarang <= saldoTarget) {
			saldoSekarang += bunga * saldoSekarang;
			System.out.printf("Saldo di bulan ke-"+i+" : Rp.%,.0f%n", saldoSekarang);
			i++;
		}

	}

}
