package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO61 {

    @EJB
    private HelperBeanN61 helperBeanN61;

    public String identify() {
        return "HelperBeanO61";
    }
}
