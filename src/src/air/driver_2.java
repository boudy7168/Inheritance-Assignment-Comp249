package air;

import fer.Ferry;
import met.Metro;
import mono.Monowheel;
import tr.Train;
import tr.Tram;
import wt.WheeledTransportation;

public class driver_2 {
	
	
	
	
	
	public static void main(String[] args) {
		
		
		WheeledTransportation w1=new WheeledTransportation();
		WheeledTransportation w2=new WheeledTransportation(4,50);
		WheeledTransportation w3=new WheeledTransportation(w2);
		
		
		//creating three Train objects
		Train t1=new Train();
		Train t2=new Train(1,45,3,"canada","france");
		Train t3=new Train(t1);
		
		//creating three MEtro objects
		Metro m1=new Metro();
		Metro m2=new Metro(1,45,4,"USA","Spain",20);
		Metro m3=new Metro(m2);
		
		//creating three Tram objects
		Tram tram1=new Tram();
		Tram tram2=new Tram(4,16,9,"Chile","germany",12,2024);
		Tram tram3=new Tram(tram1);
		
		//creating three Monowheel
		Monowheel mono1=new Monowheel();
		Monowheel mono2=new Monowheel(4,50,1050);
		Monowheel mono3=new Monowheel(mono2);
		
		//creating three Aircraft
		Aircraft a1=new Aircraft();
		Aircraft a2=new Aircraft(1500,300);
		Aircraft a3=new Aircraft(100999,455);
		
		//creating three Airoplane objects
		WW2_Airoplane airo1=new WW2_Airoplane();
		WW2_Airoplane airo2=new WW2_Airoplane(1200,400,true);
		WW2_Airoplane airo3=new WW2_Airoplane(airo1);
		
		//creating four Ferry objects
		Ferry f1=new Ferry();
		Ferry f2=new Ferry(150,500);
		Ferry f3=new Ferry(f1);
		Ferry f4=new Ferry(150,500);
		Transportation[] objs1= {w1,w2,w3,a1,a2,a3,airo2,airo3,f1,f4,tram1,tram2,tram3,m1,m2,t1,t2,t3,mono1,mono2};  //objs1 is the array containing the Aircraft objects a1,a2,a2 .
		Object[] objs2= {tram1,tram3,m3,m1,airo2,airo3,f1,f4,mono1,mono2,mono3,f1,f2,f3};  //objs2 is the array not containing any Aircraft objects.
		
		
		Transportation[] obj3=copyTheObjects( objs1);
		
		displayTheInfo(obj3);
		
		
		
		
		
		

	}
	


	
	
	
	
public static Transportation[] copyTheObjects(Transportation[] arr) {
		
		Transportation[] tranArr = new Transportation[arr.length];
		
		for (int i=0; i< tranArr.length; i++) {
			
			tranArr[i] = new Transportation(arr[i]);
			
		}
		return tranArr;
		
	}
	
	public static void displayTheInfo(Transportation[] arr) {
		
		
		String m;
		System.out.println("THis is the information about the transportation vehicles:");
		
		for (int i=0; i<arr.length; i++) {
			
			
			System.out.println(arr[i]);
		
		}
		
	}
}
