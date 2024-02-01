package net.guille_dlc.crossbowgun.init;

import net.guille_dlc.crossbowgun.items.CrossbowGunItem;
import net.guille_dlc.crossbowgun.CrossbowGunMod;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

public class ModItems {
	public static void setup() {
		registerItems();
	}

	public static Supplier<Item> CROSSBOW_GUN;
	public static Supplier<Item> BULLET;

	private static void registerItems() {
		CROSSBOW_GUN = registerItem(() ->
				new CrossbowGunItem(
						new Item.Properties()
								.stacksTo(1)
								.durability(465)),
						"crossbow_gun");

		BULLET = registerItem(() ->
				new ArrowItem(
						new Item.Properties()),
						"bullet");

	}

	private static <T extends Item> Supplier<T> registerItem(Supplier<T> itemSupplier, String name) {
		return CrossbowGunMod.ITEM_REGISTER.register(name, itemSupplier);
	}
}
