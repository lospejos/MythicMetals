package nourl.mythicmetals.registry;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nourl.mythicmetals.MythicMetals;

public class RegisterItems {
    public static final Item Adamantite_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Aetherium_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Aquarium_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Argonium_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Banglum_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Brass_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Bronze_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Carmot_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Celestium_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Copper_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Discordium_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Durasteel_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Electrum_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Etherite_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Hallowed_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Kyber_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Lutetium_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Manganese_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Metallurgium_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS).fireproof());
    public static final Item Midas_Gold_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Mythril_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Orichalcum_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Osmium_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Platinum_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Prometheum_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Quadrillum_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Quicksilver_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Runite_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Silver_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Slowsilver_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Starrite_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Steel_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Stormyx_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Tantalite_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Tin_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Truesilver_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Unobtainium_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS).fireproof());
    public static final Item Ur_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Vermiculite = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item Zinc_Dust = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "adamantite_dust"), Adamantite_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "aetherium_dust"), Aetherium_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "aquarium_dust"), Aquarium_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "argonium_dust"), Argonium_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "banglum_dust"), Banglum_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "brass_dust"), Brass_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "bronze_dust"), Bronze_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "carmot_dust"), Carmot_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "celestium_dust"), Celestium_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "copper_dust"), Copper_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "discordium_dust"), Discordium_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "durasteel_dust"), Durasteel_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "electrum_dust"), Electrum_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "etherite_dust"), Etherite_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "hallowed_dust"), Hallowed_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "kyber_dust"), Kyber_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "lutetium_dust"), Lutetium_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "manganese_dust"), Manganese_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "metallurgium_dust"), Metallurgium_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "midas_gold_dust"), Midas_Gold_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "mythril_dust"), Mythril_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "orichalcum_dust"), Orichalcum_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "osmium_dust"), Osmium_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "platinum_dust"), Platinum_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "prometheum_dust"), Prometheum_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "quadrillum_dust"), Quadrillum_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "quicksilver_dust"), Quicksilver_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "runite_dust"), Runite_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "silver_dust"), Silver_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "slowsilver_dust"), Slowsilver_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "starrite_dust"), Starrite_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "steel_dust"), Steel_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "stormyx_dust"), Stormyx_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "tantalite_dust"), Tantalite_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "tin_dust"), Tin_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "truesilver_dust"), Truesilver_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "unobtainium_dust"), Unobtainium_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "ur_dust"), Ur_Dust);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "vermiculite"), Vermiculite);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "zinc_dust"), Zinc_Dust);
    }
}
