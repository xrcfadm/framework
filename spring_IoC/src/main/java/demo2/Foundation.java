package demo2;

public class Foundation {
    private String rebar;//钢筋
    private String cement;//水泥

    public Foundation(String rebar, String cement){
        this.rebar = rebar;
        this.cement = cement;
    }
    public void init(){
        System.out.println("Foundation: 打地基用 " + this.rebar +" "+ this.cement);
    }
}
