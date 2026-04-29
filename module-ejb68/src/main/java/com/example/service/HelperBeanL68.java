package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL68 {

    @EJB
    private HelperBeanK68 helperBeanK68;

    public String identify() {
        return "HelperBeanL68";
    }
}
