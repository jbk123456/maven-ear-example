package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM112 {

    @EJB
    private HelperBeanL112 helperBeanL112;

    public String identify() {
        return "HelperBeanM112";
    }
}
