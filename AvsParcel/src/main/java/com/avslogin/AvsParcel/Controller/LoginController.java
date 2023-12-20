package com.avslogin.AvsParcel.Controller;

import com.avslogin.AvsParcel.Comman.APIResponse;
import com.avslogin.AvsParcel.DTO.LoginRequestDTO;
import com.avslogin.AvsParcel.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class LoginController {
@Autowired
private LoginService loginService;


    @PostMapping("/login")
    public ResponseEntity<APIResponse> login(@RequestBody LoginRequestDTO loginRequestDTO ){

        APIResponse apiResponse = loginService.login(loginRequestDTO);

        return ResponseEntity
                .status(apiResponse.getStatus())
                .body(apiResponse);
    }

}
