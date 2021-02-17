package com.example.uas201804007

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.produk_main.*

class ProdukMain : AppCompatActivity() {
    lateinit var produkDBHelper: DBHelper
    lateinit var inputid: EditText
    lateinit var inputproduk: EditText
    lateinit var inputmotif: EditText
    lateinit var inputwarna: EditText
    lateinit var inputsize: EditText
    lateinit var inputprice: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.produk_main)
        inputid = findViewById(R.id.input_id)
        inputproduk = findViewById(R.id.input_produk)
        inputmotif = findViewById(R.id.input_motif)
        inputwarna = findViewById(R.id.input_warna)
        inputsize = findViewById(R.id.input_size)
        inputprice = findViewById(R.id.input_price)
        produkDBHelper = DBHelper(this)
    }
    fun addData(v: View){
        var idin = inputid.text.toString()
        var produkin = inputproduk.text.toString()
        var motifin = inputmotif.text.toString()
        var warnain = inputwarna.text.toString()
        var sizein = inputsize.text.toString()
        var pricein = inputprice.text.toString()
        produkDBHelper.InsertProduk(idin, produkin, motifin, warnain, sizein,  pricein)
        inputid.setText("")
        inputproduk.setText("")
        inputmotif.setText("")
        inputwarna.setText("")
        inputsize.setText("")
        inputprice.setText("")

    }
    fun showAll(v: View){
        var pindah = Intent(this, RvDataProduk ::class.java)
        startActivity(pindah)
    }
}