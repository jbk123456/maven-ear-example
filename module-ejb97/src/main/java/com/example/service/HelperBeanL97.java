package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL97 {

    @EJB
    private HelperBeanK97 helperBeanK97;

    public String identify() {
        return "HelperBeanL97";
    }
}
