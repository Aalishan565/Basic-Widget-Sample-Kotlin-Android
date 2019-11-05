package com.example.basickotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        val TAG: String = "MainActivity"
    }

    /*private lateinit var etMessage: EditText
    private lateinit var tvMessage: TextView
    private lateinit var btnSubmit: Button
    private lateinit var btnNavigate: Button*/
    private lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //optional
        /* etMessage = findViewById(R.id.etMessage);
         tvMessage = findViewById(R.id.tvMessage);
         btnSubmit = findViewById(R.id.btnSubmit);
         btnNavigate = findViewById(R.id.btnNavigate);*/

        btnSubmit.setOnClickListener(this)
        btnNavigate.setOnClickListener(this)


        /*btnSubmit.setOnClickListener(View.OnClickListener(fun(it: View) {
            name = etMessage.text.toString();
            tvMessage.setText(name)
            Toast.makeText(this, name, Toast.LENGTH_LONG).show()
        }))
        btnNavigate.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)

        })*/
    }

    override fun onClick(view: View?) {
        when (view) {
            btnSubmit -> {
                Log.d(TAG, "Submit button clicked")
                name = etMessage.text.toString();
                //tvMessage.setText(name)
                tvMessage.text = name
                //Toast.makeText(this, name, Toast.LENGTH_LONG).show()
                showToast(name)
            }
            btnNavigate -> {
                Log.d(TAG, "Navigate button clicked")
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                name = tvMessage.text.toString()
                intent.putExtra(Constants.key_name, name)
                startActivity(intent)
            }
        }
    }
}

