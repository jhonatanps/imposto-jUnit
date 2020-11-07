/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imposto;

/**
 *
 * @author Cirim
 */
public class Imposto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Pessoa p = new Pessoa();
       
       p.setNome("jhonatan");
       p.setRendaBrutaAnual(9000.00);
       p.setNumeroDepenDentes(0.0);
       
       p.calculoImposto();
        System.out.println(p.calculoImposto());
       p.getNumeroDepenDentes();
        System.out.println(p.calculaDependente());
       p.getRendaLiquida();
        System.out.println(p.calculaRendaLiquida());
       /*
           Olha só, toda vez q fizer uma alteração vc vai la na pasta e da um git status para ver 
        como ta a sincronização com seu repositorio, agora vou fazer isso vai ver q esse arquivo foi alterado;
        
        
        */
       
    }
    
}
