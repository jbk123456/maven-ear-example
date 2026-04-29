package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL51 {

    @EJB
    private HelperBeanK51 helperBeanK51;

    public String identify() {
        return "HelperBeanL51";
    }
}
