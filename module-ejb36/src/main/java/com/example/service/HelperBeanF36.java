package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF36 {

    @EJB
    private HelperBeanE36 helperBeanE36;

    public String identify() {
        return "HelperBeanF36";
    }
}
