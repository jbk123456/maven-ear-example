package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO168 {

    @EJB
    private HelperBeanN168 helperBeanN168;

    public String identify() {
        return "HelperBeanO168";
    }
}
