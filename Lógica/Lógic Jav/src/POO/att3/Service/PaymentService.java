package att3.Service;

import att3.Contracts.IPayable;

public class PaymentService {

    public boolean proccesPayment(IPayable payer, double amount){

        boolean paymentSuccess = payer.pay(amount);

        if (paymentSuccess){
            System.out.println("Pagamento de " + amount + " realizado com sucesso por " + payer);
        } else {
            System.out.println("Erro no pagamento");
        }
        return paymentSuccess;
    }

}
