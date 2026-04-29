package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL84 {

    @EJB
    private HelperBeanK84 helperBeanK84;

    public String identify() {
        return "HelperBeanL84";
    }
}
