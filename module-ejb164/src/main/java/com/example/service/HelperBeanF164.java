package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF164 {

    @EJB
    private HelperBeanE164 helperBeanE164;

    public String identify() {
        return "HelperBeanF164";
    }
}
