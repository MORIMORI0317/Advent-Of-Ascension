package net.tslat.aoa3.client.render.entities.projectiles.cannonshots;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.tslat.aoa3.client.fx.FXFluffyTrail;
import net.tslat.aoa3.entity.projectiles.cannon.EntityLuxonSticklerShot;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nullable;

public class LuxonSticklerShotRenderer extends Render<EntityLuxonSticklerShot> {
	private final ResourceLocation texture;

	public LuxonSticklerShotRenderer(final RenderManager manager, final ResourceLocation textureResource) {
		super(manager);
		texture = textureResource;
	}

	@Override
	public void doRender(EntityLuxonSticklerShot entity, double x, double y, double z, float entityYaw, float partialTicks) {
		for (int i = 0; i < 14; i++) {
			new FXFluffyTrail(entity.world, entity.posX, entity.posY, entity.posZ, 0, 0, 0, Enums.RGBIntegers.CYAN, 65).create();
		}
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityLuxonSticklerShot entity) {
		return texture;
	}
}
