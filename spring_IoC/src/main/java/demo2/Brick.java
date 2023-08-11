package demo2;

public class Brick {
    private Foundation foundation;
    private String redBrick;//红砖

    public Brick(Foundation foundation, String redBrick){
        // 砌砖 依赖于 已经打好地基
        this.foundation = foundation;
        this.redBrick = redBrick;//新增
    }
    public void init(){
        this.foundation.init();
        System.out.println("Brick: 砌砖用 " + this.redBrick);
    }
}
