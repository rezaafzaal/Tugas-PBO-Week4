Nama : Reza Afzaal Faizullah Taqy <br>
NRP : 5025241051

Disini saya membuat sebuah program jam digital sederhana menggunakan bahasa pemrograman Java. Program ini dibangun dengan memanfaatkan tiga buah kelas, yaitu NumberDisplay, ClockDisplay, dan Clock. Setiap kelas memiliki peran yang berbeda namun saling berhubungan sehingga mampu membentuk aplikasi jam digital dengan antarmuka grafis.

<img width="769" height="581" alt="image" src="https://github.com/user-attachments/assets/8609817e-9eaa-4d23-a7b0-66e301210c82" />


Kelas pertama adalah NumberDisplay, yang berfungsi sebagai komponen dasar penyusun jam. Kelas ini memiliki dua atribut utama, yaitu limit sebagai batas maksimum angka (contohnya 24 untuk jam dan 60 untuk menit) serta value sebagai nilai saat ini. Fungsi utama kelas ini adalah untuk menyimpan angka, menampilkannya dalam format dua digit, serta menambahkan nilainya dengan sistem rollover (kembali ke 0 setelah mencapai batas). Dengan demikian, kelas ini dapat dipakai secara fleksibel baik untuk jam, menit, maupun detik.

Kelas kedua adalah ClockDisplay, yang menggabungkan beberapa objek NumberDisplay untuk membentuk sebuah jam digital yang utuh. Pada kelas ini dibuat dua atribut NumberDisplay, yaitu hour dan minute. Terdapat pula sebuah string displayString yang digunakan untuk menyimpan representasi waktu dalam format teks. Kelas ini menyediakan method timeTick() untuk memajukan waktu setiap menit, setTime() untuk mengatur jam sesuai input, serta getTime() untuk mengembalikan tampilan waktu dalam format “HH:MM”. Proses pembaruan tampilan dilakukan secara otomatis melalui method updateDisplay().

Kelas ketiga adalah Clock, yang berperan sebagai antarmuka utama bagi pengguna. Pada kelas ini digunakan Swing untuk membangun GUI dengan komponen utama berupa JFrame dan JLabel sebagai penampil waktu. Beberapa tombol juga disediakan, seperti Start, Stop, dan Step, agar pengguna dapat mengendalikan jalannya jam. Jalannya waktu diatur menggunakan inner class bernama TimerThread yang berjalan pada background thread. Inner class ini secara terus menerus memanggil method step() untuk memperbarui waktu dan menampilkannya pada label, selama status clockRunning masih aktif. Dengan demikian, jam dapat berjalan otomatis tanpa interaksi manual dari pengguna.

Kelas NumberDisplay bertindak sebagai penyimpan angka, kelas ClockDisplay mengelola logika waktu, sedangkan kelas Clock mengatur antarmuka grafis dan jalannya aplikasi. Hasil akhir dari program adalah sebuah tampilan jam digital yang dapat berjalan secara otomatis, dihentikan, maupun dipajukan secara manual sesuai perintah pengguna.


<img width="298" height="169" alt="image" src="https://github.com/user-attachments/assets/018547bc-e3f8-42bd-bd33-b8e9e11f1549" />
