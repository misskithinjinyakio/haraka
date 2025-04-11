package com.faith.harakamall.ui.screens.samatha

import android.R.id.bold
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.faith.harakamall.R
import com.faith.harakamall.navigation.ROUT_HOME
import com.faith.harakamall.ui.theme.neworange


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ServiceScreen(navController: NavController){
    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(


        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.Red
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Search, contentDescription = "Home") },
                    label = { Text("search") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Color.LightGray
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()


            ) {


                //Main Contents of the page
                Spacer(modifier = Modifier.height(60.dp))
Text(text = "Hi Samantha" ,fontWeight = FontWeight.ExtraBold, fontSize = (40.sp))
                Text(text = "Here are your projects", fontSize = (20.sp))
                //Row starts

                Row (modifier = Modifier.verticalScroll(rememberScrollState())) {
                    Column (modifier = Modifier.padding(start = 20.dp).background(color =neworange)) {
                        Image(
                            painter = painterResource(R.drawable.img),
                            contentDescription = "home",
                            modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                            contentScale=ContentScale.FillWidth,




                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Column {
                            Text(text = "Cryptocurrency")
                            Text(text = "Landing page")








                        }



                    }
                    //row ends


                    Spacer(modifier = Modifier.height(20.dp))
                    //Row starts

                    Column(modifier = Modifier.padding(start = 20.dp).background(color = neworange)) {
                        Image(
                            painter = painterResource(R.drawable.image1),
                            contentDescription = "home",
                            modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                            contentScale=ContentScale.FillWidth


                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Column {

                           Text(text = "Status ", fontWeight = FontWeight.ExtraBold, fontSize = (40.sp))
                        }



                    }
                    //row ends
                    Spacer(modifier = Modifier.height(20.dp))
                    //Row starts

                    Column(modifier = Modifier.padding(start = 20.dp)) {
                        Image(
                            painter = painterResource(R.drawable.image2),
                            contentDescription = "home",
                            modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                            contentScale=ContentScale.FillWidth





                        )
                        Spacer(modifier = Modifier.width(20.dp))
                        Column {
                            Text(
                                text = "Mens t-shirts",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.ExtraBold
                            )
                            Text(
                                text = "Casual Wear",
                                fontSize = 15.sp,

                                )
                            Text(
                                text = "ksh 2000",
                                fontSize = 20.sp,
                                textDecoration = TextDecoration.LineThrough

                            )
                            Text(
                                text = "price ksh 2500",
                                fontSize = 15.sp,


                                )
                            Row {
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                                Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)

                            }
                            Button(onClick = {},
                                colors= ButtonDefaults.buttonColors(Color.Red),
                                shape = RoundedCornerShape(10.dp))
                            { Text(text = "CONTACT US") }
                        }



                    }
                    //row ends
                    Card() {
                       Column {
                           Row {
                               Text(text ="NDA Review for website project" , fontWeight = FontWeight.Bold, fontSize = (20.sp))
                               Text(text ="Today 10pm" , fontSize = (10.sp))

                           }
                       }
                    }
                    Card() {
                        Column {
                            Row {
                                Text(text ="Email Reply for Green Project" , fontWeight = FontWeight.Bold, fontSize = (20.sp))
                                Text(text ="Today 10pm" , fontSize = (10.sp))

                            }
                        }
                    }

                }
                Spacer(modifier = Modifier.height(20.dp))
                Card (){
                    Row (){
                        Column (){
                            Text(text = "fjsgdfvgf")
                        }
                    }
                }











            }
        }
    )

    //End of scaffold






}


@Preview(showBackground = true)
@Composable
fun ServiceScreenPreview(){
    ServiceScreen(rememberNavController())}
