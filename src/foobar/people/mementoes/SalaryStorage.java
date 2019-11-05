package foobar.people.mementoes;

// 存储薪水备忘录的类
public class SalaryStorage {
    private SalaryMemento salaryMemento;

    public SalaryStorage(SalaryMemento salaryMemento) {
        this.salaryMemento = salaryMemento;
    }

    public SalaryMemento getSalaryMemento() {
        return salaryMemento;
    }

    public void setSalaryMemento(SalaryMemento salaryMemento) {
        this.salaryMemento = salaryMemento;
    }
}
