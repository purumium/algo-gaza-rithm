#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int hp) {
   
    int a = 5;
    int b = 3;
    int c = 1;
    
    int result = (hp / a) + ( (hp % a) / b ) + ( (hp % a) % b ) / c; 
        
    return result;
}