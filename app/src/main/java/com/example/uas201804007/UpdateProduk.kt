package com.example.uas201804007

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class UpdateProduk : AppCompatActivity() {
    lateinit var produkDBHelper: DBHelper
    lateinit var inputid: EditText
    lateinit var inputproduk: EditText
    lateinit var inputmotif: EditText
    lateinit var inputwarna: EditText
    lateinit var inputsize: EditText
    lateinit var inputprice: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.update_produk)
        inputid = findViewById(R.id.input_idu)
        inputproduk = findViewById(R.id.input_produku)
        inputmotif = findViewById(R.id.input_motifu)
        inputwarna = findViewById(R.id.input_warnau)
        inputsize = findViewById(R.id.input_sizeu)
        inputprice = findViewById(R.id.input_priceu)
        produkDBHelper = DBHelper(this)
        val bundle = intent.extras
        if (bundle!=null){
            inputid.setText(bundle.getString("idk"))
            inputproduk.setText(bundle.getString("produkk"))
            inputmotif.setText(bundle.getString("motifk"))
            inputwarna.setText(bundle.getString("warnak"))
            inputsize.setText(bundle.getString("sizek"))
            inputprice.setText(bundle.getString("pricek"))

        }
    }
    fun updateData(v: View){
        var idin = inputid.text.toString()
        var produkin = inputproduk.text.toString()
        var motifin = inputmotif.text.toString()
        var warnain = inputwarna.text.toString()
        var sizein = inputsize.text.toString()
        var pricein = inputprice.text.toString()
        produkDBHelper.updateProduk(idin, produkin, motifin, warnain, sizein, pricein)
        var pindah = Intent(this, RvDataProduk::class.java)
        startActivity(pindah)
    }
    fun cancelData(v: View){
        var pindah = Intent(this, RvDataProduk::class.java)
        startActivity(pindah)
    }
}