package demo1;

public class House {
    public void init(){
        // 创建房子 依赖于挂房梁等操作
        Beam beam = new Beam();
        beam.init();

        System.out.println("demo1.House: demo1.House create");
    }
}
