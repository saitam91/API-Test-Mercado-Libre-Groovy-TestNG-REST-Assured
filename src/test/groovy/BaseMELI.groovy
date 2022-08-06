import io.restassured.RestAssured
import io.restassured.builder.RequestSpecBuilder
import io.restassured.http.ContentType
import io.restassured.specification.RequestSpecification
import org.testng.annotations.BeforeClass
import org.testng.annotations.DataProvider

class BaseMELI {

    @BeforeClass
    public static void setupRestAssured(){
        RestAssured.baseURI="https://api.mercadolibre.com"
        RequestSpecification requestSpecification = new RequestSpecBuilder()
        .addHeader("Content-Type", ContentType.JSON.toString())
        .addHeader("Accept", ContentType.JSON.toString())
        .build()
        RestAssured.requestSpecification=requestSpecification
}
    @DataProvider(name="DataContainer")
    public Object[] myDataProvider()
    {
        Object data = new Object[3];
        data[0]= "Xbox";
        data[1]= "Playstation";
        data[2]= "Nintendo";
        return data;

}
}
