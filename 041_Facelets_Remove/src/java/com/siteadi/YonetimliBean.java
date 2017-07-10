/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siteadi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author husey
 */
@ManagedBean
@RequestScoped
public class YonetimliBean {

    /**
     * Creates a new instance of YonetimliBean
     */
    private String adiSoyadi,buttonYazisi = "sayfa2'ye gidecek";
    public YonetimliBean() {
    }

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getButtonYazisi() {
        return buttonYazisi;
    }

    public void setButtonYazisi(String buttonYazisi) {
        this.buttonYazisi = buttonYazisi;
    }
    
    public String yonlenecekSayfayaGit(){
        return "sayfa2";
    }
    
}
