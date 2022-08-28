package com.tunaegilmez.kotlinalertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Context

        //Activity Context -> this
        //App Context -> applicationContext

        Toast.makeText(applicationContext,"Welcome to my app",Toast.LENGTH_LONG).show()

    }

    fun save(view: View){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setMessage("Are you sure ?")
        alert.setPositiveButton("YES") {dialog, which ->
            //onClick Listener
            Toast.makeText(applicationContext,"Saved",Toast.LENGTH_SHORT).show()
        }
        alert.setNegativeButton("NO") {dialog, which ->
            //onClick Listener
            Toast.makeText(this@MainActivity,"Not Saved",Toast.LENGTH_SHORT).show()
                            // this@MainActivity demek ile this demek aynı bu örnekte.
        }

        alert.show()
    }
}