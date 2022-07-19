package com.example.ui.feature.about

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.ui.component.NameCard

//下载游戏view
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen() {
    Scaffold(
        topBar = {
            SmallTopAppBar(title = { Text("About") })
        }
    ) { pd ->
        Column(modifier = Modifier.padding(pd)) {
            Text("About", fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(10.dp))
            NameCard("http://q1.qlogo.cn/g?b=qq&nk=3272912942&s=640",
                "purofle",
                "The project owner"
            )
        }
    }
}