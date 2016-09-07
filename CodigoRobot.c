//Universidad Del Valle de Guatemala
//Algoritmos y Estructuras de Datos
//Segundo Ciclo 2016
//                             PROYECTO 1                                  
//Integrantes:  Diego Soler
//              Fredy Espana
//              Rodolfo Cacacho
//              Rene Olivet



#include "simpletools.h"                      // Include simpletools header
#include "abdrive.h"                          // Include abdrive header
#include "ping.h"                             // Include ping header

int turn; //Variable que indica a que direccion gira el robot
int num;  //Variable que guarda los numeros random
int anterior; //Llevar cuenta del giro anterior

//Estructura del stack
struct stack{
    int stk[100];
    int top;
  };

typedef struct stack ST;
ST s;


void push(int);  //Metodos del Stack
int pop(void);

int main()                                    // MAIN
{
   
   //Llamada a funcion recursiva
   recursive();   

 
 }


//Funcion recursiva
void recursive(){
  

  while(1){
 
  //Mientras haya obstaculo lejos, siga avanzando   
  while(ping_cm(8)>= 10){
       pause(5);
       num= rand() % 3;
       push(num);
       drive_speed(60,60);
       
       
       //Si hay camino enfrente y a los lados
       if ((LIR()==1 && RIR()==1)){
     
               //Si el giro anterior fue a la izquierda, gira a la derecha
               if (anterior == 1){
               pause(600);
               turnRight();
               drive_goto(40,40);
               pause(500);
               recursive(); //Llamada recursiva
               }
               
               //Si el giro anterior fue a la derecha, gira a la izquierda

                if (anterior == 2){
                pause(600);
                turnLeft();
                drive_goto(40,40);
                pause(500); 
                recursive();
               } 
                  
           }            
       
     }       
            
  
    
    //Si hay obstaculo a la derecha, gire a la izquierda
    if (RIR() == 0){
      
        
       turnLeft();
       recursive(); 
       
            
     }
     
     //Si hay obstaculo a la izquierda, gire a la derecha

     if (LIR() == 0) {
       turnRight();
       recursive(); 
      }
      
      
      //Si hay obstaculo enfrente y a los lados, regrese
      if(ping_cm(8)<10 && (RIR()==0 && LIR()==0)){
       
       turnBack();
       recursive();
        
      } 
      
      
      
      //Si no, solo hay obstaculo enfrente y gire aleatoriamente a la izquierda o a la derecha
      else{
       
       turn=pop();
       anterior=turn;
       drive_speed(0,0);
  
    if (turn == 1){
       turnLeft();
       recursive(); 
     }
     if (turn == 2){
       turnRight();
       recursive(); 
      } 
        
      }         
      
       
    
        
  }
  
 
  
 }  
            

//Infrarrojo derecho    
int RIR(){
   freqout(1, 1, 35000);
   return input(2);
} 

//Infrarrojo izquierdo
int LIR(){
   freqout(11, 1, 35000);
   return input(10);
}   


//Verifica la interseccion
int intersection(){

if(LIR()==1 && RIR()==1){
 return 1;  //Regrese 1
} 

else{
 return 0; 
} 
 
}
 
 
//Giro a la derecha  
void turnRight(){ 

  pause(250);
  drive_speed(0,0);
  drive_goto(28,-25); //Gira a la derecha
  pause(500);
  drive_goto(5,5);
  anterior=2;
  return;  

}


//Giro a la izquierda
void turnLeft(){

  pause(250);
  drive_speed(0,0);
  drive_goto(-28,25); //Gira a la izquierda 
  pause(500);
  drive_goto(5,5);
  anterior=1;
  return;  

}

//Giro hacia atras
void turnBack(){
  
  pause(250);
  drive_speed(0,0);
  drive_goto(-25,25); //De retache
  drive_goto(-25,25); 
  pause(500);
  drive_goto(5,5);
  return; 
  
}

//Push al stack
void push(int a){
    s.top = s.top+1;
    s.stk[s.top]= a;
  }

//Pop al stack  
int pop(){
    int a = s.stk[s.top];
    s.top = s.top - 1;
    return a;
  }
  