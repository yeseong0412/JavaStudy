public class Developer extends Employee {
    private double salary;

    public Developer(String name) {
        super(name);
        // 원래는 자식 생성자 가장 첫번째 행에 super() 기본 생성자가 실행된다.
        // 하지만 부모 클래스에는 Employee(String name) 밖에 없기 때문에 super()는 실행이 안되고 결과적으로 컴파일 에러가 뜬다
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
