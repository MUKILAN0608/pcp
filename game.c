#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void main() {
    char name1[20], name2[20];
    int nums[5];
    int player1[3];
    int player2[3];
    int s1 = 0, s2 = 0;
    int used[11] = {0};
    int a, player_choice;

    srand(time(NULL));

    for (int i = 0; i < 5; ) {
        a = (rand() % 10) + 1;
        if (!used[a]) {
            nums[i++] = a;
            used[a] = 1;
        }
    }

    printf("Generated numbers: ");
    for (int i = 0; i < 5; i++) {
        printf("%d ", nums[i]);
    }
    printf("\n");

    for(int v = 0; v < 3; v++) {
        printf("Player 1, enter your choice: ");
        scanf("%d", &player_choice);
        
        int found = 0;
        for(int n = 0; n < 5; n++) {
            if(nums[n] == player_choice) {
                s1++;
                printf("IT IS CORRECT\n");
                found = 1;
                break;
            }
        }
        if(!found) {
            printf("IT IS WRONG\n");
        }
    }
}
