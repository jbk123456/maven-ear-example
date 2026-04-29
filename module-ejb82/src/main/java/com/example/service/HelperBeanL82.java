package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL82 {

    @EJB
    private HelperBeanK82 helperBeanK82;

    public String identify() {
        return "HelperBeanL82";
    }
}
