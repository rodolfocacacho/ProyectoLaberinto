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
int pop(void);

int main()                                    // main function
{
   
   recursive();   

 
 }

void recursive(){
  while(1){
    
  while(ping_cm(8)>= 10){
       pause(5);
       num= rand() % 3;
       push(num);
       drive_speed(60,60);
   
    
  } 
   
    

    if (RIR() == 0){
      
        
       turnLeft();
       recursive(); 
       
            
     }
     
     if (LIR() == 0) {
       turnRight();
       recursive(); 
      }
 
      
         
      
      
      
      else{
       
       turn=pop();
  
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
            
    
int RIR(){
   freqout(1, 1, 27000);
   return input(2);
} 

int LIR(){
   freqout(11, 1, 27000);
   return input(10);
}   


  
void turnRight(){ 

  pause(250);
  drive_speed(0,0);
  drive_goto(28,-25); //gira a la izquierda 
  pause(500);
  drive_goto(5,5);
  return;  

}

void turnLeft(){

  pause(250);
  drive_speed(0,0);
  drive_goto(-28,25); //gira a la izquierda 
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