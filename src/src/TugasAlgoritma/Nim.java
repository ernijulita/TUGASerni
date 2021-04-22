package TugasAlgoritma;

public class Nim {
    private String nim;

    String Nama;
    String JenjangPendidikan;
    String TahunMasuk;
    String Fakultas;
    String Jurusan;
    String Jeniskelamin;
    int NomorUrutMahasiswa;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjangPendidikan() {
        char kodeJp = nim.charAt(0);
        if (kodeJp == '1') {
            return "S1(Sarjana)";
        } else if (kodeJp == '2') {
            return "S2(Margister)";
        } else if (kodeJp == '3') {
            return "S3(Doktor)";
        }
        return "Unknown";
    }

    public String getTahunMasuk() {
        char kodeTahunMasuk = nim.charAt(1);
        char kodeTahunMasuk2 = nim.charAt(2);
        return "Tahun Masuk = 20" + kodeTahunMasuk + kodeTahunMasuk2;
    }

    public String getFakultas() {
        char kodeFakultas = nim.charAt(3);
        if (kodeFakultas == '1') {
            return "Tarbiyah dan Keguruan";
        } else if (kodeFakultas == '2') {
            return "Syari’ah dan Hukum";
        } else if (kodeFakultas == '3') {
            return "Ushuluddin";
        } else if (kodeFakultas == '4') {
            return "Dakwah dan Komunikasi";
        } else if (kodeFakultas == '5') {
            return "Sains dan Teknologi";
        } else if (kodeFakultas == '6') {
            return "Psikologi";
        } else if (kodeFakultas == '7') {
            return "Ekonomi dan Ilmu Sosial";
        } else if (kodeFakultas == '8') {
            return "Pertanian dan Peternakan";
        }
        return "Unknown";

    }

    public String getJurusan() {
        char kodeJurusan = nim.charAt(5);
        if (kodeJurusan == '1') {
            return "Teknik Informatika";
        } else if (kodeJurusan == '2') {
            return "Teknik Industri";
        } else if (kodeJurusan == '3') {
            return "Sistem Informasi";
        } else if (kodeJurusan == '4') {
            return "Matematika";
        } else if (kodeJurusan == '5') {
            return "Teknik Elektro";
        }
        return "Unknown";
    }

    public String getJenisKelamin() {
        char kodeJk = nim.charAt(6);
        if (kodeJk == '1') {
            return "Laki-Laki";
        } else if (kodeJk == '2') {
            return "Perempuan";
        }
        return "UNKNOWN";

    }
    public String getNomorUrutMahasiswa() {
        char kodeN = nim.charAt(7);
        char kodeo = nim.charAt(8);
        char kodem = nim.charAt(9);
        char koder = nim.charAt(10);
        return "Nomor Urut : " + kodeN + kodeo + kodem + koder;
    }
}

