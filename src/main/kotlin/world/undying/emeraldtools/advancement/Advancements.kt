package world.undying.emeraldtools.advancement

import net.md_5.bungee.api.chat.TranslatableComponent
import xyz.xenondevs.nmsutils.advancement.AdvancementLoader
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitFun
import xyz.xenondevs.nova.util.advancement
import xyz.xenondevs.nova.util.icon
import xyz.xenondevs.nova.util.obtainNovaItemsAdvancement

import world.undying.emeraldtools.EmeraldTools
import world.undying.emeraldtools.registry.Items

private val ROOT = advancement(EmeraldTools, "root") {
    display {
        icon(Items.EMERALD_SWORD)
        title(TranslatableComponent("advancement.emeraldtools.root.title"))
        description(TranslatableComponent("advancement.emeraldtools.root.description"))
        background("minecraft:textures/block/emerald_block.png")

        announceToChat(false)
        showToast(false)
    }
    criteria { tick("tick") {} }
}

private val OBTAIN_ANY_EMERALD_TOOL = obtainNovaItemsAdvancement(
    EmeraldTools, "any_tool", ROOT, listOf(
        Items.EMERALD_PICKAXE, Items.EMERALD_HOE, Items.EMERALD_AXE,
        Items.EMERALD_SWORD, Items.EMERALD_SHOVEL
    ), false
)

private val OBTAIN_ALL_EMERALD_TOOLS = obtainNovaItemsAdvancement(
    EmeraldTools, "all_tools", OBTAIN_ANY_EMERALD_TOOL, listOf(
        Items.EMERALD_SWORD, Items.EMERALD_HOE, Items.EMERALD_AXE,
        Items.EMERALD_PICKAXE, Items.EMERALD_SHOVEL
    ), true
)

private val OBTAIN_ANY_EMERALD_ARMOR = obtainNovaItemsAdvancement(
    EmeraldTools, "any_armor", ROOT, listOf(
        Items.EMERALD_HELMET, Items.EMERALD_CHESTPLATE,
        Items.EMERALD_BOOTS, Items.EMERALD_LEGGINGS
    ), false
)

private val OBTAIN_ALL_EMERALD_ARMOR = obtainNovaItemsAdvancement(
    EmeraldTools, "all_armor", OBTAIN_ANY_EMERALD_ARMOR, listOf(
        Items.EMERALD_HELMET, Items.EMERALD_CHESTPLATE,
        Items.EMERALD_BOOTS, Items.EMERALD_LEGGINGS
    ), true
)

@Init
object Advancements {

    @InitFun
    fun register() {
        AdvancementLoader.registerAdvancements(
            ROOT, OBTAIN_ANY_EMERALD_TOOL, OBTAIN_ALL_EMERALD_TOOLS, OBTAIN_ALL_EMERALD_ARMOR, OBTAIN_ANY_EMERALD_ARMOR
        )
    }

}

