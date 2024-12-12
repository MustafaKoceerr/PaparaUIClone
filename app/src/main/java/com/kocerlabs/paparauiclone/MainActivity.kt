package com.kocerlabs.paparauiclone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.kocerlabs.paparauiclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

        binding.bottomNavigationView.setupWithNavController(navController)


//        setupActionBarWithNavController(navController, appBarConfiguration)

        /**
         * Burada toolbar yardımıyla fragment'ların isimlerinin yukarıda görünmesini sağladık.
         * Bu isimleri değiştirmek istersen, navGraph'a gidip oradan label'ları değiştirerek bunu yapabilirsin.
         */
    }


}