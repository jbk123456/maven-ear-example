package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL168 {

    @EJB
    private HelperBeanK168 helperBeanK168;

    public String identify() {
        return "HelperBeanL168";
    }
}
