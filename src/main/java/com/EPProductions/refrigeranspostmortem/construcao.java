/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EPProductions.refrigeranspostmortem;

/**
 *
 * @author cadub
 */
abstract class construcao {
        protected String nome;
        protected int num;

        public construcao(String nome, int num){
                this.nome = nome;
                this.num = num;
        }
        
}

class templo extends construcao {
        String religiao;

        public templo(String nome, int num, String religiao){
                super(nome, num);
                this.religiao = religiao;
        }

        public String getReligiao(){
                return religiao;
        }

        @Override public String toString(){
                return "Nome: " + this.nome +
                        "\nNumero: " + this.num +
                        "\nReligiao: " + this.religiao;
        }

}

//public class loja {
//}
    
//public class cemiterio {
//}

//public class fabrica {
//}

