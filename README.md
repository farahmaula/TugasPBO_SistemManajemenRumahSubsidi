Nama  : Farah Hikmatul Maula

NIM   : 2509116099

# Penjelasan Sistem Manajemen Runmah Subsidi

Sistem manajemen rumah suubsidi dibuat untuk administrasi dalam mengelola pendataan rumah subsidi, data pembeli, pengajuan rumah subsidi sampai dengan proses pembayaran. Sistem ini ditujukan untuk bagian administrasi atau admin.

Admin dapat melakukan proses menambah data, melihat, mengubah, dan menghapus data rumah subsidi dan pembeli yang digunakan sebagai syarat mengajukan pembelian rumah subsidi. Setelah data dimasukkan pembeli dapat melakukan pengajuan pembelian dengan memasukkan NIK pembeli dan ID rumah yang ingin diajukan. Setelah itu akan dilakukan proses pengajuan, jika penghasilan atau gaji pembeli dibawah 2 juta serta sudah mempunyai rumah sebelumnya maka pengajuan akan ditolak. Setelah pengajuan diproses dan memenuhi persyaratan, pengajuan dapat disetujui dan dilanjutkan ke proses pembayaran. Saat melakukan pembayaran terdapat dua pilihan yaitu sistem cash atau cicilan. Untuk pembayaran cicilan, sistem menghitung jumlah cicilan berdasarkan 30% dari penghasilan pembeli. 

# Penjelasan Inheritance

Pada sistem ini rumah subsidi menjadi class utama atau disebut _superclass_ yang nantinya isi dari rumah subsidi akan diwariskan pada class lainnya dan isi atau atribut dari class ini bersifat general. _Subclass_ diberi nama rumahtersedia untuk memberi tau secara lebih spesifik data rumah subsidi. _Subclass_ rumahtersedia memiliki atribut lokasi dan jumlah rumah. RumahTersedia dapat menggunakan atribut dan method yang dimiliki oleh RumahSubsidi, kemudian menambahkan informasi yang lebih spesifik mengenai rumah yang tersedia. Dapat disimpulkan bahwa rumahsubsidi adalah superclass dan rumahtersedia adalah subclass dari superclass.

Gambar dibawah ini adalah kode yang digunakan dalam inharitance.

<img width="940" height="156" alt="image" src="https://github.com/user-attachments/assets/6495d085-1e00-44f4-8215-537522ce7a91" />
