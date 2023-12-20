package com.avslogin.AvsParcel.Controller;

import com.avslogin.AvsParcel.Comman.APIResponse;
import com.avslogin.AvsParcel.DTO.CustomerDTO;
import com.avslogin.AvsParcel.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CutomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/customer")
    public ResponseEntity<APIResponse> Customer(
            @RequestBody CustomerDTO customerDTO)
    {

        APIResponse apiResponse= customerService.Addcustomer(customerDTO);
        return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
    }
}
