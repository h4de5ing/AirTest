package content

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun HomeContent() {
    var index0 by remember { mutableStateOf(0.0f) }

    var index1 by remember { mutableStateOf(0) }
    var index2 by remember { mutableStateOf(0) }
    var index3 by remember { mutableStateOf(0) }

    var index4 by remember { mutableStateOf(0) }
    var index5 by remember { mutableStateOf(0) }
    var index6 by remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize().padding(10.dp)) {
        Text(
            text = "PM2.5", fontSize = 45.sp,
            modifier = Modifier.padding(10.dp)
        )
        Text(
            text = "  $index0 ppb",
            fontSize = 30.sp,
            modifier = Modifier.fillMaxWidth().padding(end = 20.dp),
            textAlign = TextAlign.End
        )
        Text(
            text = "实测电压：${index1}v,采样流量：${index2}L/min,检测温度: ${index3}℃",
            modifier = Modifier.fillMaxWidth().padding(10.dp)
        )
        Text(
            text = "空白电压：${index4}v,蠕动泵转速：${index5}r/min,反应温度: ${index6}℃",
            modifier = Modifier.fillMaxWidth().padding(10.dp)
        )
    }
}