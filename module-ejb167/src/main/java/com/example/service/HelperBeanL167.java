package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL167 {

    @EJB
    private HelperBeanK167 helperBeanK167;

    public String identify() {
        return "HelperBeanL167";
    }
}
