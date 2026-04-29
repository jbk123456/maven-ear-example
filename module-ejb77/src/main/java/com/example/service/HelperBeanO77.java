package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO77 {

    @EJB
    private HelperBeanN77 helperBeanN77;

    public String identify() {
        return "HelperBeanO77";
    }
}
