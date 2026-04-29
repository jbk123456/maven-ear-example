package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL41 {

    @EJB
    private HelperBeanK41 helperBeanK41;

    public String identify() {
        return "HelperBeanL41";
    }
}
