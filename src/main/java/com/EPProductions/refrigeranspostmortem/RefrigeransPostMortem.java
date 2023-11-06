/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.EPProductions.refrigeranspostmortem;


/**
 *
 * @authors: 
 * DmNiv
 * eduabranco
 *
 */
public class RefrigeransPostMortem {
  public static void main(String[] args) {
	  templo templo1 = new templo("Atzocan", 124, "aiui");
          loja loja1 = new loja("Jeff",365,"Polishop");
          fabrica fabrica1 = new fabrica("Assunção",365,"Trigolino");
          cemiterio cemiterio1 = new cemiterio("Roberto",430,"Max Domini");
	  System.out.println(templo1.toString());
          System.out.println(loja1.toString());
          System.out.println(fabrica1.toString());
          System.out.println(cemiterio1.toString());
  }
}