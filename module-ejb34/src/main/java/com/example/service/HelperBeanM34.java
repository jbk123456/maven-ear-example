package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM34 {

    @EJB
    private HelperBeanL34 helperBeanL34;

    public String identify() {
        return "HelperBeanM34";
    }
}
