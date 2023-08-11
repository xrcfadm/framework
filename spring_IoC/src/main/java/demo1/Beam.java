package demo1;

public class Beam {
    private String material;//(杉木sm)
    public void init(){
        // 挂房梁等 依赖于 砌好砖
        Brick brick = new Brick();
        brick.init();

        System.out.println("Bean: 房梁木用 " + this.material);
    }
}
