package karp.todo;

public class Item
{
	private String name;
	private Boolean checked = false;
	
	public Item(String name)
	{
		this.name = name;
	}
	
	/*
	 * Setters
	 */
	
	public void setName(String name){this.name = name;}
	public void setChecked(Boolean checked){this.checked = checked;}
	
	/*
	 * Getters
	 */
	
	public String getName(){return name;}
	public Boolean getChecked(){return checked;}
}
