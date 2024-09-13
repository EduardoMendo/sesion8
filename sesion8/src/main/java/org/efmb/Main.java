package org.efmb;

import models.Product;
import models.ProductManager;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        JOptionPane optionPane = new JOptionPane();
        Product product = new Product();
        JOptionPane.showMessageDialog(null, "Ingrese los datos del prodcuto:");
    }
}