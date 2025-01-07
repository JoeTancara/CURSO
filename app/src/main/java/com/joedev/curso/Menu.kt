package com.joedev.curso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.joedev.curso.firstApp.FirstAppActivity
import com.joedev.curso.imccalculator.ImcCalculatorActivity
import com.joedev.curso.settings.SettingsActivity
import com.joedev.curso.superheroapp.SuperHeroListActivity
import com.joedev.curso.todoapp.TodoActivity

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        val btnsuperHero = findViewById<Button>(R.id.btnSuperHero)
        val btnSettings = findViewById<Button>(R.id.btnSettings)

        btnSaludApp.setOnClickListener{navigateUpToSaludApp()}
        btnIMCApp.setOnClickListener{navigateUpToIMCApp()}
        btnTODO.setOnClickListener{navigateUpToTODOApp()}
        btnsuperHero.setOnClickListener{navigateUpSuperHero()}
        btnSettings.setOnClickListener{navigateUpSettings()}

    }

    private fun navigateUpToTODOApp() {
        val intent = Intent(this,TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateUpToSaludApp (){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
    private fun navigateUpToIMCApp(){
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }
    private fun navigateUpSuperHero(){
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }
    private fun navigateUpSettings(){
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }
}