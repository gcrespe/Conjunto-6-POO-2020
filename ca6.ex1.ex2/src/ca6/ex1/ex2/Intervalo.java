/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca6.ex1.ex2;

/**
 *
 * @author gcres
 * @param <T>
 */
public final class Intervalo<T extends Comparable<T>> implements Comparable<T>{
    
    T limInferior;
    T limSuperior;
    T val;
    
    
    Intervalo(T limiteInf, T limiteSup){
       this.limInferior = limiteInf;
       this.limSuperior = limiteSup;
       this.val = this.limInferior;
       if(compareTo(limiteSup) != -1){
           System.out.println("Intervalo  inválido");
       }
    }
    
    
    T getLimSup(){
        return this.limSuperior;
    }
    
    T getLimInf(){
        return this.limInferior;
    }
    
    @Override
    public int compareTo(T num) {
        int retorno = this.val.compareTo(num);
        return retorno;
    }
    
    public void imprime(){
       System.out.println("[" + this.limInferior + "," + this.limSuperior + "]");
    }
    
    public void ordenaVetor(T arr[]){
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++){
                this.val = arr[j];
                if (this.val.compareTo(arr[min_idx]) == -1) 
                    min_idx = j; 
            } 
                
            // Swap the found minimum element with the first 
            // element 
            T temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    }
    
}
