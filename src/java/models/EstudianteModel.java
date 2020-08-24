/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entity.Estudiante;

/**
 *
 * @author J Cardoza
 */
public class EstudianteModel {

    public Estudiante Consultar() {
        Estudiante estudiante = new Estudiante(1, "Isac", "Ramirez", "Ing en Sistemas y computacion", 25);
        return estudiante;
        

    }


    public String guardarEstudiante(String estudiante) {
        return estudiante;
    }

    public String updateEstudiante(String estudiante) {
        return estudiante;

    }

    public String deleteEstudiante(String estudiante) {
        return estudiante;
    }

}
