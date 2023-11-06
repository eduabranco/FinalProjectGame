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

    @Override 
    public String toString(){
        return "Nome: " + this.nome +
            "\nNumero: " + this.num +
            "\nReligiao: " + this.religiao;
    }

}

class loja extends construcao {
    String varejista;
    public loja(String nome, int num, String varejista){
        super(nome, num);
        this.varejista = varejista;
    }
    
    public String getVarejista(){
        return varejista;
    }
    
    @Override 
    public String toString(){
        return "Nome: " + this.nome +
            "\nNumero: " + this.num +
            "\nReligiao: " + this.varejista;
    }
}
    
class cemiterio extends construcao {
    String funeraria;
    public cemiterio(String nome, int num, String funeraria){
        super(nome, num);
        this.funeraria = funeraria;
    }
    
    public String getFuneraria(){
        return funeraria;
    }
    
    @Override 
    public String toString(){
        return "Nome: " + this.nome +
            "\nNumero: " + this.num +
            "\nReligiao: " + this.funeraria;
    }
}

class fabrica extends construcao {
    String companhia;
    public fabrica(String nome, int num, String companhia){
        super(nome, num);
        this.companhia = companhia;
    }
    
    public String getCompanhia(){
        return companhia;
    }
    
    @Override 
    public String toString(){
        return "Nome: " + this.nome +
            "\nNumero: " + this.num +
            "\nReligiao: " + this.companhia;
    }
}
