package ariefsaferman.jwork;
/**
 * 
 *
 * @author Arief Saferman
 * @version  18 Maret 2021 
 * 
 */

public enum PaymentType 
{
    BankPayment("BankPayment"),
    EwalletPayment("EwalletPayment");

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
