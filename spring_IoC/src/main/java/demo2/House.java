package demo2;

public class House {
    private Beam beam;
    public House(Beam beam){
        this.beam = beam;
    }
    public void init(){
        // 创建房子 依赖于挂房梁等操作
        beam.init();

        System.out.println("house: 房子建成");
    }
}
