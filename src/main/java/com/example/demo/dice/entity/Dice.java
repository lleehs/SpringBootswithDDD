package com.example.demo.dice.entity;
import lombok.Getter;

// Entity 내부에 상태 값을 배치
// 이 상태 값을 획득히고 싶을 경우 사용하는 것이 Getter
// @Getter를 사용하여 getNumber()
@Getter
public class Dice {

    private int number;

    public Dice(int number) {
        this.number = number;
    }
}