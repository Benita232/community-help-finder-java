package za.co.benita.communityhelpfinder;
import java.util.ArrayList;
import java.util.List;
public class ServiceManager {
    private  ArrayList<Service> services;

    public ServiceManager(){
        services = new ArrayList<>();
    }

    public void addService(Service service){
        if (service == null){
            throw new IllegalArgumentException("Service cannot be null");
        }
        services.add(service);

    }

    public void viewServices(){
        if (services.isEmpty()){
            System.out.println("No service to view");
            return;
        }

        for (Service service : services ){
            System.out.println(service);
        }
    }
}
