package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI36 {

    @EJB
    private HelperBeanH36 helperBeanH36;

    public String identify() {
        return "HelperBeanI36";
    }
}
