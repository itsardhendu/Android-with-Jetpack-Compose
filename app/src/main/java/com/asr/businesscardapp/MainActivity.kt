package com.asr.businesscardapp

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asr.businesscardapp.ui.theme.BusinessCardAppTheme
import com.asr.businesscardapp.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    businessCard()
                }
            }
        }
    }
}
@Composable
fun businessCard() {
    composableCard(
        full_name =  stringResource(R.string.full_name),
        title = stringResource(R.string.title),
        phone = stringResource(R.string.phone),
        social_media = stringResource(R.string.social_media),
        email = stringResource(R.string.email),
        imagePainter = painterResource(R.drawable.ardhendudpcroped),
    )
}

@Composable
private fun composableCard(
//Parameter of private fun
    full_name: String,
    title: String,
    phone: String,
    social_media: String,
    email: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
){
//Body of Private Fun
    Column(// Full name, Title
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(painter = imagePainter, contentDescription = "Ardhendu Sarkar DP")
        Text(
            text = full_name,
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = Color.White,
            modifier = Modifier.padding(bottom = 15.dp)
        )
        Text(
            text = title,
            fontSize = 25.sp,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Italic,
            color = Color(0xFF3ddc84),
            modifier = Modifier.padding(bottom = 15.dp)
        )
    }
    Column(//Phone, Social Media, Email
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
    ) {
        Row(
            modifier= Modifier
                .padding(bottom = 5.dp)
                .border(2.dp, Color.Black)
                .padding(5.dp)
                .fillMaxWidth()
                .padding(5.dp)
                .clickable {  },
            horizontalArrangement = Arrangement.Center
        ) {
            val icon = painterResource(id = R.drawable.baseline_call_24)
            Icon(painter = icon, contentDescription = null, modifier = Modifier.padding(end = 10.dp), Color(0xFF3ddc84))
            Text(
                text = phone,
                fontSize = 20.sp,
            )
        }
        Row(
            modifier= Modifier
                .padding(bottom = 5.dp)
                .border(2.dp, Color.Black)
                .padding(5.dp)
                .fillMaxWidth()
                .padding(5.dp)
                .clickable {  },
            horizontalArrangement = Arrangement.Center
        ) {
            val icon2 = painterResource(id = R.drawable.baseline_share_24)
            Icon(painter = icon2, contentDescription = null, modifier = Modifier.padding(end = 10.dp), Color(0xFF3ddc84))
            Text(
                text = social_media,
                fontSize = 20.sp,
            )
        }
        Row(
            modifier= Modifier
                .padding(bottom = 5.dp)
                .border(2.dp, Color.Black)
                .padding(5.dp)
                .fillMaxWidth()
                .padding(5.dp)
                .clickable {  },
            horizontalArrangement = Arrangement.Center
        ) {
            val icon3 = painterResource(id = R.drawable.baseline_email_24)
            Icon(painter = icon3, contentDescription = null,modifier = Modifier.padding(end = 10.dp), Color(0xFF3ddc84))
            Text(
                text = email,
                fontSize = 20.sp,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        businessCard()
    }
}