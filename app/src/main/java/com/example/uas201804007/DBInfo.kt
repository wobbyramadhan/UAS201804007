package com.example.uas201804007
import android.provider.BaseColumns
object DBInfo {
    class UserTable: BaseColumns {
        companion object {
            val TABLE_NAME = "user"
            val COL_EMAIL = "email"
            val COL_PASS = "pass"
            val COL_FULLNAME = "fullname"
            val COL_ALAMAT = "alamat"
            val COL_JENKAL = "jeniskelamin"
            val COL_JUMLAH = "jumlah"
        }
    }
    class ProdukTable: BaseColumns {
        companion object {
            val TABLE_NAME = "barang"
            val COL_ID = "id"
            val COL_PRODUK = "produk"
            val COL_MOTIF = "motif"
            val COL_WARNA = "warna"
            val COL_SIZE = "size"
            val COL_PRICE = "price"
        }
    }
}