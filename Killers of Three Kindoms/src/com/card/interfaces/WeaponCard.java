package com.card.interfaces;

import java.util.List;

import com.logic.player.APlayer;

public abstract class WeaponCard extends AEquipmentCard{
	protected int attackRange;
	
	public void use(APlayer player, List<APlayer> target)
	{
		for(APlayer targetPlayer: target)
		{
			targetPlayer.setWeapon(this);
		}
	}
	
	public void setAttackRange() {
		// TODO Auto-generated method stub
		
	}
}
