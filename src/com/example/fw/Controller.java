package com.example.fw;

/*
com.example.fw.Controller 의 종유가 여러게더라.
초기화 - 같은코드
실행 - 다른코드?
마무리 - 같은코드
 */
//@Controller
public abstract class Controller {
    protected final void init(){
        System.out.println("초기화 하는 코드");
    }
    protected final void close(){
        System.out.println("마무리 하는 코드");
    }
    protected abstract void run();
    //  내가 가진 메소드를 호출한다.
    // 어떤 모양순서를 가지고 있다. 이런 메소드를 메소드 템플릿이라 한다.
    public void execute(){
        this.init(); //this 생략가능
        this.run();
        this.close();
    }
}
