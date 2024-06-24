package fr.megarma.memorycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import fr.megarma.memorycard.ui.screens.MemoryCardGameScreen
import fr.megarma.memorycard.ui.theme.MemoryCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MemoryCardTheme {
                MemoryCardGameScreen(modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White)
                    .systemBarsPadding()
                )
            }
        }
    }
}