package com.jerielb.additional_food.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class JollibeeEntity extends AnimalEntity {
	public JollibeeEntity(EntityType<? extends AnimalEntity> entityType, World world) {
		super(entityType, world);
	}
	
	@Override
	public boolean isBreedingItem(ItemStack stack) {
		return false;
	}
	
	@Nullable
	@Override
	public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
		return null;
	}
	
	public static DefaultAttributeContainer.Builder createAttributes() {
		return MobEntity.createMobAttributes()
				.add(EntityAttributes.GENERIC_MAX_HEALTH, 18)
				.add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.35)
				.add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1)
				.add(EntityAttributes.GENERIC_FOLLOW_RANGE, 20);
	}
}
