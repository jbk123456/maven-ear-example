package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL143 {

    @EJB
    private HelperBeanK143 helperBeanK143;

    public String identify() {
        return "HelperBeanL143";
    }
}
