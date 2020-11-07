package imposto;

public class Pessoa {
    
    String nome;
    Double numeroDepenDentes;
    Double rendaBrutaAnual = 0.0;
    Double rendaLiquida = 0.0;
    Double imposto = 0.0;
    
    
   public double calculoImposto(){
       
      
       if(rendaBrutaAnual <= 10000.00){
           imposto = 0.0;
           
       }else if((rendaBrutaAnual > 10000.)&&(rendaBrutaAnual <= 30000.00)){
           
          imposto = rendaBrutaAnual * 0.05;
           
       }else if((rendaBrutaAnual > 3000.00)&&(rendaBrutaAnual < 60000.00)){
           
           imposto = rendaBrutaAnual * 0.10;
  
       }else if(rendaBrutaAnual >= 60000.00 ){
           
           imposto = rendaBrutaAnual * 0.15;
  
       }  
       
       return imposto;
        
   }
   
   public double calculaDependente(){
       
       numeroDepenDentes =  numeroDepenDentes * 600.00;
       
       return numeroDepenDentes;
       
   }
   
   public double calculaRendaLiquida(){
       
       if(imposto > numeroDepenDentes){
           
       rendaLiquida = rendaBrutaAnual - (imposto - numeroDepenDentes);
       
       }else{
           
           rendaLiquida = rendaBrutaAnual;
       }
       
       return rendaLiquida;
       
   }
   
  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNumeroDepenDentes() {
        return numeroDepenDentes;
    }

    public void setNumeroDepenDentes(Double numeroDepenDentes) {
        this.numeroDepenDentes = numeroDepenDentes;
    }

    public Double getRendaBrutaAnual() {
        return rendaBrutaAnual;
    }

    public void setRendaBrutaAnual(Double rendaBrutaAnual) {
        this.rendaBrutaAnual = rendaBrutaAnual;
    }

    public Double getRendaLiquida() {
        return rendaLiquida;
    }

    public void setRendaLiquida(Double rendaLiquida) {
        this.rendaLiquida = rendaLiquida;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }
   


   
}