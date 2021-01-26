# Bank Activity Based Management

Kelompok
1. Melinda Sari (1917051007) - mellnda1917051007
2. Christofora Diana Yuliawati (1917051026) - christoforadiana
3. Siever Geoffrey Kalele (1917051064) - razerook 

Pembagian tugas:
1. Design dan database --> Christofora Diana Yuliawati (1917051026)
2. Bank management javafx --> Melinda Sari (1917051007), Siever Geoffrey Kalele (1917051064)

# Deskripsi program
Bank activity based management berfungsi untuk membantu pengelola bank dalam hal mengatur aktivitas account, transaksi, layanan, dan pekerja di tiap cabangnya. Sistem ini digunakan untuk menginputkan informasi riwayat aktivitas bank, yang dapat digunakan oleh sang manager untuk memantau aktivitas banknya. Satu account nasabah bank dapat melakukan satu atau lebih transaksi dalam satu waktu, nasabah bank dapat melakukan transaksi dan mendapatkan satu atau beberapa jenis layanan yang dapat dilayani oleh karyawan bank, di satu cabang bank akan memberikan satu kali atau beberapa layanan untuk nasabah bank dalam satu waktu, di satu cabang bank mempunyai beberapa karyawan bank.

# Class Diagram

1. Aggregation dari Branch ke AccountHolder merepresentasikan relasi “has-a”, artinya class Branch memiliki/terdiri dari para AccountHolder.
2. Aggregation dari Branch ke Employee merepresentasikan relasi “has-a”, artinya class Branch memiliki/terdiri dari para Employee. 
3. Aggregation dari AccountHolder ke Account merepresentasikan relasi “has-a”, artinya class AccountHolder memiliki/terdiri dari bagian-bagian Account yang lebih kecil.
4. Association dari Account ke Transaction, dalam kasus ini Account memiliki Transaction.
5. Association dari Account ke Service, dalam kasus ini Account mendapatkan Service.

# ER Diagram

1. Branch memiliki beberapa Employee.
2. AccountHolder melakukan registrasi di Branch untuk mendapatkan Account.
3. Setiap AccountHolder memiliki dapat memiliki satu atau lebih Account.
4. Setiap Account dapat melakukan satu atau lebih Transaction.
5. Setiap Account dapat menerima satu atau lebih Service.


