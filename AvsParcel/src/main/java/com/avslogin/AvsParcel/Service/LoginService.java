package com.avslogin.AvsParcel.Service;

import com.avslogin.AvsParcel.Comman.APIResponse;
import com.avslogin.AvsParcel.DTO.LoginRequestDTO;
import com.avslogin.AvsParcel.DTO.SignUpRequestDTO;
import com.avslogin.AvsParcel.Entity.User;
import com.avslogin.AvsParcel.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public APIResponse signup(SignUpRequestDTO signUpRequestDTO) {
        APIResponse apiResponses =new APIResponse();

//dto to entity
        User userEntity =new User();
        userEntity.setName(signUpRequestDTO.getName());
        userEntity.setEmail(signUpRequestDTO.getEmail());
        userEntity.setActive(signUpRequestDTO.isActive());
        userEntity.setPhoneNumber(signUpRequestDTO.getPhoneNumber());
        userEntity.setPassword(signUpRequestDTO.getPassword());


        //store entity
       userEntity= userRepository.save(userEntity);

        //return
        apiResponses.setData(userEntity);

        return apiResponses;
    }

    public APIResponse login(LoginRequestDTO loginRequestDTO) {

        APIResponse apiResponse = new APIResponse();


        // verify user exist with given email and password
        User user = userRepository.findOneByEmailIgnoreCaseAndPassword(loginRequestDTO.getEmail(), loginRequestDTO.getPassword());
        System.out.println(user);
        // response
        if(user == null){
            apiResponse.setData("User login failed");

        }
        else
        {
            apiResponse.setData("User login successfully");
        }
        return apiResponse;
    }
    public List<User>getUser(Set<String> gen){
    List<User> userList =  new ArrayList<>();
    if (gen==null)
    {
        userRepository.findAll().forEach(user -> userList.add(user));
    }
    else
    {
        return userRepository.findAllByGenderIn(gen);
    }

       return userList;
    }

    public void deleteUser(long id)
    {
        boolean exists =userRepository.existsById(id);
        APIResponse apiResponse = new APIResponse();
        if (!exists)
        {
            apiResponse.setData("Id is not exists "+id);
        }
        userRepository.deleteById(id);
    }
    public  User updateUsers(User inUser)
    {

       return userRepository.save(inUser);
    }

    public Optional<User> getUserById(long userId){
        return userRepository.findById(userId);
    }

}

