package foobar.people;

// 表示人的抽象基类
public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    // 得到名字
    public String getName() {
        return name;
    }
}
