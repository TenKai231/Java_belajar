-- Jalankan skrip ini di phpMyAdmin, pada database Mahasiswa.
-- Aman dijalankan berulang kali pada database Mahasiswa.

CREATE TABLE IF NOT EXISTS mahasiswa (
    nim INT NOT NULL,
    nama VARCHAR(100) NOT NULL,
    jurusan VARCHAR(100) NOT NULL,
    fakultas VARCHAR(100) NOT NULL,
    universitas VARCHAR(150) NOT NULL,
    bidang_peminatan VARCHAR(150) NOT NULL,
    alamat VARCHAR(255) NOT NULL,
    no_telpon VARCHAR(30) NOT NULL,
    PRIMARY KEY (nim)
);

DELIMITER $$

DROP PROCEDURE IF EXISTS tambah_kolom_mahasiswa $$

CREATE PROCEDURE tambah_kolom_mahasiswa()
BEGIN
    IF NOT EXISTS (
        SELECT 1 FROM information_schema.columns
        WHERE table_schema = DATABASE() AND table_name = 'mahasiswa' AND column_name = 'fakultas'
    ) THEN
        ALTER TABLE mahasiswa ADD COLUMN fakultas VARCHAR(100) NOT NULL DEFAULT '' AFTER jurusan;
    END IF;

    IF NOT EXISTS (
        SELECT 1 FROM information_schema.columns
        WHERE table_schema = DATABASE() AND table_name = 'mahasiswa' AND column_name = 'universitas'
    ) THEN
        ALTER TABLE mahasiswa ADD COLUMN universitas VARCHAR(150) NOT NULL DEFAULT '' AFTER fakultas;
    END IF;

    IF NOT EXISTS (
        SELECT 1 FROM information_schema.columns
        WHERE table_schema = DATABASE() AND table_name = 'mahasiswa' AND column_name = 'bidang_peminatan'
    ) THEN
        ALTER TABLE mahasiswa ADD COLUMN bidang_peminatan VARCHAR(150) NOT NULL DEFAULT '' AFTER universitas;
    END IF;
END $$

CALL tambah_kolom_mahasiswa() $$
DROP PROCEDURE tambah_kolom_mahasiswa $$

DELIMITER ;
