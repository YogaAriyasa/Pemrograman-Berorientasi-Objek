/*
1. Permasalahan komputasi yang diselesaikan program ini adalah menghitung seluruh komponen
gaji karyawan, menentukan gaji pokok, bonus serta pajak karyawan secara otomatis melalui
kode program yang dibuat. Seperti contoh, program menghitung gaji bersih karyawan (Penghasilan kotor
dikurangi pajak) secara otomatis menggunakan perintah "-" sehingga kita tidak perlu menghitung secara manual.
2. Input: Kita harus menginput seluruh data yang diperlukan dan akan digunakan dalam perhitungan,
data yang harus diinput meliputi data karyawan (Golongan, durasi lembur), gaji pokok karyawan, upah lembur,
bonus untuk durasi lembur tertentu, dan pajak yang dikenakan.
Proses: Dalam program ini, proses yang dijalankan adalah menghitung aspek tertentu menggunakan aspek-aspek
yang berhubungan, seperti menghitung pajak menggunakan penghasilan kotor yang dimana penghasilan kotor merupakan
hasil dari gaji pokok + upah lembur + bonus durasi lembur (jika lembur selama lebih dari 10 jam), dan menghitung gaji
bersih yang dihasilkan dari penghasilan kotor dikurangi pajak.
Output: Output atau hasil dari program ini adalah menyimpan dan menampilkan data, gaji pokok, bonus, dan
pajak karyawan.
3. Tipe data pada setiap variabel beserta alasan pemilihannya:
Golongan = string: Karena golongan hanya merupakan variabel 1 huruf yang tidak memerlukan perhitungan matematika.
Durasi lembur = float: Karena durasi lembur merupakan angka yang akan digunakan untuk menentukan bonus, dan disini
saya menggunakan float karena terdapat kemungkinan durasi lembur dalam satuan menit karyawan menjadi penentu bonus
lembur, contohnya seperti durasi 10 jam lebih 12 menit yang akan dianggap mendapatkan bonus karena durasinya melebihi
10 jam walau hanya 12 menit.
Gaji pokok = double: Karena gaji pokok merupakan angka yang besar dan terdapat kemungkinan melibatkan angka desimal
karena adanya persentase pajak dan bonus.
Upah lembur = double: Karena upah lembur ditentukan dalam persentase tertentu dan karena tipe data double lebih
akurat dibanding tipe data float, sebab tipe data double memiliki ketelitian digit yang lebih besar dibanding tipe
data float.
Bonus lembur = double: Karena bonus lembur ditentukan dalam persentase tertentu dan karena tipe data double lebih
akurat dibanding tipe data float, sebab tipe data double memiliki ketelitian digit yang lebih besar dibanding tipe
data float.
Pajak = double: Karena pajak ditentukan dalam persentase tertentu dan karena tipe data double lebih
akurat dibanding tipe data float, sebab tipe data double memiliki ketelitian digit yang lebih besar dibanding tipe
data float.
Penghasilan kotor = double: Karena penghasilan kotor merupakan angka yang besar dan terdapat kemungkinan melibatkan angka
desimal karena adanya persentase pajak dan bonus.
Gaji bersih = double: Karena gaji bersih merupakan angka yang besar dan terdapat kemungkinan melibatkan angka desimal
karena adanya persentase pajak dan bonus.
4. Karena kondisi karyawan dapat berbeda sehingga memerlukan struktur kondisional untuk menentukan sesuatu yang berbeda
pada kondisi yang berbeda juga. Seperti contoh karyawan yang bernama Andi merupakan golongan A dan karyawan yang bernama
Budi merupakan golongan B, sehingga dibuatkan beberapa kondisi, yaitu kondisi ketika golongannya A dan kondisi ketika
golongannya B, yang dimana perbedan golongan tersebut akan membedakan gaji pokok yang diterima karyawan.
5. Perulangan dilakukan untuk membuat program lebih singkat dan efisien karena perhitungan gaji dapat dilakukan untuk
lima karyawan secara otomatis. Dengan perulangan, kode tidak perlu ditulis berulang kali secara manual pada kondisi
tertentu. Contohnya untuk menampilkan semua nama karyawan, kita cukup mengetik perintah perulangan sebanyak satu kali.
6.Perhitungan manual untuk karyawan Andi:
Golongan: A
Durasi lembur: 12 jam
Gaji pokok = Rp5.000.000
Upah lembur = 12 × Rp50.000 = Rp600.000
Bonus lembur = 10% × Rp5.000.000 = Rp500.000
Penghasilan kotor = Rp5.000.000 + Rp600.000 + Rp500.000 = Rp6.100.000
Pajak = 11% × Rp6.100.000 = Rp671.000
Gaji bersih = Rp6.100.000 − Rp671.000 = Rp5.429.000
Hasil perhitungan manual tersebut sama dengan hasil yang ditampilkan program untuk Andi, yaitu Rp5.429.000.
7. Karyawan yang mendapatkan gaji bersih tertinggi adalah Andi, yaitu sebesar Rp5.429.000. Hal ini terjadi karena Andi
memiliki gaji pokok golongan A sebesar Rp.5.000.000 dan durasi lembur 12 jam, sehingga mendapatkan bonus sebesar
Rp.500.000 dan upah lembur sebesar Rp600.000. Meskipun Andi dikenakan pajak sebesar Rp671.000, gaji bersihnya tetap menjadi
yang tertinggi dibandingkan karyawan lainnya.
*/

public class AB253{
    public static void main(String[] args) {
        String[] nama = {"Andi", "Budi", "Citra", "Dewi", "Eko"};
        String[] golongan = {"A", "B", "C", "A", "B"};
        float[] durasiLembur = {12.0f, 8.0f, 15.0f, 5.0f, 20.0f};

        double gajiPokok, upahLembur, bonus, pajak;
        double penghasilanKotor, gajiBersih;
        double totalGajiBersih = 0;

        System.out.printf("%-8s %-10s %-10s %-15s %-15s %-12s %-12s %-15s%n",
                "Nama", "Golongan", "Lembur", "Gaji Pokok",
                "Upah Lembur", "Bonus", "Pajak", "Gaji Bersih");

        for (int i = 0; i < nama.length; i++) {
            if (golongan[i].equals("A")) {
                gajiPokok = 5000000;
            } else if (golongan[i].equals("B")) {
                gajiPokok = 4000000;
            } else {
                gajiPokok = 3000000;
            }

            upahLembur = durasiLembur[i] * 50000;

            if (durasiLembur[i] > 10) {
                bonus = gajiPokok * 0.10;
            } else {
                bonus = 0;
            }

            penghasilanKotor = gajiPokok + upahLembur + bonus;

            if (penghasilanKotor > 5500000) {
                pajak = penghasilanKotor * 0.11;
            } else {
                pajak = 0;
            }

            gajiBersih = penghasilanKotor - pajak;
            totalGajiBersih += gajiBersih;

            System.out.printf("%-8s %-10s %-10.2f %-15.0f %-15.0f %-12.0f %-12.0f %-15.0f%n",
                    nama[i], golongan[i], durasiLembur[i], gajiPokok,
                    upahLembur, bonus, pajak, gajiBersih);
        }

        System.out.printf("%nTotal gaji bersih: Rp%.0f%n", totalGajiBersih);
    }
}
