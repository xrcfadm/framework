package demo2;

public class Beam {
    private Brick brick;
    private String material;

    public Beam(Brick brick, String material){
        this.brick = brick;
        this.material = material;
    }
    public void init(){
        // 挂房梁等 依赖于 砌好砖
        brick.init();

        System.out.println("Bean: 房梁木用 " + this.material);
    }
}
