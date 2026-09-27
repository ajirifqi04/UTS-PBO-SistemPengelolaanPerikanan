# Sistem Pengelolaan Perikanan

Nama : Aji Rifqi Suryana

NIM : 2509116054

## 1. Deskripsi Proyek

Sistem Pengelolaan Perikanan merupakan program berbasis Java yang digunakan untuk mengelola data ikan dan stok ikan. Program ini dapat digunakan untuk memasukkan data ikan laut dan ikan sungai, kemudian menampilkan kembali data yang telah dimasukkan.

Data ikan laut memiliki informasi tambahan berupa kedalaman habitat dan wilayah tangkap, sedangkan data ikan sungai memiliki informasi berupa nama sungai dan jenis perairan. Program juga menyediakan pengelolaan data stok yang terdiri dari ID stok, ID ikan, jumlah stok, dan satuan.

Program dibuat menggunakan konsep dasar Object-Oriented Programming (OOP), seperti inheritance, polymorphism, encapsulation, condition, looping, dan ArrayList.

## 2. Alur Program

Program dimulai dari MainPerikanan.java dengan membuat Scanner untuk menerima input dan ArrayList untuk menyimpan data ikan serta data stok. Setelah itu, sistem menampilkan menu utama dan menjalankan proses sesuai pilihan yang dipilih.

1. Input Ikan Laut

Sistem menerima data ikan laut berupa ID ikan, nama ikan, jenis ikan, status konservasi, kedalaman habitat, dan wilayah tangkap. Data tersebut digunakan untuk membuat objek IkanLaut, kemudian objek disimpan ke dalam ArrayList<Ikan>. Sistem juga membuat objek Stok berdasarkan data stok yang dimasukkan dan menyimpannya ke dalam ArrayList<Stok>.

2. Input Ikan Sungai

Sistem menerima data ikan sungai berupa ID ikan, nama ikan, jenis ikan, status konservasi, nama sungai, dan jenis perairan. Data tersebut digunakan untuk membuat objek IkanSungai, kemudian objek disimpan ke dalam ArrayList<Ikan>. Data stok ikan sungai juga dibuat menjadi objek Stok dan disimpan ke dalam ArrayList<Stok>.

3. Tampilkan Data Ikan

Sistem memeriksa apakah terdapat data ikan yang tersimpan. Jika ada, sistem menggunakan perulangan untuk mengambil setiap objek dari ArrayList<Ikan> dan menjalankan method tampilkanInfoIkan(). Method tersebut akan menampilkan informasi sesuai dengan jenis objek ikan melalui penerapan polymorphism.

4. Tampilkan Data Stok

Sistem memeriksa data stok yang tersimpan di dalam ArrayList<Stok>. Jika terdapat data, sistem menggunakan perulangan untuk mengambil setiap objek Stok dan menampilkan ID stok, ID ikan, jumlah stok, serta satuan.

5. Jumlah Data Ikan

Sistem menghitung jumlah seluruh objek ikan yang tersimpan di dalam ArrayList<Ikan> menggunakan method size(). Hasil perhitungan kemudian ditampilkan sebagai jumlah data ikan yang tersimpan.

6. Keluar

Sistem menghentikan perulangan utama ketika pilihan keluar dipilih. Setelah perulangan berhenti, Scanner ditutup dan program selesai dijalankan.

### Cara Kerja Sistem

Sistem bekerja dengan menyimpan data ikan dan stok dalam ArrayList selama program dijalankan. Data ikan disimpan sebagai objek dari class IkanLaut atau IkanSungai, sedangkan data stok disimpan sebagai objek dari class Stok.

Class Ikan berperan sebagai superclass yang menyimpan data umum ikan. Class IkanLaut dan IkanSungai menjadi subclass yang mewarisi data tersebut dan memiliki atribut tambahan sesuai dengan jenis ikan. Dengan demikian, satu ArrayList<Ikan> dapat menyimpan objek dari kedua subclass tersebut.

