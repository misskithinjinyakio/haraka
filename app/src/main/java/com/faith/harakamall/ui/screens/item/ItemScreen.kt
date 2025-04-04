package com.faith.harakamall.ui.screens.item

import android.media.RouteListingPreference.Item
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.faith.harakamall.R
import com.faith.harakamall.ui.theme.neworange
import com.faith.harakamall.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()
    ){
        //topappbar
        TopAppBar(title = { Text(text = "product") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = neworange,
                titleContentColor = newwhite,
                navigationIconContentColor = newwhite,
                actionIconContentColor = newwhite,



            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                }
            },
            actions = {
                Icon(imageVector = Icons.Default.ShoppingCart, contentDescription ="shoppingCart" )
                Icon(imageVector = Icons.Default.Notifications, contentDescription = "notifications")
            }

        )




       // end of topappbar
        Image(
            painter = painterResource(R.drawable.image1),
            contentDescription = "home",
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentScale = ContentScale.FillWidth
        )

        Spacer(modifier = Modifier.height(20.dp))
        //searchbar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "") },
            placeholder = { Text(text = "search here") }
        )
        //end of searchbar


        Spacer(modifier = Modifier.height(20.dp))
        //Row starts

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Row(modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.img),
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
                        text = "ksh 4500",
                        fontSize = 20.sp,
                        textDecoration = TextDecoration.LineThrough

                    )
                    Text(
                        text = "price ksh 5500",
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


            Spacer(modifier = Modifier.height(20.dp))
            //Row starts

            Row(modifier = Modifier.padding(start = 20.dp)) {
                Image(
                    painter = painterResource(R.drawable.image1),
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
            Spacer(modifier = Modifier.height(20.dp))
            //Row starts

            Row(modifier = Modifier.padding(start = 20.dp)) {
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





















        }
    }


}


@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(rememberNavController())
}