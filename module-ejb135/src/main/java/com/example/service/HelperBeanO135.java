package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO135 {

    @EJB
    private HelperBeanN135 helperBeanN135;

    public String identify() {
        return "HelperBeanO135";
    }
}
