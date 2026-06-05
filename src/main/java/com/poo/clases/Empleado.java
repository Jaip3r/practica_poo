package com.poo.clases;

import com.poo.enums.Departamento;

public class Empleado {
    
    private String DNI;
    private String nombre;
    private int edad;
    private Departamento departamento;
    private boolean teletrabajo;
    private Empresa empresa;

    private static double salarioBase = 1000;

    public Empleado(String dNI, String nombre, int edad, Departamento departamento, boolean teletrabajo,
            Empresa empresa) {

        try {
            Validador.validarDNI(dNI);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }

        if (empresa == null) {
            throw new IllegalArgumentException("La empresa es obligatoria");
        }

        DNI = dNI;
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.teletrabajo = teletrabajo;
        this.empresa = empresa;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public boolean isTeletrabajo() {
        return teletrabajo;
    }

    public void setTeletrabajo(boolean teletrabajo) {
        this.teletrabajo = teletrabajo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public static double getSalarioBase() {
        return salarioBase;
    }

    public static void setSalarioBase(double salarioBase) {
        Empleado.salarioBase = salarioBase;
    }

    public double calcularSueldo() {
        double salario = Empleado.salarioBase;
        if (this.edad > 30) {
            salario += 200;
        }

        salario += this.departamento.getPlus();
        return salario;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        if (DNI == null) {
            if (other.DNI != null)
                return false;
        } else if (!DNI.equals(other.DNI))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Empleado [DNI=" + DNI + ", nombre=" + nombre + ", edad=" + edad + ", departamento=" + departamento
                + ", teletrabajo=" + teletrabajo + ", empresa=" + empresa + "]";
    }

}