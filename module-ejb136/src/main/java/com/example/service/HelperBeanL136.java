package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL136 {

    @EJB
    private HelperBeanK136 helperBeanK136;

    public String identify() {
        return "HelperBeanL136";
    }
}
