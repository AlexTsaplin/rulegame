package kn21.tsaplin.rulegamecompose

import RuleScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import kn21.tsaplin.rulegamecompose.ui.theme.GreenBg
import kn21.tsaplin.rulegamecompose.ui.theme.RuleGameComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RuleGameComposeTheme {

                    Surface (
                        modifier = Modifier.fillMaxSize(),
                        color = GreenBg
                    ) {
                       RuleScreen()
                }
            }
        }
    }
}

