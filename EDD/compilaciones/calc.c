#include <stdio.h>

int suma (int op1, int op2){
    return op1+op2;

}

int resto (int op1, int op2){
    return op1-op2;

}

int multiplica (int op1, int op2){
    return op1*op2;

}

int divide (int op1, int op2){
    return op1/op2;

}

int main(){
int a=10;
int b=5;
printf("La suma es %d\n",suma(a,b));
printf("La resto es %d\n",resto(a,b));
printf("La multipila es %d\n",multiplica(a,b));
printf("La division es %d\n",divide(a,b));
}
