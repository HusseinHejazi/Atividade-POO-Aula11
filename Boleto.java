public class Boleto extends Pagamento{
   private String numeroDoBoleto;
   private int dia;
   private int mes;
   private int ano;
   
   public Boleto(){
   }
   
   public Boleto (String numeroDoBoleto, int dia, int mes, int ano, String nomeDoPagador, String cpf, double valorASerPago){
      this.numeroDoBoleto = numeroDoBoleto;
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
   }
   
   public String getNumeroDoBoleto(){
      return numeroDoBoleto;
   }
   
   public int getDia(){
      return dia;
   }
   
   public int getMes(){
      return mes;
   }
   
   public int getAno(){
      return ano;
   }
   
   public void setNumeroDoBoleto(String numeroDoBoleto){
      this.numeroDoBoleto = numeroDoBoleto;
   }
   
   public void SetDia(int dia){
      this.dia = dia;
   }
   
   public void SetMes(int mes){
      this.mes = mes;
   }
   
   public void SetAno(int ano){
      this.ano = ano;
   }
   
}
