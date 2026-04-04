package questao22.services;

import questao22.entities.Contract;
import questao22.entities.Installment;

import java.time.LocalDate;


public class ContractService {

    private OnlinePaymentService paymentService = new PaypalService();

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue()/ months;
            for(int i = 1; i <= months; i++){
                LocalDate dueDate = contract.getData().plusMonths(i);

                double interest = paymentService.interest(basicQuota, i);
                double fee = paymentService.paymentFee(basicQuota + interest);
                double quota = basicQuota + interest + fee;

                contract.getInstallment().add(new Installment(quota, dueDate));
            }
        }
    }

