import groovy.transform.ToString
import io.restassured.response.Response
import org.apache.log4j.LogManager
import org.apache.log4j.Logger
import org.testng.annotations.DataProvider
import org.testng.annotations.Test

import static io.restassured.RestAssured.get
import static org.junit.Assert.assertTrue

class TestMELI extends BaseMELI{

    private static final Logger log = LogManager.getLogger(TestMELI.class);

    @Test(groups = "simple",dataProvider="DataContainer", dataProviderClass = BaseMELI.class)
    public void criteriaMatchesWithResult(String searchCriteria) {
        Response response=get("/sites/MLA/search?q="+searchCriteria)
        String [] resultSearch = response.path("results.title")
        for (int i = 0; i < resultSearch.length; i++) {
                        assertTrue("The result search "+resultSearch[i]+" not match with the search criteria: "+searchCriteria,resultSearch[i].contains(searchCriteria));
                        log.info("The result search "+resultSearch[i]+" matches with the search criteria: "+searchCriteria);
    }

}
}