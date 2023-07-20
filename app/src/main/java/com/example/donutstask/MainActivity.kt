package com.example.donutstask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.donutstask.screens.details.DetailsScreen
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberNavController
import com.example.donutstask.screens.home.HomeScreen
import com.example.donutstask.screens.onboarding.OnBoardingScreen
import com.example.donutstask.ui.theme.DonutsTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //OnBoardingScreen()
            //HomeScreen()
            DetailsScreen()

            //val navController = rememberNavController()
//            NavHost(navController = navController, startDestination ="OnBoardingScreen" ){
//                composable("OnBoardingScreen"){OnBoardingScreen()}
//            }


        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DonutsTaskTheme {
        Greeting("Android")
    }
}