package javaEx04;

// 추상 클래스
public abstract class DrawingObject {
    public String penColor;

    // 추상 메서드 : body 가 구현되어 있지 않고 선언부만 있는 메서드
    public abstract void draw();
}
