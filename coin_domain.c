#include <stdio.h>

void greedy(int coins[], int l, int a) {
    for (int i = 0; i < l; i++) {
        while (a >= coins[i]) {
            printf("%d ", coins[i]);
            a -= coins[i];
        }
    }
}

int main() {
    int coins[] = {25, 10, 5, 1};
    int l = sizeof(coins) / sizeof(coins[0]);
    int a;

    printf("Enter the amount: ");
    scanf("%d", &a);

    greedy(coins, l, a);
    return 0;
}
