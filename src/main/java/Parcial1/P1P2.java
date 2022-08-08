/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial1;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class P1P2 {
    
 
    private static String [][] comi= new String [7][11];
    private static final int Nombre=0;
    private static final int ENERO=1;
    private static final int FEBRERO=2;
    private static final int MARZO=3;
    private static final int ABRIL=4;
    private static final int TotalVentas=5;
    private static final int COMISION20=6;
    private static final int COMISION30=7;
    private static final int VentasComisiones=8;
    private static final int ISR=9;
    private static final int LIQUIDO=10;
            
    private static void IngresarVendedores (int fila){
        
        comi[fila][Nombre]=("Nombre");
        comi[fila][ENERO]=("ENE");
        comi[fila][FEBRERO]=("FEB");
        comi[fila][MARZO]=("MAR");
        comi[fila][ABRIL]=("ABRI");
        comi[fila][TotalVentas]=("TV");
        comi[fila][COMISION20]=("20%");
        comi[fila][COMISION30]=("30%");
        comi[fila][VentasComisiones]=("VC");
        comi[fila][ISR]=("ISR");
        comi[fila][LIQUIDO]=("LIQ");
        
        comi[fila +1][Nombre]=("Oscar");
        comi[fila +1][ENERO]=("560");
        comi[fila +1][FEBRERO]=("800");
        comi[fila +1][MARZO]=("680");
        comi[fila +1][ABRIL]=("490");
        
        comi[fila +2][Nombre]=("Victor");
        comi[fila +2][ENERO]=("450");
        comi[fila +2][FEBRERO]=("800");
        comi[fila +2][MARZO]=("1230");
        comi[fila +2][ABRIL]=("250");
        
        comi[fila +3][Nombre]=("Luis ");
        comi[fila +3][ENERO]=("756");
        comi[fila +3][FEBRERO]=("369");
        comi[fila +3][MARZO]=("432");
        comi[fila +3][ABRIL]=("490");
        
        comi[fila +4][Nombre]=("belen");
        comi[fila +4][ENERO]=("880");
        comi[fila +4][FEBRERO]=("1200");
        comi[fila +4][MARZO]=("680");
        comi[fila +4][ABRIL]=("490");
        
        comi[fila +5][Nombre]=("Frank");
        comi[fila +5][ENERO]=("560");
        comi[fila +5][FEBRERO]=("800");
        comi[fila +5][MARZO]=("680");
        comi[fila +5][ABRIL]=("300");
        
        comi[fila +6][Nombre]= ("TOTAL");
        
       
        
    }
    
    
     public static void DATOS(){
            
            int i=0;
             IngresarVendedores(i);
        }
    
    public static void sumasfilas (){
        
        for  (int i=1; i<6; i++){
            int suma=0;
            suma=Integer.valueOf(comi[i][1]);
            suma=suma+Integer.valueOf(comi[i][2]);
            suma=suma+Integer.valueOf(comi[i][3]);
            suma=suma+Integer.valueOf(comi[i][4]);
            
            comi[i][5]=suma+"";
            
        }
    }
    
    public static void Comision20(){
        for (int i=1; i<6; i++){
            int suma,comision=0;
            suma=Integer.valueOf(comi[i][5]);
            
            if (suma<2000){
                comision =(suma*20)/100;
                comi[i][6]=comision+"";
                comi[i][7]=0+"";
            }
            if (suma >2000){
                comision= (suma+35)/100;
                comi[i][7]=comision+"";
                comi[i][6]=0+"";
            }
        }
    }
    
    public static void Totalventa(){
        for (int i=1; i<6; i++){
            int suma=0;
            suma=Integer.valueOf(comi[i][5]);
            suma=suma+Integer.valueOf(comi[i][6]);
            suma=suma+Integer.valueOf(comi[i][7]);
            
            comi[i][8]=suma+"";
        }
    }
    
    public static void ISR5(){
        for (int i=1; i<6; i++){
              int suma,comision=0;
        suma= Integer.valueOf(comi[i][8]);
        
        comision= (suma*5)/100;
        comi[i][9]=comision+"";
        }
      
        
        
    }
    
    public static void liquido (){
        for (int i=1; i<6; i++){
            int liqui=0;
            liqui=Integer.valueOf(comi[i][8]);
            liqui=liqui-Integer.valueOf(comi[i][9]);
            
            comi[i][10]=liqui+"";
            
            
        }
    }
    
    public static void sumacolumnas(){
        for(int i=1; i<11; i++){
            int suma=0;
            suma=Integer.valueOf(comi[1][i]);
            suma=suma+Integer.valueOf(comi[2][i]);
            suma=suma+Integer.valueOf(comi[3][i]);
            suma=suma+Integer.valueOf(comi[4][i]);
            suma=suma+Integer.valueOf(comi[5][i]);
            
            comi[6][i]=suma+"";
            
            
        }
    }
    public static void ImprimeDecorado(){
        for (int x=0; x< comi.length;x++){
            System.out.print("");
            
            for(int y=0; y<comi[x].length; y++){
                System.out.print(comi[x][y]);
                if (y!= comi[x].length-1){
                    System.out.print("\t");
                }
                
            }
            System.out.println("");
        }
        
    }
    
    public static void numeroMayor(){
        String Nombre="";
        int max=0;
        int mayor1,mayor2,mayor3,mayor4,mayor5 =0;
        for(int i=1; i<5; i++){
            mayor1=Integer.valueOf(comi[1][10]);
            mayor2=Integer.valueOf(comi[2][10]);
            mayor3=Integer.valueOf(comi[3][10]);
            mayor4=Integer.valueOf(comi[4][10]);
            mayor5=Integer.valueOf(comi[5][10]);
            
            if(mayor1>max){
                max=mayor1;
            }else if (mayor2>max){
                max=mayor2;
            }else if (mayor3>max){
                max=mayor3;
            }else if (mayor4>max){
                max=mayor4;
            }else if (mayor5>max){
                max=mayor5;
            }
            
            if (mayor1==max){
                Nombre=(comi[1][0]);
            }else if (mayor2==max){
                Nombre=(comi[2][0]);
            }else if (mayor3==max){
                Nombre=(comi[3][0]);
            }else if (mayor4==max){
                Nombre=(comi[4][0]);
            }else if (mayor5==max){
                Nombre=(comi[5][0]);
            }
        }
        
        System.out.println("\n La persona que vendio mas es :"+Nombre+"y vendio:"+max);
   
        
    }
    
    public static void numeromenor (){
        String Nombre="";
        int min=0;
        int menor1,menor2,menor3,menor4,menor5 =0;
        
        for (int i=1; i<5; i++){
            
            menor1=Integer.valueOf(comi[1][10]);
            menor2=Integer.valueOf(comi[2][10]);
            menor3=Integer.valueOf(comi[3][10]);
            menor4=Integer.valueOf(comi[4][10]);
            menor5=Integer.valueOf(comi[5][10]);
            
            if(menor1<min){
                min=menor1;
            }else if (menor2<min){
               min=menor2;
            }else if (menor3<min){
                min=menor3;
            }else if (menor4<min){
                min=menor4;
            }else if (menor5<min){
                min=menor5;
            }
            
            
            if (menor1==min){
                Nombre=(comi[1][0]);
            }else if (menor2==min){
                Nombre=(comi[2][0]);
            }else if (menor3==min){
                Nombre=(comi[3][0]);
            }else if (menor4==min){
                Nombre=(comi[4][0]);
            }else if (menor5==min){
                Nombre=(comi[5][0]);
            }

        }
        
        System.out.println("\n La persona que vendio menos es :"+Nombre+"y vendio:"+min);
        
    }
    public static void Menu(){
       Scanner dat= new Scanner(System.in);
       int opcion=0;
       System.out.println("Selecionar una opcion: \n"
       +"1- Despliega la matriz \n"
       +"2- La persona que vendio mas \n"
       +"3- La persona que vendio menos ");
       
       System.out.println("\n Ingrese el numero de la fila");
       opcion=dat.nextInt();
       
      
       switch (opcion){
           case 1:
               DATOS ();
               sumasfilas ();
               Comision20();
               Totalventa();
               ISR5();
               liquido ();
               sumacolumnas ();
               ImprimeDecorado();
               
               break;
               
           case 2:
               DATOS();
               sumasfilas ();
               Comision20();
               Totalventa();
               ISR5();
               liquido();
               numeroMayor ();
               
               break;
               
           case 3:
               DATOS();
               sumasfilas();
               Comision20();
               Totalventa();
               ISR5();
               liquido();
               numeromenor();
               break;
               
               
       }
        
       
       
    }
    
}


