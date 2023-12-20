package com.avslogin.AvsParcel.Controller;

import com.avslogin.AvsParcel.Comman.APIResponse;
import com.avslogin.AvsParcel.DTO.SignUpRequestDTO;
import com.avslogin.AvsParcel.Entity.User;
import com.avslogin.AvsParcel.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
public class SignupController {
    @Autowired
    private LoginService loginService;
    @PostMapping("/signup")
    public ResponseEntity<APIResponse> singup(
            @RequestBody SignUpRequestDTO signUpRequestDTO)
    {
        APIResponse apiResponse= loginService.signup(signUpRequestDTO);
        return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
    }

    @GetMapping("/user")
    public List<User> getUser(@RequestParam(value = "gendertype",required = false) Set<String> gender)

    {
        return loginService.getUser(gender);
    }


    @DeleteMapping(path = "user-delete/{id}")
    public void deleteUser(@PathVariable("id") Long id)
    {
        loginService.deleteUser(id);
    }

    @PutMapping(value = "updater")
    public User updateUser(@RequestBody User Inuser)
    {
       return loginService.updateUsers(Inuser);
    }

    @GetMapping(value = "/user/{id}")
    public Optional<User> getUserById(@PathVariable("id") long userId)
    {
        return loginService.getUserById(userId);
    }

}
