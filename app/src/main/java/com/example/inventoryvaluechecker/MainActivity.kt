package com.example.inventoryvaluechecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val etSteamID = findViewById<TextView>(R.id.SteamIDinput)

        val submit = findViewById<Button>(R.id.confirm)

        val csgobackpack = ("http://csgobackpack.net/api/GetInventoryValue/?id="+etSteamID)




        if (submit != null && etSteamID != null) {
            submit.setOnClickListener {


            }
        }


    }
}