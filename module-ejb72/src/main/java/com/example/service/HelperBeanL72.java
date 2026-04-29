package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL72 {

    @EJB
    private HelperBeanK72 helperBeanK72;

    public String identify() {
        return "HelperBeanL72";
    }
}
