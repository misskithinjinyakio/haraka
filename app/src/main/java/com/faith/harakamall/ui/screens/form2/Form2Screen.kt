package com.faith.harakamall.ui.screens.form2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.faith.harakamall.R
import com.faith.harakamall.ui.theme.neworange
import com.faith.harakamall.ui.theme.neworange1
import com.faith.harakamall.ui.theme.newwhite
import com.faith.harakamall.ui.theme.newwhite1


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Form2Screen(navController: NavController){

    //box
    Box(){
        //card
        Card(
            modifier= Modifier.fillMaxSize(),
            shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp, topStart = 60.dp, topEnd = 60.dp),
            colors = CardDefaults.cardColors(Blue)
        ) {
            Column (modifier = Modifier
                .fillMaxSize()
                .padding(start = 0.dp),
                horizontalAlignment = Alignment.CenterHorizontally,

                ){
                Spacer(modifier = Modifier.height(40.dp))
                Text(text = "WELCOME TO ", fontSize = 30.sp,

                    color = White)
                Text(text = "HARAKAMALL", color = White, fontSize = 30.sp)
                Spacer(modifier = Modifier.height(20.dp))
                Image(
                    painter = painterResource(R.drawable.shop),
                    contentDescription = "home",

                )


            }


        }
        //end of card
        Card (
            modifier= Modifier.fillMaxWidth().height(600.dp)
                .align(alignment = Alignment.BottomCenter)
                .padding(start = 20.dp, end = 20.dp)
                .offset(y=90.dp),
            shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp, topStart = 60.dp, topEnd = 60.dp)
        ){

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "The Most Worth ", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold,

                    color = Red)
                Text(text = "Grocery App", fontWeight = FontWeight.ExtraBold, fontSize = 40.sp,
                    color = Red
                )
                Spacer(modifier = Modifier.height(20.dp))


                var username by remember { mutableStateOf("") }
                var password by remember { mutableStateOf("") }



                Spacer(modifier = Modifier.height(20.dp))
                //USERNAME
                OutlinedTextField(
                    value = username,
                    onValueChange = {username=it},
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "") },
                    label ={Text(text = "USERNAME")},
                    colors = OutlinedTextFieldDefaults.colors(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    shape = RoundedCornerShape(20.dp)

                )
                //end of USERNMAE
                Spacer(modifier = Modifier.height(20.dp))

                Spacer(modifier = Modifier.height(20.dp))
                //PASSWORD
                OutlinedTextField(
                    value = password,
                    onValueChange = {password=it},
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
                    label ={Text(text = "PASSWORD")},
                    colors = OutlinedTextFieldDefaults.colors(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation(),
                    shape = RoundedCornerShape(20.dp)

                )
                //end of PASSWORD
                Spacer(modifier = Modifier.height(20.dp))

                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = {

                },
                    colors= ButtonDefaults.buttonColors(Color.Red),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp)
                )
                { Text(text = "sign up") }
                Text(text = "Already Are member? log in")




            }
        }

    }
    //end of box



}


@Preview(showBackground = true)
@Composable
fun Form2ScreenPreview(){
    Form2Screen(rememberNavController())
}