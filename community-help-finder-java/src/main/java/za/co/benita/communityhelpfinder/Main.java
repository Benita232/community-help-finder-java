package za.co.benita.communityhelpfinder;

public class Main {
    public static void main(String[] args) {
        ServiceManager serviceManager =new  ServiceManager();

        Service clinic = new Service("Hillbrow Clinic", "Clinic", "Johannesburg", "011-123-4567", "benitannabuife1@gmail.com");
        //System.out.println(clinic);

        serviceManager.addService(clinic);
        serviceManager.viewServices();

        //System.out.println("Community Help Finder");
    }
}
