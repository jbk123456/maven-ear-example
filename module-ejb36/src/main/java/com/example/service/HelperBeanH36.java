package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH36 {

    @EJB
    private HelperBeanG36 helperBeanG36;

    public String identify() {
        return "HelperBeanH36";
    }
}
