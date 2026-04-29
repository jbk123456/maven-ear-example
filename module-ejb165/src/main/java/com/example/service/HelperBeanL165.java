package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL165 {

    @EJB
    private HelperBeanK165 helperBeanK165;

    public String identify() {
        return "HelperBeanL165";
    }
}
