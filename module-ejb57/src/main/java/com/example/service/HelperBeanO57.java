package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO57 {

    @EJB
    private HelperBeanN57 helperBeanN57;

    public String identify() {
        return "HelperBeanO57";
    }
}
