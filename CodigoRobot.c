/*
 * Integrantes:
 * Rodolfo Cacacho
 * Rene Olivet
 * Diego Soler
 * Fredy España
 */


#include "simpletools.h"                      // Include simpletools header
#include "abdrive.h"                          // Include abdrive header
#include "ping.h"                             // Include ping header

int turn; //Variable para indicar al robot que decision tomar
int num;
//Estructura del stack
struct stack{
    int stk[100];
    int top;
  };

typedef struct stack ST;
ST s;

void push(int);
int pop (void);

int main()                                    // main function
{
  while(1){
  drive_speed(50,50);
 
 
  recursive(); 
  
    }   

 
 }

void recursive(){
  
  num= rand() % 3;
  while(v_adelante()<5){
    
    push(num);
    
    turn=pop();
  
    if (turn == 1){
       turnLeft();
     }
     if (turn == 2){
       turnRight();
      }
      
 
  }  
}             
    
int v_adelante(){
  return ping_cm(8);
}

void turnRight(){ 
  drive_speed(0,0);
  drive_goto(26,-25); //gira a la izquierda 
  pause(500);
  drive_goto(5,5);
  return;
}

void turnLeft(){
 
  drive_speed(0,0);
  drive_goto(-26,25); //gira a la izquierda 
  pause(500);
  drive_goto(5,5);
  return;
}

void turnBack(){

  drive_goto(52,-52); //gira a la izquierda 
  pause(500);
   drive_goto(5,5);
 
  return;
}


void push(int a){
    s.top = s.top+1;
    s.stk[s.top]= a;
  }
  
int pop(){
    int a = s.stk[s.top];
    s.top = s.top - 1;
    return a;
  }