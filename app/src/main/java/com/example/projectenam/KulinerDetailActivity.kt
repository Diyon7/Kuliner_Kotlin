package com.example.projectenam

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kuliner_detail.*

class KulinerDetailActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kuliner_detail)

        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partName = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            var partPhoto = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT,0)
            var partDesk = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            tv_item_name.text = partName
            tv_item_id.text = partDesk
            tv_item_photo.contentDescription = partName
            tv_item_photo.setImageResource(partPhoto)
        }
    }
}