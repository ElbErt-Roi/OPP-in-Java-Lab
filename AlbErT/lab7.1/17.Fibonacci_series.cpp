#include <stdio.h>

int main() {
    int first = 0, second = 1, next = 0;

    // Print the first two terms of the Fibonacci series
    printf("Fibonacci Series up to 300:\n");
    printf("%d, %d", first, second);

    // Generate the Fibonacci series
    next = first + second;
    while (next <= 300) {
        printf(", %d", next);
        first = second;
        second = next;
        next = first + second;
    }

    printf("\n");
    return 0;
}

