package com.example.basickotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var bundle: Bundle? = intent.extras
        var name = bundle?.getString(Constants.key_name)
        // Toast.makeText(this,name,Toast.LENGTH_SHORT).show()
        name?.let { showToast(it, Toast.LENGTH_LONG) }
    }
}
