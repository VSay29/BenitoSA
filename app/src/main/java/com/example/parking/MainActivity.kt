package com.example.parking

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.parking.ui.theme.ParkingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainParking()
        }
    }
}

@Composable
fun MainParking() {

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ParkingTheme {
        MainParking()
    }
}