package javaEx02;

public class Student {
    private String stdNo;       // 학번
    private String stdName;     // 이름
    private int stdYear;        // 학년

    // 매개변수가 있는 생성자
    // 생성자 : 클래스 이름과 동일한 메서드 / 멤버필드를 초기화할 때 사용
    // 객체가 생성될 때 멤버 필드에 값을 저장하기 위해 사용
    // 호출하지 않아도 객체 생성될 때 자동 호출
    // 반환형 없음
    public Student(String stdNo, String stdName, int stdYear) {
        this.stdNo = stdNo;
        this.stdName = stdName;
        this.stdYear = stdYear;
    }

    public String getStdNo() {
        return stdNo;
    }

    public void setStdNo(String stdNo) {
        this.stdNo = stdNo;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdYear() {
        return stdYear;
    }

    public void setStdYear(int stdYear) {
        this.stdYear = stdYear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdNo='" + stdNo + '\'' +
                ", stdName='" + stdName + '\'' +
                ", stdYear=" + stdYear +
                '}';
    }

    public void show() {
        System.out.println(
               stdNo + ',' +
              stdName + ',' +
               stdYear
                );
    }
}
