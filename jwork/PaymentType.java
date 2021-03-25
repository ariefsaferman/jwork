public enum PaymentType 
{
    BankPayment("Bank Payment"), 
    EwalletPayment("E-Wallet Payment"); 

    private final String paymentString;

   PaymentType(String paymentString)
   {
       this.paymentString = paymentString; 
   }

    public String toString()
    {
        return paymentString; 
    }
}
