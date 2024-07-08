package ch05.sec07;

public class MutiDimesionPrintDefaultExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[3][3]; //3행 3열의 데이터가 만들어짐
        /* {
              {0,0,0},
              {0,0,0},
              {0,0,0}
           }
        */

        //2차원 배열에 값을 할당하지 않을 경우 디폴트 값 출력
        for (int i = 0; i < 3; i++) { //행
            for (int j = 0; j < 3 ; j++) { //열
                System.out.println("mathScores[" + i + "][" + j + "]:" + mathScores[i][j]);
            }
        }

    }
}
