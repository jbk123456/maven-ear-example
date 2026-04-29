package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM164 {

    @EJB
    private HelperBeanL164 helperBeanL164;

    public String identify() {
        return "HelperBeanM164";
    }
}
