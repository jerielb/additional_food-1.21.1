package com.jerielb.additional_food.entity.client;

import com.jerielb.additional_food.AdditionalFood;
import com.jerielb.additional_food.entity.custom.JollibeeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class JollibeeRenderer extends MobEntityRenderer<JollibeeEntity, JollibeeModel<JollibeeEntity>> {
	public JollibeeRenderer(EntityRendererFactory.Context context) {
		super(context, new JollibeeModel<>(context.getPart(JollibeeModel.JOLLIBEE)), 0.75f);
	}
	
	@Override
	public Identifier getTexture(JollibeeEntity entity) {
		return Identifier.of(AdditionalFood.MOD_ID, "textures/entity/jollibee/jollibee.png");
	}
}
