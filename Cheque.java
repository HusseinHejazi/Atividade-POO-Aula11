public class Cheque extends Pagamento{
   private String numeroDoCheque;
   
   public Cheque (){
   }
   
   public Cheque (String numeroDoCheque, String nomeDoPagador, String cpf, double valorASerPago){
      this.numeroDoCheque = numeroDoCheque;
   }
   
   public String getNumeroDoCheque(){
      return numeroDoCheque;
   }
   public void setNumeroDoCheque(String numeroDoCheque){
      this.numeroDoCheque = numeroDoCheque;
   }
   
}