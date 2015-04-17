package com.logic.player;

import java.util.ArrayList;
import java.util.List;
import com.card.interfaces.ACard;
import com.logic.interfaces.IPlayer;
import com.system.constants.CardConst;
import com.system.enums.GameState;

public abstract class APlayer implements IPlayer{

	 protected int currentHP;
	 protected List<ACard> hands;
	 public GameState gameState;
	 
	 
	 public List<ACard> getAvailableCards(List<ACard> cards){ 
		 if(gameState == GameState.begin || gameState == gameState.check || gameState == GameState.drawCard){
			 return new ArrayList<ACard>();
		 }if(gameState == GameState.castCard){
			 List<ACard> listType = new ArrayList<ACard>();
			 for (ACard c : cards) {
					if (c != null && c.getType() == CardConst.CardType_Dodge) {
						listType.add(c);
					}
				}
			 cards.removeAll(listType);
		 }
		return cards;
	}
	 
	 public void setCurrentHP(int i) {
			// TODO Auto-generated method stub
			this.currentHP = i;
		}

	 public int getCurrentHP() {
			// TODO Auto-generated method stub
			return this.currentHP;
		}
	 
	 public List<ACard> getHands() {
			// TODO Auto-generated method stub
			return this.hands;
	}

	 public void setHands(List<ACard> list) {
			// TODO Auto-generated method stub
			this.hands = list;
	}
}