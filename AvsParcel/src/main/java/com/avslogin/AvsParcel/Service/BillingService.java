package com.avslogin.AvsParcel.Service;

import com.avslogin.AvsParcel.Comman.APIResponse;
import com.avslogin.AvsParcel.DTO.BillingDTO;
import com.avslogin.AvsParcel.Entity.Billing;
import com.avslogin.AvsParcel.Repo.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class BillingService {
    @Autowired
    private BillingRepository billingRepository;

    @Autowired
    public BillingService(BillingRepository billingRepository) {
        this.billingRepository = billingRepository;
    }
    public APIResponse AddBilling(BillingDTO billingDTO)
    {
        APIResponse apiResponse= new APIResponse();
        Billing billingEntity = new Billing();
        billingEntity.setCustomerName(billingDTO.getCustomerName());
        billingEntity.setToCustomer(billingDTO.getToCustomer());
        billingEntity.setFromAddress(billingDTO.getFromAddress());
        billingEntity.setToAddress(billingDTO.getToAddress());
        billingEntity.setMobileNO(billingDTO.getMobileNO());
        billingEntity.setToMobileNO(billingDTO.getToMobileNO());
        billingEntity.setEmail(billingDTO.getEmail());
        billingEntity.setGSTNo(billingDTO.getGSTNo());
        billingEntity.setNoOfPackage(billingDTO.getNoOfPackage());
        billingEntity.setMaterialValue(billingDTO.getMaterialValue());
        billingEntity.setWeight(billingDTO.getWeight());
        billingEntity.setPaymentType(billingDTO.getPaymentType());


        billingEntity= billingRepository.save(billingEntity);

        //return
        apiResponse.setData(billingEntity);

        return apiResponse;
    }

    public Optional<Billing> getBillById(long billingId) {
        return billingRepository.findByBillingId(billingId);
    }


    public List<Billing> getBill(Set<String> paymentType) {
        if (paymentType == null) {
            return billingRepository.findAll();
        } else {
            return billingRepository.findAllByPaymentTypeIn(paymentType);
        }

    }

    public void deleteBillingById(long billingId) {
        billingRepository.deleteById(billingId);
    }
    public Billing updateBilling(Billing inBilling) {
        return billingRepository.save(inBilling);
    }
}







