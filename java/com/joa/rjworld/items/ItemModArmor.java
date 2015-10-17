package main.java.com.joa.rjworld.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class ItemModArmor extends ItemArmor {

	public ItemModArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);

		this.setUnlocalizedName(unlocalizedName);
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (itemStack.getItem() == ModItems.zestoren_helmet) {
			this.effectPlayer(player, Potion.waterBreathing, 2);
		}
		if (itemStack.getItem() == ModItems.zestoren_chestplate) {
			this.effectPlayer(player, Potion.resistance, 2);
		}
		if (itemStack.getItem() == ModItems.zestoren_leggings) {
			this.effectPlayer(player, Potion.fireResistance, 1);
		}
		if (itemStack.getItem() == ModItems.zestoren_boots) {
			this.effectPlayer(player, Potion.jump, 2);
			this.effectPlayer(player, Potion.moveSpeed, 2);
		}

		if (this.isWearingFullSet(player, ModItems.zestoren_helmet, ModItems.zestoren_chestplate, ModItems.zestoren_leggings, ModItems.zestoren_boots)) {
			this.effectPlayer(player, Potion.regeneration, 2);
		}
	}

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
		//Always effect for 8 seconds, then refresh
		if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
			player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
	}

	private boolean isWearingFullSet(EntityPlayer player, Item helmet, Item chestplate, Item leggings, Item boots) {
		return player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == helmet
				&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == chestplate
				&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == leggings
				&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == boots;
	}
}
