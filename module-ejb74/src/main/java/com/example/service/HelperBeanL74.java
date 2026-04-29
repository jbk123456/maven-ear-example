package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL74 {

    @EJB
    private HelperBeanK74 helperBeanK74;

    public String identify() {
        return "HelperBeanL74";
    }
}
