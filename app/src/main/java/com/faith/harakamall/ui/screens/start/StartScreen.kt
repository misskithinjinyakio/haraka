package com.faith.harakamall.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.faith.harakamall.R
import com.faith.harakamall.navigation.ROUT_ITEM
import com.faith.harakamall.ui.theme.neworange

@Composable
fun StartScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "HarakaMall",
            fontSize = 30.sp,


        )
        Spacer(modifier = Modifier.height(20.dp))
        //circularimage
        Image(
            painter = painterResource(R.drawable.image2),
            contentDescription = "home",
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        //image end
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "find your oder!!!",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Text is any written material. The machine can recognise hand-written characters and turn them into printed text. The manuscript consisted of 500 pages of typed text. 3. countable noun [usually singular] B1.",
            fontSize = 18.sp,
            textAlign = TextAlign.Center
            )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            navController.navigate(ROUT_ITEM)
        },
            colors= ButtonDefaults.buttonColors(Color.Red),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp)
        )
        { Text(text = "more") }



    }



}


@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen(rememberNavController())
}
