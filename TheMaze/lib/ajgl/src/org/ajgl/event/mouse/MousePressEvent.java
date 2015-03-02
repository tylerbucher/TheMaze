/**
 * AJGL, an abstract java game library that provides useful functions for making a game.
 * Copyright (C) 2014 Tyler Bucher
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.ajgl.event.mouse;

/**
 * This class is designed to dispatch a mouse press event.
 * @author Tyler Bucher
 */
public class MousePressEvent extends MouseEvent {
    
    private int buttonPressed;  // The integer value of the button pressed
    
    /**
     * Creates a new mouse press event.
     * @param buttonPressed - the button pressed
     */
    public MousePressEvent(int buttonPressed) {
        this.buttonPressed = buttonPressed;
    }

    /**
     * Returns the mouse button pressed.
     * @return the mouse button pressed
     */
    public int getButtonPressed() {
        return buttonPressed;
    }
    
    @Override
    public String getName() {
        return "MousePressEvent";
    }
}
