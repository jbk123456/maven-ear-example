package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM80 {

    @EJB
    private HelperBeanL80 helperBeanL80;

    public String identify() {
        return "HelperBeanM80";
    }
}
