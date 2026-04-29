package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM68 {

    @EJB
    private HelperBeanL68 helperBeanL68;

    public String identify() {
        return "HelperBeanM68";
    }
}
