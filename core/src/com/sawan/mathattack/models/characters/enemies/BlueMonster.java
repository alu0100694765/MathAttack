/**
 * File name:	BlueMonster.java
 * Version:		1.0
 * Date:		21/03/2015 18:55:57
 * Author:		Sawan
 * Copyright:	Copyright 200X Sawan
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
package com.sawan.mathattack.models.characters.enemies;

import com.sawan.mathattack.scene2d.AbstractActor;

/**
 * @author Sawan
 *
 */
public class BlueMonster extends AbstractActor {
	float worldWidth;
	float speed;
	boolean isMoving;
	
	
	public BlueMonster(float width, float height, boolean DIPActive) {
		super(width, height, DIPActive);
	}
	
	public void startMoving(float worldWidth,  float speed, boolean isMoving){
		this.worldWidth = worldWidth;
		this.speed = speed;
		this.isMoving = isMoving;

	}
	
	@Override
	public void act(float delta) {
		super.act(delta);
		//
		checkPosition();
		//
		if(isMoving){
			translateWithoutAcc(-speed, 0, delta);
		}
	}

	private void checkPosition() {
		if(getX() < -200){
			setX(worldWidth + 200);
		}
	}
}
