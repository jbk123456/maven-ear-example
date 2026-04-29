package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK103 {

    @EJB
    private HelperBeanJ103 helperBeanJ103;

    public String identify() {
        return "HelperBeanK103";
    }
}
