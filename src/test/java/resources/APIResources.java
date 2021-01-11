package resources;
//enum is special class in java which has collection of constants or  methods
public enum APIResources {
	
	AddPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/get1/json"),
	deletePlaceAPI("/maps/api/place/delete1/json");
	private String resource;
	
	APIResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		system.out.println("test");
		return resource;
	}
	

}
