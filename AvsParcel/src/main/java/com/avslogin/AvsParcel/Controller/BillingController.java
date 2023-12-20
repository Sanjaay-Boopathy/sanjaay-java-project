package com.avslogin.AvsParcel.Controller;

import com.avslogin.AvsParcel.Comman.APIResponse;
import com.avslogin.AvsParcel.DTO.BillingDTO;
import com.avslogin.AvsParcel.Entity.Billing;
import com.avslogin.AvsParcel.Service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Controller
public class BillingController {
    @Autowired
    private BillingService billingService;
    //Adding a bill
    @PostMapping("/AddBilling")
    public ResponseEntity<APIResponse> AddBilling(
            @RequestBody BillingDTO billingDTO)
    {
        APIResponse apiResponse= billingService.AddBilling(billingDTO);
        return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
    }
    // reports for single bill no
    @GetMapping(value = "/billno/{billingId}")
    public ResponseEntity<Billing> getBillById(@PathVariable("billingId") long billingId) {
        Optional<Billing> billing = billingService.getBillById(billingId);
        if (billing.isPresent()) {
            return ResponseEntity.ok(billing.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping("/bill")
    public ResponseEntity<List<Billing>> getUser(@RequestParam(value = "PaymentType", required = false) Set<String> paymentType) {
        List<Billing> billings = billingService.getBill(paymentType);
        return ResponseEntity.ok(billings);
    }


    @DeleteMapping("/delete/{billingId}")
    public ResponseEntity<String> deleteBilling(@PathVariable long billingId) {
        billingService.deleteBillingById(billingId);
        return ResponseEntity.ok("Billing deleted successfully");
    }

    @PutMapping("/update")
    public ResponseEntity<Billing> updateBilling(@RequestBody Billing billing) {
        Billing updatedBilling = billingService.updateBilling(billing);
        return ResponseEntity.ok(updatedBilling);
    }


}
