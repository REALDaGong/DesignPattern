package foobar.Building;

import foobar.product.product_interface.*;
import java.util.Vector;
/** 这个文件是产品组重写的，要合并一下 */
public class StoreHouse extends House implements Barnmethods {


	public String name;
	public int xlen;
	public int ylen;
	public int zlen;
	public int capacity;
	private Vector<BaseProduct> angleCotton;
	private Vector<BaseProduct> demonCotton;
	private Vector<BaseProduct> battleMelon;
	private Vector<BaseProduct> chicken;
	private Vector<BaseProduct> fish;
	private Vector<BaseProduct> frog;
	private Vector<BaseProduct> mutton;
	private Vector<BaseProduct> pork;

	public StoreHouse(){
		this.angleCotton = new Vector<BaseProduct>();
		this.demonCotton = new Vector<BaseProduct>();
		this.battleMelon = new Vector<BaseProduct>();
		this.chicken = new Vector<BaseProduct>();
		this.fish = new Vector<BaseProduct>();
		this.frog = new Vector<BaseProduct>();
		this.mutton = new Vector<BaseProduct>();
		this.pork = new Vector<BaseProduct>();
	}

	public int getAngle() {
		System.out.println("AngleCotton num:"+angleCotton.size());
		return angleCotton.size();
	}

	public int getDemon() {
		System.out.println("DemonCotton num:"+demonCotton.size());
		return demonCotton.size();
	}

	public int getBattle() {
		System.out.println("BattleMelon num:"+battleMelon.size());
		return battleMelon.size();
	}

	public int getChicken(){
		System.out.println("chicken num:"+chicken.size());
		return chicken.size();
	}
	public int getFish(){
		System.out.println("fish num:"+fish.size());
		return fish.size();
	}
	public int getFrog(){
		System.out.println("frog num:"+frog.size());
		return frog.size();
	}
	public int getMutton(){
		System.out.println("mutton num:"+mutton.size());
		return mutton.size();
	}
	public int getPork(){
		System.out.println("pork num:"+pork.size());
		return pork.size();
	}

	public void addAngle(BaseProduct plantProduct) {
		this.angleCotton.add(plantProduct);
		System.out.println("AngleCotton upgrade");
	}

	public void addDemon(BaseProduct plantProduct) {
		this.demonCotton.add(plantProduct);
		System.out.println("DemonCotton upgrade");
	}

	public void addBattle(BaseProduct plantProduct) {
		this.battleMelon.add(plantProduct);
		System.out.println("BattleMelon upgrade");
	}

	public void addChicken(BaseProduct baseProduct){
		this.chicken.add(baseProduct);
		System.out.println("Chicken upgrade");
	}
	public void addFish(BaseProduct baseProduct){
		this.fish.add(baseProduct);
		System.out.println("Fish upgrade");
	}
	public void addFrog(BaseProduct baseProduct){
		this.frog.add(baseProduct);
		System.out.println("Frog upgrade");
	}
	public void addMutton(BaseProduct baseProduct){
		this.mutton.add(baseProduct);
		System.out.println("Mutton upgrade");
	}
	public void addPork(BaseProduct baseProduct){
		this.pork.add(baseProduct);
		System.out.println("Pork upgrade");
	}

	@Override
	public void addPlant(BaseProduct plantProduct) {

	}

	@Override
	public void addAnimal(BaseProduct animalProduct) {

	}

}
