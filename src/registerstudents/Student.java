package registerstudents;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author roroc
 */
public class Student {
    private String name;
    private String surname;
    private int edad;
    private String Curso;
    private String dni;

    public Student(String name, String surname, int edad, String Curso, String dni) {
        this.name = name;
        this.surname = surname;
        this.edad = edad;
        this.Curso = Curso;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return name+"," + surname + "," + edad + ","+ Curso+","+ dni;
    }
    
}
