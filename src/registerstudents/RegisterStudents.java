/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registerstudents;

import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import static registerstudents.LibrayFilesDirectories.*;

/**
 *
 * @author roroc
 */
public class RegisterStudents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        makeRegister();
        
        ArrayList<String> registerOfStudents= readRegisterStudents(false);
        
        Scanner escaner = new Scanner(System.in);
        System.out.println("Welcome to the register of students");
        //File registro = LibrayFilesDirectories.makeRegister();
        int opcion;
        boolean exitProgram = false;
//        boolean correct = false;
        initStudents(registerOfStudents);
        do {
            escaner = new Scanner(System.in);

            System.out.println("¿What option do you wanna choose?");
            System.out.println("1)Add a new student");
            System.out.println("2)Show students");
            System.out.println("3)Delete student");
            System.out.println("4)Search student by DNI");
            System.out.println("5)Exit program");
       try {
            opcion = escaner.nextInt();
            switch (opcion) {
                   case 1:
                        writeStudent(register);
                        break;
                    case 2:
                         readRegisterStudents(true);
                        break;
                    case 3:
                        deleteStudent(register, registerOfStudents);
                        break;
                    case 4:
                        findStudent(registerOfStudents);
                        break;
                case 5:
                    exitProgram = true;
                    break;
                    default:
                        System.out.println("Choose valid option");

                }
            } catch (Exception e) {
                System.err.println("Introduce un número");
            }
        } while (!exitProgram);
//
    }
}
