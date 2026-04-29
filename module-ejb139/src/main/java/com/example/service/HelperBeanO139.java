package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO139 {

    @EJB
    private HelperBeanN139 helperBeanN139;

    public String identify() {
        return "HelperBeanO139";
    }
}
