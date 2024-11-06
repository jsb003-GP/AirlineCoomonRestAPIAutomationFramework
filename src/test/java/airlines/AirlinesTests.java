package airlines;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import RestUtils.RestUtils;
import utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class AirlinesTests extends AirlineAPIs {

    @Test
    public void createAirline() throws IOException {

        Map<String,Object> payload  = Payloads.getCreateAirlinePayloadFromMap("9712e4476512","ABC Airlines","Hongkong","IMLOGO","Best We are in the worlds","Tokyo","abc.com","1999");

        Response response = createAirline(payload);
        Assert.assertEquals(response.getStatusCode(),200,"Status code Verify");
    }
}
