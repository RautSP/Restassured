package rest2224;

import java.util.ArrayList;

public class PetStruct{
public int id;
public Category category;
public String name;
public ArrayList<String> photoUrls;
public ArrayList<Tag> tags;
public String status1;


    public long getId() {
	return id;
}
	public void setId(int id) {
		
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(ArrayList<String> photoUrls) {
		this.photoUrls = photoUrls;
	}
	public ArrayList<Tag> getTags() {
		return tags;
	}
	public void setTags(ArrayList<Tag> tags) {
		this.tags = tags;
	}
	public String getStatus() {
		return status1;
	}
	public void setStatus(String status) {
		this.status1 = status;
	}
	public String status;
	public Category Category;
}




