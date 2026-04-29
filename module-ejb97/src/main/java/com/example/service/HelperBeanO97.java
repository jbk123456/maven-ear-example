package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO97 {

    @EJB
    private HelperBeanN97 helperBeanN97;

    public String identify() {
        return "HelperBeanO97";
    }
}
