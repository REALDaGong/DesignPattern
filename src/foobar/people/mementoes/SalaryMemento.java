package foobar.people.mementoes;

// 农场工人薪水的备忘录类
public class SalaryMemento {
    private int salary;

    public SalaryMemento(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
