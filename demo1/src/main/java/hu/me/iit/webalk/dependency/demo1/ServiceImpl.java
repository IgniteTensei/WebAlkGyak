package hu.me.iit.webalk.dependency.demo1;

public class ServiceImpl implements Service{
	
	private final Dependency dependency;

	public ServiceImpl(Dependency dependency){
		this.dependency = dependency;
	}

	public void calculate(){
		dependency.helpNoParameterNoReturnValue();

	}
	
	public int retot() {
		return 5;
	}
	
}
