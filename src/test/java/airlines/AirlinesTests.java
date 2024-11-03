package airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import RestUtils.RestUtils;
import utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class AirlinesTests {



    @Test
    public void createAirline() throws IOException {

        String env = System.getProperty("env") == null ? "qa": System.getProperty("env");
        Map<String, String> data = JsonUtils.getJsonDataAsMap(""+env+"/airlinesApiData.json");
        String endpoint = data.get("crateAirlineEndpoint");
        Map<String,Object> payload  = Payloads.getCreateAirlinePayloadFromMap("9712412","ABC Airlines","Hongkong","IMLOGO","Best We are in the worlds","Tokyo","abc.com","1999");

        Response response = RestUtils.performPost(endpoint,payload, new HashMap<>());
        Assert.assertEquals(response.getStatusCode(),200,"Status code Verify");
    }
}
