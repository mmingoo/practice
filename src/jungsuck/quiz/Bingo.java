package jungsuck.quiz;

public class Bingo {
    static int bingo_cnt=0;

    public static void main(String[] args) {

        int[][] bingo_arr = {
                {1,1,0,0,0},
                {1,1,1,1,1},
                {1,1,1,0,0},
                {1,1,0,1,0},
                {1,1,0,0,1}
        };

        Bingo bingo = new Bingo();
        //가로 세로 빙고 세기
        bingo.count_row_column(bingo_arr);
        //대각선 빙고 세기
        bingo.cnt_diagonal(bingo_arr);

        System.out.println(bingo_cnt);
    }






    // 가로, 세로 카운트
    public void count_row_column(int[][] bingo_arr){
        for(int i = 0; i<bingo_arr.length; i++){
            int row_sum = 0;
            int column_sum = 0;

            for (int j = 0; j<bingo_arr[i].length; j++){
                // 가로 카운팅
                row_sum+= bingo_arr[i][j];

                //세로 카운팅
                column_sum += bingo_arr[j][i];
            }

            if(row_sum == bingo_arr.length){
                // 가로 줄의 합이 5와 같다면 -> 빙고이므로 -> ++
                bingo_cnt++;
            }
            if(column_sum == bingo_arr.length){
                // 세로 줄의 합이 5와 같다면 -> 빙고이므로 -> ++
                bingo_cnt++;
            }
        }
    }

    // 대각선 세기
    public void cnt_diagonal(int[][] bingo_arr){
        for(int i = 0; i<bingo_arr.length; i++){
            int r_sum = 0;
            int l_sum = 0;

            r_sum += bingo_arr[i][i];
            l_sum += bingo_arr[4-i][i];

            // 우하향 대각선 원소의 합이 5라면 -> 빙고 -> ++
            if(r_sum == bingo_arr.length){
                bingo_cnt++;
            }

            // 우상향 대각선 원소의 합이 5라면 -> 빙고 -> ++
            if (l_sum == bingo_arr.length){
                bingo_cnt++;
            }
        }
    }


}
