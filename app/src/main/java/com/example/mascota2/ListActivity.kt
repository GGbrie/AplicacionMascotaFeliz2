package com.example.mascota2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mascota2.ui.theme.Mascota2Theme

class ListActivity : ComponentActivity() {
    private val datos : List<String> = listOf(
        "Razas",
        "Entrenamiento",
        "Alimentacion",
        "Belleza",
        "Reproduccion",
        "Salud",
        "Noticias"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mascota2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2B48C)
                ) {
                    Pantalla(datos)
                }
            }
        }
    }
}

@Composable
fun Pantalla(datos: List<String>){
    LazyColumn(
        contentPadding = PaddingValues(all = 10.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ){
        items(datos){
                item -> ListItemRow(item)
        }
    }
}

@Composable
fun ListItemRow(item: String){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(8.dp))
            .background(color = Color(0xFFE2D0B7))
            .padding(horizontal = 16.dp, vertical = 10.dp)
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = item,
                color = Color.Black,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                "Mas...",
                color = Color.Black,
                fontSize = 20.sp
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PantallaPreview(){
    val datos : List<String> = listOf(
        "Razas",
        "Entrenamiento",
        "Alimentacion",
        "Belleza",
        "Reproduccion",
        "Salud",
        "Noticias"
    )
    Mascota2Theme (true){
        Pantalla(datos)
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Mascota2Theme {
        Greeting("Android")
    }
}