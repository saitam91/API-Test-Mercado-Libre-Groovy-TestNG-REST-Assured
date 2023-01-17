import io.restassured.RestAssured
import io.restassured.builder.RequestSpecBuilder
import io.restassured.http.ContentType
import io.restassured.specification.RequestSpecification
import org.testng.annotations.BeforeClass
import org.testng.annotations.DataProvider

class BaseMELI {

    @BeforeClass()
    public static void setupRequestAssured(){
        RestAssured.baseURI="https://api.mercadolibre.com"
        RequestSpecification requestSpecification = new RequestSpecBuilder()
                .addHeader("Content-type", ContentType.JSON.toString())
                .addHeader("Accept", ContentType.JSON.toString())
                .build()
        RestAssured.requestSpecification=requestSpecification
    }


    @DataProvider(name="DataContainer")
    public Object[] myDataProvider()
    {
        Object data = new Object[1];
        data[0]= "Polystation";

        return data;

}
}
