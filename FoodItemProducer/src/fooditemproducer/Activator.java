package fooditemproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	private ServiceRegistration serviceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("FoodItem Producer service started");
		
		//Register Publisher Service
		FoodItemInterface foodItemInterface = new FoodItemServiceImpl();
		serviceRegistration = context.registerService(FoodItemInterface.class.getName(), foodItemInterface, null);
	}


	public void stop(BundleContext context) throws Exception {
		System.out.println("FoodItem Producer service stopped");
		serviceRegistration.unregister();
	}

}
