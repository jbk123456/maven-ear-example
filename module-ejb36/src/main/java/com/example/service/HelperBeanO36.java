package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO36 {

    @EJB
    private HelperBeanN36 helperBeanN36;

    public String identify() {
        return "HelperBeanO36";
    }
}
