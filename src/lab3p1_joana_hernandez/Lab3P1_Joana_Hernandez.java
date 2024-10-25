/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_joana_hernandez;
import java.util.Scanner;
/**
 *
 * @author joana
 */
public class Lab3P1_Joana_Hernandez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int respuesta;
        
        do {
       
        System.out.println("------menu-----");
        System.out.println("1) reloj de arena");
        System.out.println("2) calculadora de combinaciones");
        System.out.println("3) Sandwich");
        System.out.println("4) Salir");
        System.out.print("Que desea hacer? ");
        respuesta = scanner.nextInt();
        
             System.out.println("");
             switch (respuesta) {
                case 1: 
                     System.out.print("Ingrese un numero mayor o igual a 7: ");
                     int a = scanner.nextInt();
                     
                      if (a>= 7) {
                        for (int i = 0; i < a; i++) {
                            for (int j = 0; j < i; j++) {
                               System.out.print(" ");
                            }
                            for (int j = 0; j < (a - i)*2 - 1; j++) {
                                    if (i == a - 1) {
                                     System.out.print(" ");
                                    } else {
                                         System.out.print("*");
                                    }
                            }
                              System.out.println();
                       }
                        for (int i = 1; i < a; i++) {
                            for (int j = 0; j < a - i - 1; j++) {
                               System.out.print(" ");
                        }
                            for (int j = 0; j < (i * 2) + 1; j++) {
                               System.out.print("*");
                         }
                              System.out.println();
                        }
                    } else {
                        System.out.println("Numero invalido");
                    }  
                    break;
                
                 case 2: 
                     System.out.print("Ingrese un valor para n: ");
                     int n = scanner.nextInt();
                     System.out.print("Ingrese un valor para r: ");
                     int r = scanner.nextInt();
                        
                        if(r<=n) {
                            
                            int c; // es respuesta final
                            int x; //x es factorial de: (n-r)
                            int y; // y es la division de factorial n entre la multiplicacion de fac de n y fac de r
                            int fac_x = 1;
                            int fac_n = 1;
                            int fac_r = 1;
                            x = n - r;
                            for (int i = 2; i<= n; i++) {
                                fac_n*=i;
                            }
                            for (int j = 2; j <= r; j++) {
                                fac_r*=j;
                            }
                            for (int k = 2; k <= x; k++) {
                                fac_x*=k;
                            }
                            
                            y = fac_x * fac_r;
                            c = fac_n / y;
                            
                            System.out.print("Combinaciones posibles entre " + n + " y " + r + " : " + c + " ");
                            
                        } else {
                            System.out.println("r no puede ser mayor que n");
                        }
                    break;
               
                case 3 :
                    System.out.print("Ingrese un limite impar mayor o igual a 7: ");
                    int limite = scanner.nextInt();
                   
                        if (limite>= 7 && limite % 2 != 0) {
                            for (int i = 0; i < limite; i++) {
                             for (int j = 0; j < limite; j++) {
                                 if (j == i) {
                                   System.out.print("  ");
                                 } else {
                                     System.out.print(" * ");
                                }
                             }
                                 System.out.println();
                          }
                            
                        } else {
                            System.out.print("Numero invalido");
                        }
                    
                    break;
                    
                default: 
                    System.out.print("El numero debe ser uno de las opciones");
                    break;
        }
             System.out.println();
        } while (respuesta != 4);
       // aqui termina
    } 
}