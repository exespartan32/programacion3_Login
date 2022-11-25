package com.example.exequielprueba_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class ExeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exe)

        //intent.extras.getBundle("username)
        var username = intent.extras?.getString("username")
        var password = intent.extras?.getString("password")

        var user = findViewById<TextView>(R.id.textUser)
        user?.text="usuario: $username"

        var pass = findViewById<TextView>(R.id.textPass)
        pass?.text="password: $password"


        Toast.makeText(this, "bienvenido usuario "+username, Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "bienvenido contraseña "+password, Toast.LENGTH_SHORT).show()

    }
        fun regresar(view: View){
            var dataIntent = Intent(this, ExeActivity::class.java)
            startActivity(dataIntent)
        }
}