Saat sistem menampilkan data ikan, objek yang tersimpan diproses menggunakan perulangan. Method tampilkanInfoIkan() dipanggil pada setiap objek, kemudian sistem menjalankan method sesuai dengan jenis objek melalui overriding. Proses tersebut merupakan penerapan polymorphism pada program.

Sistem juga menggunakan if else untuk memeriksa kondisi data sebelum ditampilkan. Perulangan while digunakan untuk menjaga program tetap berjalan selama pengguna belum memilih keluar, sedangkan perulangan for digunakan untuk mengambil data yang tersimpan di dalam ArrayList.

Secara keseluruhan, sistem bekerja dengan proses membuat objek, menyimpan objek ke dalam ArrayList, memproses data menggunakan kondisi dan perulangan, kemudian menampilkan informasi berdasarkan objek yang tersimpan.

Data yang dimasukkan disimpan menggunakan `ArrayList` selama program sedang berjalan.

## 3. Penjelasan Gambar Output

### Screenshot Menu Utama

<img width="400" height="263" alt="image" src="https://github.com/user-attachments/assets/79f38db4-dd8c-4555-aee3-269bb15f843d" />

Gambar menunjukkan tampilan awal program yang berisi beberapa pilihan menu, yaitu input ikan laut, input ikan sungai, menampilkan data ikan, menampilkan data stok, melihat jumlah data ikan, dan keluar dari program.

### Screenshot Input Data Ikan Laut

<img width="366" height="758" alt="image" src="https://github.com/user-attachments/assets/af986687-5b71-451f-94bb-3d58a75df5f3" />

Gambar menunjukkan proses memasukkan data ikan laut. Data yang dimasukkan terdiri dari ID ikan, nama ikan, jenis ikan, status konservasi, kedalaman habitat, wilayah tangkap, serta data stok ikan.

### Screenshot Input Data Ikan Sungai

<img width="362" height="766" alt="image" src="https://github.com/user-attachments/assets/afc7d9e7-0f93-458f-8b06-f949fdf974b1" />

Gambar menunjukkan proses memasukkan data ikan sungai. Data yang dimasukkan terdiri dari ID ikan, nama ikan, jenis ikan, status konservasi, nama sungai, jenis perairan, serta data stok ikan.

### Screenshot Output Data Ikan

<img width="362" height="775" alt="image" src="https://github.com/user-attachments/assets/80bf3552-ae3a-48d7-aa43-c2352b7522aa" />

Gambar menunjukkan hasil pembacaan data ikan yang telah dimasukkan sebelumnya. Sistem menampilkan informasi umum ikan serta informasi tambahan sesuai dengan jenis ikannya.

### Screenshot Output Data Stok

<img width="319" height="698" alt="image" src="https://github.com/user-attachments/assets/0b485896-4ab4-4a24-8b33-e7d1230fb181" />

Gambar menunjukkan data stok ikan yang telah dimasukkan. Informasi yang ditampilkan terdiri dari ID stok, ID ikan, jumlah stok, dan satuan.

Screenshot Jumlah Data Ikan

<img width="368" height="520" alt="image" src="https://github.com/user-attachments/assets/f74f3a65-adb1-4669-a8c8-5860d7ede30b" />

Gambar menunjukkan hasil perhitungan jumlah data ikan yang telah tersimpan di dalam sistem. Sistem menghitung seluruh data ikan yang terdapat dalam ArrayList, baik data ikan laut maupun ikan sungai, kemudian menampilkan jumlah keseluruhan data ikan.

Screenshot Keluar

<img width="784" height="407" alt="image" src="https://github.com/user-attachments/assets/4d6f640a-b322-4e6a-9e79-4102f2662ce4" />

Gambar menunjukkan kondisi ketika pengguna memilih menu keluar. Sistem menampilkan pesan bahwa program selesai, kemudian menghentikan proses perulangan menu sehingga program berakhir.
