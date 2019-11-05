package foobar.people;

import foobar.people.actions.*;
import foobar.people.mementoes.*;
import foobar.people.types.*;
import foobar.tool.Tool;

// 表示农场工人的类，继承自 Person
public class Farmhand extends Person {
    private int salary;             // 农场工人的薪水
    private JobCategory type;      // 农场工人的种类
    private Farmhand next = null;   // 农产工人链表中的下一个农场工人

    // 构造函数
    public Farmhand(String name, int salary, JobCategory type) {
        super(name);
        this.salary = salary;
        this.type = type;
        System.out.println("Farmhand " + super.name + " is successfully created!");
        System.out.println(super.name + "'s salary is $" + salary + '.');
        System.out.println(super.name + "'s type is " + type.toString() + '.');
    }

    // 设定链表中下一个元素
    public void setNext(Farmhand next) {
        this.next = next;
    }

    // 得到薪水
    public int getSalary() {
        return salary;
    }
    // 设定薪水
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // 创建该农场工人薪水的备忘录类
    public SalaryMemento createSalaryMemento() {
        return new SalaryMemento(salary);
    }

    // 通过薪水备忘录类恢复薪水
    public void restoreFromSalaryMemento(SalaryMemento salaryMemento) {
        salary = salaryMemento.getSalary();
    }

    // 完成工作
    // 工作会在责任链上传递，直至某一对象决定实现它
    public boolean doAgricultureWork(Tool tool, Object obj) {
        if (type == JobCategory.AGRICULTURE) {
            // 如果该农场工人对象符合要求，则处理请求
            Provider provider = new AgricultureWorkFactory();
            Action action = provider.produce();
            action.act(tool, obj);
            return true;
        }
        else if (next != null) {
            // 如果该农场工人对象不能处理该请求，那么他会把相同的请求传给下一个接收者
            next.doAgricultureWork(tool, obj);
        }
        // 若请求传至责任链尾部时，仍没有对象可以处理该请求，则程序将该情况输出
        System.out.println("No farmhand can finish the task.");
        return false;
    }

    public boolean doBuildingWork(Tool tool, Object obj) {
        if (type == JobCategory.BUILDING) {
            Provider provider = new BuildingWorkFactory();
            Action action = provider.produce();
            action.act(tool, obj);
            return true;
        }
        else if (next != null) {
            next.doAgricultureWork(tool, obj);
        }
        System.out.println("No farmhand can finish the task.");
        return false;
    }

    public boolean repairTool(Tool tool) {
        if (type == JobCategory.MAINTENANCE) {
            Provider provider = new RepairToolFactory();
            Action action = provider.produce();
            action.act(tool);
            return true;
        }
        else if (next != null) {
            next.repairTool(tool);
        }
        System.out.println("No farmhand can finish the task.");
        return false;
    }

    public boolean replaceTool(Tool tool) {
        if (type == JobCategory.MAINTENANCE) {
            Provider provider = new ReplaceToolFactory();
            Action action = provider.produce();
            action.act(tool);
            return true;
        }
        else if (next != null) {
            next.replaceTool(tool);
        }
        System.out.println("No farmhand can finish the task.");
        return false;
    }
}