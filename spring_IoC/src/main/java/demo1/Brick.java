package demo1;

public class Brick {
    private String redBrick;//红砖

    public void init(){
        // 砌砖 依赖于 已经打好地基
        Foundation foundation = new Foundation();
        foundation.init();

        System.out.println("demo1.Brick: 砌砖用 " + this.redBrick);
    }
}
