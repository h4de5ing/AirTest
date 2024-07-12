import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import cafe.adriel.voyager.navigator.tab.*
import tab.ExportTab
import tab.CalibrationTab
import tab.HomeTab
import tab.ProfileTab

@Composable
fun TabHomeScreen() {
    val tabList = listOf(HomeTab, CalibrationTab, ProfileTab, ExportTab)
    TabNavigator(
        HomeTab,
        tabDisposable = {
            TabDisposable(
                navigator = it,
                tabs = tabList
            )
        }
    ) {
        Scaffold(
            content = { CurrentTab() },
            bottomBar = {
                BottomNavigation { tabList.forEach { TabNavigationItem(it) } }
            }
        )
    }
}

@Composable
private fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current
    BottomNavigationItem(
        selected = tabNavigator.current.key == tab.key,
        onClick = { tabNavigator.current = tab },
        icon = {
            Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = tab.options.title)
//                Icon(painter = tab.options.icon!!, contentDescription = tab.options.title)
            }
        }
    )
}