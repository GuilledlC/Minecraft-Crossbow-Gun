package net.guille_dlc.crossbowgun.init;

import net.guille_dlc.crossbowgun.CrossbowGunMod;
import net.minecraft.world.item.*;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import java.util.function.Supplier;

public class ModItems {
	public static void setup() {
		registerItems();
	}

	public static Supplier<Item> CROSSBOW_GUN;

	private static void registerItems() {
		CROSSBOW_GUN = registerItem(() ->
				new CrossbowItem(
						new Item.Properties()),
						"crossbow_gun");
	}

	private static <T extends Item> Supplier<T> registerItem(Supplier<T> itemSupplier, String name) {
		return CrossbowGunMod.ITEM_REGISTER.register(name, itemSupplier);
	}
}
