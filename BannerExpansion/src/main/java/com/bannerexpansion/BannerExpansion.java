package com.bannerexpansion;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.BannerPatternItem;
import net.minecraft.item.Item;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class BannerExpansion implements ModInitializer {
    public static final String MOD_ID = "banner_expansion";
    private static Identifier id(String path) { return Identifier.of(MOD_ID, path); }

    private static void registerPatternItem(String name) {
        TagKey<BannerPattern> tag = TagKey.of(RegistryKeys.BANNER_PATTERN, id("pattern_item/" + name));
        Item item = new BannerPatternItem(tag, new Item.Settings().maxCount(1));
        Registry.register(Registries.ITEM, id(name), item);
    }

    @Override
    public void onInitialize() {
        registerPatternItem("phoenix_charge");
        registerPatternItem("demon_charge");
        registerPatternItem("wolf_charge");
        registerPatternItem("crown_charge");
        registerPatternItem("void_charge");
    }
}
