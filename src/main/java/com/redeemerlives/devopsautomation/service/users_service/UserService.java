package com.redeemerlives.devopsautomation.service.users_service;

import com.redeemerlives.devopsautomation.Response.WebResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String helloUser() {
        return new WebResponse("Hello user from web response in service").getResponse();
    }
}
