/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Gafufos.Utils;

import java.util.ResourceBundle;

/**
 *
 * @author MAURICIO
 */
public class BundleUtils {
    public static String getBundleProperty(String property){
        return ResourceBundle.getBundle("com.Gafufos.Utils/Bundle").getString(property);
    }
}
