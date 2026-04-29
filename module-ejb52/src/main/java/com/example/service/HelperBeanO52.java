package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO52 {

    @EJB
    private HelperBeanN52 helperBeanN52;

    public String identify() {
        return "HelperBeanO52";
    }
}
