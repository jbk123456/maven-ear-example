package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL163 {

    @EJB
    private HelperBeanK163 helperBeanK163;

    public String identify() {
        return "HelperBeanL163";
    }
}
