#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> board, int k) {
    int answer = 0;

    int a = board.size();
    int b = board[0].size();
    
    for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
            if (i + j <= k) {
                answer += board[i][j];
            }
        }
    }

    return answer;
}