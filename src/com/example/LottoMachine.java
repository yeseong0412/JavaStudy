package com.example;

public interface LottoMachine {
    int MaxBallCnt=45;
    int ReturnBallCnt=6;
    public void setBalls(Ball[] balls); // Ball[] Ball이 여러개를 받게다.
    public void mix();// 가지고 있는 볼을 썪는다.
    public Ball[] getBalls(); // 6개의 Ball을 반환한다.

}
