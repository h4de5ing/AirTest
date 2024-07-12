package content

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun CaliContent() {
    var index0 by remember { mutableStateOf(0) }

    var index1 by remember { mutableStateOf(0) }
    var index2 by remember { mutableStateOf(0) }
    var index3 by remember { mutableStateOf(0) }

    var index4 by remember { mutableStateOf(0) }
    var index5 by remember { mutableStateOf(0) }
    var index6 by remember { mutableStateOf(0) }
    Column {
        Text(text = "PM2.5")
        Text(text = "$index0 ppb")
        Text(text = "实测电压：${index1}v,采样流量：${index2}L/min,检测温度: ${index3}℃")
        Text(text = "空白电压：${index4}v,蠕动泵转速：${index5}r/min,反应温度: ${index6}℃")
    }
}