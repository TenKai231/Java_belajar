package Java_pertemuan_11;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class Data_Mahasiswa extends JFrame {

    JTextField txtNama, txtNim, txtFakultas, txtUniversitas, txtBidangPeminatan, txtAlamat, txtNoHp;
    JComboBox<String> cmbJurusan;

    JButton btnTambah, btnUbah, btnHapus, btnClear;

    JTable tabel;
    DefaultTableModel model;
    private final MahasiswaDAO mahasiswaDAO = new MahasiswaDAO();

    public Data_Mahasiswa() {

        setTitle("Data Mahasiswa");
        setSize(1_050, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel utama
        JPanel panelUtama = new JPanel(new BorderLayout(10, 10));
        panelUtama.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Judul
        JLabel judul = new JLabel("DATA MAHASISWA");
        judul.setFont(new Font("Arial", Font.BOLD, 20));
        judul.setHorizontalAlignment(JLabel.CENTER);

        panelUtama.add(judul, BorderLayout.NORTH);

        // Panel input
        JPanel panelInput = new JPanel(new GridLayout(8, 3, 10, 10));

        txtNama = new JTextField();
        txtNim = new JTextField();
        txtFakultas = new JTextField();
        txtUniversitas = new JTextField();
        txtBidangPeminatan = new JTextField();
        txtAlamat = new JTextField();
        txtNoHp = new JTextField();

        cmbJurusan = new JComboBox<>(new String[]{
            "Sistem Informasi",
            "Teknik Informatika",
            "Manajemen Informatika",
            "Akuntansi"
        });

        btnTambah = new JButton("Tambah");
        btnUbah = new JButton("Ubah");
        btnHapus = new JButton("Hapus");
        btnClear = new JButton("Clear");

        panelInput.add(new JLabel("Nama"));
        panelInput.add(txtNama);
        panelInput.add(btnTambah);

        panelInput.add(new JLabel("NIM"));
        panelInput.add(txtNim);
        panelInput.add(btnUbah);

        panelInput.add(new JLabel("Jurusan"));
        panelInput.add(cmbJurusan);
        panelInput.add(new JLabel(""));

        panelInput.add(new JLabel("Fakultas"));
        panelInput.add(txtFakultas);
        panelInput.add(new JLabel(""));

        panelInput.add(new JLabel("Universitas"));
        panelInput.add(txtUniversitas);
        panelInput.add(new JLabel(""));

        panelInput.add(new JLabel("Bidang Peminatan"));
        panelInput.add(txtBidangPeminatan);
        panelInput.add(new JLabel(""));

        panelInput.add(new JLabel("Alamat"));
        panelInput.add(txtAlamat);
        panelInput.add(btnHapus);

        panelInput.add(new JLabel("No Handphone"));
        panelInput.add(txtNoHp);
        panelInput.add(btnClear);

        // Panel tengah
        JPanel panelTengah = new JPanel(new BorderLayout(10, 15));
        panelTengah.add(panelInput, BorderLayout.NORTH);

        // Tabel mahasiswa
        String[] kolom = {
            "Nama", "NIM", "Jurusan", "Fakultas", "Universitas", "Bidang Peminatan",
            "Alamat", "No Handphone"
        };

        model = new DefaultTableModel(kolom, 0);
        tabel = new JTable(model);
        tabel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(tabel);

        panelTengah.add(scrollPane, BorderLayout.CENTER);

        panelUtama.add(panelTengah, BorderLayout.CENTER);

        add(panelUtama);

        pasangAksiTombol();
        tampilkanData();
    }

    private void pasangAksiTombol() {
        btnTambah.addActionListener(e -> tambahData());
        btnUbah.addActionListener(e -> ubahData());
        btnHapus.addActionListener(e -> hapusData());
        btnClear.addActionListener(e -> clearForm());
        tabel.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && tabel.getSelectedRow() >= 0) {
                isiFormDariTabel(tabel.getSelectedRow());
            }
        });
    }

    private Mahasiswa ambilDataForm() {
        String nama = txtNama.getText().trim();
        String nimText = txtNim.getText().trim();
        String fakultas = txtFakultas.getText().trim();
        String universitas = txtUniversitas.getText().trim();
        String bidangPeminatan = txtBidangPeminatan.getText().trim();
        String alamat = txtAlamat.getText().trim();
        String noHp = txtNoHp.getText().trim();

        if (nama.isEmpty() || nimText.isEmpty() || fakultas.isEmpty() || universitas.isEmpty()
                || bidangPeminatan.isEmpty() || alamat.isEmpty() || noHp.isEmpty()) {
            throw new IllegalArgumentException("Semua field wajib diisi.");
        }

        try {
            int nim = Integer.parseInt(nimText);
            return new Mahasiswa(nama, nim, (String) cmbJurusan.getSelectedItem(), fakultas,
                    universitas, bidangPeminatan, alamat, noHp);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("NIM harus berupa angka.");
        }
    }

    private void tambahData() {
        try {
            if (mahasiswaDAO.tambah(ambilDataForm())) {
                JOptionPane.showMessageDialog(this, "Data mahasiswa berhasil ditambahkan.");
                tampilkanData();
                clearForm();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan. Pastikan NIM belum digunakan.", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IllegalArgumentException e) {
            tampilkanValidasi(e.getMessage());
        }
    }

    private void ubahData() {
        try {
            if (mahasiswaDAO.ubah(ambilDataForm())) {
                JOptionPane.showMessageDialog(this, "Data mahasiswa berhasil diubah.");
                tampilkanData();
                clearForm();
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan atau gagal diubah.", "Gagal", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IllegalArgumentException e) {
            tampilkanValidasi(e.getMessage());
        }
    }

    private void hapusData() {
        try {
            int nim = Integer.parseInt(txtNim.getText().trim());
            if (JOptionPane.showConfirmDialog(this, "Hapus data dengan NIM " + nim + "?", "Konfirmasi hapus", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (mahasiswaDAO.hapus(nim)) {
                    JOptionPane.showMessageDialog(this, "Data mahasiswa berhasil dihapus.");
                    tampilkanData();
                    clearForm();
                } else {
                    JOptionPane.showMessageDialog(this, "Data tidak ditemukan atau gagal dihapus.", "Gagal", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            tampilkanValidasi("Masukkan NIM berupa angka atau pilih data dari tabel.");
        }
    }

    private void tampilkanData() {
        model.setRowCount(0);
        List<Mahasiswa> daftarMahasiswa = mahasiswaDAO.ambilSemua();
        for (Mahasiswa mhs : daftarMahasiswa) {
            model.addRow(new Object[]{mhs.getNama(), mhs.getNim(), mhs.getJurusan(),
                    mhs.getFakultas(), mhs.getUniversitas(), mhs.getBidangPeminatan(),
                    mhs.getAlamat(), mhs.getNoTelpon()});
        }
    }

    private void isiFormDariTabel(int baris) {
        txtNama.setText(model.getValueAt(baris, 0).toString());
        txtNim.setText(model.getValueAt(baris, 1).toString());
        cmbJurusan.setSelectedItem(model.getValueAt(baris, 2).toString());
        txtFakultas.setText(model.getValueAt(baris, 3).toString());
        txtUniversitas.setText(model.getValueAt(baris, 4).toString());
        txtBidangPeminatan.setText(model.getValueAt(baris, 5).toString());
        txtAlamat.setText(model.getValueAt(baris, 6).toString());
        txtNoHp.setText(model.getValueAt(baris, 7).toString());
    }

    private void clearForm() {
        txtNama.setText("");
        txtNim.setText("");
        cmbJurusan.setSelectedIndex(0);
        txtFakultas.setText("");
        txtUniversitas.setText("");
        txtBidangPeminatan.setText("");
        txtAlamat.setText("");
        txtNoHp.setText("");
        tabel.clearSelection();
        txtNama.requestFocus();
    }

    private void tampilkanValidasi(String pesan) {
        JOptionPane.showMessageDialog(this, pesan, "Input tidak valid", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Data_Mahasiswa().setVisible(true);
        });
    }
}
