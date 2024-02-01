package net.guille_dlc.crossbowgun.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BulletItem extends Item {
	public BulletItem(Item.Properties pProperties) {
		super(pProperties);
	}

	public AbstractBullet createBullet(Level pLevel, ItemStack pStack, LivingEntity pShooter) {
		Bullet bullet = new Bullet(pLevel, pShooter, pStack.copyWithCount(1));
		return bullet;
	}

	public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.world.entity.player.Player player) {
		int enchant = net.minecraft.world.item.enchantment.EnchantmentHelper.getItemEnchantmentLevel(net.minecraft.world.item.enchantment.Enchantments.INFINITY_ARROWS, bow);
		return enchant <= 0 ? false : this.getClass() == BulletItem.class;
	}
}
