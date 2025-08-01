package com.example.laboratorio2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.graphics.Color
import com.example.laboratorio2.ui.theme.Laboratorio2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Mensajes()
        }

    }

}

@Composable
fun Mensajes(){
    val context = LocalContext.current

    Scaffold { innerPadding ->
        Column  (
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFB2DFDB))
                .padding(innerPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Juan Gabriel Gualim Molina",
                style = MaterialTheme.typography.headlineMedium,
                fontFamily = FontFamily.Cursive
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "¡Bienvenido al Programa!",
                fontSize = 18.sp,
                fontFamily = FontFamily.Serif
            )

            Spacer(modifier = Modifier.height(16.dp))

            MyImage()
            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {
                Toast.makeText(context, "Haz hecho click en el boton.", Toast.LENGTH_SHORT).show()
            }) {
                Text("Haz clic aquí")
            }
        }
    }
}

@Composable
fun MyImage(){
    Image(
        painterResource(R.drawable.ic_launcher_foreground),
        "Mi imagen de prueba"
    )
}


@Preview
@Composable
fun PreviewComponent(){
    Mensajes()
}