#include <stdio.h>

int main(void) {
	// your code goes here
	int tc;
	scanf("%d",&tc);
	while(tc--){
	    int a;
        scanf("%d", &a);
        if (a>=30)
        {
            printf("Yes \n");
        }
        else
        printf("No \n");
	}
	return 0;
}

