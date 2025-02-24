#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}

int cal(int nums[], int k, int size) {
    int sum = 0;
    qsort(nums, size, sizeof(int), compare);
    
    for (int i = 0; i < size && k > 0; i++) {
        if (nums[i] < 0) {
            nums[i] = -nums[i];
            k--;
        }
    }

    if (k % 2 == 1) {
        qsort(nums, size, sizeof(int), compare);
        nums[0] = -nums[0];
    }

    for (int i = 0; i < size; i++) {
        sum += nums[i];
    }
    
    return sum;
}

int main() {
    int n;
    printf("ENTER THE NUMBER OF INPUT:");
    scanf("%d", &n);
    
    int nums[n];
    printf("ENTER THE INPUT IN ARRAY:");
    for (int i = 0; i < n; i++) {
        scanf("%d", &nums[i]);
    }

    int k;
    printf("ENTER THE VALUE OF K:");
    scanf("%d", &k);

    int size = sizeof(nums) / sizeof(nums[0]);
    printf("%d", cal(nums, k, size));
    
    return 0;
}
