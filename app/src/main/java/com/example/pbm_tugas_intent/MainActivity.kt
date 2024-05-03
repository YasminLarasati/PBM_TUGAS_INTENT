package com.example.pbm_tugas_intent

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtNIK = findViewById<EditText>(R.id.NIK)
        val edtNama = findViewById<EditText>(R.id.Nama)
        val edtTanggalLahir = findViewById<EditText>(R.id.edtTanggalLahir)
        val edtGolDar = findViewById<EditText>(R.id.edtGolDar)
        val edtAlamat = findViewById<EditText>(R.id.edtAlamat)
        val edtRT = findViewById<EditText>(R.id.edtRTRW)
        val edtDesa = findViewById<EditText>(R.id.edtDesa)
        val edtKecamatan = findViewById<EditText>(R.id.edtKecamatan)
        val edtAgama = findViewById<EditText>(R.id.edtAgama)
        val edtKawin = findViewById<EditText>(R.id.edtKawin)
        val edtPekerjaan = findViewById<EditText>(R.id.edtPekerjaan)
        val rbLaki = findViewById<RadioButton>(R.id.laki)
        val rbPerempuan = findViewById<RadioButton>(R.id.perempuan)
        val btnSimpan = findViewById<Button>(R.id.btnSimpan)
        val jkel = findViewById<RadioGroup>(R.id.jkel)

        btnSimpan.setOnClickListener(View.OnClickListener {
            val nik = edtNIK.text.toString()
            val nama = edtNama.text.toString()
            val tanggalLahir = edtTanggalLahir.text.toString()
            val golDar = edtGolDar.text.toString()
            val alamat = edtAlamat.text.toString()
            val RTRW = edtRT.text.toString()
            val desa = edtDesa.text.toString()
            val kecamatan = edtKecamatan.text.toString()
            val agama = edtAgama.text.toString()
            val kawin = edtKawin.text.toString()
            val pekerjaan = edtPekerjaan.text.toString()

            val jeniskel = jkel.checkedRadioButtonId
            val jeniskelamin = findViewById<RadioButton>(jeniskel)
            val isiJKel = jeniskelamin?.text.toString()

//            if(rbLaki.isChecked){
//                val jk = "Laki-Laki"
//            }
//            else if (rbPerempuan.isChecked){
//                val jk = "Perempuan"
//            }
//            val jkel = jk.text

            val intent = Intent(this, SaveDataActivity::class.java).also{
                it.putExtra("NIK", nik)
                it.putExtra("Nama", nama)
                it.putExtra("Tanggal Lahir", tanggalLahir)
                it.putExtra("Jenis Kelamin", isiJKel)
                it.putExtra("Golongan Darah", golDar)
                it.putExtra("Alamat", alamat)
                it.putExtra("RT/RW", RTRW)
                it.putExtra("Kelurahan/Desa", desa)
                it.putExtra("Kecamatan", kecamatan)
                it.putExtra("Agama", agama)
                it.putExtra("Status Perkawinan", kawin)
                it.putExtra("Pekerjaan", pekerjaan)

                startActivity(it)
            }
        })
    }
}