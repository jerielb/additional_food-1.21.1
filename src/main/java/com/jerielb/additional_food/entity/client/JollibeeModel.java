package com.jerielb.additional_food.entity.client;

import com.jerielb.additional_food.AdditionalFood;
import com.jerielb.additional_food.entity.custom.JollibeeEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class JollibeeModel<T extends JollibeeEntity> extends SinglePartEntityModel<T> {
	public static final EntityModelLayer JOLLIBEE = new EntityModelLayer(Identifier.of(AdditionalFood.MOD_ID, "jollibee"), "main");
	
	private final ModelPart head;
	private final ModelPart head_layers;
	private final ModelPart body;
	private final ModelPart body_layers;
	private final ModelPart arms;
	private final ModelPart right_arm;
	private final ModelPart right_arm_layers;
	private final ModelPart left_arm;
	private final ModelPart left_arm_layers;
	private final ModelPart legs;
	private final ModelPart right_leg;
	private final ModelPart right_leg_layers;
	private final ModelPart left_leg;
	public JollibeeModel(ModelPart root) {
		this.head = root.getChild("head");
		this.head_layers = this.head.getChild("head_layers");
		this.body = root.getChild("body");
		this.body_layers = this.body.getChild("body_layers");
		this.arms = root.getChild("arms");
		this.right_arm = this.arms.getChild("right_arm");
		this.right_arm_layers = this.right_arm.getChild("right_arm_layers");
		this.left_arm = this.arms.getChild("left_arm");
		this.left_arm_layers = this.left_arm.getChild("left_arm_layers");
		this.legs = root.getChild("legs");
		this.right_leg = this.legs.getChild("right_leg");
		this.right_leg_layers = this.right_leg.getChild("right_leg_layers");
		this.left_leg = this.legs.getChild("left_leg");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData head = modelPartData.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		
		ModelPartData head_r1 = head.addChild("head_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -3.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -24.0F, 0.0F, -0.1047F, 0.0873F, 0.0F));
		
		ModelPartData head_layers = head.addChild("head_layers", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData left_r1 = head_layers.addChild("left_r1", ModelPartBuilder.create().uv(0, 48).cuboid(4.0F, -8.0F, -3.0F, 0.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.2F, -24.0F, 0.0F, -0.1047F, 0.0873F, 0.0F));
		
		ModelPartData right_r1 = head_layers.addChild("right_r1", ModelPartBuilder.create().uv(48, 0).cuboid(4.0F, -8.0F, -3.0F, 0.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-8.2F, -24.0F, 0.7F, -0.1047F, 0.0873F, 0.0F));
		
		ModelPartData front_r1 = head_layers.addChild("front_r1", ModelPartBuilder.create().uv(56, 16).cuboid(-4.0F, -8.0F, -3.0F, 8.0F, 8.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -24.0F, -0.25F, -0.1047F, 0.0873F, 0.0F));
		
		ModelPartData bottom_r1 = head_layers.addChild("bottom_r1", ModelPartBuilder.create().uv(24, 24).cuboid(-4.0F, 0.0F, -3.0F, 8.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -23.85F, 0.0F, -0.1047F, 0.0873F, 0.0F));
		
		ModelPartData top_r1 = head_layers.addChild("top_r1", ModelPartBuilder.create().uv(24, 16).cuboid(-4.0F, 0.0F, -3.0F, 8.0F, 0.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -32.15F, 0.9F, -0.1047F, 0.0873F, 0.0F));
		
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -24.0F, -1.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		
		ModelPartData body_layers = body.addChild("body_layers", ModelPartBuilder.create().uv(16, 48).cuboid(-4.0F, -11.8F, -1.0F, 8.0F, 0.0F, 4.0F, new Dilation(0.0F))
				.uv(48, 32).cuboid(-4.0F, -24.0F, -1.2F, 8.0F, 12.0F, 0.0F, new Dilation(0.0F))
				.uv(40, 48).cuboid(-4.0F, -24.0F, 3.2F, 8.0F, 12.0F, 0.0F, new Dilation(0.0F))
				.uv(32, 52).cuboid(-4.2F, -24.0F, -1.0F, 0.0F, 12.0F, 4.0F, new Dilation(0.0F))
				.uv(56, 44).cuboid(4.2F, -24.0F, -1.0F, 0.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData arms = modelPartData.addChild("arms", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		
		ModelPartData right_arm = arms.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData right_arm_r1 = right_arm.addChild("right_arm_r1", ModelPartBuilder.create().uv(16, 32).cuboid(-3.0F, -2.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-5.0F, -22.0F, 0.0F, -0.3911F, -0.1176F, -0.7341F));
		
		ModelPartData right_arm_layers = right_arm.addChild("right_arm_layers", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData bottom_r2 = right_arm_layers.addChild("bottom_r2", ModelPartBuilder.create().uv(40, 60).cuboid(1.0F, -2.0F, -1.0F, 0.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-8.1F, -19.1F, -0.5F, -0.3911F, -0.1176F, -0.7341F));
		
		ModelPartData top_r2 = right_arm_layers.addChild("top_r2", ModelPartBuilder.create().uv(16, 52).cuboid(1.0F, -2.0F, -1.0F, 0.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.9F, -22.2F, 0.1F, -0.3911F, -0.1176F, -0.7341F));
		
		ModelPartData back_r1 = right_arm_layers.addChild("back_r1", ModelPartBuilder.create().uv(24, 68).cuboid(-3.0F, -2.0F, -1.0F, 4.0F, 12.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.4F, -20.6F, 3.9F, -0.3911F, -0.1176F, -0.7341F));
		
		ModelPartData front_r2 = right_arm_layers.addChild("front_r2", ModelPartBuilder.create().uv(64, 24).cuboid(-3.0F, -2.0F, -1.0F, 4.0F, 12.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-5.1F, -22.1F, -0.2F, -0.3911F, -0.1176F, -0.7341F));
		
		ModelPartData left_arm = arms.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData left_arm_r1 = left_arm.addChild("left_arm_r1", ModelPartBuilder.create().uv(32, 32).cuboid(-1.0F, -2.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -22.0F, 0.0F, 0.0F, 0.2094F, -1.5708F));
		
		ModelPartData left_arm_layers = left_arm.addChild("left_arm_layers", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData back_r2 = left_arm_layers.addChild("back_r2", ModelPartBuilder.create().uv(64, 36).cuboid(-1.0F, -2.0F, -1.0F, 4.0F, 12.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -22.9F, 4.2F, 0.0F, 0.2094F, -1.5708F));
		
		ModelPartData front_r3 = left_arm_layers.addChild("front_r3", ModelPartBuilder.create().uv(64, 48).cuboid(-1.0F, -2.0F, -1.0F, 4.0F, 12.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -21.9F, -0.3F, 0.0F, 0.2094F, -1.5708F));
		
		ModelPartData bottom_r3 = left_arm_layers.addChild("bottom_r3", ModelPartBuilder.create().uv(48, 60).cuboid(3.0F, -2.0F, -1.0F, 0.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -17.9F, 0.9F, 0.0F, 0.2094F, -1.5708F));
		
		ModelPartData top_r3 = left_arm_layers.addChild("top_r3", ModelPartBuilder.create().uv(24, 52).cuboid(3.0F, -2.0F, -1.0F, 0.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -22.2F, -0.1F, 0.0F, 0.2094F, -1.5708F));
		
		ModelPartData legs = modelPartData.addChild("legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		
		ModelPartData right_leg = legs.addChild("right_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData right_leg_r1 = right_leg.addChild("right_leg_r1", ModelPartBuilder.create().uv(0, 32).cuboid(-2.1F, 0.0F, -1.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-1.9F, -12.0F, 0.0F, 0.1904F, -0.0249F, 0.1634F));
		
		ModelPartData right_leg_layers = right_leg.addChild("right_leg_layers", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData left_r2 = right_leg_layers.addChild("left_r2", ModelPartBuilder.create().uv(0, 64).cuboid(1.9F, 0.0F, -1.0F, 0.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-1.6F, -12.0F, 0.0F, 0.1904F, -0.0249F, 0.1634F));
		
		ModelPartData right_r2 = right_leg_layers.addChild("right_r2", ModelPartBuilder.create().uv(56, 60).cuboid(1.9F, 0.0F, -1.0F, 0.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-6.1F, -12.75F, 0.0F, 0.1904F, -0.0249F, 0.1634F));
		
		ModelPartData front_r4 = right_leg_layers.addChild("front_r4", ModelPartBuilder.create().uv(64, 60).cuboid(-2.1F, 0.0F, -1.0F, 4.0F, 12.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.9F, -12.0F, -0.2F, 0.1904F, -0.0249F, 0.1634F));
		
		ModelPartData left_leg = legs.addChild("left_leg", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
		
		ModelPartData left_r3 = left_leg.addChild("left_r3", ModelPartBuilder.create().uv(8, 64).cuboid(2.1F, 0.0F, -1.0F, 0.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(2.1F, -12.0F, 0.0F, 0.0F, 0.0F, -0.0349F));
		
		ModelPartData right_r3 = left_leg.addChild("right_r3", ModelPartBuilder.create().uv(64, 0).cuboid(2.1F, 0.0F, -1.0F, 0.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-2.3F, -11.9F, 0.0F, 0.0F, 0.0F, -0.0349F));
		
		ModelPartData front_r5 = left_leg.addChild("front_r5", ModelPartBuilder.create().uv(16, 68).cuboid(-1.9F, 0.0F, -1.0F, 4.0F, 12.0F, 0.0F, new Dilation(0.0F))
				.uv(32, 0).cuboid(-1.9F, 0.0F, -0.8F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(1.9F, -12.0F, -0.2F, 0.0F, 0.0F, -0.0349F));
		return TexturedModelData.of(modelData, 128, 128);
	}
	@Override
	public void setAngles(JollibeeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		head.render(matrices, vertexConsumer, light, overlay, color);
		body.render(matrices, vertexConsumer, light, overlay, color);
		arms.render(matrices, vertexConsumer, light, overlay, color);
		legs.render(matrices, vertexConsumer, light, overlay, color);
	}
	
	@Override
	public ModelPart getPart() {
		return null;
	}
}
