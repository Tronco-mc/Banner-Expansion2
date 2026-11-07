package com.bannerexpansion;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class BannerExpansion implements ModInitializer {
    public static final String MOD_ID = "banner_expansion";

    private static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    private static ResourceKey<Item> itemKey(String name) {
        return ResourceKey.create(Registries.ITEM, id(name));
    }

    private static Item registerItem(String name) {
        ResourceKey<Item> key = itemKey(name);
        Item item = new Item(new Item.Properties().setId(key).stacksTo(1));
        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    @Override
    public void onInitialize() {
        registerItem("phoenix_charge");
        registerItem("demon_charge");
        registerItem("wolf_charge");
        registerItem("crown_charge");
        registerItem("void_charge");
    }
}
