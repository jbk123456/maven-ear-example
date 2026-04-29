package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL83 {

    @EJB
    private HelperBeanK83 helperBeanK83;

    public String identify() {
        return "HelperBeanL83";
    }
}
