package vechile;

public class VechileUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vechile v = new Vechile();
        v.setMaxSpeed(10);
        v.print();
        
        Car c = new Car();
        c.numGears = 10;
        c.color = "Black";
        c.print();
        
        c.printCar();
	}

}
