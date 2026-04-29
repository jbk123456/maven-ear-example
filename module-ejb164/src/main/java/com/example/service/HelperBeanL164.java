package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL164 {

    @EJB
    private HelperBeanK164 helperBeanK164;

    public String identify() {
        return "HelperBeanL164";
    }
}
