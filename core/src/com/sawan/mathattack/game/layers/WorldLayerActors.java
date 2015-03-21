/**
 * File name:	WorldLayerActors.java
 * Version:		1.0
 * Date:		20/3/2015 10:05:12
 * Author:		Itop1
 * Copyright:	Copyright 200X Itop1
 *
 *				This file is part of Math Attack.
 *
 *				Math Attack is free software: you can redistribute it 
 *				and/or modify it under the terms of the GNU General
 *				Public License as published by the Free Software 
 *				Foundation, either version 3 of the License, 
 *				or (at your option) any later version.
 *
 *				Math Attack is distributed in the hope that it will 
 *				be useful, but WITHOUT ANY WARRANTY; without even 
 *				the implied warranty of MERCHANTABILITY or FITNESS 
 *				FOR A PARTICULAR PURPOSE. See the GNU General Public
 *			    License for more details.
 *
 *				You should have received a copy of the GNU General 
 *				Public License along with Math Attack. If not, see 
 *				http://www.gnu.org/licenses/.
 */
package com.sawan.mathattack.game.layers;

import java.util.ArrayList;

import com.sawan.mathattack.asset.BlueMonsterAssets;
import com.sawan.mathattack.asset.HeroAssests;
import com.sawan.mathattack.game.managers.MAGameManager;
import com.sawan.mathattack.models.characters.Hero;
import com.sawan.mathattack.models.characters.enemies.BlueMonster;
import com.sawan.mathattack.scene2d.AbstractWorldScene2d;
import com.sawan.mathattack.settings.AppSettings;

/**
 * @author Sawan
 *
 */
public class WorldLayerActors extends AbstractWorldScene2d {
	
	private MAGameManager gameManager;
	private Hero hero;
	private ArrayList<BlueMonster> enemies;
	
	protected final static int NUM_ENEMIES = 20;
	
	public WorldLayerActors(MAGameManager gameManager, float posX, float posY, float worldWidth, float worldHeight) {
		super(posX, posY, worldWidth, worldHeight);
		this.gameManager =  gameManager;
		setUpHero();
		setUpEnemies();
	}
	
	public void setUpHero() {
		hero = new Hero(gameManager.worldLayer_background.SOIL_WIDHT, gameManager.worldLayer_background.SOIL_HEIGHT, true);
		
		
		hero.setY(gameManager.worldLayer_background.SOIL_HEIGHT * AppSettings.getWorldSizeRatio());
		hero.setX(0f * AppSettings.getWorldPositionXRatio());
		hero.setAnimation(HeroAssests.hero_faint, true, true);
		addActor(hero);
	}
	
	public void setUpEnemies() {
		enemies = new ArrayList<BlueMonster>();
		
		for (int i = 0; i < NUM_ENEMIES; i++) {
			BlueMonster current_monster = new BlueMonster(gameManager.worldLayer_background.SOIL_WIDHT, gameManager.worldLayer_background.SOIL_HEIGHT, true);
			
			float posY = gameManager.worldLayer_background.SOIL_HEIGHT * AppSettings.getWorldSizeRatio();
			current_monster.setY(posY);
			current_monster.setX(gameManager.getStage().getWidth() + 200);
			
			current_monster.setAnimation(BlueMonsterAssets.monster_walking, true, true);
			
			current_monster.startMoving(gameManager.getStage().getWidth(), 110, true);
			
			enemies.add(current_monster);
			addActor(current_monster);
		}
	}
}
