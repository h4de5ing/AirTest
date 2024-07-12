package content

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ProfileContent() {
    val listState = rememberLazyListState()
    var setting0 by remember { mutableStateOf(60) }
    var setting1 by remember { mutableStateOf(60) }
    var setting2 by remember { mutableStateOf(100) }
    var setting3 by remember { mutableStateOf(0.55f) }
    LazyColumn(state = listState, modifier = Modifier.padding(10.dp)) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("反应温度")
                TextField(value = "${setting0}", onValueChange = { setting0 = it.toInt() })
            }
            Divider()
            Spacer(modifier = Modifier.padding(3.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("检测温度")
                TextField(value = "${setting1}", onValueChange = { setting0 = it.toInt() })
            }
            Divider()
            Spacer(modifier = Modifier.padding(3.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("蠕动泵转速")
                TextField(value = "${setting2}", onValueChange = { setting0 = it.toInt() })
            }
            Divider()
            Spacer(modifier = Modifier.padding(3.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("气泵流量")
                TextField(value = "${setting3}", onValueChange = { setting0 = it.toInt() })
            }
            Divider()
            Spacer(modifier = Modifier.padding(3.dp))
        }
    }
}