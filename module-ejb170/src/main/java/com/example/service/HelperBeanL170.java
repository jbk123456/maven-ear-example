package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL170 {

    @EJB
    private HelperBeanK170 helperBeanK170;

    public String identify() {
        return "HelperBeanL170";
    }
}
