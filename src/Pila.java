import java.util.*;
import java.util.Scanner;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;
public class Pila 
{
public int tope,MAX;
public int topeC,MAXC;
public int Pila[];
public int PilaB[];
public int PilaC[];

public Pila(int M)
{////CONSTRUCTOR
    
    M=200;
    MAX=M;
    Pila=new int[MAX];
    tope=0;
   PilaB=new int[MAX];
   
}////CONSTRUCTOR
///////////////////////////////////////////////////////////////
  public int llenado()
  {////////////LLAVE METODO LLENADO
      int x;
      Scanner keyboard=new Scanner(System.in);
      System.out.println("DE QUE TAMAÑO SERA TU PILA");
      x=keyboard.nextInt();
      Pila Stack=new Pila(x);
      //if(tope<x)
      //{/////////////LLAVE IF LLENADO
      Scanner read=new Scanner(System.in);
      System.out.println("------------------------------");
      System.out.println("CUANTOS DATOS QUIERE INGRESAR");
      System.out.println("------------------------------");
      int datosingresar=read.nextInt();
     if(datosingresar>x)
             {
                System.out.println ("LOS DATOS QUE INGRESO NO CONCUERDAN");
             }
      else {//////LLAVE ELSE
              {///////LLAVE
      int aleatorio;
      int RESULTADO;
      
      for(int i=0;i<datosingresar;i++)  
      {//////LLAVE FOR LLENADO
         
          aleatorio=(int)(Math.random()*400-200);
          Pila[tope]=aleatorio;
          
          RESULTADO=Pila[tope];
          tope++;
          System.out.println(". . . . . . . . . . . . .");
          System.out.println("DATOS PILA A");
          System.out.println(". . . . . . . . . . . . .");
         
          
      }////LLAVE FOR LLENADO
      }/////////LLAVE 
     
      
     }/////LLAVEA ELSE
    return 0;
  }////////LLAVE METODO LLENADO                                     
  ////////////////////////////////////////////////////////////////////////////////

  
  
  //////////////////////////////////////////////////////////////////////////////
  public void Mostrar()
{/////////METODO MOSTRAR
    if(!Vacia())
    {///////IF MOSTRAR
        for(int i=(tope-1);i>=0;i--)
        {//////FOR MOSTRAR
            int A;
            A=(Pila[i]);
            System.out.println(A);
            
        }///////FOR MOSTRAR
    }////////IF MOSTRAR
    else 
    {//////ELSE MOSTRAR
        System.out.println(" LA PILA ESTA VACIA");
    }//////ELSE MOSTRAR
}/////////METODO MOSTRAR
 ///////////////////////////////////////////////////////////////////////////////
    
  public boolean Vacia()
  {//////VACIO
     if(Pila==null)
     {
         return true;
     }
     else 
     {
         return false;
     }
  }//////VACIA
/////////////////////////////////////////////////////////////////////
  
  public int LlenadoB()
  
  {
      
      {////////////LLAVE METODO LLENADO B
      int y;
      Scanner keyboard=new Scanner(System.in);
      System.out.println("DE QUE TAMAÑO SERA TU PILA");
      y=keyboard.nextInt();
      int Arraym[]=new int[y];
      Pila StackB=new Pila(y);
      //if(tope<x)
      //{/////////////LLAVE IF LLENADO
      Scanner read=new Scanner(System.in);
      System.out.println("------------------------------");
      System.out.println("CUANTOS DATOS QUIERE INGRESAR EN SU PILA B");
      System.out.println("------------------------------");
      
      int datosingresarb=read.nextInt();
      int ArrayN[]= new int[datosingresarb];
     if(datosingresarb>y)
             {
                System.out.println ("LOS DATOS QUE INGRESO EN LA PILA BNO CONCUERDAN");
             }
      else {
              {////////LLAVE
    
          
      int aleatorioB;
      int RESULTADOB;
      for(int i=0;i<datosingresarb;i++)  
      {//////LLAVE FOR LLENADO
         
          aleatorioB=(int)(Math.random()*400-200);
          PilaB[tope]=aleatorioB;
          
          RESULTADOB=PilaB[tope];
          tope++;
          
          System.out.println("* * * * * * * * * * * * * * * * * ");
          System.out.println("SE HAN AÑADIDO DATOS A LA PILA B");
          System.out.println("* * * * * * * * * * * * * * * * * "); 
            
          
      }/////////LLAVE FOR
      //}/////LLAVE IF LLENADO
      
     }////LLAVE
  }////////LLAVE ELSE                                     
 
    return 0;
    
      }
  }//////LLAVE LLENADO
  
