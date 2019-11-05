package com.example.basickotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.basickotlin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var activitySecondBinding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitySecondBinding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        var bundle: Bundle? = intent.extras
        var name = bundle?.getString(Constants.key_name)
        name?.let { showToast(it, Toast.LENGTH_LONG) }
        var message = name?.let { Message(it) }
        activitySecondBinding.message = message


    }
}
