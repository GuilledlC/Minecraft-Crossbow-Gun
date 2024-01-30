package net.guille_dlc.crossbowgun;

import com.mojang.logging.LogUtils;
import net.guille_dlc.crossbowgun.init.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.slf4j.Logger;

@Mod(CrossbowGunMod.MOD_ID)
public class CrossbowGunMod {
	public static final String MOD_ID = "crossbowgun";
	private static final Logger LOGGER = LogUtils.getLogger();

	public static final DeferredRegister.Items ITEM_REGISTER = DeferredRegister.createItems(MOD_ID);

	public CrossbowGunMod(IEventBus modEventBus) {
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);

		ITEM_REGISTER.register(modEventBus);

		ModItems.setup();
	}
}