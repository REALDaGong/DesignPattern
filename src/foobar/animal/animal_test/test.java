package foobar.animal.animal_test;

import foobar.animal.animal_base.*;
import foobar.animal.factory.*;

//����;

public class test {
	public void startalltest() {
		//����ÿ�ֶ����һ��
		ChickenFactory cf=new ChickenFactory();
		Chicken chicken= cf.createAnimal();
		FishFactory fishF=new FishFactory();
		Fish fish = fishF.createAnimal();
		FrogFactory frogF=new FrogFactory();
		Frog frog = frogF.createAnimal();
		PigFactory pigF=new PigFactory();
		Pig pig = pigF.createAnimal();
		SheepFactory sheepF=new SheepFactory();
		Sheep sheep=sheepF.createAnimal();
		
		chicken.walk();			//������
		pig.walk();				//������
		
		fish.sleep();			//��˯��
		sheep.sleep();			//��˯��
		
		for(int i=0;i<3;i++) {			//ʹ���ܺͼ���ʳ���ɳ�����һ�׶�
			frog.eat();
			chicken.eat();
		}
		if(	frog.checkFertility()) {		//��鼦�ķ�ֳ������ͨ������з�ֳ
			frog.breed();
		}
		
		chicken.produceWithoutDeath();		//�������ջ񼦵Ĳ�Ʒ
		chicken.produceWithDeath();			//�����ջ񼦵Ĳ�Ʒ
		
		for(int i=0;i<2;i++) {			//�������
			pig.setHungry();
		}
		
		while(sheep.getLife()) {		//���ʳ��ֱ���ɳ�������
			sheep.eat();
		}
	}
	public void main() {
		startalltest();
	}

}
