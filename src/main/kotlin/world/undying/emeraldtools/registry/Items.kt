@file:Suppress("unused")

package world.undying.emeraldtools.registry

import  xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init
import world.undying.emeraldtools.EmeraldTools
import xyz.xenondevs.nova.item.behavior.*

@Init
object Items : ItemRegistry by EmeraldTools.registry {

    val EMERALD_SWORD = registerItem("emerald_sword", Tool, Damageable, Enchantable)
    val EMERALD_SHOVEL = registerItem("emerald_shovel", Tool, Damageable, Enchantable, Flattening, Extinguishing)
    val EMERALD_PICKAXE = registerItem("emerald_pickaxe", Tool, Damageable, Enchantable)
    val EMERALD_AXE = registerItem("emerald_axe", Tool, Damageable, Enchantable, Stripping)
    val EMERALD_HOE = registerItem("emerald_hoe", Tool, Damageable, Enchantable, Tilling)

}