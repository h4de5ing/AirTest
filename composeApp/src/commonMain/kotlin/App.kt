import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import org.jetbrains.compose.ui.tooling.preview.Preview
import java.text.SimpleDateFormat

@Composable
@Preview
fun App() {
    var time by remember { mutableStateOf("") }
    LaunchedEffect(Unit) {
        while (true) {
            time = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis())
            delay(1000L)
        }
    }
    MaterialTheme {
        Box {
            Column {
                Text(text = time, textAlign = TextAlign.Center, fontSize = 20.sp, modifier = Modifier.fillMaxWidth())
                TabHomeScreen()
            }
        }
    }
}