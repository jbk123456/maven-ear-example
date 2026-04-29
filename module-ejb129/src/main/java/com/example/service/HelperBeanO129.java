package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO129 {

    @EJB
    private HelperBeanN129 helperBeanN129;

    public String identify() {
        return "HelperBeanO129";
    }
}
