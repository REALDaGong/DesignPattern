package foobar.plant.plant_entity;
import logger.logger;
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
        logger.println("The plant has been killed!");
    }

    //成熟阶段可以收获植物
    public void harvest(){
        logger.println("The plant has been harvested!");
    }
}
