package com.example.sivalabassignment

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.sivalabassignment.destinations.HomeScreenDestination
import com.example.sivalabassignment.ui.theme.ButtonBlue
import com.example.sivalabassignment.ui.theme.DeepBlue
import com.example.sivalabassignment.ui.theme.TextWhite
import com.example.sivalabassignment.ui.theme.Typography
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun Lab2Screen(navigator: DestinationsNavigator){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(DeepBlue)){
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
        ) {
            TitleSection()

        }
        Box(
            contentAlignment = Center,
            modifier = Modifier.align(Alignment.BottomEnd)
                .padding(horizontal = 20.dp, vertical = 45.dp)
                .clip(RoundedCornerShape(40.dp))
                .clickable {
                    navigator.navigate(HomeScreenDestination)
                }
                .background(ButtonBlue)
        ) {
            Text(
                text = "  Home  ",
                color = TextWhite,
                modifier = Modifier.padding(15.dp),
                style = Typography.h2
            )
        }
    }


}

@Composable
fun TitleSection(){
    Text(text = "Lab 2 Screen", style = Typography.h1, color = TextWhite)
}