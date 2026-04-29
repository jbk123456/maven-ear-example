package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL30 {

    @EJB
    private HelperBeanK30 helperBeanK30;

    public String identify() {
        return "HelperBeanL30";
    }
}
