package lab_3_3;

import java.util.ArrayList;
import java.util.List;

public class RealEstate
{
	private String agent_name;
	public Address agent_address;
	public List<House> house_list;
	
	public RealEstate(String agent_name, Address agent_address)
	{	
		this.agent_name = agent_name;
		this.agent_address = agent_address;
		this.house_list=new ArrayList();
	}

	public String getAgent_name() {
		return agent_name;
	}

	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}

	public Address getAgent_address() {
		return agent_address;
	}

	public void setAgent_address(Address agent_address) {
		this.agent_address = agent_address;
	}
	
	public void addHouse(House h)
	{
		house_list.add(h);
	}
	
	public String displayAllHouses()
	{
		String output="";
		for (int i = 0; i < house_list.size(); i++) {
			output+=house_list.get(i)+"/n";
		}
		return output;
	}
	
	public int getnumHouses()
	{
		return house_list.size();
	}
	
	public String searchByPrice(int p1,  int p2)
	{

		String output="";
		for (int i = 0; i < house_list.size(); i++) {
			if(house_list.get(i).getPrice()>=p1 && house_list.get(i).getPrice()>=p2)
			output+=house_list.get(i)+"/n";
		}
		return output;
	}
	
	
	
	
	
	
}
