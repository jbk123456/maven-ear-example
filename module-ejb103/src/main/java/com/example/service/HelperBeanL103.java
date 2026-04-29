package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL103 {

    @EJB
    private HelperBeanK103 helperBeanK103;

    public String identify() {
        return "HelperBeanL103";
    }
}
