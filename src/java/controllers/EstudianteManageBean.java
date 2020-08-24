/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entity.Estudiante;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import models.EstudianteModel;

/**
 *
 * @author J Cardoza
 */
@Named(value = "estudianteManageBean")
@Dependent
public class EstudianteManageBean {

    /**
     * Creates a new instance of EstudianteManageBean
     */
    private EstudianteModel estudianteModel = new EstudianteModel();

    public EstudianteManageBean() {
    }

    public Estudiante getPersonaModel() {
        return estudianteModel.Consultar();
    }

    public void guardarEstudiante(Estudiante estudiante) {

    }

    public void updateEstudiante(Estudiante estudiante) {

    }

    public void deleteEstudiante(Estudiante estudiante) {

    }
}
