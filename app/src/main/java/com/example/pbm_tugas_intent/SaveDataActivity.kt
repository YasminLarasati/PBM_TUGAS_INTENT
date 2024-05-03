package com.example.pbm_tugas_intent

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SaveDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_save_data)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val isiNik = intent.getStringExtra("NIK")
        val isiNama = intent.getStringExtra("Nama")
        val isiTtl = intent.getStringExtra("Tanggal Lahir")
        val isiJKel = intent.getStringExtra("Jenis Kelamin")
        val isiGolDar = intent.getStringExtra("Golongan Darah")
        val isiAlamat = intent.getStringExtra("Alamat")
        val isiRTRW = intent.getStringExtra("RT/RW")
        val isiDesa = intent.getStringExtra("Kelurahan/Desa")
        val isiKecamatan = intent.getStringExtra("Kecamatan")
        val isiAgama = intent.getStringExtra("Agama")
        val isiKawin = intent.getStringExtra("Status Perkawinan")
        val isiKerja = intent.getStringExtra("Pekerjaan")

        val nik = findViewById<TextView>(R.id.isiNIK).apply {
            text = isiNik
        }
        val nama = findViewById<TextView>(R.id.isiNama).apply {
            text = isiNama
        }
        val TTL = findViewById<TextView>(R.id.isiTanggalLahir).apply {
            text = isiTtl
        }
        val jenisKel = findViewById<TextView>(R.id.isiJenisKlemain).apply {
            text = isiJKel
        }
        val goldar = findViewById<TextView>(R.id.isiGolDar).apply {
            text = isiGolDar
        }
        val alamat = findViewById<TextView>(R.id.isiAlamat).apply {
            text = isiAlamat
        }
        val rtrw = findViewById<TextView>(R.id.isiRTRW).apply {
            text = isiRTRW
        }
        val desa = findViewById<TextView>(R.id.isiDesa).apply {
            text = isiDesa
        }
        val kecamatan = findViewById<TextView>(R.id.isiKecamatan).apply {
            text = isiKecamatan
        }
        val agama = findViewById<TextView>(R.id.isiAgama).apply {
            text = isiAgama
        }
        val kawin = findViewById<TextView>(R.id.isiKawin).apply {
            text = isiKawin
        }
        val kerja = findViewById<TextView>(R.id.isiPekerjaan).apply {
            text = isiKerja
        }

        val kembali = findViewById<Button>(R.id.btnKembali)
        kembali.setOnClickListener(View.OnClickListener {
            finish()
        })

    }
}