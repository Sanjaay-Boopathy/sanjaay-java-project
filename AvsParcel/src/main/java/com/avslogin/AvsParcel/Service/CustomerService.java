package com.avslogin.AvsParcel.Service;

import com.avslogin.AvsParcel.Comman.APIResponse;
import com.avslogin.AvsParcel.DTO.CustomerDTO;
import com.avslogin.AvsParcel.Entity.Customer;
import com.avslogin.AvsParcel.Repo.CustomerRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepositry customerRepositry;
    public  APIResponse Addcustomer(CustomerDTO customerDTO)
    {
        APIResponse apiResponse = new APIResponse();

         Customer customerEntity = new Customer();
        customerEntity.setCustomerName(customerDTO.getCustomerName());
        customerEntity.setCompanyName(customerDTO.getCompanyName());
        customerEntity.setWhatsappNo(customerDTO.getWhatsappNo());
        customerEntity.setPhoneNo(customerDTO.getPhoneNo());
        customerEntity.setAddress(customerDTO.getAddress());
        customerEntity.setAge(customerDTO.getAge());
        customerEntity.setGender(customerDTO.getGender());
        customerEntity.setActive(customerDTO.getActive());
        customerEntity.setGSTNo(customerDTO.getGSTNo());
        customerEntity.setPANNo(customerDTO.getPANNo());
        customerEntity.setEmail(customerDTO.getEmail());
        Optional<Customer> customerOptional= customerRepositry.findCustomerByEmail(customerEntity.getEmail());
        if(customerOptional.isPresent())
        {
            throw new IllegalStateException("email taken");
        }
        else{
            customerEntity= customerRepositry.save(customerEntity);
        }
        //store entity


        //return
        apiResponse.setData(customerEntity);

        return apiResponse;


    }
}
