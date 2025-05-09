bool canThreePartsEqualSum(int* arr, int arrSize) {
    int sum = 0;
 
    for (int i = 0; i < arrSize; i++) {
        sum += arr[i];
    }

    if (sum % 3 != 0) {
        return false;
    }

    int target = sum / 3; 
    int currentSum = 0, count = 0;

    for (int i = 0; i < arrSize; i++) {
        currentSum += arr[i];

        if (currentSum == target) {
            count++;
            currentSum = 0; 
        }

        if (count == 2 && i < arrSize - 1) { 
            return true; 
        }
    }

    return false;
}
