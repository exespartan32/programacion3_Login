package com.example.exequielprueba_v1

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
//import com.example.exequielprueba_v1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    //private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)
        var bienvenidos = findViewById<TextView>(R.id.textBienvenida)
        var username = findViewById<EditText>(R.id.userName)
        var password = findViewById<EditText>(R.id.password)
        var button = findViewById<Button>(R.id.buttonSendData)

        button.setOnClickListener{
            Toast.makeText(this, "response MaintActivity", Toast.LENGTH_SHORT).show()
            var dataIntent = Intent(this, ExeActivity::class.java)
            var dataBundle = Bundle()
            dataIntent.putExtra("username", username.text.toString())
            dataIntent.putExtra("password", password.text.toString())
            startActivity(dataIntent, dataBundle)
        }

        username.addTextChangedListener{
            if(it?.length?:0 > 10){
                username.setError("no debe ingresar mas de 10 caracteres")
            }

        }

    }

}