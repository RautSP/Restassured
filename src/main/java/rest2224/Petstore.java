package rest2224;

import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Petstore {

	public static void main(String[] args) throws JsonProcessingException {
		File f=new File("C:\\Users\\Admin\\workspace-mohini\\rest2224\\src\\test\\resource\\pestjson\\petjson.json");
RequestSpecification req=new RequestSpecBuilder().addHeader("Content-Type","application/json").
setBaseUri("https://petstore.swagger.io/v2/pet").build();

ResponseSpecification res=new ResponseSpecBuilder().expectStatusCode(200).
expectContentType("application/json").build();

 
PetStruct resu=given().spec(req).body(f).when().post().then().spec(res).extract().response().as(PetStruct.class);
//System.out.println(resu.toString());

System.out.println(resu.getId());
System.out.println(resu.getName());

PetStruct ps=new PetStruct();
ps.setId(123);
ps.Category =new Category();
ps.setId(1);
ps.setName("jirafee");
ps.photoUrls=new ArrayList<String>();
ps.photoUrls.add("root.png");
ps.tags=new ArrayList<Tag>();
ps.tags.add(new Tag());
ps.tags.get(0).id=12;
ps.tags.get(0).name="beer";
ps.status1="available";

ObjectMapper om=new ObjectMapper();
System.out.println(om.writeValueAsString(ps));




	}
	


}
