public class OngoingAlreadyExistsException extends  Exception{
    private Invoice invoice_error;

    public OngoingAlreadyExistsException(Invoice invoice_input)
    {
        super("Status Invoice: ");
        invoice_error = invoice_input;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + invoice_error.getStatus() + "Not OnGoing";
    }
}
