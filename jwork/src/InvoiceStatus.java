public enum InvoiceStatus
{
    OnGoing ("OnGoing"), 
    Finished("Finished"), 
    Cancelled("Cancelled");

    private final String invoiceString; 

    InvoiceStatus(String invoiceString)
    {
        this.invoiceString = invoiceString; 
    }
    
    @Override
    public String toString()
    {
        return invoiceString;
    }
    

}