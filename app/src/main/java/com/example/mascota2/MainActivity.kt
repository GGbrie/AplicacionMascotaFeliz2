package com.example.mascota2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mascota2.ui.theme.Mascota2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mascota2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2B48C)
                ) {
                    Elementos()
                }
            }
        }
    }
}

@Composable
fun Elementos() {
    val mContext = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier
                .clip(shape = MaterialTheme.shapes.small)
                .background(Color(0xFFD2B48C))
                .border(0.dp, Color(0xFF8B4513))
        ) {
            Image(
                painter = painterResource(id = R.drawable.mascotaa),
                contentDescription = "Mascota Feliz",
                modifier = Modifier.padding(20.dp)
            )
        }

        Text(
            text = "Mascota Feliz",
            color = Color.Black,
            style = MaterialTheme.typography.headlineLarge

        )

        Text(
            text = "Bienvenido, usuario",
            color = Color(0xFF8B4513),
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(vertical = 50.dp)
        )

        Row {
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(
                    text = "Tu mascota",
                    color = Color.Black,
                    style = MaterialTheme.typography.headlineMedium
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            OutlinedButton(
                onClick = {
                    mContext.startActivity(Intent(mContext, ListActivity::class.java))
                }
            ) {
                Text(
                    text = "Contenidos",
                    color = Color.Black,
                    style = MaterialTheme.typography.headlineMedium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ElemetosPreview(){
    Mascota2Theme(true) {
        Elementos()
    }
}

@Preview(showBackground = true)
@Composable
fun ElementosPreview(){
    Mascota2Theme {
        Elementos()
    }
}