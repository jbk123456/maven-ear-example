package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL107 {

    @EJB
    private HelperBeanK107 helperBeanK107;

    public String identify() {
        return "HelperBeanL107";
    }
}
