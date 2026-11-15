import java.util.ArrayList;

// ===============================
// CLASS NASABAH
// ===============================
class Nasabah {
    private String nama;
    private String nomorIdentitas;
    private String alamat;

    public Nasabah(String nama, String nomorIdentitas, String alamat) {
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanInfo() {
        System.out.println("Nama             : " + nama);
        System.out.println("Nomor Identitas  : " + nomorIdentitas);
        System.out.println("Alamat           : " + alamat);
    }
}


// ===============================
// CLASS REKENING
// ===============================
class Rekening {
    private String nomorRekening;
    private double saldo;
    private Nasabah pemilik;

    public Rekening(String nomorRekening, Nasabah pemilik) {
        this.nomorRekening = nomorRekening;
        this.pemilik = pemilik;
        this.saldo = 0;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setoran berhasil.");
            System.out.println("Jumlah setoran : Rp" + jumlah);
        } else {
            System.out.println("Jumlah setoran tidak valid.");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah penarikan tidak valid.");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil.");
            System.out.println("Jumlah penarikan : Rp" + jumlah);
        }
    }

    public void transfer(Rekening tujuan, double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah transfer tidak valid.");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            tujuan.saldo += jumlah;

            System.out.println("Transfer berhasil.");
            System.out.println("Jumlah transfer : Rp" + jumlah);
            System.out.println("Ke rekening     : " + tujuan.nomorRekening);
        }
    }

    public void cekSaldo() {
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Pemilik        : " + pemilik.getNama());
        System.out.println("Saldo          : Rp" + saldo);
    }
}


// ===============================
// CLASS BANK
// ===============================
class Bank {
    private String namaBank;
    private ArrayList<Nasabah> daftarNasabah;
    private ArrayList<Rekening> daftarRekening;

    public Bank(String namaBank) {
        this.namaBank = namaBank;
        daftarNasabah = new ArrayList<>();
        daftarRekening = new ArrayList<>();
    }

    public Rekening bukaRekening(
            String nama,
            String nomorIdentitas,
            String alamat,
            String nomorRekening) {

        Nasabah nasabah = new Nasabah(
                nama,
                nomorIdentitas,
                alamat
        );

        Rekening rekening = new Rekening(
                nomorRekening,
                nasabah
        );

        daftarNasabah.add(nasabah);
        daftarRekening.add(rekening);

        System.out.println("Rekening berhasil dibuat.");
        System.out.println("Nomor rekening : " + nomorRekening);
        System.out.println("Pemilik        : " + nama);

        return rekening;
    }

    public Rekening cariRekening(String nomorRekening) {
        for (Rekening rekening : daftarRekening) {
            if (rekening.getNomorRekening().equals(nomorRekening)) {
                return rekening;
            }
        }

        return null;
    }

    public void tampilkanJumlahNasabah() {
        System.out.println("Jumlah nasabah : " + daftarNasabah.size());
    }
}


// ===============================
// CLASS TRANSAKSI
// ===============================
class Transaksi {

    public static void setor(Rekening rekening, double jumlah) {
        rekening.setor(jumlah);
    }

    public static void tarik(Rekening rekening, double jumlah) {
        rekening.tarik(jumlah);
    }

    public static void transfer(
            Rekening sumber,
            Rekening tujuan,
            double jumlah) {

        sumber.transfer(tujuan, jumlah);
    }
}


// ===============================
// MAIN PROGRAM
// ===============================
public class SistemPerbankan {

    public static void main(String[] args) {

        Bank bank = new Bank("Bank Java Indonesia");

        System.out.println("===== PEMBUKAAN REKENING =====");

        Rekening rekening1 = bank.bukaRekening(
                "Budi",
                "123456789",
                "Palembang",
                "001"
        );

        System.out.println();

        Rekening rekening2 = bank.bukaRekening(
                "Andi",
                "987654321",
                "Jakarta",
                "002"
        );

        System.out.println("\n===== PENYETORAN =====");

        Transaksi.setor(rekening1, 5000000);

        System.out.println("\n===== CEK SALDO =====");

        rekening1.cekSaldo();

        System.out.println("\n===== PENARIKAN =====");

        Transaksi.tarik(rekening1, 1000000);

        System.out.println("\n===== CEK SALDO SETELAH PENARIKAN =====");

        rekening1.cekSaldo();

        System.out.println("\n===== TRANSFER =====");

        Transaksi.transfer(
                rekening1,
                rekening2,
                2000000
        );

        System.out.println("\n===== SALDO REKENING BUDI =====");

        rekening1.cekSaldo();

        System.out.println("\n===== SALDO REKENING ANDI =====");

        rekening2.cekSaldo();

        System.out.println("\n===== INFORMASI BANK =====");

        bank.tampilkanJumlahNasabah();
    }
}