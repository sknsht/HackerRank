#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int i,j,k,c;
    float l;
    char s[81];
    scanf("%s",s);
    l = sqrt(strlen(s));
    if(l-(int)l == 0)
     k=(int)l;
    else 
     k=(int)l+1; 
    char t[100][100];
    if(strlen(s)!=1)
    {
        for(i=0;i<k;i++) 
    {  c=0;
      for(j=i;j<strlen(s);j++)
      {
          t[i][c]=s[j]; 
          j=j+k-1;
          c++;
      } 
      printf("%s",t[i]);
      printf(" ");
    } 
    } 
    else 
    printf("%s",s);
    return 0;
} 


