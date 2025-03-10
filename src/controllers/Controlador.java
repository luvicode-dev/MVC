
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Modelo;
import views.Vista;

public class Controlador implements ActionListener {
    
    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btn_sumar.addActionListener(this);
        this.view.btn_restar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        model.setNumero_uno(Integer.parseInt(view.cajaN1.getText()));
        model.setNumero_dos(Integer.parseInt(view.cajaN1.getText()));

        if (e.getSource() == view.btn_sumar) {
            model.sumar();
            view.cajaRes.setText(String.valueOf(model.getResultado()));

        } else if (e.getSource() == view.btn_restar) {
            model.restar();
            view.cajaRes.setText(String.valueOf(model.getResultado()));

        }


    
}}
