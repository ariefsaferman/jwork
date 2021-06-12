package ariefsaferman.jwork.exception;

import ariefsaferman.jwork.Invoice;

public class OngoingInvoiceAlreadyExistsException extends Exception
{
    private Invoice invoice_error;

    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input)
    {
        super("Status Invoice: ");
        invoice_error = invoice_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + invoice_error.getJobseeker().getId() + " is still on going";
    }
}