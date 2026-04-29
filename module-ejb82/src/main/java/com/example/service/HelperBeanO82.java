package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO82 {

    @EJB
    private HelperBeanN82 helperBeanN82;

    public String identify() {
        return "HelperBeanO82";
    }
}
