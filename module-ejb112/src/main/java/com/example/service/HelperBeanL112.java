package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL112 {

    @EJB
    private HelperBeanK112 helperBeanK112;

    public String identify() {
        return "HelperBeanL112";
    }
}
