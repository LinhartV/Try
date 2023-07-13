/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.dali;

/**
 *
 * @author linvo
 */
public interface ICharacter {
    public void attack(ICharacter character);
    public void getLives();
    public void setLives();
    public void checkDeath();
}
