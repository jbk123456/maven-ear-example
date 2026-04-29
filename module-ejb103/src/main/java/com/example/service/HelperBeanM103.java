package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM103 {

    @EJB
    private HelperBeanL103 helperBeanL103;

    public String identify() {
        return "HelperBeanM103";
    }
}
