package creational.factorymethod.improved;


public class Client {

    public static void main(String [] args){

        TransportFactory factory = new BikeFactory();

        Transport transport = factory.create();

        System.out.println(transport.drive());

        factory  = new CarFactory();

        transport = factory.create();

        System.out.println(transport.drive());
        
        
        //real case invoking
        invokeSharedCode(new BikeFactory());
        invokeSharedCode(new CarFactory());


    }
    
    //object being created depending on factory type, and behavior is defined in interface also
    public static void invokeSharedCode(TransportFactory factory){
    	
    	Transport transport = factory.create();

        System.out.println(transport.drive());
    	
    }
	
}
