package br.com.alearaujo.git;

public class Lampada {
	
	String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;
    
    boolean ligada;
    
    void ligar () {
        ligada = true;        
    }
    
    void desligar (){
        ligada = false;
    }
    
    void mostrarEstado (){
        if (ligada){
            System.out.println("A l�mapada est� ligada.");
        } else  { 
            System.out.println("A l�mpada est� desligada");
        }
}
    
}


