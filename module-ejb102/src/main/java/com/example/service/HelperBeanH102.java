package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH102 {

    @EJB
    private HelperBeanG102 helperBeanG102;

    public String identify() {
        return "HelperBeanH102";
    }
}
