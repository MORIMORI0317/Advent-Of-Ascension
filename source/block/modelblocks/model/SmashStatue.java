package net.nevermine.block.modelblocks.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.nevermine.block.modelblocks.ModelEternalBlock;

public class SmashStatue extends ModelBase implements ModelEternalBlock {
	ModelRenderer headbrace;
	ModelRenderer bodylower;
	ModelRenderer rightarm1;
	ModelRenderer leftarm1;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer leftarm10;
	ModelRenderer leftarm2;
	ModelRenderer leftarm3;
	ModelRenderer leftarm4;
	ModelRenderer leftarm5;
	ModelRenderer leftarm6;
	ModelRenderer leftarm7;
	ModelRenderer leftarm8;
	ModelRenderer leftarm9;

	public SmashStatue() {
		textureWidth = 128;
		textureHeight = 32;
		(headbrace = new ModelRenderer(this, 35, 1)).addBox(-5.0f, -1.0f, -5.0f, 10, 2, 10);
		headbrace.setRotationPoint(0.0f, -9.0f, 0.0f);
		headbrace.setTextureSize(128, 32);
		headbrace.mirror = true;
		setRotation(headbrace, 0.0f, 0.0f, 0.0f);
		(bodylower = new ModelRenderer(this, 100, 1)).addBox(-4.0f, 0.0f, -2.0f, 8, 8, 4);
		bodylower.setRotationPoint(0.0f, 4.0f, 0.0f);
		bodylower.setTextureSize(128, 32);
		bodylower.mirror = true;
		setRotation(bodylower, 0.0f, 0.0f, 0.0f);
		(rightarm1 = new ModelRenderer(this, 71, 21)).addBox(-4.0f, -1.0f, -3.0f, 7, 5, 6);
		rightarm1.setRotationPoint(-7.0f, -4.0f, 0.0f);
		rightarm1.setTextureSize(128, 32);
		rightarm1.mirror = true;
		setRotation(rightarm1, 0.0f, 0.0f, 0.0f);
		(leftarm1 = new ModelRenderer(this, 71, 21)).addBox(-3.0f, -1.0f, -3.0f, 7, 5, 6);
		leftarm1.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftarm1.setTextureSize(128, 32);
		leftarm1.mirror = true;
		setRotation(leftarm1, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 51, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		rightleg.setRotationPoint(-3.0f, 12.0f, 0.0f);
		rightleg.setTextureSize(128, 32);
		rightleg.mirror = true;
		setRotation(rightleg, 0.3346075f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 51, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4);
		leftleg.setRotationPoint(3.0f, 12.0f, 0.0f);
		leftleg.setTextureSize(128, 32);
		leftleg.mirror = true;
		setRotation(leftleg, -0.4089647f, 0.0f, 0.0f);
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head.setRotationPoint(0.0f, -9.0f, 0.0f);
		head.setTextureSize(128, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 99, 14)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 6);
		body.setRotationPoint(0.0f, -8.0f, -1.0f);
		body.setTextureSize(128, 32);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(rightarm = new ModelRenderer(this, 81, 2)).addBox(-3.0f, 4.0f, -2.0f, 4, 12, 4);
		rightarm.setRotationPoint(-7.0f, -4.0f, 0.0f);
		rightarm.setTextureSize(128, 32);
		rightarm.mirror = true;
		setRotation(rightarm, 0.4833219f, 0.0f, 0.0f);
		(leftarm10 = new ModelRenderer(this, 4, 21)).addBox(-3.0f, 9.0f, -16.0f, 8, 8, 2);
		leftarm10.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftarm10.setTextureSize(128, 32);
		leftarm10.mirror = true;
		setRotation(leftarm10, -0.7807508f, 0.0f, 0.0f);
		(leftarm2 = new ModelRenderer(this, 81, 2)).addBox(-1.0f, 4.0f, -2.0f, 4, 12, 4);
		leftarm2.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftarm2.setTextureSize(128, 32);
		leftarm2.mirror = true;
		setRotation(leftarm2, -0.7807508f, 0.0f, 0.0f);
		(leftarm3 = new ModelRenderer(this, 39, 17)).addBox(0.0f, 12.0f, -4.0f, 2, 2, 2);
		leftarm3.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftarm3.setTextureSize(128, 32);
		leftarm3.mirror = true;
		setRotation(leftarm3, -0.7807508f, 0.0f, 0.0f);
		(leftarm4 = new ModelRenderer(this, 36, 22)).addBox(-1.0f, 11.0f, -18.0f, 4, 4, 2);
		leftarm4.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftarm4.setTextureSize(128, 32);
		leftarm4.mirror = true;
		setRotation(leftarm4, -0.7807508f, 0.0f, 0.0f);
		(leftarm5 = new ModelRenderer(this, 4, 21)).addBox(-3.0f, 9.0f, -8.0f, 8, 8, 2);
		leftarm5.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftarm5.setTextureSize(128, 32);
		leftarm5.mirror = true;
		setRotation(leftarm5, -0.7807508f, 0.0f, 0.0f);
		(leftarm6 = new ModelRenderer(this, 4, 21)).addBox(-3.0f, 9.0f, -12.0f, 8, 8, 2);
		leftarm6.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftarm6.setTextureSize(128, 32);
		leftarm6.mirror = true;
		setRotation(leftarm6, -0.7807508f, 0.0f, 0.0f);
		(leftarm7 = new ModelRenderer(this, 36, 22)).addBox(-1.0f, 11.0f, -6.0f, 4, 4, 2);
		leftarm7.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftarm7.setTextureSize(128, 32);
		leftarm7.mirror = true;
		setRotation(leftarm7, -0.7807508f, 0.0f, 0.0f);
		(leftarm8 = new ModelRenderer(this, 36, 22)).addBox(-1.0f, 11.0f, -10.0f, 4, 4, 2);
		leftarm8.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftarm8.setTextureSize(128, 32);
		leftarm8.mirror = true;
		setRotation(leftarm8, -0.7807508f, 0.0f, 0.0f);
		(leftarm9 = new ModelRenderer(this, 36, 22)).addBox(-1.0f, 11.0f, -14.0f, 4, 4, 2);
		leftarm9.setRotationPoint(7.0f, -4.0f, 0.0f);
		leftarm9.setTextureSize(128, 32);
		leftarm9.mirror = true;
		setRotation(leftarm9, -0.7807508f, 0.0f, 0.0f);
	}

	public void render(final float f5) {
		headbrace.render(f5);
		bodylower.render(f5);
		rightarm1.render(f5);
		leftarm1.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm10.render(f5);
		leftarm2.render(f5);
		leftarm3.render(f5);
		leftarm4.render(f5);
		leftarm5.render(f5);
		leftarm6.render(f5);
		leftarm7.render(f5);
		leftarm8.render(f5);
		leftarm9.render(f5);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}