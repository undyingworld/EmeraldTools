@file:Suppress("unused")

package world.undying.emeraldtools.registry

import  xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init
import world.undying.emeraldtools.EmeraldTools
import xyz.xenondevs.nova.item.behavior.*
import xyz.xenondevs.nova.player.equipment.ArmorType

@Init
object Items : ItemRegistry by EmeraldTools.registry {

    //<editor-fold desc="Tools">
    val EMERALD_SWORD = registerItem("emerald_sword", Tool, Damageable, Enchantable)
    val EMERALD_SHOVEL = registerItem("emerald_shovel", Tool, Damageable, Enchantable, Flattening, Extinguishing)
    val EMERALD_PICKAXE = registerItem("emerald_pickaxe", Tool, Damageable, Enchantable)
    val EMERALD_AXE = registerItem("emerald_axe", Tool, Damageable, Enchantable, Stripping)
    val EMERALD_HOE = registerItem("emerald_hoe", Tool, Damageable, Enchantable, Tilling)

    val COPPER_SWORD = registerItem("copper_sword", Tool, Damageable, Enchantable)
    val COPPER_SHOVEL = registerItem("copper_shovel", Tool, Damageable, Enchantable, Flattening, Extinguishing)
    val COPPER_PICKAXE = registerItem("copper_pickaxe", Tool, Damageable, Enchantable)
    val COPPER_AXE = registerItem("copper_axe", Tool, Damageable, Enchantable, Stripping)
    val COPPER_HOE = registerItem("copper_hoe", Tool, Damageable, Enchantable, Tilling)
    //</editor-fold>

    //<editor-fold desc="Armor">
    val EMERALD_HELMET = registerItem("emerald_helmet", Wearable(ArmorType.HELMET, Sounds.ARMOR_EQUIP_EMERALD), Damageable)
    val EMERALD_CHESTPLATE = registerItem("emerald_chestplate", Wearable(ArmorType.CHESTPLATE, Sounds.ARMOR_EQUIP_EMERALD), Damageable)
    val EMERALD_LEGGINGS = registerItem("emerald_leggings", Wearable(ArmorType.LEGGINGS, Sounds.ARMOR_EQUIP_EMERALD), Damageable)
    val EMERALD_BOOTS = registerItem("emerald_boots", Wearable(ArmorType.BOOTS, Sounds.ARMOR_EQUIP_EMERALD), Damageable)

    val COPPER_HELMET = registerItem("copper_helmet", Wearable(ArmorType.HELMET, Sounds.ARMOR_EQUIP_COPPER), Damageable)
    val COPPER_CHESTPLATE = registerItem("copper_chestplate", Wearable(ArmorType.CHESTPLATE, Sounds.ARMOR_EQUIP_COPPER), Damageable)
    val COPPER_LEGGINGS = registerItem("copper_leggings", Wearable(ArmorType.LEGGINGS, Sounds.ARMOR_EQUIP_COPPER), Damageable)
    val COPPER_BOOTS = registerItem("copper_boots", Wearable(ArmorType.BOOTS, Sounds.ARMOR_EQUIP_COPPER), Damageable)
    //</editor-fold>
}