package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL58 {

    @EJB
    private HelperBeanK58 helperBeanK58;

    public String identify() {
        return "HelperBeanL58";
    }
}
