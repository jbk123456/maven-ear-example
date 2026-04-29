package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM111 {

    @EJB
    private HelperBeanL111 helperBeanL111;

    public String identify() {
        return "HelperBeanM111";
    }
}
