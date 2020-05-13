public class CartaoDeCredito extends Pagamento{
   private String numeroDoCartao;
   
   public CartaoDeCredito(){
   }
   
   public CartaoDeCredito(String numeroDoCartao, String nomeDoPagador, String cpf, double valorASerPago){
      this.numeroDoCartao = numeroDoCartao;
   }
   
   public String getNumeroDoCartao(){
      return numeroDoCartao;
   }
   public void setNumeroDoCartao(String numeroDoCartao){
      this.numeroDoCartao = numeroDoCartao;
   }
            
}