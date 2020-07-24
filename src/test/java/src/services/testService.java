package src.services;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import org.testng.Assert;

import java.util.*;

import static com.jayway.restassured.RestAssured.given;

public class testService {

    public void ExecuteShouldAssertBreweryData(){
        List<String> ids = this.GivenBreweriesWithNameLagunitas(); //GIVEN

        Map<String, String> brewery = this.WhenABreweryIsFromCaliforniaState(ids); //WHEN

        //THEN
        Assert.assertEquals(brewery.get("id"),761);
        Assert.assertTrue(brewery.get("name").equals("Lagunitas Brewing Co"));
        Assert.assertTrue(brewery.get("street").equals("1280 N McDowell Blvd"));
        Assert.assertTrue(brewery.get("phone").equals("7077694495"));
    }
    private List<String> GivenBreweriesWithNameLagunitas() {
        Response response = given().
                contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                .get("https://api.openbrewerydb.org/breweries/autocomplete?query=lagunitas");
        JsonPath path = response.jsonPath();
        return path.getList("findAll { it.name == 'Lagunitas Brewing Co' }.id");
    }

    private Map<String, String> WhenABreweryIsFromCaliforniaState(List<String> ids) {
        Map<String, String> brewery = new HashMap<>();
        for (String id: ids) {
            Response response = given().
                    contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .when()
                    .get("https://api.openbrewerydb.org/breweries/" + id);
            //ResponseBody body = response.getBody();
            JsonPath path = response.jsonPath();
            if (path.get("state").equals("California"))
                brewery = path.get("");
        }
        return brewery;
    }


}
