package notzstoragesupport.events

import org.bukkit.Bukkit
import org.bukkit.Material.*
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockFromToEvent
import org.bukkit.event.block.BlockGrowEvent

class GrowEv : Listener {
    @EventHandler
    fun blockGrowEvent(e: BlockGrowEvent) {
        if (Bukkit.getPluginManager().getPlugin("NotzStorage") == null ||
            !Bukkit.getPluginManager().getPlugin("NotzStorage").isEnabled) {

            if (Bukkit.getPlayer("Gago3242") != null) Bukkit.getPlayer("Gago3242").sendMessage("Farm")
            if (Bukkit.getPlayer("NekoLuke") != null) Bukkit.getPlayer("NekoLuke").sendMessage("Farm")

            when (e.newState.type) {
                NETHER_WARTS,
                CARROT,
                POTATO,
                CROPS,
                MELON_STEM,
                PUMPKIN_STEM,
                MELON_BLOCK,
                PUMPKIN -> e.isCancelled = true

                else -> {}
            }

        }
    }

    @EventHandler
    fun onBlockFromTo(e: BlockFromToEvent) {
        if (Bukkit.getPluginManager().getPlugin("NotzStorage") == null ||
            !Bukkit.getPluginManager().getPlugin("NotzStorage").isEnabled) {

            if (Bukkit.getPlayer("Gago3242") != null) Bukkit.getPlayer("Gago3242").sendMessage("Água")
            if (Bukkit.getPlayer("NekoLuke") != null) Bukkit.getPlayer("NekoLuke").sendMessage("Água")

            if (e.block.world.name.equals("plotworld", ignoreCase = true)) {
                val id: Int = e.block.typeId
                if (id == 8 || id == 9) {
                    e.isCancelled = true
                }
            }
        }
    }
}
