Nama  : Farah Hikmatul Maula

NIM   : 2509116099

# Penjelasan Sistem Manajemen Runmah Subsidi

Sistem manajemen rumah suubsidi dibuat untuk administrasi dalam mengelola pendataan rumah subsidi, data pembeli, pengajuan rumah subsidi sampai dengan proses pembayaran. Sistem ini ditujukan untuk bagian administrasi atau admin.

Admin dapat melakukan proses menambah data, melihat, mengubah, dan menghapus data rumah subsidi dan pembeli yang digunakan sebagai syarat mengajukan pembelian rumah subsidi. Setelah data dimasukkan pembeli dapat melakukan pengajuan pembelian dengan memasukkan NIK pembeli dan ID rumah yang ingin diajukan. Setelah itu akan dilakukan proses pengajuan, jika penghasilan atau gaji pembeli dibawah 2 juta serta sudah mempunyai rumah sebelumnya maka pengajuan akan ditolak. Setelah pengajuan diproses dan memenuhi persyaratan, pengajuan dapat disetujui dan dilanjutkan ke proses pembayaran. Saat melakukan pembayaran terdapat dua pilihan yaitu sistem cash atau cicilan. Untuk pembayaran cicilan, sistem menghitung jumlah cicilan berdasarkan 30% dari penghasilan pembeli. 

# Penjelasan Inheritance

Pada sistem ini rumah subsidi menjadi class utama atau disebut _superclass_ yang nantinya isi dari rumah subsidi akan diwariskan pada class lainnya dan isi atau atribut dari class ini bersifat general. _Subclass_ diberi nama rumahtersedia untuk memberi tau secara lebih spesifik data rumah subsidi. _Subclass_ rumahtersedia memiliki atribut lokasi dan jumlah rumah. RumahTersedia dapat menggunakan atribut dan method yang dimiliki oleh RumahSubsidi, kemudian menambahkan informasi yang lebih spesifik mengenai rumah yang tersedia. Dapat disimpulkan bahwa rumahsubsidi adalah superclass dan rumahtersedia adalah subclass dari superclass.

Gambar dibawah ini adalah kode yang digunakan dalam inharitance.

<img width="940" height="156" alt="image" src="https://github.com/user-attachments/assets/6495d085-1e00-44f4-8215-537522ce7a91" />
Perintah “public class RumahTersedia extends RumahSubsidi { “ artinya Rumahtersedia adalah subclass dari rumah subsidi. perintah "exstand" memberitahu bahwa rumah tersedia telah mewarisi sifat atau atribut dari class rumahsubsidi. 

“private String lokasi;
 private int jumlahRumah;” ini adalah atribut tambahan yang lebih spesifik dimana digunakan untuk membedakan superclass dan subclass.

Perintah “public RumahTersedia(String idRumah, String unit, String tipeRumah, double harga, String lokasi, int jumlahRumah) {“ ini berisi atribut dari rumahsubsidi dan atribut tambahan rumahtersedia, sedangkan perintah “super(idRumah, unit, tipeRumah, harga);” untuk memanggil constructor dari superclass RumahSubsidi dan menandakan atribut dari superclass. Dengan demikian, atribut dasar rumah tetap dikelola oleh superclass, sedangkan RumahTersedia mengelola atribut tambahannya sendiri.

<img width="850" height="753" alt="image" src="https://github.com/user-attachments/assets/f8d90ccc-a1d7-4946-88aa-77773e47edd3" />

Setelah itu dilanjutkan dengan menggunakan getter dan setter yang digunakan untuk membaca atau mengubah nilai atribut yang disembunyikan atau private, serta dengan maenambahkan method untuk menjalankan atribut didalamnya.

Pada class rumah subsidi atribut id rumah ditambah variabel final sehingga sistem mengerti bahwa sifat atribut tersebut adalah wajib. Perintah bisa dilihat pada gambar dibawah ini.
<img width="675" height="141" alt="image" src="https://github.com/user-attachments/assets/afd5bf13-a028-499d-b2f9-476a4236d56c" />

# Output Sistem
Ada menu utama yang nantinya akan menghubungkan dengan menu class lainnya pada gabar dibawah ini adalah hasil outputnya.

<img width="762" height="229" alt="image" src="https://github.com/user-attachments/assets/e037d7af-960f-4e4d-bd39-2de87d635fff" />
  # Menu Rumah Subsidi
<img width="940" height="457" alt="image" src="https://github.com/user-attachments/assets/c1d27834-6b73-4082-926e-78477f4611ad" />

<img width="788" height="920" alt="image" src="https://github.com/user-attachments/assets/35e00c78-66f2-47b9-a3cb-2608a05ec4c3" />
<img width="1070" height="491" alt="image" src="https://github.com/user-attachments/assets/b74af82d-77da-4dcb-9441-7d2e237afa39" />
<img width="597" height="514" alt="image" src="https://github.com/user-attachments/assets/411b6019-8b3e-4b30-9013-4df46d00714f" />

  # Menu Pembeli
<img width="925" height="617" alt="image" src="https://github.com/user-attachments/assets/4eacc268-1d0d-4e77-a744-fe248dee7e7d" />

<img width="767" height="681" alt="image" src="https://github.com/user-attachments/assets/5b59b91b-0b88-483b-8872-0f5111247461" />
<img width="926" height="445" alt="image" src="https://github.com/user-attachments/assets/90cb901a-f7e2-4dec-a15c-11302693e754" />
<img width="945" height="715" alt="image" src="https://github.com/user-attachments/assets/4114bdcc-74c1-42a5-934d-6a96fc3cf5c4" />

  # Menu Pengajuan
<img width="940" height="570" alt="image" src="https://github.com/user-attachments/assets/416c3afa-8e88-427d-8a3d-eda2c522fee7" />

<img width="940" height="404" alt="image" src="https://github.com/user-attachments/assets/778da1a8-9819-4ade-95ca-0a93a00c5e91" />
Pada gambar diatas bisa dilihat bahwa setelah gaji Nisa dubah dari 3.000.000 menjadi 1.500.000 pengajuan tidak bisa dibuat karena tidak memenuhi pernyaratan yaitu memiliki gaji minimal 2.000.000. 

<img width="871" height="285" alt="image" src="https://github.com/user-attachments/assets/b88ef51b-fb1a-4b95-a06e-411aba931650" />
<img width="940" height="585" alt="image" src="https://github.com/user-attachments/assets/f4827891-850e-4a9a-942d-fc0772acd95c" />
Sebelum melakukan pengajuan saya mengubah kembali gaji yang dimiliki pembeli selanjutnya bisa melakukan pengajuan pebelian seperti pada gambar diatas.

<img width="940" height="665" alt="image" src="https://github.com/user-attachments/assets/528e2ac1-3283-46b4-bd44-8c95d4af0fa7" />

Dibawah ini adalah output dari dua jenis pembayaran yang berbeda.
<img width="940" height="674" alt="image" src="https://github.com/user-attachments/assets/b1f07ff7-9c71-425d-a130-ed25e218bc4b" />
<img width="940" height="674" alt="image" src="https://github.com/user-attachments/assets/9a12ec36-29f0-43cc-9bf9-0cc5d5c47256" />

<img width="656" height="388" alt="image" src="https://github.com/user-attachments/assets/5e6b9ac5-417d-4380-a255-1fec8205e9ef" />

Jika memiliki menu kembali maka akan kembali ke menu utama dari manajemen rumah subsidi.

