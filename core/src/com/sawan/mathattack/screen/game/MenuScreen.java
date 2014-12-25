/**
 * File name:	MenuScreen.java
 * Version:		1.0
 * Date:		25/12/2014 17:02:27
 * Author:		Sawan J. Kapai Harpalani
 * Copyright:	Copyright 200X Sawan J. Kapai Harpalani
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
package com.sawan.mathattack.screen.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sawan.mathattack.screen.Screen;

/**
 * The Class MenuScreen.
 *
 * @author Sawan J. Kapai Harpalani
 */
public class MenuScreen extends Screen {
	
	

	/* (non-Javadoc)
	 * @see com.sawan.mathattack.screen.Screen#create()
	 */
	@Override
	public void create() {
		System.out.println("created!");
	}

	/* (non-Javadoc)
	 * @see com.sawan.mathattack.screen.Screen#render(com.badlogic.gdx.graphics.g2d.SpriteBatch)
	 */
	@Override
	public void render(SpriteBatch sprite_batch) {
		System.out.println("rendering!");
	}

	/* (non-Javadoc)
	 * @see com.sawan.mathattack.screen.Screen#resize(int, int)
	 */
	@Override
	public void resize(int width, int height) {
		System.out.println("resized!");
	}

	/* (non-Javadoc)
	 * @see com.sawan.mathattack.screen.Screen#dispose()
	 */
	@Override
	public void dispose() {
		System.out.println("disposed!");
	}

	/* (non-Javadoc)
	 * @see com.sawan.mathattack.screen.Screen#hide()
	 */
	@Override
	public void hide() {
		System.out.println("hiden!");
	}

	/* (non-Javadoc)
	 * @see com.sawan.mathattack.screen.Screen#pause()
	 */
	@Override
	public void pause() {
		System.out.println("paused!");
	}

	/* (non-Javadoc)
	 * @see com.sawan.mathattack.screen.Screen#resume()
	 */
	@Override
	public void resume() {
		System.out.println("resumed!");
	}

	@Override
	public void update() {
		
	}

}