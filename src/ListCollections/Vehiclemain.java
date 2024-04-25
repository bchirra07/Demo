package ListCollections;

import java.util.Map;
import java.util.TreeMap;

public class Vehiclemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vehicle v1=new Vehicle("Tesla", 2017);
		Vehicle v2=new Vehicle("Honda", 2022);
		Vehicle v3=new Vehicle("Toyota", 2024);
		Vehicle v4=new Vehicle("Hyundai", 2007);
		
		Vehicleinfo vi1=new Vehicleinfo(120, "Model s");
		Vehicleinfo vi2=new Vehicleinfo(140, "Accord");
		Vehicleinfo vi3=new Vehicleinfo(160, "Camry");
		Vehicleinfo vi4=new Vehicleinfo(100, "Elantra");
		
		Map<Vehicle,Vehicleinfo> mapings=new TreeMap<Vehicle,Vehicleinfo>(new sortbyModel());
		mapings.put(v4, vi4);
		mapings.put(v3, vi3);
		mapings.put(v2, vi2);
		mapings.put(v1, vi1);
		
		for(Map.Entry<Vehicle,Vehicleinfo>temp:mapings.entrySet())
		{
			System.out.println("Key:"+temp.getKey()+ " , Value  "+temp.getValue());
		}
		
		
		
		
		
		
	}

}
