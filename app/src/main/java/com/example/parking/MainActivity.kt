package com.example.parking

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.parking.ui.theme.ParkingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ParkingTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "main_parking"
                ) {
                    composable("main_parking") { MainParking(navController) }
                    composable("home_parking") { HomeParking(navController) }
                }
            }
        }
    }
}

@Composable
fun MainParking(navController: NavController) {

    Column(Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        Row(Modifier.padding(20.dp)) {
            Text(
                "Parking Benito S.L.", textAlign = TextAlign.Center,
                color = Color.hsv(220f, 0.45f, 0.14f),
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                lineHeight = 50.sp
            )
        }
        Image(
                painter = painterResource(id = R.drawable.gatocoche),
                contentDescription = "Gato en el coche",
                modifier = Modifier.size(250.dp)
            )
        Row {
            Button(onClick = { navController.navigate("home_parking") }) {
                Text("Empezar")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ParkingPreview() {
    ParkingTheme {
        val navController = rememberNavController()
        MainParking(navController)
    }
}