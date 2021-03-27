/**
 * 
 *
 * @author Arief Saferman
 * @version  18 Maret 2021 
 * 
 */

public enum PaymentType 
{
    BankPayment("Bank Payment"), 
    EwalletPayment("E-Wallet Payment"); 

    private final String paymentString;

   PaymentType(String paymentString)
   {
       this.paymentString = paymentString; 
   }

   @Override
    public String toString()
    {
        return paymentString; 
    }
}
