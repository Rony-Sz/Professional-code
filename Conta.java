/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade8;

/**
 *
 * @author Rony
 */
public abstract class Conta {
    public int numero;
    public String nomeTitular;
    public float saldo;
    
    //Metódos
    public void sacar(float v){
        if(this.getSaldo()>= v){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Saque realizado na conta de: "+ this.getNomeTitular());
        } else{
            System.out.println("Slado insuficiente!");
        }
    }
    public void depositar(float v){
        this.setSaldo(this.getSaldo()+v);
        System.out.println("Deposito realizado!");
    }
    public void mostrarTipoDeConta(String t){
        if(t == "CE"){
            System.out.println("Conta Especial");
        } else if(t == "CP"){
            System.out.println("Conta Poupança");
        }
    }

    //Construct
    public Conta() {
    }

    //Get e Set
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
}
