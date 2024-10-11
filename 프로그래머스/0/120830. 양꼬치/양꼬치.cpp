#include <string>
#include <vector>

using namespace std;

int solution(int n, int k) {
    int answer = 0;
    int freeDrink = n / 10;
    int drink = k;
    answer = n * 12000;
    if(k != 0){
        drink = (k-freeDrink) * 2000;
        answer+= drink;
    }
    
    
    
    return answer;
}