package com.sofudev.samplecrud;

public class konfigurasi {

    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    //UNTUK LOCALHOST SELALU GUNAKAN IP 10.0.2.2 DI EMULATOR
    public static final String URL_ADD="http://10.0.2.2/crudsiswa/pegawai/simpan";
    public static final String URL_GET_ALL = "http://10.0.2.2/crudsiswa/pegawai/listing";
    public static final String URL_GET_EMP = "http://10.0.2.2/crudsiswa/pegawai/fetch_data/";
    public static final String URL_UPDATE_EMP = "http://10.0.2.2/crudsiswa/pegawai/simpan";
    public static final String URL_DELETE_EMP = "http://10.0.2.2/crudsiswa/pegawai/hapus_data/";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_POSISI = "desg"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_GAJIH = "salary"; //salary itu variabel untuk gajih

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_POSISI = "desg";
    public static final String TAG_GAJIH = "salary";

    //JSON Object Tags
    public static final String COL_NAMA = "nama";
    public static final String COL_POSISI = "posisi";
    public static final String COL_GAJIH = "gajih";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
