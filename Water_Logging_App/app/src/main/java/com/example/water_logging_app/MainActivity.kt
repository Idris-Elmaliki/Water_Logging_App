package com.example.water_logging_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
<<<<<<< Updated upstream
import com.example.water_logging_app.ui.WaterLogUiLayout
=======
import com.example.water_logging_app.ui.MainAppFunc
>>>>>>> Stashed changes
import com.example.water_logging_app.ui.theme.Water_Logging_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Water_Logging_AppTheme {
<<<<<<< Updated upstream
                WaterLogUiLayout(
=======
                MainAppFunc(
>>>>>>> Stashed changes
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
        }
    }
<<<<<<< Updated upstream
}
=======
}
>>>>>>> Stashed changes
