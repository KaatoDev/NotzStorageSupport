package notzstoragesupport

import notzstoragesupport.events.GrowEv
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(GrowEv(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
