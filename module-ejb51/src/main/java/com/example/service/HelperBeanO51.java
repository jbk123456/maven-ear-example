package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO51 {

    @EJB
    private HelperBeanN51 helperBeanN51;

    public String identify() {
        return "HelperBeanO51";
    }
}
