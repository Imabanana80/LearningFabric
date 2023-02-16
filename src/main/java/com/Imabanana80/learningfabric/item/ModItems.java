package com.Imabanana80.learningfabric.item;

import com.Imabanana80.learningfabric.LearningFabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item BANANA = registerItem("banana",
            new Item(new FabricItemSettings().group(ModItemGroup.BANANAITEMS).food(ModFoodComponents.BANANA)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LearningFabric.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LearningFabric.LOGGER.debug("Registering Mod Items for " + LearningFabric.MOD_ID);
    }
}