 //////////////////////////////////////////////////////////////////////////////////////////////////////// 
  
    public void MostrarB()
    
    {///////MOSTRAR B
        if(!VaciaB())
    {///////IF MOSTRAR
        for(int i=(tope-1);i>=0;i--)
        {//////FOR MOSTRAR
            int B;
            B=(PilaB[i]);
            
               System.out.println(B);
               if(B>0)
               {
                   
                   
               }
            
        }///////FOR MOSTRAR
    }////////IF MOSTRAR
    else 
    {//////ELSE MOSTRAR
        System.out.println(" LA PILA B ESTA VACIA");
    }//////ELSE MOSTRAR
    }///////MOSTRAR B
    
    public boolean VaciaB()
  {//////VACIO B
     if(PilaB==null)
     {
         return true;
     }
     else 
     {
         return false;
     }
  }//////VACIA B
    
    
    public void VaciarB()
    
    {
        if(tope>0)
        {
            tope--;
            System.out.println("DATO ELIMINADO DE LA PILA B");
        }
        else
        {
            System.out.println("NO HAY QUE ELIMINAR");
        }
    }
    
   public void VaciarA()
   {
       if(tope>0)
       {
           tope--;
           System.out.println("DATO ELIMINADO DE LA PILA A");
       }
       else 
       {
           System.out.println("NO HAY QUE ELIMINAR");
       }
       
   }
    
 
   

//   void QuickSort(int first,int last)
   
//   {
//       int vector=0;
//       int i=first,j=last;
//       int pivote=vector[(first+last)/2];
//       int aux;
//       do
//       {
//           while(vector[i]<pivote)
//               i++;
//           while(vector[j]>pivote)
//               j++;
//           if(i<=j)
//           {
//               aux=vector[j];
//               vector[j]=vector[i];
//               vector[i]=aux;
//               i++;
//               j--;
//           }
//       }
//       while(i<=j);
//       if(first<j)
//       
//       {
//         QuickSort(vector,first,j);  
//       }
//       if(last>i)
//       
//       {
//           QuickSort(vector,i,last);
//       }
//   
//   }
    
    
    public void METODO()
    {  
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args)
    {
       int key=0,opciones;
       Scanner keyboard=new Scanner(System.in);
       System.out.println("*PILA*");
       Pila Stack=new Pila(key);
       Pila StackB=new Pila(key);
       do
       {///////////////DO WHILE PRIMER MENHU
            System.out.println("------------------------------------");
            System.out.println("1.-Pila A");
            System.out.println("2.-Pila B");
            System.out.println("3.-PILA C");
            System.out.println("4.-SALIR");
            System.out.println("------------------------------------");
            opciones=keyboard.nextInt();
            switch(opciones)
            {///////////OPCIONES
                case 1:
                {///PILA A
                    int MenuA;
                    System.out.println("PILA A");
                    System.out.println("¿QUE OPCION QUIERES?");
                    System.out.println("1.-LLENADO DE DATOS");
                    System.out.println("2.-MOSTRAR DATOS");
                    System.out.println("3.-VACIA DATOS");
                    System.out.println("4.-SALIR");
                    MenuA=keyboard.nextInt();
                  System.out.println("____________________________________________________-");
                    switch(MenuA)
                    {///MENU A
//___________________CASE 1 MENU A___________________________________//                      
                       
                        case 1:
                            
                        //LLENADO A
                            System.out.println("__________________PILA A__________________");
                            Stack.llenado();
                            System.out.println("__________________PILA A___________________");
                        //LLENADO A
                        break;
//______________________CASE 2  MENU A___________________________________//
                        
                        case 2:
                            
                        //MOSTRAR A
                            System.out.println("__________________DATOS PILA A___________________");
                            Stack.Mostrar();
                            System.out.println("__________________DATOS PILA A___________________");
                        ///MOSTRAR A
                        break;
                        
//______________________CASE 3 MENU A_________________________________//
                        case 3:
                        ////VACIAR DATOS A
                        Stack.VaciarA();
                        ////VACIAR DATOS A
                        break;
                        
                    }///MENU A
                    
                   
                }////PILA A
                break;
//////////////////////////////////////////////////////////////////////
                case 2:
                {////////PILA B
                    int MenuB;
                    System.out.println("PILA B");
                    System.out.println("¿QUE OPCION QUIERES?");
                    System.out.println("1.-LLENADO DE DATOS");
                    System.out.println("2.-MOSTRAR DATOS");
                    
                    System.out.println("3.-VACIA DATOS");
                    System.out.println("4.-SALIR");
                    MenuB=keyboard.nextInt();
                  System.out.println("___________________________________________");
                    switch(MenuB)
                    
                    {/////MENU B
//___________________CASE 1 MENU B_______________________________//
                        case 1:
                        {//////LLENADO B
                            System.out.println("_________________________PILA B_____________________________");
                              StackB.LlenadoB();
                            System.out.println("_________________________PILA B______________________________");
                            
                        }///////LLENADO 
                        break;
//___________________CASE 2 MENU B_______________________________//
                        case 2:
                        {///MOSTRAR B
                            System.out.println("_______________DATOS PILA B___________________________________");
                           StackB.MostrarB();
                            System.out.println("_______________DATOS PILA B___________________________________");
                        }///MOSTRAR
                        break;
//__________________CASE 3 MENU B_______________________________________//
                        case 3:
                        {////Vaciar
                            StackB.VaciarB();
                        }////Vaciar
                        break;
                    }/////MENU B
                  
                 
                }////////PILA B
                break;
//////////////////////////////////////////////////////////////////////////////////////////////
                case 3:
                {///////PILA C
                    int MenuC;
                    System.out.println("PILA C");
                    System.out.println("¿QUE OPCION QUIERES?");
                    System.out.println("1.-LLENAR LA PILA");             
                    System.out.println("2.-ORDENAR DATOS");
                    
                    System.out.println("3.-SALIR");
                    MenuC=keyboard.nextInt();
                    switch(MenuC)
                    {/////MENU C
                        case 1:
                        {///////LLENAR LA PILA C
                            
                        Stack.Mostrar();
                        StackB.MostrarB();
                        }///////LLENAR LA PILA C
                       break;
                        case 2:
                        {/////ORDENAR DATOS PILA C
                        
                        }//////ORDENAR DATOS PILA C
                        break;
                        
                    }////MENU C
                }///////PILA C
////////////////////////////////////////////////////////////////////
            }//////OPCIONES
       }/////////////////DO WHILE PRIMERO MENU
       while(opciones!=4);
    }///////////CLASE MAIN

   //////////////////////////////////////////////////////////////////////////////

    
}////////CLASS PILA


//////          int[]orden={RESULTADOB};
//          int intercambio=0;
//         int aux = 0,x,z;
//         for(x=0;x<orden.length-1;i++)
//         
//         {
//             for(z=0;z<orden.length-x-1;z++)
//             {
//                 if(orden[z+1]<orden[z])
//                 {
//                     aux=orden[z+1];
//                     orden[z+1]=orden[z];
//                     orden[z]=aux;
//                    
//                 }
//             }
//         }
//         System.out.println();
          