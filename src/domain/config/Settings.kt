package domain.config

object Settings {

    var darkModeEnabled: Boolean = false

    fun toggleDarkMode() {
        darkModeEnabled = !darkModeEnabled
    }
}