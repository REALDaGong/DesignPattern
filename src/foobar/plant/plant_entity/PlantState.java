package foobar.plant.plant_entity;

public class PlantState {
    //植物状态
    private String state="seeding";

    public PlantState(){

    }

    public String getState(){
        return state;
    }

    public  void setState(String state){
        this.state=state;
    }

    //幼苗阶段可以杀死植物
    public void killed(){
        System.out.println("The plant has been killed!");
    }

    //成熟阶段可以收获植物
    public void harvest(){
        System.out.println("The plant has been harvested!");
    }
}
