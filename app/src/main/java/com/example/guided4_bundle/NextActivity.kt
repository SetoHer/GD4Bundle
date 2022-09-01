package com.example.guided4_bundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    private lateinit var nama: TextView
    private lateinit var nim: TextView
    private lateinit var fakultas: TextView
    private lateinit var prodi: TextView
    lateinit var mBunlde: Bundle

    lateinit var vNama: String
    lateinit var vNim: String
    lateinit var vFakultas: String
    lateinit var vProdi: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        getBundle()
        setText()
    }

    fun getBundle(){
        mBunlde = intent.getBundleExtra( "register")!!
        vNama = mBunlde.getString("nama")!!
        vNim = mBunlde.getString("nim")!!
        vFakultas = mBunlde.getString("fakultas")!!
        vProdi = mBunlde.getString("prodi")!!
    }

    fun  setText(){
        nama = findViewById(R.id.textViewnama)
        nama.setText(vNama)
        nim = findViewById(R.id.textViewNim)
        nim.setText(vNim)
        fakultas = findViewById(R.id.textViewFakultas)
        fakultas.setText(vFakultas)
        prodi = findViewById(R.id.textViewProgramStudi)
        prodi.setText(vProdi)

    }
}