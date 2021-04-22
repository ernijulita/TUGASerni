package TugasAlgoritma;

public class NimRun {
    public static void main(String[] args) {
        String nim = "12050120465";
        Nim objNim = new Nim();
        objNim.setNim(nim);

        System.out.println("===================================================");
        System.out.println("Mahasiswa Universitas Uin Suska Riau");
        System.out.println("Nama = Erni Julita");
        System.out.println("Jenis pendidikan = " + objNim.getJenjangPendidikan());
        System.out.println(objNim.getTahunMasuk());
        System.out.println("Fakultas = " + objNim.getFakultas());
        System.out.println("Jurusan =" + objNim.getJurusan());
        System.out.println("Jenis kelamin = " + objNim.getJenisKelamin());
        System.out.println(objNim.getNomorUrutMahasiswa());
        System.out.println("====================================================");
    }

}

