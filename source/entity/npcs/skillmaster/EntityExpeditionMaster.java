package net.tslat.aoa3.entity.npcs.skillmaster;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.ArmourRegister;
import net.tslat.aoa3.common.registration.ItemRegister;
import net.tslat.aoa3.entity.base.AoATraderRecipe;
import net.tslat.aoa3.utils.StringUtil;

import javax.annotation.Nullable;
import java.util.ArrayList;

public class EntityExpeditionMaster extends EntitySkillMaster {
	public EntityExpeditionMaster(World world) {
		super(world);
	}

	@Nullable
	@Override
	protected ITextComponent getInteractMessage() {
		return StringUtil.getLocale("message.dialogue.expedition_master." + rand.nextInt(5));
	}

	@Override
	protected ArrayList<AoATraderRecipe> getNewTrades(final ArrayList<AoATraderRecipe> newList) {
		newList.add(new AoATraderRecipe(new ItemStack(ItemRegister.coinLunaver), new ItemStack(ArmourRegister.ExpeditionBody)));
		newList.add(new AoATraderRecipe(new ItemStack(ItemRegister.coinLunaver), new ItemStack(ArmourRegister.ExpeditionLegs)));
		newList.add(new AoATraderRecipe(new ItemStack(ItemRegister.coinLunaver), new ItemStack(ArmourRegister.ExpeditionBoots)));
		newList.add(new AoATraderRecipe(new ItemStack(ItemRegister.coinLunaver), new ItemStack(ArmourRegister.ExpeditionHelmet)));

		return newList;
	}
}
