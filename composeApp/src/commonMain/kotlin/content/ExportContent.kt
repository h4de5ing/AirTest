package content

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ExportContent() {
    var startTime by mutableStateOf("")
    var stopTime by mutableStateOf("")
    Column(modifier = Modifier.fillMaxSize().padding(10.dp), verticalArrangement = Arrangement.Center) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "起始时间")
            TextField(value = startTime, onValueChange = { startTime = it }, readOnly = true)
            Text(text = "结束时间")
            TextField(value = stopTime, onValueChange = { stopTime = it }, readOnly = true)
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = {}) {
                Text(text = "数据导出")
            }
            Button(onClick = {}) {
                Text(text = "数据清除")
            }
        }
    }
}