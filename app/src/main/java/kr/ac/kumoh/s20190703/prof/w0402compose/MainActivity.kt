package kr.ac.kumoh.s20190703.prof.w0402compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.ac.kumoh.s20190703.prof.w0402compose.ui.theme.W0402ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    W0402ComposeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            //Greeting("안녕하세요")
            MyLinearLayout()
        }
    }
}

@Composable
fun MyLinearLayout() {

    Column {

        Row{
            Text(text = "안녕하세요 ",
                modifier = Modifier
                    .background(Color.Yellow)
                    .padding(8.dp)
            )
            Text(text = "컴공 ",
                modifier = Modifier
                    .background(Color.Cyan)
                    .padding(8.dp)
            )
        }
        Text(text = "어디서 본 것 같은 ",
            modifier = Modifier
                .background(Color.Magenta)
                .padding(8.dp)
        )
        
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
    }

//orientation = 리니어 레이아웃에서 방향을 얘기하는 것 [시험]
