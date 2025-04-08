package com.faith.harakamall.ui.screens.home

import android.text.style.UnderlineSpan
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.faith.harakamall.R

@Composable
fun Homescreen(navController: NavController){

Column (
    modifier = Modifier.fillMaxSize()
) {
    Text(text = "HarakaMall",
        fontSize = 30.sp,
        color = Color.Red,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center,

        modifier = Modifier.fillMaxWidth()

    )
    Spacer(modifier = Modifier.height(20.dp))

    Image(
        painter = painterResource(R.drawable.image1),
        contentDescription = "home"
    )
    Text(text = "Welcome to my App")
    Spacer(modifier = Modifier.height(20.dp))
    Text(text = "Quick Mall, also HarakaMall, is a Kenyan supermarket chain. As of June 2022, it was the second largest supermarket chain in the country, behind market leader, Naivas Limited, with 84 stores and over 8,000 employees.")
    Button(onClick = {},
        colors= ButtonDefaults.buttonColors(Color.Red),
        shape = RoundedCornerShape(10.dp))
    { Text(text = "add to cut") }

}



}




@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    Homescreen(rememberNavController())
}