package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL146 {

    @EJB
    private HelperBeanK146 helperBeanK146;

    public String identify() {
        return "HelperBeanL146";
    }
}
