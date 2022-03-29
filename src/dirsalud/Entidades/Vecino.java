/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dirsalud.Entidades;

import java.util.*;

/**
 *
 * @author Nacho
 */
public class Vecino {
    private String nombre;
    private String apellido;
    private Integer dni;
    private Date fechanac;
    private String domcalle;
    private Integer domnum;
    private String barrio;
    private String manzana;
    private Integer casanum;
    private boolean obrasoc;
    private String obrasocnom;

    public Vecino() {
    }

    public Vecino(String nombre, String apellido, Integer dni, Date fechanac, String domcalle, Integer domnum, String barrio, String manzana, Integer casanum, boolean obrasoc, String obrasocnom) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechanac = fechanac;
        this.domcalle = domcalle;
        this.domnum = domnum;
        this.barrio = barrio;
        this.manzana = manzana;
        this.casanum = casanum;
        this.obrasoc = obrasoc;
        this.obrasocnom = obrasocnom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public String getDomcalle() {
        return domcalle;
    }

    public void setDomcalle(String domcalle) {
        this.domcalle = domcalle;
    }

    public Integer getDomnum() {
        return domnum;
    }

    public void setDomnum(Integer domnum) {
        this.domnum = domnum;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public Integer getCasanum() {
        return casanum;
    }

    public void setCasanum(Integer casanum) {
        this.casanum = casanum;
    }

    public boolean isObrasoc() {
        return obrasoc;
    }

    public void setObrasoc(boolean obrasoc) {
        this.obrasoc = obrasoc;
    }

    public String getObrasocnom() {
        return obrasocnom;
    }

    public void setObrasocnom(String obrasocnom) {
        this.obrasocnom = obrasocnom;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vecino other = (Vecino) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vecino{" + "nombre=" + nombre + ", apellido=" + apellido + ",*/dni=" + dni + ", */fechanac=" + fechanac + ", */domcalle=" + domcalle + ", */domnum=" + domnum + ", */barrio=" + barrio + ", */manzana=" + manzana + ", */casanum=" + casanum + ", */obrasoc=" + obrasoc + ", */obrasocnom=" + obrasocnom + '}';
    }
    
    
    
            
}
