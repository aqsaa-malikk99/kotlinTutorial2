package com.example.testingkotlinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testingkotlinapp.ui.theme.TestingKotlinAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestingKotlinAppTheme {
                TaskCompletedScreen()
            }
        }
    }
}

@Composable
fun CreateUI1(modifier: Modifier = Modifier) {
    Column {
        Image(painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null)
        Text(text = stringResource(R.string.headline), fontSize = 24.sp, modifier = Modifier.padding(16.dp))
        Text(
            text = stringResource(R.string.subtext),
            modifier = Modifier
                .padding(16.dp,0.dp,16.dp,0.dp),
            textAlign = TextAlign.Justify
        )
        Text(text = stringResource(R.string.description),

            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify)
    }
}
@Composable
fun TaskCompletedScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.ic_task_completed)
        Image(painter = image, contentDescription = null)
        Text(
            text = stringResource(R.string.all_tasks_completed),
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.nice_work),
            fontSize = 16.sp
        )
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TestingKotlinAppTheme {
        TaskCompletedScreen()
    }
}
