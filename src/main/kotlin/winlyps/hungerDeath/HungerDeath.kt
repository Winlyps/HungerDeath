package winlyps.hungerDeath

import org.bukkit.plugin.java.JavaPlugin

class HungerDeath : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        getServer().pluginManager.registerEvents(HungerDeathListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}