package winlyps.hungerDeath

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.FoodLevelChangeEvent
import org.bukkit.entity.Player

class HungerDeathListener(private val plugin: HungerDeath) : Listener {

    @EventHandler
    fun onFoodLevelChange(event: FoodLevelChangeEvent) {
        val entity = event.entity
        if (entity is Player) {
            if (event.foodLevel <= 0 && entity.health <= 1.0) {
                entity.health = 0.0
            }
        }
    }
}