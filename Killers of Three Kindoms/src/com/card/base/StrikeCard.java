package com.card.base;

import java.util.List;

import com.card.interfaces.ACard;
import com.logic.player.APlayer;

public class StrikeCard extends ACard{

	public StrikeCard(){
		this.name = "Strike";
	}
	
	/**
	 * The process of striking
	 * 1.check the weapon effect if player has a weapon.
	 * 2.check the armor effect.
	 * 3.calculate the number of damage.
	 */
	@Override
	public void use(APlayer player,List<APlayer> target) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * To check whether player can strike the target.
	 *  1.check for death;  
	 *  2.check for distance
	 * @param a list of player 
	 * @return true  yes,target can be striked.
	 * 		   false no,target can not be striked.
	 */
	public boolean checkTarget(List<APlayer> players){
		return true;
	}

}
