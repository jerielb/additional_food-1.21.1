package com.jerielb.additional_food;

import com.jerielb.additional_food.entity.ModEntities;
import com.jerielb.additional_food.entity.client.JollibeeModel;
import com.jerielb.additional_food.entity.client.JollibeeRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AdditionalFoodClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		EntityModelLayerRegistry.registerModelLayer(JollibeeModel.JOLLIBEE, JollibeeModel::getTexturedModelData);
		EntityRendererRegistry.register(ModEntities.JOLLIBEE, JollibeeRenderer::new);
	}
}
