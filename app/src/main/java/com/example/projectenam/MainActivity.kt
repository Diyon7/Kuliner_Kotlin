package com.example.projectenam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  testData = createPhoneData()
        rv_parts.layoutManager = LinearLayoutManager(this)
        rv_parts.setHasFixedSize(true)
        rv_parts.adapter = ContactAdapter(testData, {phoneItem : KulinerData -> phoneItemClicked(phoneItem)})
    }
    private fun phoneItemClicked(kulinerItem : KulinerData) {
        val showDetailActivityIntent = Intent (this, KulinerDetailActivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, kulinerItem.photo)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, kulinerItem.name)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, kulinerItem.deskripsi)
        startActivity(showDetailActivityIntent)
    }
    private fun createPhoneData() : List<KulinerData> {
        val partList = ArrayList<KulinerData>()
        partList.add(
            KulinerData(
                R.drawable.lontong_balap,
                "Lontong Balap",
            "Kuliner Surabaya yang terdiri dari lontong, tahu goreng, lentho dan disiram kuah cambah atau kuah tauge."))
        partList.add(
            KulinerData(
                R.drawable.rujak_cingur,
                "Rujak Cingur",
            "Dalam seporsi rujak cingur terdapat sayuran, cingur atau moncong sapi dan saus kacang tanah berbumbu petis. Ciri khas dari masakan Surabaya ini adalah cingur atau moncong sapi yang direbus dan diiris-iris sebagai isian rujak."))
        partList.add(
            KulinerData(
                R.drawable.lontong_kupang,
                "Lontong Kupang",
            "Lontong kupang merupakan camilan gurih berupa lontong dengan kuah dan taburan kupang. Kupang merupakan sejenis kerang berukuran kecil."))
        partList.add(
            KulinerData(
                R.drawable.tahu_tek,
                "Tahu Tek",
            "Tahu tek ini merupakan makanan dengan perpaduan tahu, telur dadar, lontong dan lainnya yang ditaburi sambel kacang."))
        partList.add(
            KulinerData(
                R.drawable.tahu_campur,
                "Tahu Campur",
            "Kuliner Surabaya satu ini berisi jeroan sapi, daging, perkedel, tahu goreng, selada, dan kuah berwarna cokelat bening."))
        partList.add(
            KulinerData(
                R.drawable.sate_klopo,
                "Sate Klopo",
            "Bentuk hidangan ini mirip seperti sate pada umumnya, namun penggunaan bumbunya ada sedikit perbedaan. sate kelopo disajikan bersama parutan daging kelapa yang ditaruh pada seluruh bagian sate."))
        partList.add(
            KulinerData(
                R.drawable.klanting,
                "Klanting",
                "Makanan satu ini merupakan jajanan pasar manis atau bisa disebut  kue basah. Klanting adalah kue yang terbuat dari tepung tapioka, dibentuk layaknya jari. Di atasnya ditaburi kelapa parut dan disiram gula aren."))
        return partList
    }
}