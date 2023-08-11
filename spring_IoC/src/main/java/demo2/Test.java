package demo2;

public class Test {
    //测试传对象 解耦合代码
    public static void main(String[] args) {
        Foundation foundation = new Foundation("xx号钢筋", "xx号水泥");
        Brick brick = new Brick(foundation, "xx号红砖");
        Beam beam = new Beam(brick, "杉木");
        House house = new House(beam);
        house.init();
    }
}
