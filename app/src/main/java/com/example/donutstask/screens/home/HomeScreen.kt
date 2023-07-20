package com.example.donutstask.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutstask.screens.onboarding.OnBoardingScreen
import com.example.donutstask.R
import com.example.donutstask.screens.home.composable.cardItem
import com.example.donutstask.screens.home.composable.donutsRecycleItem
import com.example.donutstask.ui.theme.*


@Composable
fun HomeScreen() {

    val todayDonutlist = listOf(
        R.drawable.donut6,
        R.drawable.donut7,
        R.drawable.donut6,
        R.drawable.donut7,
        R.drawable.donut6,
        R.drawable.donut7,
    )

    val donutlist = listOf(
        R.drawable.donut4,
        R.drawable.donut5,
        R.drawable.donut4,
        R.drawable.donut5,
        R.drawable.donut4,
        R.drawable.donut5,
    )

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 40.dp)) {

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column() {
                Text(
                    text = "Let’s Gonuts!",
                    fontSize = 30.sp,
                    style = Typography.button,
                    color = Rose_1
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Order your favourite donuts from here",
                    fontSize = 14.sp, style = Typography.body2, color = Gray
                )

            }

            Icon(
                painter = painterResource(id = R.drawable.ic_search_24),
                contentDescription = null,
                tint = Rose_1,
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .background(Rose_3)
                    .padding(8.dp)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Today Offers", fontSize = 20.sp, style = Typography.button, color = Black)
        Spacer(modifier = Modifier.height(16.dp))


        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(32.dp),
        ) {
            items(todayDonutlist.size) { position ->
                cardItem(painterResource(id = todayDonutlist[position]),
                    if(position %2 == 0) Plue else Rose_3,
                    {   })
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Donuts", fontSize = 20.sp, style = Typography.button, color = Black)
        Spacer(modifier = Modifier.height(16.dp))

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(2.dp),
        ) {
            items(donutlist.size) { position ->
                    donutsRecycleItem(painter = painterResource(id = donutlist[position]), "Chocolate Cherry", "$22")
            }

        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}